package day6;

import java.io.Serializable;

public class Student implements Serializable {
	String name;
	int age;
	String project;

	public Student() {
		super();
	}

	public Student(String name, int age, String project) {
		super();
		this.name = name;
		this.age = age;
		this.project = project;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", project=" + project + "]";
	}

	public void study() {
		System.out.println(name + "가 " + project + "를 학습합니다.");
	}

	public void studentInfo() {
		System.out.println(name + " : " + age);
	}
}
