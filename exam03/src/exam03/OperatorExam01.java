package exam03;

public class OperatorExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num01 = 100;
		byte byNum01 = 10;
		long lyNum01 = 20;
		double dyNum01 = 33.3333;
		
		// byte 끼리 더했는데 결과는 int로 반환
		// byte byResult = byNum01 + byNum01;
		
		int inresult01 = byNum01 + byNum01;
		
		long inResult01 = lyNum01 + num01;
		
		inResult01 = byNum01 + num01;
		
		int target = 10;
		
		System.out.println(target % 3);

	}

}
