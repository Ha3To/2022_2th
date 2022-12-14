package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);
		System.out.printf("상품의 가격:%6d원\n", value);
		System.out.printf("상품의 가격:%-6d원\n", value);
		System.out.printf("상품의 가격:%06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}

/*
 * println -> 내용출력후 행바꿈
 * printf -> 내용만 출력
 * printf("형식문자열", 값1, 값2, ...) -> 괄호안 첫번째 문자열 형식대로 내용 출력
 * 
 * p.92
 */