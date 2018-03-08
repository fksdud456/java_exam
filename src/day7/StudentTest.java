package day7;
class Student {
	String name;
	int age;
	String project;
	
	Student() {
		System.out.println("Student Ŭ���� ��ü ����!!");
	}
	
	Student(String name, int age, String project) {
		this.name = name;
		this.age = age;
		this.project = project;
	}
	Student(String project) {
		
		this("��ġ", 100, project);
		
	}
	
	void study() {
		System.out.println(name + "�� "+project+"�� �н��մϴ�.");
	}
	void studentInfo() {
		System.out.println(name + " : " + age);
	}
}
public class StudentTest {
	public static void main(String[] args) throws Exception{
		System.out.println("main() �޼��� �������");
		//Thread.sleep(5000); // ����ӵ� üũ��
		System.out.println("Student Ŭ������ ��ü ����-1");
		Student st1 = new Student();
		st1.name = "��ũ";
		st1.age = 22;
		st1.project = "�ڹ�";
		st1.studentInfo();
		st1.study();
		//Thread.sleep(5000);
		System.out.println("Student Ŭ������ ��ü ����-2");
		Student st2 = new Student("�Ѹ�", 22, "����");
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
		System.out.println("main() �޼��� ��������");
	}
}







