package chap06;

public class CarMain {

	public static void main(String[] args) {
		// 객체생성
		Car myCar = new Car();
		//필드 사용
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		//필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
		myCar.color = "휜색";
		System.out.println("색깔 : " + myCar.color);
		
		//교제p279
		System.out.println("------교재 P279-------");
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다");
		}else {
			System.out.println("gas를 주입하세요");
		}
		
		//교재p284
		System.out.println("------교재 P284-------");
		myCar.keyTurnOn();
		myCar.run2();
		
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: "+speed+"km/h");
		
		
	}//end main

}
