package basic;

// 함수적 인터페이스 구현

public class LamdaTest2 {
	public static void main(String[] args) {
		// 람다식을 사용하지 않았을 경우
		LamdaTestInterface t1 = new LamdaTestInterface() {
			
			@Override
			public void test() {
				System.out.println("안녕하세요 - 람다식 사용 안함");
			}
		};
		
		t1.test();// 구현한 메서드 호출
		
		// 람다식 사용하기
		// 람다식은 인터페이스에 선언된 메서드를 구현하는 것이다.
		LamdaTestInterface t2 = () -> {
			System.out.println("안녕하세요 - 람다식 사용");
		};
		
		t2.test();// 구현한 메서드 호출
		
		
		LamdaTestInterface t3 = () -> System.out.println("안녕하세요2 - 람다식 사용");
		
		t3.test();// 구현한 메서드 호출
		
		System.out.println("===============================================================");
		
		LamdaTestInterface2 t4 = (int a) -> {
			int k = a + 100;
			System.out.println("k = " + k);
		};
		
		t4.test(30);
		
		
		LamdaTestInterface2 t5 = (a) -> {
			int j = a - 50;
			System.out.println("j = " + j);
		};
		
		t5.test(30);
		
		
		LamdaTestInterface2 t6 = a -> {
			int h = a * 10;
			System.out.println("h = " + h);
		};
		
		t6.test(30);
		
		
		LamdaTestInterface3 t7 = (int a, int b) -> {
			int r = a + b;
			return r;
		};
		int y = t7.test(11, 63);
		System.out.println("반환값 y = " + y);
		
		
		LamdaTestInterface3 t8 = (a, b) -> {
			return a * b;
		};
		int x = t8.test(5, 9);
		System.out.println("반환값 x = " + x);
		
		
		LamdaTestInterface3 t9 = (a, b) -> a - b;
		int z = t9.test(25, 8);
		System.out.println("반환값 z = " + z);
		
		
		
		
		
	}
}
