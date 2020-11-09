import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값 : ");
		int n = stdIn.nextInt();
		
		if(n>0) 
			if(n%2 == 0) 
				System.out.println("이 값은 짝수입니다.");
			else
				System.out.println("이 값은 홀수입니다.");
			else 
				System.out.println("양수가 아닌 값을 입력하였습니다.");
			
		

	}

}
