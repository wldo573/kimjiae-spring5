#### 작업예정.
- 스프링 프로젝트 순서
- 1. JUnit > 마이바티스(DB핸들링) > 페이징기능 > 검색기능 > 첨부파일기능 > 스프링 시큐리티(로그인 인증) 
- 2. 댓글처리(RestAPI-백엔드, Ajax처리-프런트단) > 네이버아이디로그인(외부API사용) > 헤로쿠클라우드배포
- 3. 문서작업(화면기획서XLS 제작,화면설계서 PPT제작)
- 1달간(프론트엔드)은 주로 UI 계속진행(VS code개발환경) 하면서,
- 피곤할때, 자바|스프링(이클립스-egov전자정부프레임워크개발환경) 기본언어실습진행.
- 피곤할때, 오라클DB(SQL디벨러퍼개발환경) Ansi-SQL(표준SQL)기본언어실습진행CRUD.
- 2달째부터(백엔드), 주로 스프링으로 실습이 진행(납품용-이력서포트폴리오용).
- VS code에서 만든 UI를 이클립스에서 JSP로 변경 한 후 스프링웹프로젝트를 진행합니다

#### 20210603(목) 작업예정
-페키지는 관련기능을 한곳에 모아서 개발자 관
-jUnit테스트: 오라클 연동한 후 회원관리부분 CRUD 테스트진행
-오라클CRUD 실습예정.
-admin부터 프로그램 작업 시작예정
-내일은 자바 대신에 https://wikidocs.net/3910



#### 20210602(수) 작업예정.
- 예외처리하는 목적:에러상황에서도 프로그램이 중단되지 않도록 하는 것이 주목적(에러상황을 세련되게 넘기게 처리)
- 스프링에서는 개발자가 처리하는 100의 코딩에서 2-3개정도(파일업로드,다운로드)이고, 대부분  throw Exception 스프링으로 넘김.(예외의 전파)
- 쓰레드 : thread,실행되는 프로그램을 명시,1개 프로그램에는 보통1개 쓰레드가 실행,특이한 경우(http웹네트워크 프로그램인경우 다운로드 버튼 다운로드 100G 쓰레드가 실행 후 ,리스트버튼을 클릭했을때 목록보기 쓰레드가 동시에 실행-안드로이드 앱에서 필요) 여러개 쓰레드 실행이 필요한 경우가 있습니다.
- 예외처리: Throwable 오브젝트가 실행시 에러가 발생하면,예외(내용)를 보낼때 (던질때)사용하는 클래스 Throwable 클래스라고 한다
- 스프링에서는 예외(에러)정보를 스프링 처리합니다.
- 자바앱에서는 예외(에러)정보를 개발자가 처리합니다.(개발자가 손이 많이 갑니다.) 지금 실습합니다.
- 예외처리:에러발생시 프록,램이 중지되는 것을 방지하고, 계속 프로그램을 사용할 수있도록 처리하는 방법 = Exception
- 페키지는 관련기능을 한곳에 모아서 개발자 관리하기 편하게 하기 위해서 구분한 이름(폴더명)
- Controller클래스 + home/index.jsp(화면) 한쌍 입니다. 그래서,컨트롤러클래스 만든 변수를 index.jsp에서 사용가능하게 됩니다.
- 안드로이드앱 = 액티비티(java) + 레이아웃.xml(화면) 한쌍
- C#닷넷 = test.aspx.cs(프로그램) + test.aspx(화면) 한쌍
- 일반홈페이지(cafe24)-URL직접접근이 가능(보안위험높음)
- MVC웹프로그램 차이점-URL직접접근이 가능X(보안위험낮음)-관공서,대학,은행 주사용
- MVC프로젝트에도 URL직접접근이 가능한 resources폴더 직접접근이 가능-static 콘텐츠(html,css,js)를 모아 놓은 폴더.views폴더 - jsp는 직접접근이 불가능
- Views폴더처럼 직접접근이 불가능한 컨텐츠는 Controller(라우터)로 접근하게 됨
- views/home/index.jsp 엑박처리OK, 분해는 관리자단 실습 후 작업합니다.
- 개발순서: ERD제작 -> html제작 -> jsp제작(현재:관리자단10기능 작업 후 사용자단5기능)
- admin 폴더 만든이후 분해는 Junit 실습 후 작업합니다.
- Junit(Java Unit Test):자바 단위 테스트(서비스프로그램만들기전 프로토타입 시제품 제작)-Junit CRUD 작업 후 본격작업시작.
- 로거의레벨 :DEBUG로거레벨을 설정
- 남품할때:WARN부터 프로그램 작업 시작예정
- admin 부터 프로그램 작업 시작예정.
- 4장 패키지와 예외처리 실습 후 오라클 CRUD 실습.

