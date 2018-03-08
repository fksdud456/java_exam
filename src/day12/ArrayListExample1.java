package day12;
import java.util.*;
class ArrayListExample1 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("포도");          
        list.add("딸기");          
        list.add("복숭아");          
        int num = list.size();
        for (int cnt = 0; cnt < num; cnt++) {
            String str = list.get(cnt);
            System.out.println(str);
        }
        System.out.println(list);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(new Integer(100));        
        list2.add(1000);// JDK 1.5 부터 AUTO Boxing 이라는 구문이 지원
        //list2.add("1000");
    }
}


