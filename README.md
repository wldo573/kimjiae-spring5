#### 20210527(목) 작업예정
-3장 객체와 클래스 부터시작
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
