package com.gg.zadania.zad07.z4;

public class Main {
	public static void main(String[] args) {
      Examiner teacher = new Teacher("Teacher Teacher");
			Examinated[] students = new Student[]{
					new Student("Rafał Rafalski"),
					new Student("Roman Romański"),
					new Student("Michał Michalski"),
			};
//		System.out.println();
		Exam[] exams = teacher.createExams(students.length);
		for (int i = 0; i < students.length; i++) {
			students[i].writeExam(exams[i]);
		}
//		System.out.println();
		teacher.evaluteExam(exams);
	}
}
