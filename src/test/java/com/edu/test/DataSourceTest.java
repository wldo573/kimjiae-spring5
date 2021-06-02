package com.edu.test;


import org.apache.taglibs.standard.lang.jstl.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 이 클래스는 오라클과 연동해서 CRUD를 테스트하는 클래스입니다.
 * 과장(이사,팀장)Junit CRUD까지 만들어서 일반사원에게 공개
 * @author 김지애
 *
 */

//RunWith인터페이스 현재클래스가 Jnuit실행클래스라고 명시
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
@WebAppConfiguration
public class DataSourceTest {
	//디버그용 로그 객체변수생성
	private org.slf4j.Logger logger =Logger.getLogger(DataSourceTest.class); 
@Test
	public void junutTest() {
	//로거는 장점>조건에 따라서 출력을 
		logger.debug("Junit테스트시작입니다.");
	}
}
