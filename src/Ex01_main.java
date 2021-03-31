import kr.or.bit.common.Car;

/*
 * 클래스는 == 설계도 == 데이터 타입(사용자 정의)
 * 
 * 클래스 구성 요소 : [필드(속성) + 함수(기능)] + 생성자 함수
 * field >> 고유데이터, 상태데이터, 부품(참조)정보 >> 변수
 * funtion >> 기능과 행위 >> 최소단위(1개의 기능)
 * 추가적으로 생성자 함수 >> member field의 초기화 목적
 * 
 * 클래스, 필드, 생성자, 함수 : 어느 곳에 위치하느냐 (Scope)영역
 * >> 접근자 한정자, 수정자
 * >> public, pivate, default, protected(상속)
 * 
 * 1. public class Car{} >> ko.or.bit.common 폴더 아래...
 * 2. class AirPlane{} >> default 생략 >> 컴파일러가 default 있는것처럼
 *    >> default(같은 폴더)
 *    >> default 접근자는 [같은 폴더 접근 가능][다른폴더에 있으면 서로 접근 불가]
 *    >> program 같은 폴더안에 있는 클래스는 사용 가능하다.
 * 
 * 3. 하나의 물리적인 자바파일은 여러개의 클래스를 가질 수 있다.(O)
 *    Ex01_main.java >> 여러개의 클래스 >> 단 Ex01_main 클래스만 public을 가진다.
 *    연습할때만...
 *    나머지는 다 디폴드 클래스이다.
 */
class Test{ // 앞에 default class Test 생략
	int data; // 접근 제한자
}

public class Ex01_main {

	public static void main(String[] args) {
		Car car = new Car();
		Test test = new Test();
		System.out.println(test.data);
		
	}

}
