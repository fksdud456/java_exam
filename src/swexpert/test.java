package swexpert;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=1;
		int c= d++;
		System.out.println(c);
		System.out.println(c);
		
		System.out.println(d);

		System.out.println();
		int a=0;
		int b= 0;

		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("a: "+ a++);
			System.out.println("b:" + ++b);
			System.out.println("a결과: "+ a);
			System.out.println("b결과:" + b);
			if(b==2) {
				if( a == 2 ) {
					System.out.println("end");
					break;
				}				
			}


		}
	}

}
