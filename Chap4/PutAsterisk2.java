import java.util.Scanner;

public class PutAsterisk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("ȭ�鿡 ����� *�� ��ΰ���");
		int n = stdIn.nextInt();
		
		int i = 1;
		while(i<=n) {
			System.out.println('*');
			i++;
		}
		System.out.println();
	}

}
