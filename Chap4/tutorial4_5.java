import java.util.Scanner;

public class tutorial4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner stdIn = new Scanner(System.in);
				
				System.out.println("카운트 다운을 합니다.");
				
				int x;
				
				do {
					System.out.println("정숫값을 입력 하시오 : ");
					x = stdIn.nextInt();
					
				}while(x<=0);
				
				while(x>=0){
					System.out.println(x);
					++x;
				}
				

			}

	}
