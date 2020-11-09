import java.util.Scanner;

public class DigitsNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값을 입력 하시오 : ");
		int a = stdIn.nextInt();
		
		if (a == 0) {
			System.out.println("0입니다.");
		} else if (a>=-9 && a<=9) {
			System.out.println("1의 자리입니다.");
		} else {
			System.out.println("10의 자리입니다.");
		}

	}

}
