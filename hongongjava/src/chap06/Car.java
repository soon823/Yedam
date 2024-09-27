package chap06;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed;	//값을 지정해주지 않으면 초기화 값이 들어가짐	
	int gas;
	//생성자 - 생성자를 만들지 않으면 컴퓨터가 자동생성함
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	int getSpeed() {
		return speed;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		}
		System.out.println("gas가 있습니다");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다 (gas 잔량 : " + gas + ")");
				gas --;
			}else {
				System.out.println("멈춥니다 (gas 잔량 : " + gas + ")");
				return;
			}
		}
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다");
	}
	void run2() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속:"+speed+"km/h)");
		}
	}
	
}//end class
