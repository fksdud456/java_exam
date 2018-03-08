package day5;
public class MethodLab3 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++){
			System.out.print(getRandom(10));
			if(i<4) 
				System.out.print(", ");
		}
		System.out.println();
		
		for(int i=0; i<5; i++){
			System.out.print(getRandom(10,20));
			if(i<4) 
				System.out.print(", ");
		}
	}
	public static int getRandom(int n) {
		return (int)(Math.random()*n)+1;
	}
	public static int getRandom(int n1, int n2) {
		return (int)(Math.random()*(n2-n1+1))+n1;
	}
}



