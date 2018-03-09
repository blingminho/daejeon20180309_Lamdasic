package basic;
/*
 * 람다식 : 익명함수를 생성하기 위한 식
 * 
 * 람다식(자바관점)
 * 		=> 매개변수를 가진 코드 입력
 * 		=> (런타임시) 익명 구현체로 생성된다
 * 
 * 
 * 인터페이스명 변수명 = 익명구현체 내용; ==> 익명구현체 만들기
 * 
 * 인터페이스명 변수명 = 람다식;
 * 
 * 람다식으로 변환할 수 있는 인터페이스
 * 		==> 함수적 인터페이스
 * 		==> 추상메서드가 1개만 선언되어 있는 인터페이스
 * 		==> 함수적인터페이는 인터페이스명 앞에
 * 			@FunctionalInterface 를 붙여준다.
 * 
 * 람다식 작성 방법
 * 기본 형식)
 * 		(자료형이름 매개변수명, ...) -> {실행문; ...}
 * 		
 * 		1. '자료형이름'을 생략할 수 있다.
 * 			(int a) -> {System.out.println(a);};
 * 			==>
 * 			(a)	-> {System.out.println(a);};
 * 
 * 		2. 매개변수가 1개이면 괄호'( )'를 생략할 수 있다.
 * 			(a)	-> {System.out.println(a);};
 * 			==>
 * 			a -> {System.out.println(a);};
 * 
 * 		3. '실행문'이 1개이면 '{ }'을 생략할 수 있다
 * 			a -> {System.out.println(a);};
 * 			==>
 * 			a -> System.out.println(a);
 * 
 * 		4. 매개변수가 하나도 없으면 괄호'( )'를 생략할 수 없다.
 * 			() -> System.out.println("안녕")
 * 			
 * 		5. 반환값이 있을 경우에는 return을 사용한다.
 * 			실행문에 return명령 하나만 사용할 경우에는
 * 			return과 '{ }'를 생략할 수 있다.
 * 			(a, b) -> {return a+b;};
 * 			==>
 * 			(a, b) -> return a+b;
 * 			==>
 * 			(a, b) -> a+b;
 * 
 * 		
 * 
 */
public class LamdaTest1 {
	public static void main(String[] args) {
		
		// 람다식을 사용하지 않을 경우
		Thread th1 = new Thread(
				// 익명 구현체 부분
				new Runnable() {
					
					@Override
					public void run() {
						for (int i = 0; i < 10; i++) {
							System.out.println(i);
						}
					}
				}
		);
		
		th1.start();
		
		Thread th2 = new Thread(
				() -> {
					for (int i = 0; i < 10; i++) {
						System.out.println("람다식 - " + i);
					}
				}
				
		);
		th2.start();
		
	}
}