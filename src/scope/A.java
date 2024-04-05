package scope;
// 접근제어자를 확인하고, 변수의 유효범위를 작성하세요!
public class A {
	
	public int field1; // 어디서든 사용 가능
	
	int field2; // 같은 패키지 안에서
	
	private int field3; // 클래스 내부에서만
	
}
