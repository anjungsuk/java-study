import java.util.Scanner;

public class tutorial4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner stdIn = new Scanner(System.in);
				
				System.out.println("ī��Ʈ �ٿ��� �մϴ�.");
				
				int x;
				
				do {
					System.out.println("�������� �Է� �Ͻÿ� : ");
					x = stdIn.nextInt();
					
				}while(x<=0);
				
				while(x>=0){
					System.out.println(x);
					++x;
				}
				

			}

	}
