package day6;

public class StudentTest {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "��ũ";
		st1.age = 22;
		st1.project = "�ڹ�";
		st1.studentInfo();
		st1.study();
		Student st2 = new Student();
		st2.name = "�Ѹ�";
		st2.age = 22;
		st2.project = "����";
		st2.studentInfo();
		st2.study();
		System.out.println(st1);
		System.out.println(st2);
		System.out.println("st2 = st1 ����");
		st2 = st1;
		System.out.println(st1);
		System.out.println(st2);		
		st2.studentInfo();
		st2.study();
	}
}







