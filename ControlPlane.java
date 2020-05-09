package lession7;

public class ControlPlane {
	static int moveUp() {
		int r = (int) (Math.random() * 100);
		System.out.println("Рух вверх на " + r+ " км");
		return r;
	}

	static int moveDown() {
		int r = (int) (Math.random() * 100);
		System.out.println("Рух вниз на " + r+ " км");
		return r;
	}

	static int moveLeft() {
		int r = (int) (Math.random() * 100);
		System.out.println("Маневр вліво на " + r+ " км");
		return r;
	}

	static int moveRight() {
		int r = (int) (Math.random() * 100);
		System.out.println("Маневр право на " + r+ " км");
		return r;

	}

	static int moveForward() {
		int r = (int) (Math.random() * 100);
		System.out.println("Рух вперед на " + r+ " км");
		return r;

	}
}
