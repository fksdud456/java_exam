package day8;

public class BlockTest {
	static {
		System.out.println("static �� ����");
	}
	
	{
		System.out.println("Instance �� ����");
	}
	
	public BlockTest() {
		System.out.println("������ ����");
	}
	
	public static void main(String[] args) {
		System.out.println("BlcoTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		System.out.println(bt);
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
		System.out.println(bt2);
	}

}
