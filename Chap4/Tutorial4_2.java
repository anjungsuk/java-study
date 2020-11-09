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
			System.out.println("숫자를 입력하세요:");
			x = stdIn.nextInt();
			
			if(x<num) {
				System.out.println("더 큰 수 입니다.");
			}else if(x>num) {
				System.out.println("더 작은 수 입니다.");
			}
			
		}while(x == num);

		System.out.println();
		x++;
	}

}
