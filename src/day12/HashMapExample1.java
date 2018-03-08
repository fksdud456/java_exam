package day12;
import java.util.*;
public class HashMapExample1 {
    public static void main(String args[]) {
        HashMap<String, Integer> map = 
        		new HashMap<>();
        map.put("�ظ�", 95);
        map.put("�츣�̿´�", 100);
        map.put("��", 85);
        map.put("�巹����", 93);
        map.put("�׺�", 70);
        map.put("�츣�̿´�", 55); // JDK 1.5 Auto Boxing ����
        System.out.println(map);
        Integer num = map.get("�츣�̿´�");
        System.out.println("�츣�̿´��� ������? " + num);
        // HashMap ��ü�� ����� �����͵��� name(key) �鸸
        // �����ؼ� ȭ�鿡 ����� ����.
        System.out.println(map.keySet());
        // HashMap ��ü�� ����� �����͵���
        // name --> value
        // �������� ������� ����� ����.
        Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str + " --> " + map.get(str));
		}		
		for (String str : map.keySet())
			System.out.println(str + " --> " + map.get(str));		
		System.out.println("�� �ٸ� ���");
		Object names[] = map.keySet().toArray();
		for(int i=0; i < names.length; i++)
			System.out.println(names[i] + " --> " + 
		                                      map.get(names[i]));		
    }
}





