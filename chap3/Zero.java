import java.util.Scanner;

public class Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값 : ");
		int a = stdIn.nextInt();
		
		if(!(a != 0))
			System.out.println("이 값은 0입니다.");
		else
			System.out.println("이값은 0이 아닙니다.");
		
		

	}

}