####20210531(월)작업 
- 토드(sql디벨러퍼와 비슷한 상용)에서는 버튼으로 포워드 엔지니어링이 처리.
- 무료sql디벨러퍼에서는 버튼X. DDL문을 실행해서 포워드엔지니어링을 처리.
- 참고, mysql용 워크벤치는 무료이지만, 버튼으로 포워드엔지니어링이 가능.
- sql쿼리 3가지로 분류
- 초기DDL문: Data Derinition Language. 데이터 정의 언어 Create table문
- 유지DCL문: Data Control Language. 데이터 제어언어  commit,rollback
- 개발DML문: Data Manufacture Language. 데이터 조작언어 CRUD쿼리.
- ERD 그림 만든것을 물리 테이블로 Forward 엔지니어링
- 데이터 딕셔너리를 모델과 동기화 : 자료사전(데이터의 데이터)을 DB테이블과 동기화
- 데이터 딕셔너리는 메타 데이터와 동일합니다.:콘텐츠 x, 구조,구성 정보만 존재
- 물리테이블을 ERD 그림으로 만드는 것 :reverse 엔지니어링(기존DB분석시 사용)
- 스프링시큐리티는 2단계: 구현예정
- 1단계.로그인인증(ENABLED):authentication(로그인 X, 글쓰기 기능 X, 관리자 X)
- 2단계. 권한체크(LEVELS):AUTHORITY(관리자-admin URL 접근가능,일반회원은 사용자홈페이지에서 공지사항X,갤러리만 사용가능합니다.)
- 1:N관계? 게시물1개에 댓글 n개 달릴 수 있음.
- E-R다이어그램은 그림일뿐,물리DB(테이블)은 ERD기준으로 생성가능.
- PK를 AI(Auto Increment자동증가)로 만들기:오라클(시퀸스객체로기능구현), Mysql(AI라는 필드속성으로 처리)
- ERD에서 Relation 생성:게시판타입테이블과 게시물관리테이블의 관계를 생성
- 부자의 관계는 부모의 PK를 기준, 자식에게는 FK(Foreign Key)로 관계를 맺습니다.
- 게시판타입:notice,gallery 2가지가 존재한다면 ,
- Relation관계가 필요한 이유:공지사항이나 갤러리 게시판이 아니면, 개발자가 예외처를 하지 않아도 다른 게시판으로 등록하는상황 발생이 되지 않게 됩니다.
- 데이터 무결성을 유지하는 역할.(외래키 관계)
- 필드 데이터형3:Timestamp(시간도장)년월일시분초밀리초,Date(년월일까지)
- 필드 데이터형2 :CLOB(CHAR,LOGN,BYTE)글내용이 많을때 사용하는 데이터형태
- 필드 데이터형:VARCHAR2(1바이트를 1글자-한글), VARCHER(1바이트 1글자-영문전용)
- 테이블구성:필드(컬럼)=테이블의 멤버변수(자바VO클래스의 멤버변수)
- 필드구성:primayKey(주키,기본키,고유키)=테이블영역에서 고유한 ID를 말함(중복되지 않는 값)
- PK예(개인을 식별할 수 있는값): 로그인id,개인이메일주소,주민번호등등,게시판타입
- RDBMS : RelationDataBaseManagementSystem(관계형 데이타베이스관리시스템)
- 오라클:테이블스페이스(TableSpace) = 스키마(Scheme:Mysql)=데이터베이스(DB-MS-SQL)
- 지난주 금요일날, 오라클 웹용 관리프로그램에서 XE라는 테이블스페이스를 XE사용자로 추가했음.
- EnititRelationDiagram(ERD-객체관계그림): Entity=테이블
- 데이터모델:Model object를 형상화 시킨것을 모델이라고함. 데이터베이스를 말함.
- MVC 스프링프로젝트에서  M이 Model이고,스프링프로젝트 구성중에  DB를 가르킴.
- 참고로, V는 View고 jsp를 말합니다.
- 참고로, C는 Controller고 클래스를 말합니다.
- 설치시 암호는 apmsetup으로 통일 합니다.


