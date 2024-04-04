package thisex;

public class quiz1 {

	public static void main(String[] args) {
		
		Student student = new Student("둘리", 5000);
		Student student2 = new Student("도우너", 10000);

	}

}

class Student {
	String name;
	
	int money;

	public Student(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

}

class Bus {
	int line;

	public Bus(int line) {
		super();
		this.line = line;
	}
}

class line {
	int lineNumber;

	public line(int lineNumber) {
		super();
		this.lineNumber = lineNumber;
	}
	
}