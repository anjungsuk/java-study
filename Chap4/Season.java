import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int retry;
		do {
			System.out.println("계절의 월 수를 입력 하시오 : ");
			int season = stdIn.nextInt();
			
			if(season>=3 &&season<=5) {
				System.out.println("해당 계절은 봄입니다.");
			}else if(season>=6&&season<=9) {
				System.out.println("해당 계절은 여름입니다.");
			}else if(season>=10&&season<=11) {
				System.out.println("해당계절은 가을 입니다.");
			}else if(season==12||season==1||season==2)
				System.out.println("해당 계절은 겨울 입니다.");
		System.out.println("다시 시작하실려면 1을 아니면 0을 입력하세요.");
		retry = stdIn.nextInt();
		}while(retry==1); // 변수 retry에 입력된 값이 1이면 retry == 1 을 통해 참 구분을 하고 do문 재실행
		System.out.println("프로그램이 종료 되었습니다.");
	}
}

