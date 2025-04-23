package exam03;

public class UpDownExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		int sum = 0;
		
		// 연산 후 증가 : 대입 후 자신을 증가
		sum = num++;
		
		System.out.println("sum = " + sum + ", num : " + num);
		
		// 연산 전 증가 : 증가 후 대입
		sum = ++num;
		
		System.out.println("sum = " + sum + ", num : " + num);

	}

}
