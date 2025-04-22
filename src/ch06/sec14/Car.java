package ch06.sec14;

public class Car {
//필드 선언
	private int speed;    //전역변수,선언만 되있고 값이 없다==> 0

	private boolean stop; //전역변수,선언만 되있고 값이 없다==> false
	
//speed 필드의 Tetter/Setter 선언
//	private int getSpeed() {
//
//		return speed;
//	}
//
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}

	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop == true)
			this.speed = 0;
	}

}
