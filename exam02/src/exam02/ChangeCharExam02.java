package exam02;

public class ChangeCharExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'E';
		
		int num = 65;
		
		int chToNum = 0;
		
		char intToCh = ' '; // char 에 빈 공간을 넣을 때 띄워서 넣어야 함
		
		// int 와 char 는 자동형변환
		
		// char -> int 는 변경 시 자동형변환 가능
		chToNum = ch;

		// int -> char 변경 시 강제형변환
		intToCh = (char)num;
		
		System.out.println(chToNum);
		System.out.println(intToCh);
	}

}
