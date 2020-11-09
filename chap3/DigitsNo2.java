import java.util.Scanner;

public class DigitsNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값 : ");
		int a = stdIn.nextInt();
		
		if(a <= -10 || a >= 10) {
			System.out.println("2자릿수 이상입니다.");
		}else {
			System.out.println("2자릿수 미만입니다.");
		}

	}

}
