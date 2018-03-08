package day7;
class Member {
	String name;
	String account;
	String passwd;
	int birthyear;	
	String getMemberInfo() {
		return name + ":" + account + ":" + birthyear +":" + passwd;
	}
}
public class MemberTest {
	public static void main(String[] args) { 
		Member m1 = new Member();
		System.out.println(m1);
		System.out.println(m1.getMemberInfo());
		m1.name="°í±æµ¿";
		m1.account="guest";
		m1.passwd="@12345";
		m1.birthyear=2010;
		System.out.println(m1.getMemberInfo());
		m1 = null;
		//System.out.println(m1.getMemberInfo());
	}
}








