package thisex;

public class quiz2 {

	public static void main(String[] args) {
		
		Student2 student = new Student2("둘리", 100000);
		Taxi.taxi = new Taxi(null)
		student.showInfo();
		
		
	}

}

class Student2 {
	String name;
	int money;
	
	public Student2(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		
		if (money < 10000) {
			System.out.println("택시를 탈 수 없습니다.");
			return;
		}
		
		taxi.take(10000); // 10000원 지불
		this.money = this.money - 10000; // 가진돈 10000원을 잃음
	}
	
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "입니다.");
	}

}

class Taxi {
	String taxiNumber;
	int money;
	
	public Taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}

	// 택시에 승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money;
	}

	public void showInfo() {
		System.out.println("택시번호 " + taxiNumber + "의 수입은 " + money + "입니다.");
	}

	}
