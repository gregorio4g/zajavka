package com.gg.zad7.z4;

public class Teacher extends Person implements Examiner {
	public Teacher(final String name) {
		super(name);
		System.out.println("Creating teacher: " + name);
	}

	@Override
	public String toString() {
		return "Teacher: " + super.toString();
	}

	@Override
	public Exam[] createExams(int numberOfStudents) {
		Exam[] exams = new Exam[numberOfStudents];
		for (int i = 0; i < exams.length; i++) {
			exams[i] = createExam();
		}
		System.out.println("Teacher created " + numberOfStudents + " exams");
		return exams;
	}

	private Exam createExam() {
		return new Exam();
	}

	@Override
	public void evaluteExam(Exam[] exams) {
		for (Exam exam :
				exams) {
			System.out.println("Teacher evaluating " + exam.getStudent() + " exam");
			exam.calculateScore();
			System.out.println(exam.getStudent().toString() + " points scored: " + exam.getScore());
			System.out.println();
		}
	}
}
