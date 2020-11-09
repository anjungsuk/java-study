import java.util.Scanner;

public class Tutorial4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("카운트 다운 시작.");
		
		int x;
		do {
			System.out.println("정숫값을 입력 하시오");
			x = stdIn.nextInt();
		}while(x<=0);
		
		while(x>=-1) {
			System.out.println(x);
			x--;
		}

	}

}
