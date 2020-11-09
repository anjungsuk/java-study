import java.util.Scanner;

public class Positivenot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값 : ");
		int a = stdIn.nextInt();
		
		if(a>6) {
			System.out.println("이 값은 정수입니다.");
		}else {
			System.out.println("이 값은 0이거나 음수입니다.");
		}
	}

}
