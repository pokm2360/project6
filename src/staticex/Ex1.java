package staticex;

public class Ex1 {

	public static void main(String[] args) {
		
		// 학생을 생성하면 학번을 자동으로 부여받음
		Student student1 = new Student();
		student1.studentName = "둘리";
		System.out.println(student1.studentName + " 학번:" + student1.studentID);
		
		Student student2 = new Student();
		student2.studentName = "또치";
		System.out.println(student2.studentName + " 학번:" + student2.studentID);
		
		System.out.println(Student.count); // 클래스로 count 변수를 직접 씀
		
		System.out.println(student1.count);
		
		System.out.println(student2.count);
	}

}

class Student {
	static int count = 0; // 공통속성
	int studentID;
	String studentName;
	
	public Student() {
		count++; // 학생이 생성될 때마다 증가
		studentID = count; // 증가된 값을 학번에 부여
	}
}