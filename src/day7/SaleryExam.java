package day7;

import day5.MethodLab3;

class SaleryExpr {
	int bonus;

	SaleryExpr() {
		this(0);
	}

	SaleryExpr(int bonus) {
		this.bonus = bonus;
	}

	int getSalary(int grade) {
		int salary = 0;

		switch (grade) {
		case 1:
			salary = bonus + 100;
			break;
		case 2:
			salary = bonus + 90;
			break;
		case 3:
			salary = bonus + 80;
			break;
		case 4:
			salary = bonus + 70;
			break;
		default:
			salary = bonus;
			break;	//필요X 어차피 빠져나감
		}
		return salary;
	}
}

public class SaleryExam {

	public static void main(String[] args) {
		int month = MethodLab3.getRandom(12);
		int grade = MethodLab3.getRandom(4);
		
		SaleryExpr s;
		if (month % 2 == 0)
			s = new SaleryExpr(100);
		else 
			s = new SaleryExpr();		

		System.out.println(month + "월 " + grade + "등급의 월급은 " + s.getSalary(grade) + "입니다.");
	}

}
