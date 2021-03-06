package day11;

import java.util.Random;

class TestException extends Exception {
	TestException(String message) {
		super(message);
	}
}

/*
 * b適掘什, c適掘什澗 throws 背辞 硲窒吉 五辞球稽 森須坦軒 角沿 
 * a適掘什拭辞 森須坦軒 try-catch
 * 森須 降持鞠檎 陥製 姥庚 呪楳 馬走 省壱 森須説聖 凶猿走 硲窒廃 敗呪稽 宜焼姶
 */
public class ExceptionTest3 {

	public static void main(String[] args) {
		System.out.println("main() 呪楳獣拙");
		a();
		System.out.println("main() 呪楳曽戟");
	}

	static void a() {
		System.out.println("a() 呪楳獣拙");
		try {
			b();
		} catch (TestException e) {
			//System.out.println("神嫌降持 : " + e.getMessage());
			//return; //赤聖 凶 蒸聖 凶
			/*e.printStackTrace();*/
			System.exit(0);
		}
		System.out.println("a() 呪楳曽戟");

	}

	static void b() throws TestException {
		System.out.println("b() 呪楳獣拙");
		c();
		System.out.println("b() 呪楳曽戟");
	}

	static void c() throws TestException {
		System.out.println("c() 呪楳獣拙");
		boolean flag = new Random().nextBoolean(); //沓棋生稽 森須 降持獣迭走 食採 竺舛
		if (flag) {
			throw new TestException("<<:::::砺什闘稽 森須降持獣鉄:::::>>"); 
		} else {
			System.out.println("せせせせせせせせせせ");
		}
		System.out.println("c() 呪楳曽戟");
	}

}
