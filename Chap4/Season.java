import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int retry;
		do {
			System.out.println("������ �� ���� �Է� �Ͻÿ� : ");
			int season = stdIn.nextInt();
			
			if(season>=3 &&season<=5) {
				System.out.println("�ش� ������ ���Դϴ�.");
			}else if(season>=6&&season<=9) {
				System.out.println("�ش� ������ �����Դϴ�.");
			}else if(season>=10&&season<=11) {
				System.out.println("�ش������ ���� �Դϴ�.");
			}else if(season==12||season==1||season==2)
				System.out.println("�ش� ������ �ܿ� �Դϴ�.");
		System.out.println("�ٽ� �����ϽǷ��� 1�� �ƴϸ� 0�� �Է��ϼ���.");
		retry = stdIn.nextInt();
		}while(retry==1); // ���� retry�� �Էµ� ���� 1�̸� retry == 1 �� ���� �� ������ �ϰ� do�� �����
		System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
	}
}

