package basic.ch19;

public class Classroom {

	private String className;
	private Student[] students;
	private int studentCount;
	private final int MAX_STUDENT = 30;

	public Classroom(String className) {
		this.className = className;
		students = new Student[MAX_STUDENT];
		this.studentCount = 0;
	}

	// 학생을 추가하는 메서드(기능)를 만들고 싶다.
	public void addStudent(Student student) {
		if (studentCount < MAX_STUDENT) {
			students[studentCount] = student;
			studentCount++;
		} else {
			System.out.println("정원 초과");
		}
	}

	// 학습에 속한 모든 학생 정보를 출력하는 기능을 만드시오.
	public void showStudents() {
		for (int i = 0; i < students.length; i++) {
			// students[i] --> [객체주소] --> heap 영역 객체를 참조
			// 아래는 방어적 코드 작성
			if(students[i] != null) {
				System.out.println("name : " + students[i].getName() + ", age : " + students[i].getage());
			}
		}
	}

}// end of class Classroom
