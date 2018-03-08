package day6;
public class MethodLab6 {
	public static void convertChar(char munja[]){
		for(int i = 0; i<munja.length; i++){
			if(munja[i]>=97){
				munja[i] = (char)(munja[i] - 32 );
			}else{
				munja[i] = (char)(munja[i] + 32);
			}
		}
	}
	public static void startcall(char arr[]){
		System.out.println("----------------");
		System.out.print("호출전 : ");
		System.out.print(arr);
		System.out.println();
	}
	public static void endcall(char arr[]){
		convertChar(arr);
		System.out.print("호출후 : ");
		System.out.print(arr);
		System.out.println();
		
	}
	public static void main(String[] args) {		
		char[] arr1 = { 'A' , 'b', 'C'};
		startcall(arr1);
		endcall(arr1);
		char[] arr2 = { 'a' , 'b', 'c', 'D', 'E', 'F'};
		startcall(arr2);
		endcall(arr2);
		char[] arr3 = { 'z' , 'S', 'Z', 'S'};
		startcall(arr3);
		endcall(arr3);
		System.out.println("----------------");
	}

}
