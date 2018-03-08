package day13;

import java.util.Arrays;
import java.util.HashSet;

class Person implements Comparable<Person>{
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person tmp = (Person)obj;
			return name.equals(tmp.name) && age == tmp.age;			
		}
		return false;
	}

	public int hashCode() {
		return name.hashCode()+age;
	}

	public String toString() {
		return name + ":" + age;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	
	public int compareTo(Person p) {
		int result = -1;
		if(age > p.age)
			result = 1;
		return result;
	}
}

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		set.add(new Person("Tom",10));
		set.add(new Person("David",20));
		set.add(new Person("David", 10));
		System.out.println(set);
		
		Person p1 = new Person("µ‡≈©", 22);
		Person p2 = new Person("µ‡≈©", 22);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.equals(p2));
		set.add(p1);
		System.out.println(set);
		System.out.println(set);
		Person p3 = p1;
		p3.SetName("µ‡≈©");
		System.out.println(p1.equals(p3));
		
		System.out.println(set);
		
		Object ary[] = set.toArray();
		for(Object d:ary)
			System.out.println(d);
		Arrays.sort(ary);	
		for(Object d:ary)
			System.out.println(d);
		
	}
}
