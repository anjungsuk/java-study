import java.util.Scanner;

public class Tutorial4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("ī��Ʈ �ٿ� ����.");
		
		int x;
		do {
			System.out.println("�������� �Է� �Ͻÿ�");
			x = stdIn.nextInt();
		}while(x<=0);
		
		while(x>=-1) {
			System.out.println(x);
			x--;
		}

	}

}
