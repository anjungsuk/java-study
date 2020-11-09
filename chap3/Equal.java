import java.util.Scanner;

public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 a :");
		int a = stdIn.nextInt();
		System.out.println("정수 b :");
		int b = stdIn.nextInt();
		
		if(a==b)
			System.out.println("두 값은 같습니다.");
		else
			System.out.println("두 값은 같지 않습니다.");

	}

}
