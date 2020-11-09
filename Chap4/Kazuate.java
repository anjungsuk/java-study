import java.util.Random;
import java.util.Scanner;

public class Kazuate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		int no = rand.nextInt(100);
		
		System.out.println("GAME START");
		System.out.println("숫자를 입력 시켜 주세요.");
		
		int x;
		do {
			x = stdIn.nextInt();
			if(x<no) {
				System.out.println("더 큰 수 입니다.");
			}else if(x>no) {
				System.out.println("더 작은 수 입니다.");
			}
		}while(x!=no); // 정답이 아닐경우 무한반복
		
		System.out.println("정답입니다.");
	}

}
