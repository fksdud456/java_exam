package day14;

import java.util.HashSet;
import java.util.StringJoiner;

public class StringTest {
	public static void main(String[] args) {
		System.out.println("1".length());    				
		System.out.println("°¡³ª´Ù".length()); 					
		System.out.println("abc".charAt(1)); 			
		System.out.println("abc".toUpperCase());	 	
		String str1 = "ABCDEFGHIJ";
		String str2 = "abcdefgfhij";
		
		System.out.println(str1.substring(4)); // begin 4 ~
		System.out.println(str1.substring(0, 3));  //0<= <3   : ABC		
		System.out.println(str2.indexOf("f"));
		System.out.println(str2.lastIndexOf("f"));      
		System.out.println(str2.replace('h', 'H'));
		
		String str3 = "java:html5:css3:javascript";
		String[] ary = str3.split(":");   
		
		HashSet<String> a = new HashSet<>();
		for(String temp : ary)
			a.add(temp);
		
		for(int i=0; i < ary.length; i++){
			System.out.println(ary[i]);
		}		
		char ch[] = str3.toCharArray();
		System.out.println(str3.length() + " ---- " + ch.length);
		for(int i=0; i < ch.length; i++){
			System.out.print(ch[i] + " ");
		}
		
		System.out.println();
		String animals = "dog, cat, bear";
		String[] arr = animals.split(",");
		System.out.println(String.join("",arr));
		StringJoiner sj = new StringJoiner("/","[","]");
		for(String s : arr)
			sj.add(s);
		System.out.println(sj.toString());
	}
}













