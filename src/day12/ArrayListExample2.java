package day12;
import java.util.*;
public class ArrayListExample2 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("����");            
        list.add("����");           
        list.add("������");  
        System.out.println(list);
        list.add(2, "Ű��"); 
        System.out.println(list);
        list.set(0, "������"); 
        System.out.println(list);
        list.remove(1);   
        System.out.println(list);
        list.remove("Ű��");
        System.out.println(list);
        int num = list.size();
        for (int cnt = 0; cnt < num; cnt++) {
            String str = list.get(cnt);
            System.out.println(str);
        }
        for(String fruit : list)
        	System.out.println(fruit);
        Iterator<String> iter = list.iterator();
        while(iter.hasNext())
        	System.out.println(iter.next());
        
    }
}
