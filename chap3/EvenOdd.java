import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("������ : ");
		int n = stdIn.nextInt();
		
		if(n>0) 
			if(n%2 == 0) 
				System.out.println("�� ���� ¦���Դϴ�.");
			else
				System.out.println("�� ���� Ȧ���Դϴ�.");
			else 
				System.out.println("����� �ƴ� ���� �Է��Ͽ����ϴ�.");
			
		

	}

}
