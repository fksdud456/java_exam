package day4;
public class ArrayTest3 {
	public static void main(String[] args) {
		int score[ ] = new int[30];
		for(int i=0; i < score.length; i++)
			System.out.println(score[i]);		
		for(int i=0; i < score.length; i++)
			score[i] = (i+1) * 100;
		for(int i=0; i < score.length; i++)
			System.out.println(score[i]);		
		for(int i=0; i < score.length; i++)
			System.out.println(++score[i]);
	}
}








