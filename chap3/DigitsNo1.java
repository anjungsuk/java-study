import java.util.Scanner;

public class DigitsNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�������� �Է� �Ͻÿ� : ");
		int a = stdIn.nextInt();
		
		if (a == 0) {
			System.out.println("0�Դϴ�.");
		} else if (a>=-9 && a<=9) {
			System.out.println("1�� �ڸ��Դϴ�.");
		} else {
			System.out.println("10�� �ڸ��Դϴ�.");
		}

	}

}
