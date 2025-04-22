
public class ch06 {

	public class Car {

		private int speed;

		private boolean stop;

		private int getSpeed() {

			return speed;
		}

		public void setSpeed(int speed) {
			if (speed < 0) {
				this.speed = 0;
				return;
			} else {
				this.speed = speed;
			}
			}
		}
	}
