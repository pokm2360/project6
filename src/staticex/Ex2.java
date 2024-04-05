package staticex;

public class Ex2 {

	public static void main(String[] args) {
		
		Student2 student1 = new Student2();
		System.out.println(Student2.getCount());
		
		Student2 student2 = new Student2();
		System.out.println(Student2.getCount());
	}

}

class Student2 {
	private static int count = 0; // 공통속성
	int studentID;
	String studentName;
	
	public Student2() {
		count++; // 학생이 생성될 때마다 증가
		studentID = count; // 증가된 값을 학번에 부여
	}

	public static int getCount() {
		return count;
	}

	//static 메소드에서는 static변수와 지역변수만 사용 가능
	public static void setCount(int count) {
		Student2.count = count;
//		studentName = "둘리"; // 인스턴스 변수 사용 불가
	}
	
	
}