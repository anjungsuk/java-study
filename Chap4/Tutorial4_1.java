import java.util.Scanner;

public class Tutorial4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int retry;
		do {
			System.out.println("���ڸ� �Է� �Ͻʽÿ� : ");
			int x = stdIn.nextInt();
			if(x>0) {
				System.out.println("�� ���� ���� �Դϴ�.");
			}else if(x<0) { 
				System.out.println("�� ���� ���� �Դϴ�.");
			}else
				System.out.println("�� ���� 0 �Դϴ�.");
			
				System.out.println("�ش� ������ ����� �ϽǷ��� 1 �ƴϸ� �ٸ� ���ڸ� �����ÿ�.");
				retry=stdIn.nextInt();
		}while(retry == 1);
		
		

	}

}
