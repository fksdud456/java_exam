package test;

public class WordTest {
	public static void main(String[] args) {
		WordCount a = new WordCount();
		String s = "Java is a object oriented programming language and general purpose language";
		System.out.println("���1 : " + a.countString(s, true));
		System.out.println("���2 : " + a.countString(s, false));
	}
}