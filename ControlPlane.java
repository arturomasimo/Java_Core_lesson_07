package lession7;

public class ControlPlane {
	 int moveUp() {
		int r = (int) (Math.random() * 100);
		System.out.println("Рух вверх на " + r+ " км");
		return r;
	}

	 int moveDown() {
		int r = (int) (Math.random() * 100);
		System.out.println("Рух вниз на " + r+ " км");
		return r;
	}

	 int moveLeft() {
		int r = (int) (Math.random() * 100);
		System.out.println("Маневр вліво на " + r+ " км");
		return r;
	}

	 int moveRight() {
		int r = (int) (Math.random() * 100);
		System.out.println("Маневр право на " + r+ " км");
		return r;

	}

	 int moveForward() {
		int r = (int) (Math.random() * 100);
		System.out.println("Рух вперед на " + r+ " км");
		return r;

	}
}
