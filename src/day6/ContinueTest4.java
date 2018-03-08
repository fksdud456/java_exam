package day6;

import java.util.Scanner;

/*
 삼각형의 행의 갯수를 입력받는 부분에서 0 이하 값이 입력되면
 다시입력받게 변경한다.
 */
public class ContinueTest4 {
	public static void main(String[] args) {
		final char DECO_MARK = '$';
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = scan.nextInt();
			if(num <= 0) 
				continue;			
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(DECO_MARK);
				}
				System.out.println();
			}
			System.out.print("계속하겠습니까?(계속:1,종료2)");
			int prompt = scan.nextInt();
			if(prompt == 2) {
				System.out.println("종료하겠습니다...안녕!!");
				break;
			}	
		}
		scan.close();
		System.out.println("-수행종료-");
	}
}
