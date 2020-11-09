import java.util.Scanner;

public class Tutorial4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("A값을 입력 하시오");
		int a = stdIn.nextInt();
		System.out.println("B값을 입력 하시오");
		int b = stdIn.nextInt();
		
		do {
			System.out.println(b);
			b++;
		}while(b<=a);
		
		
		//int count = 1;
	       /* do {
	            System.out.println("Count is: " + count);
	            count++;
	        } while (count < 11);*/
		    }
}
