import java.util.Random;
import java.util.Scanner;

public class Tutorial4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int num = rand.nextInt(100)+10;
		
		int x;
		do {
			System.out.println("GAME START");
			System.out.println("���ڸ� �Է��ϼ���:");
			x = stdIn.nextInt();
			
			if(x<num) {
				System.out.println("�� ū �� �Դϴ�.");
			}else if(x>num) {
				System.out.println("�� ���� �� �Դϴ�.");
			}
			
		}while(x == num);

		System.out.println();
		x++;
	}

}