###


#### 20210527(목) 작업예정   
- 오라클11g ExpressEdition 설치예정.
- SQL디벨러퍼를 다운받아서 압축풉니다. -ERD제작할 예정.
- StructureQueryLanguge:구조화된 질의 언어
- QueryString: URL에서 전송하는 값을 문장으로 저장한애용 ? 로 시작.
- CommenndLineInterface:SQL*Plus 터미널화면으로 SQL쿼리 실행 X
- GrapicUserInter: SQL디벨러퍼 윈도우화면 에디터에서 SQL쿼리 실행O
- SQL Developer 프로그램으로 ERD 다이어그램그림으로 프로젝트 구조제작예정.
- EntityRelationDiagram:테이블 관계도형(아래)
- 프로젝트 진행:발주(클라이언트)->수주(개발사) -> 디자인UI(Client-Dev) -> ERD(이사,팀장)->코딩시작(ERD보면서+UI소스에 프로그램입히기)
- ERD에서 SQL쿼리가 생성->물리테이블을 생성.
--------------------------------------------------
-첨부파일 (자식)->게시판테이블(부모)<-댓글테이블(자식)
- 자바앱에서는 객체를 생성후 사용이 끝나면, 메모리에서 삭제하는 명령이 필수.
- 객체를 메모리에서 삭제:Object = null; Object.close();
- 스프링에서는 내장된 가비지컬렉가(쓰레기수집가)가 자동실행 사용하지 않는 객체를 자동으로 지워줌.
- 위와 같이 개발자가 하던 메모리관리를 스프링의 대신 =IoC(Inversion Of Control)제어의 역전.특징(Ioc,AOP,DI)
- 3장 객체와 클래스 부터시작
- 스프링에서는 상속보다는 인터페이스 implements를 더 많이 사용합니다.
- abstract클래스 (추상클래스):구현내용이 없이, 메서드명만 있는 클래스,
- 추상클래스는 매서드명만 있기 때문에 (구현내용이 없기때문에),*객체로 만들수 없는 클래스 입 니다.
- 부모로써 자식에게 상속만 (메서드이름만) 재사용만 가능하게 됩니다.
- *객체로 만들 수 없다? 실행가능한 클래스로 사용못하지만,프로그램을 구조화 시킬때 필요.
- Step1 aaa = new Step1();//이렇게 생성자로 객체를 만들지 못함.
- final클래스:부모가 될 수 없는 클래스(상속해서 재사용이 불가능한 클래스임)
- 접근제어자:pulic(패키지 위치에 상관없이 접근-제일많이 사용),
- public 클래스안에서 멤버변수는 private을 제일 많이 사용.(private보안성갖춤)
- public 클래스안에서 멤버메서드는 public을 많이 사용.(외부 다른 클래스의  메서드를 실행가능)대신, 변수가 private이기 때문에 직접 수정이 안됨, 실행만 됩니다.
- 인스턴스(클라우드주로사용)=오브젝트(자바)=객체=실행중인 클래스
- 클래스 자료형(int,long,String처럼) 멤버변수,멤버메서드,서브클래스 등등 포함할 수 있습니다.=C언어 구조체 자료형
-이클립스 커밋, 푸시가 안될때 팝업창 하단에 Force 항목을 체크하고 진행.
#### 20210526(수) 
-붕어빵:붕어빵틀(클래스) -> 붕어빵 구어져서 나오면 오브젝트(객체)
-OOP:자바를 객체지향(클래스를 실행가능하게 하는) 프로그래밍
-객체 (object)와 클래스? 클래스형 자료를 실행 가능하게 만든 것을 오브젝트(객체)라고함.
-추상화(Abstract): 오프라인 업무 -> 대표 업무만 뽑아낸 클래스 = 추상클래스
-클래스는 멤버변수 + 멤버메서드(실행) + 서브클래스
-변하지 않는 변수=상수=변수명을 대문자(원주율)PI=3.141569...
-보통 상수변수는 클래스의 제일 상단 위치합니다.
-기본형(정수자료형-소문자시작): byte<short<int<long,10L(롱타입변수) (정수자료)
-기본형(실수자료형-소수점,소문자시작): float<double
-기본형(문자형-''단따옴표 값을 입력해야 에러나지않음):char,1개 문자만 입력.
-문자형에서 유니코드\u 숫자 입니다.
-기본형 (불린형-참,거짓):bollean,(0|1)
-참조형(대문자로 시작):참조형 변수의 대표적인 변수 클래스 입니다. -클래스변수(저장된상태)->실행가능하게되었을때,인스턴스변수(메모리로드된상태)
-인스턴스라는 말보다는 오브젝트라는 말을 더 많이 사용합니다.
-String(문자열 클래스변수):대문자로 시작.
-상수변수명시적 만들때: int MAX = 100;
-for-each 반복문전까지 실습

