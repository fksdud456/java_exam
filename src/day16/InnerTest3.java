package day16;

abstract class Test {
	//
	Test() {
		System.out.println("NoArgument");
	}
	abstract void output(String s);
}
public class InnerTest3 {
	void pr(Test o) {
		o.output("Test"); 
	}
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		InnerTest3 n  = new InnerTest3();
		n.pr(new Test() {
			int su = 100;
			public void output(String s) {
				System.out.println("Anonymous Class " + s) ;
				System.out.println("Anonymous Class " + su) ;
			}
		});
		
	}

}
