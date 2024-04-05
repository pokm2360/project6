package thisex;

public class quiz3 {

	public static void main(String[] args) {
		
		user user = new user("둘리", 10000);
		Cafe cafe = new Cafe("별다방");
		user.buyAmericano(cafe);
		user.showInfo();
		
		user user2 = new user("또치", 20000);
		user2.buyCaffelatte(cafe);
		user2.showInfo();
		
		cafe.showInfo();
	}

}

class Cafe {
	String menu;
	int money;
	
	public Cafe(String menu) {
		super();
		this.menu = menu;
	}
//	손님에게 커피를 파는 메소드
	public void sellCoffee(int price) { // 커피값
		this.money = this.money + price;
	}
	
	public void take(int money) {
		this.money = this.money + money;
	}
	
	public void showInfo() {
		System.out.println("별다방카페 " + menu + "의 수입은 " + money + "입니다.");
	}
}

class user {
	String name;
	int money;
	
	public user(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	public void takeCafe(Cafe cafe) {
		
		if (money < cafe.money) {
			System.out.println("소지금이 적어 커피를 살 수 없습니다.");
			return;
		}
		
	}
	public void buyAmericano(Cafe cafe) {
		cafe.sellCoffee(4000);
		this.money = this.money - 4000;
	}

	public void buyCaffelatte(Cafe cafe) {
		cafe.sellCoffee(4500);
		this.money = this.money - 4500;
	}
	// 카페에서 커피를 사고 값을 지불하는 메소드
	public void buyCoffe(Cafe cafe, int price) {
		cafe.sellCoffee(price);
		this.money = this.money - price;
	}
	
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "입니다.");
	}
}
