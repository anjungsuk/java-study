import java.util.Scanner;

public class DigitsNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ : ");
		int a = stdIn.nextInt();
		
		if(a <= -10 || a >= 10) {
			System.out.println("2�ڸ��� �̻��Դϴ�.");
		}else {
			System.out.println("2�ڸ��� �̸��Դϴ�.");
		}

	}

}
