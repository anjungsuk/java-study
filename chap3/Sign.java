import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ : ");
		int a = stdIn.nextInt();
		
		if(a>0) {
			System.out.println("�̰��� �����Դϴ�.");
			
		}else if (a<0) {
			System.out.println("�̰��� �����Դϴ�.");
			
		}else {
			System.out.println("�̰��� 0 �Դϴ�.");
		}

	}

}