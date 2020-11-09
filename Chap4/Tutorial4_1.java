import java.util.Scanner;

public class Tutorial4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int retry;
		do {
			System.out.println("숫자를 입력 하십시오 : ");
			int x = stdIn.nextInt();
			if(x>0) {
				System.out.println("이 값은 정수 입니다.");
			}else if(x<0) { 
				System.out.println("이 값은 음수 입니다.");
			}else
				System.out.println("이 값은 0 입니다.");
			
				System.out.println("해당 구문을 재실행 하실려면 1 아니면 다른 숫자를 누르시오.");
				retry=stdIn.nextInt();
		}while(retry == 1);
		
		

	}

}
