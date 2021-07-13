package com.edu.controller;

import java.util.Collection;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edu.service.IF_MemberService;
import com.edu.vo.MemberVO;

/**
 * 이 클래스는 스프링시큐리티의 /login처리한 결과를 받아서 /login_success
 * 를 처리하는 클래스 입니다.
 * @author 김지애
 *
 */
@Controller
public class LoginController {
	@Inject
	private IF_MemberService memberService;
	
	//HomeController에 있던 /login_form을 네아로 로그인URL 생성때문에 여기로 이동
	@RequestMapping(value="/login_form",method=RequestMethod.GET)
	public String login_form(Model model ,HttpSession session) throws Exception{
		//네이버 인증Url구하기:세션은 서버 클라이언트접속정보를 저장하는 공간 세션입니다.
		String naverAuthurl="";
		
		model.addAttribute("url",null);
		return "home/login";//jsp생략
	}
	//security-context에서 처리한 ID,암호 비교쿼리가 실행된 결과가 Authentication에 
	@RequestMapping(value="/login_success",method=RequestMethod.GET)
	public String login_success(HttpServletRequest request,RedirectAttributes rdat) throws Exception {
		//request는 목적: 세션객체를 만들기 위해서(로그인정보를 화면이 이동하더라고 유지하기 위해서
		//rdat의 목적:model객체로 값을 전송할 수 없는 상황일때,값을 jsp로 전송하기 위해서
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		//싱글톤객체를 만들거나 사용하는 목적:메모리관리를 위해서 1개만 객체로 만들어서 사용하기 위해서 (new로 객체를 생성하지 못함)
		String userid = "";//사용자 아이디 
		String levels="";//권한이 들어갈 변수
		Boolean enabled =false;//로그인체크가 들어가 변수(true=아이디/암호 비교성공)
		//principal객체는 UserDetails 객체가 포함되어 있고,enabled라는 인증결과가 생성됩니다
		Object principal = authentication.getPrincipal();//ID,암호 비교쿼리가 실행됩니다.
		if(principal instanceof UserDetails) {//위 결과 principal 객체에 UserDetails 있으면
			enabled = ((UserDetails) principal).isEnabled();//true false
			//위 인증결과로 로그인 체크를 합니다
		}
		//세션 정보(로그인아이디,레벨,회원이름..) 저장 시작(아래)
				HttpSession session = request.getSession();//진입 전 단계에서 발생한 세션(로그인 절차로 생생된 세션)가져오는 절차
				if(enabled) { //인증처리가 true라면 아래에서 세션 등록 시작
					//자바8이상에서만 지원되는 람다식 사용해서 DB쿼리에서 GET값 getAuthority()비교구문 처리 levels변수에 권한값 지정.
					Collection<? extends GrantedAuthority>  authorities = authentication.getAuthorities();
					if(authorities.stream().filter(o -> o.getAuthority().equals("ROLE_ANONYMOUS")).findAny().isPresent())
					{
						levels = "ROLE_ANONYMOUS";//권한_무명
					}
					if(authorities.stream().filter(o -> o.getAuthority().equals("ROLE_USER")).findAny().isPresent())
					{
						levels = "ROLE_USER";//권한_일반 사용자
					}
					if(authorities.stream().filter(o -> o.getAuthority().equals("ROLE_ADMIN")).findAny().isPresent())
					{
						levels = "ROLE_ADMIN";//권한_관리자
					}
					//사용자 아이디 값 지정.
					userid = ((UserDetails)principal).getUsername();
					//로그인 세션 저장시작: 사용처는 jsp뷰단,java클래스 모두 사용가능
					session.setAttribute("session_enabled", enabled);
					session.setAttribute("session_userid", userid);
					session.setAttribute("session_levels", levels);
					MemberVO memberVO = memberService.readMember(userid);
					session.setAttribute("session_username", memberVO.getUser_name());
					session.setAttribute("session_type", "normal");
				}
				rdat.addFlashAttribute("msg", "로그인");
				return "redirect:/";
			}
	
}
