import java.util.Scanner;

public class FingerFlashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int hand;
		
		do {
			System.out.println("손을 선택하시오(0가위/1바위/2보");
			
			hand = stdIn.nextInt();
			
		}while(hand<0||hand>2);
		
		switch(hand) {
		case 0 :
			System.out.println("가위");
			break;
		case 1 :
			System.out.println("바위");
			break;
		case 2 :
			System.out.println("보");
			break;
		}

	}

}
