import java.util.Scanner;

public class Tutorial4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정숫값 : ");
		int n = stdIn.nextInt();
		int cnt = 0;
		for(int i = 1; i<=n; i++) {
			if(n%i == 0) {
				System.out.println(i);
				cnt++;
			}
			
	
		}
		System.out.print("약수의 개수는"+cnt+"입니다.");
	}

}
