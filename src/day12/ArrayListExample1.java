package day12;
import java.util.*;
class ArrayListExample1 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("����");          
        list.add("����");          
        list.add("������");          
        int num = list.size();
        for (int cnt = 0; cnt < num; cnt++) {
            String str = list.get(cnt);
            System.out.println(str);
        }
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(new Integer(100));        
        list2.add(1000);// JDK 1.5 ���� AUTO Boxing �̶�� ������ ����
        //list2.add("1000");
    }
}


