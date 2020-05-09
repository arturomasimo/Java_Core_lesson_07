package lession7;

public class Su27 extends Plane implements SpecialOpt {

	private int maxSpeed;
	private String color;
	private int poverReserve;

	public Su27(int maxSpeed, String color) {
		super();
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	public int MoveUp() {
		System.out.print(getNickName() + ": ");
		int r = 0, x = ControlPlane.moveUp();
		if (getPoverReserve() - x > 0) {
			r = getPoverReserve() - x;
			setPoverReserve(r);
			return r;
		} else {
			r = getPoverReserve() - x + Refueling();
			setPoverReserve(r);
			return r;
		}
	}

	public int MoveDovn() {
		System.out.print(getNickName() + ": ");
		int r = 0, x = ControlPlane.moveDown();
		if (getPoverReserve() - x > 0) {
			r = getPoverReserve() - x;
			setPoverReserve(r);
			return r;
		} else {
			r = getPoverReserve() - x + Refueling();
			setPoverReserve(r);
			return r;
		}
	}

	public int MoveLeft() {
		System.out.print(getNickName() + ": ");
		int r = 0, x = ControlPlane.moveLeft();
		if (getPoverReserve() - x > 0) {
			r = getPoverReserve() - x;
			setPoverReserve(r);
			return r;
		} else {
			r = getPoverReserve() - x + Refueling();
			setPoverReserve(r);
			return r;
		}
	}

	public int MoveRight() {
		System.out.print(getNickName() + ": ");
		int r = 0, x = ControlPlane.moveRight();
		if (getPoverReserve() - x > 0) {
			r = getPoverReserve() - x;
			setPoverReserve(r);
			return r;
		} else {
			r = getPoverReserve() - x + Refueling();
			setPoverReserve(r);
			return r;
		}
	}

	public int MoveForward() {
		System.out.print(getNickName() + ": ");
		int r = 0, x = ControlPlane.moveForward();
		if (getPoverReserve() - x > 0) {
			r = getPoverReserve() - x;
			setPoverReserve(r);
			return r;
		} else {
			r = getPoverReserve() - x + Refueling();
			setPoverReserve(r);
			return r;
		}
	}

	@Override
	void StartEngine() {
		int t = (int) (20 + 68 * Math.random());
		System.out.println(getNickName() + ": Запуск двигунів через " + t + " cek");
	}

	@Override
	int FlyUp() {
		int x = (int) (Math.random() * 200);
		System.out.println(getNickName() + ": Двигуни запущені. Взліт!");
		System.out.println(getNickName() + ": Запас ходу на паливі складає " + x + " км");
		return x;
	}

	@Override
	void TouchDown() {
		System.out.println(getNickName() + ": Заходимо на посадку.");
		System.out.println(getNickName() + ": Посадка виконана вдало. Двигуни заглушені.");
	}

	@Override
	public String toString() {
		return "Su27 [toString()=" + super.toString() + "]";
	}

	@Override
	public void TurboSpeed() {
		int speed = getMaxSpeed() + (int) (Math.random() * 100);
		System.out.println(getNickName() + ": Переходимо на турборежим. Базова швидкість " + getMaxSpeed()
				+ ", швидкість на форсажі " + speed);
		setMaxSpeed(speed);
	}

	@Override
	public void SteelsFly() {
		System.out.println(getNickName() + ": Технологія СТЕЛС ввімкнена");

	}

	@Override
	public void NuclearBombing(int bomb) {
		System.out.println(getNickName() + ": Скинуто на противника " + bomb + " ядерних зарядів");
		System.out.println(getNickName() + ": Повертаємось на базу");
		
	}

// генеруємо геттери і сеттери
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	int Refueling() {
		int x = 150;
		System.out.println(getNickName() + ": Потребую дозаправки в повітрі");
		System.out.println(getNickName() + ": Дозаправлено на " + x+" км");
		return x;
	}

	@Override
	void PowerReserve() {
		System.out.println(getNickName() + ": Запас ходу  " + poverReserve+ " км");

	}

	public int getPoverReserve() {
		return poverReserve;
	}

	public void setPoverReserve(int poverReserve) {
		this.poverReserve = poverReserve;
	}

	@Override
	void TargetLost() {
		System.out.println(getNickName() + ": Ціль захоплено. Розпочинаю операцію ");
	}

}
