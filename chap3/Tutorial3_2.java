import java.util.Scanner;

public class Tutorial3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 A : ");
		int a = stdIn.nextInt();
		System.out.println("정수 B : ");
		int b = stdIn.nextInt();
		
		if((a%b)==0) {
			System.out.println("B는 A의 약수입니다.");
		}else {
			System.out.println("B는 A의 약수가 아닙니다.");
		}
		

	}

}
