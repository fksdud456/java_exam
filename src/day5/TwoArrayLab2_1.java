package day5;
public class TwoArrayLab2_1 {
	public static void main(String[] args) {
		char munja[][] = {
				{'B','C','A','A'},
				{'C','C','B','B'},
				{'D','A','A','D'},
				};
		int list [] = new int [4];
		list[0] = 'A';
		list[1] = 'B';
		list[2] = 'C';
		list[3] = 'D';
		int a=0;int b=0;int c=0;int d=0;
		for (int i =0;i<munja.length;i++) {
			for (int j=0;j<munja[0].length;j++) {
				if (munja[i][j]==list[0]) {
					a++;
				}else if (munja[i][j]==list[1]) {
					b++;
				}else if (munja[i][j]==list[2]) {
					c++;
				}else {
					d++;
				}
			}
		}
		System.out.println((char)list[0]+"는 "+a+"개 입니다");
		System.out.println("B는 "+b+"개 입니다");
		System.out.println("C는 "+c+"개 입니다");
		System.out.println("D는 "+d+"개 입니다");
	}
}



