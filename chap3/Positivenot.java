import java.util.Scanner;

public class Positivenot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ : ");
		int a = stdIn.nextInt();
		
		if(a>6) {
			System.out.println("�� ���� �����Դϴ�.");
		}else {
			System.out.println("�� ���� 0�̰ų� �����Դϴ�.");
		}
	}

}
