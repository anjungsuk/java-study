import java.util.Scanner;

public class FingerFlashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int hand;
		
		do {
			System.out.println("���� �����Ͻÿ�(0����/1����/2��");
			
			hand = stdIn.nextInt();
			
		}while(hand<0||hand>2);
		
		switch(hand) {
		case 0 :
			System.out.println("����");
			break;
		case 1 :
			System.out.println("����");
			break;
		case 2 :
			System.out.println("��");
			break;
		}

	}

}
