package day11;
public class ExceptionTest1 {
	public static void main(String[] args) {
		System.out.println("main() �������..");
		try  {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1 / num2;
			System.out.println("���� ��� : " + result);
			//���ܰ� �߻��� ���� �ִ�,  ���๮���� 1�� �̻�
		}
		/*catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�� ���� ���α׷� �ƱԸ�Ʈ�� �Է��ϼ���");
		}*/catch(ArithmeticException e) {
			System.out.println("�� ��° ���ڴ� 0�� �� ����");
			/*System.out.println(e.getMessage());
			System.out.println(e);*/
			e.printStackTrace(); // �񵿱�� �޼��� ����  
			return;
		}catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ�");
			e.printStackTrace();
		}		catch (Exception e) {
			System.out.println("�� ���� ���α׷� �ƱԸ�Ʈ�� �Է��ϼ���");
		}finally {// 0�� �Ǵ� 1�� �´�.
			System.out.println("�� ���� �ݵ�� �����մϴٿ�...");
		}
		System.out.println("main() ��������..");
		/*
		 * finally -- �� ���� �ݵ��.
		 * ������  -- main() ��������
		 * ���� ������
		 * 
		 * ArithmeticException �� return �߰����� �� . 
		 * return �ص� finally ���� ������.
		 * 
		 * jvm�� �����ϴٰ� try���� 2��°�ٿ��� exception�߻�
		 * �׷� 3,4��° ���� �������� �ʰ� catch�� exception���� ��
		 * 
		 */	
		
		
		
	}

}
