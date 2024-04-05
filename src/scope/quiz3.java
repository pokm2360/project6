package scope;

public class quiz3 {

	public static void main(String[] args) {
		
		Person person = new Person(); // 전역변수, 메인함수가 끝나기 전까지
		
		int i = 10; // 전역변수, 메인함수 끝나기 전까지
		
		if(i > 1) {
			String str = "안녕하세요"; // 지역변수
		}
		
		for (int k=0; k<10; k++) { // 지역변수
			System.out.println();
		}
		//지역변수의 유효 범위는 변수가 선언된 블록 스코프에 따라 달라진다
	}

}
