package day12;
import java.util.*;
class ArrayListExample3 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("�ӷ�");            
        list.add("���");           
        list.add("�޵�");       
        list.add("�ڵ�");       
        list.add("���");         
        int index1 = list.indexOf("���"); 
        int index2 = list.lastIndexOf("���"); 
        System.out.println("ù��° ���: " + index1);
        System.out.println("������ ���: " + index2);
    }
}
