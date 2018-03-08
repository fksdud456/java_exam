package day12;
import java.util.*;
public class HashMapExample1 {
    public static void main(String args[]) {
        HashMap<String, Integer> map = 
        		new HashMap<>();
        map.put("해리", 95);
        map.put("헤르미온느", 100);
        map.put("론", 85);
        map.put("드레이코", 93);
        map.put("네빌", 70);
        map.put("헤르미온느", 55); // JDK 1.5 Auto Boxing 구문
        System.out.println(map);
        Integer num = map.get("헤르미온느");
        System.out.println("헤르미온느의 성적은? " + num);
        // HashMap 객체에 저장된 데이터들의 name(key) 들만
        // 추출해서 화면에 출력해 본다.
        System.out.println(map.keySet());
        // HashMap 객체에 저장된 데이터들을
        // name --> value
        // 형식으로 행단위로 출력해 본다.
        Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str + " --> " + map.get(str));
		}		
		for (String str : map.keySet())
			System.out.println(str + " --> " + map.get(str));		
		System.out.println("또 다른 방법");
		Object names[] = map.keySet().toArray();
		for(int i=0; i < names.length; i++)
			System.out.println(names[i] + " --> " + 
		                                      map.get(names[i]));		
    }
}





