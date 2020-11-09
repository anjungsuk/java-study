import java.util.Scanner;

public class Tutorial4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("nÀÇ °ª : ");
		int n = stdIn.nextInt();
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			sum += i;
			System.out.print(sum);
		}

	}

}
