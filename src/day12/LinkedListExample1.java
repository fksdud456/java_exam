package day12;
import java.util.*;
class LinkedListExample1 {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("����");          
        list.add("����");          
        list.add("������");          
        int num = list.size();
        for (int cnt = 0; cnt < num; cnt++) {
            String str = list.get(cnt);
            System.out.println(str);
        }
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(new Integer(100));       
        list2.add(1000);// JDK 1.5 ���� AUTO Boxing �̶�� ������ ����
        //list2.add("1000");
    }
}
