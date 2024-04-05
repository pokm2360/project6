package object;

//둘리는 100번 버스를 타고 학교에 갑니다

//도우너는 2호선 지하철을 타고 학교에 갑니다

//학생,버스,지하철의 현재 정보 출력
public class Ex1 {

	public static void main(String[] args) {

		Student student1 = new Student("둘리", 5000);
		Bus bus = new Bus(100);
		student1.takeBus(bus);
		student1.showInfo();
		bus.showInfo();
		
		Student student2 = new Student("도우너", 10000);
		Subway subway = new Subway("2호선");
		student2.takeSubway(subway);
		student2.showInfo();
		subway.showInfo();
		
		
		
	}

}



//버스 클래스
class Bus {
	int busNumber;
	int passengerCount;
	int money;

//	버스번호를 초기화하는 생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

//	버스에 승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money;

		passengerCount++;
	}

	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은" + passengerCount + "명이고, 수입은 " + money + "원입니다.");
	}
	

}

//지하철 클래스
class Subway {

	String lineNumber;

	int passengerCount;

	int money;

//	노선 번호를 초기화 하는 생성자
	public Subway(String lineNumber) {
		super();
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money = this.money + money;

		passengerCount++;
	}

	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "번의 승객은" + passengerCount + "명이고, 수입은 " + money + "원입니다.");
	}
}

//학생 클래스
class Student {
	String studentName;

	int money;

//	학생의 이름과 가진돈을 초기화하는 생성자
	public Student(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}

//	버스에 타서 요금을 지불하는 메소드
	public void takeBus(Bus bus) {
		bus.take(1000); // 1000원 지불
		this.money = this.money - 1000; // 가진돈 1000원을 잃음
	}

//	지하철에 타서 요금을 지불하는 메소드
	public void takeSubway(Subway subway) {
		subway.take(1500); // 1500원 지불
		this.money = this.money - 1500; // 가진돈 1500원을 잃음
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
	
	public void useSubway(Subway subway) {
		System.out.println();
	}
}
