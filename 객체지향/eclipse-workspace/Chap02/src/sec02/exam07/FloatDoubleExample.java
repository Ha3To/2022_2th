package sec02.exam07;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//실수값 저장
		//float var1 = 3.14; ---> 컴파일 에러, f를 붙여 float타입인걸 컴파일러에게 알려줘야함
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//정밀도 테스트
		float var4 = 0.1234567890123456789f;	//float타입은 소수점 7자리까지 정밀도 제공
		double var5 = 0.1234567890123456789;	//double타입은 소수점 15자리까지 정밀도 제공
		
		/*
		 * 특별한 조건이 없고, 메모리제약이 없다면 실수는 double형에 저장하자.
		 * 
		 * double은 float의 2배의 정밀도를 갖는다는 의미에서 double이다.
		 */
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		//e사용하기
		double var6 = 3e6;
		float var7 = 3e6f;
		double var8 = 2e-3;
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
	}

}
