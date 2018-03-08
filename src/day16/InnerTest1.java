package day16;

class Outer {
	void pr() {
		System.out.println("Outer's pr() Method!!");
	}
	class Inner {
		void pr() {
			System.out.println("Inner's pr() Method");
		}
	}
	static class Static_Inner {
		static void pr() {
			System.out.println("Static_inner's pr() Method!!");
		}
	}
}
public class InnerTest1 {

	public static void main(String[] args) {
	//	Outer.Static_Inner.pr();
		new Outer.Static_Inner().pr();
		Outer o = new Outer();
		o.pr();
		Outer.Inner i = o.new Inner();
		i.pr();
	}

}
