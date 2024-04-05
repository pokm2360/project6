package scope;
//모든 변수의 유효 범위 작성
public class Person {
	String personName; // 인스턴스 변수라서 객체 생성 후에 사용 가능, 전역변수라서 클래스 끝나기 전가지 사용가능
	int personAge; // 인스턴스 변수라서 객체 생성 후에 사용 가능, 전역변수라서 클래스 끝나기 전가지 사용가능
	static char gender = 'f'; // 클래스 변수라서 객체 없이도 사용 가능, 전역변수라서 클래스 끝나기 전까지 사용 가능
	
	public void setPersonName(String name) { // 지역변수는 메소드 안에서만
		this.personName = name;
	}
}
