package lession7;

public abstract class Plane {
	private String nickName; // позивний
	private int width; // ширина
	private int lenght; // довжина
	private int weight; // вага

	abstract void StartEngine();

	abstract int FlyUp();

	abstract void TouchDown();

	abstract int Refueling();

	abstract void PowerReserve();

	abstract void TargetLost();
	
	// генеруемо геттери і сеттери
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
