import java.util.Scanner;

public class Tutorial3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���� A : ");
		int a = stdIn.nextInt();
		System.out.println("���� B : ");
		int b = stdIn.nextInt();
		
		if((a%b)==0) {
			System.out.println("B�� A�� ����Դϴ�.");
		}else {
			System.out.println("B�� A�� ����� �ƴմϴ�.");
		}
		

	}

}
