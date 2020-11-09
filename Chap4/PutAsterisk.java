import java.util.Scanner;

public class PutAsterisk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("몇개의 *을 표시합니까?");
		int n = stdIn.nextInt();
		
		int i = 0;
		while(i <n ) {
			System.out.println('*');
			i++;
		}
		System.out.println();
	}

}
