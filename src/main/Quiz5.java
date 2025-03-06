package main;

import java.util.ArrayList;
import java.util.List;

public class Quiz5 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1001, "둘리"));
		list.add(new Student(1002, "또치"));
		list.add(new Student(1003, "도우너"));
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i).showInfo();
		}
	}
}

class Student {
	int sNum;
	String sName;
	
	public Student(int sNum, String sName) {
		this.sName = sName;
		this.sNum = sNum;
	}
	
	public void showInfo() {
		System.out.println("Student " + "[studentID=" + this.sNum + ", studentName=" + this.sName + "]"	);
	}
}