#### 20210525(화) 작업
-스프링MVS프로젝트: ModelViewController?약자MVC구조(웹프로그램구조)
-src/test/java폴더 만들었습니다.:테스트작업은 이 폴더에서 하라는 약속.
-src/main/java폴더가 진짜 프로그램작업을 하는 폴더.
-javac HelloWorld.java  -encoding UTF-8(한글 내용도 컴파일됨)
-위 java 컴파일러로 실행한 결과->HelloWorld.class 실행파일이 생성됨.
-주)클래스파일은 실행 패키지의 루트(최상위)에서 실행해야 함.
-kr.or.test.패키지 root폴더 src/test/java 폴더에 실행을 해야함.
-java kr.or.test.HelloWorld 클래스를 실행하게 됨
-이클립스 나오기 전, 25년전 javac 컴파일에서 class 프로그램을 만들었습니다.
-지금은 터미널에서 javac 사용하지 않고, 이클립스에서 바로 실행합니다.
-javac? 자바앱 컴파일러 -> 클래스 실행파일을 만듬.class(자바환경JVM실행)
-메이븐?Maven:웹프로그램 컴파일러-> 웹프로그램(앱) 실행파일을 만듬 .war(톰켓에서 실행)
-메이븐이 컴파일할때,자바소스만 컴파일하는 것이 아니고, 외부 라이브러리도 가져와서 바인딩(묶어줌)하게 됨 = 패키징 이라고 합니다. = war(와르)파일로 패키징됨.
-메이븐이 관리하는 외부라이브러리파일 (lib) 목록을 저장하는 파일 pom.xml 입니다.
-pom.xml에서 자바버전을 1.6->1.8로 변경 후 메이븐을 업데이트 합니다.
-외부 라이브러리 파일을 참조하는 방식을 영어로 =dependency디펜던시
-자바 기초 실습
-자바.java라는  클래스파일을 컴파일해서 생성된.class 파일 실행하는 구조.
-파이썬/자바스크립트는 인터프리터 방식을 실행
-자바스크립트는 함수구조의 프로그래밍.= Function(함수)
-자바는 객체지향(Object Oriented Program) 프로그래밍.
-객체 = 실행가능한 Class(클래스)
-오브젝트(객체) =  실행가능한 Class(클래스)
-야스키,유니코드(UnicodeTypeFormat-8)
-야스키코드 IoT에서 데이터 전송시 필수로 확인해야합니다. 0,1을전송->48,49값을 받습니다.
-IoT프로그램시 하드웨어 값을 주고 받을때 if(var1 == 48){구현내용}
-공유기가 하위 가질수 있는 사설IP는 공유기자기 IP+255개 (여유분) =256개 인터넷이 가능.
-영어인코딩은 아스키코드로 다 표현가능
-Hex(16진수,Dec(10진수),char(문자)=127개/아스키문자의 크기 (컴문자-사람문자 1:1매칭)
-Oct(8진수),Bin(2진수)
-아스키코드 7비트코드(127글자) -> ANSI글자-8비트(256글자)-> UniCode(65536글자)-UTF-8
-UTF8mb4(이모지까지 포함: 이모티콘+이미지)
-자바언어를 한다는 것은 컴파일 후 실행이 된다는 의미 -> 실습예정
-자바스크립트(파이선)은 그냥 실행해서 프로그램을 만들게 됩나다.->실습예정
