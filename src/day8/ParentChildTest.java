package day8;

class Parent extends java.lang.Object {
	int x = 1;
	int y = 2;
	
	public String toString() {
		/*
		 * default 는 클래스이름@참조 getClass().getName() + '@' + Integer.toHexString(hashCode()) 
		 * 자기 자신을 호출해서 재귀함수 
		 * return toString() + "Parent 클래스의 객체임";
		 */
		return super.toString() + "\tParent 클래스의 객체임";
	}
}

class Child extends Parent{
	//member변수는 부모꺼는 부모꺼 내껀 내꺼 따로야
	int x = 10;
	
	void pr() {
		int x = 100;
		System.out.println(x);	//100
		System.out.println(this.x); //10
		System.out.println(super.x); //1
		System.out.println(y); //2
		System.out.println(this.y); //2
		System.out.println(super.y); //2
	}
	
}

public class ParentChildTest {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.toString());
		System.out.println(p);
		
		System.out.println("------------------------------------------");
		Child c = new Child();
		System.out.println(c.toString());
		System.out.println(c);
		
		c.pr();
	}

}
