import java.util.Scanner;

public class Tutorial3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값 : ");
		int a = stdIn.nextInt();
		
		if(a>0) {
			System.out.println("a의 값입니다.");
		}else {
			System.out.println("절대값은 5 입니다.");
		}

	}

}
