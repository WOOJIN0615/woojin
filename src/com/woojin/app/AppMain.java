package com.woojin.app;

import com.woojin.app.Students.CollStudent;
import com.woojin.app.Students.HighStudent;
import com.woojin.app.Students.MiddleStudent;
import com.woojin.app.Students.Student;

public class AppMain {

	public static void main(String[] args) {
		
		// MiddleStudent is a Student
		// MiddleStudent 타입은 Student 타입이다.
		
		MiddleStudent ms = new MiddleStudent();
		HighStudent hs = new HighStudent();
		
		ms.setHistory(60);
		
		Student st=ms;
		ms = (MiddleStudent)st;
		System.out.println(ms.getHistory());
		
		st = new Student("test");
		
		ms = (MiddleStudent)st;
		
		ms = new MiddleStudent();
		hs = new HighStudent();
		
		Student [] students = new Student[2];
		students[0] = ms;
		students[1] = hs;
		
		ms = (MiddleStudent)students[0];
		hs = (HighStudent)students[1];
		
	}

}
