import java.util.Random;
import java.util.Scanner;

public class Kazuate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(100);
		
		System.out.println("GAME START");
		System.out.println("���ڸ� �Է� ���� �ּ���.");
		
		int x;
		do {
			x = stdIn.nextInt();
			if(x<no) {
				System.out.println("�� ū �� �Դϴ�.");
			}else if(x>no) {
				System.out.println("�� ���� �� �Դϴ�.");
			}
		}while(x!=no); // ������ �ƴҰ�� ���ѹݺ�
		
		System.out.println("�����Դϴ�.");
	}

}
