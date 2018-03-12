package basic;

public class LamdaTest3 {
	
	// 메서드의 매개변수도 그 메서드의 지역 변수 이다.
	public void testMethod(final int temp) {
		final int localVal = 40;// 변경할 여지가 없으므로 final을 안붙여도 된다
		int test = 100;
		
//		temp = 300;// 에러발생
//		localVar = 111;
		
		test = 30;// 람다식 내부에서 사용하는 변수가 아니므로 자유롭다(final 안붙여도 된다)
		
		// 람다식 내부에서 사용되는 지역변수는 final이어야 한다
		// 보통은 final을 붙이지 않으면 컴파일러가 자동으로 붙여준다.
		
		LamdaTestInterface lt = () -> {
			//람다식에서 로컬변수 사용하기
			System.out.println("temp = " + temp);
			System.out.println("localVal = " + localVal);
		};
		
		lt.test();
	}
	
	public static void main(String[] args) {
		LamdaTest3 lamda = new LamdaTest3();
		lamda.testMethod(500);
	}
}
