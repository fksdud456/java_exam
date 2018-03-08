package day10;

public class RuntimeTest {

	public static void main(String[] args) throws Exception{
		/*
		 * Singleton pattern
		 * 
		 * ���������� ������ ���ٸ��ϴ� ��� err : not visible()
		 * 
		 * non-static �޼��嵵 ������ �����ڸ� ���Ƴ���
		 * Runtime r = new Runtime();
		 * ��� Runtime��ü�� �������ִ� static �޼��尡 ����
		 * 
		 * runtime ��ü�� JVM : JVM ����.
		 * �ַ� �������ڿ��� Ȱ���ϴ� �ֵ��� singleTon
		 * */
		Runtime r = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		Runtime r3 = Runtime.getRuntime();
		System.out.println(r);
		System.out.println(r2);
		System.out.println(r3);
		r.exec("c:/windows/notepad.exe");
		
	}

}
