package day8;

public class BlockTest {
	static {
		System.out.println("static 블럭 수행");
	}
	
	{
		System.out.println("Instance 블럭 수행");
	}
	
	public BlockTest() {
		System.out.println("생성자 수행");
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
