package lession7;

public class Main {

	public static void main(String[] args) {

		ControlCenter c = new ControlCenter("Center", "Steel", "Terrorist#1", (int) (Math.random() * 9 + 1));

		Su27 a1 = new Su27(300, "black");

		a1.setNickName("Bravo");
		a1.setLenght(20);
		a1.setWeight(25);
		a1.setWidth(10);
		
		ControlCenter.setNickName(a1.getNickName()); 
		c.StartTask();

		a1.StartEngine();
		a1.setPoverReserve(a1.FlyUp());
		a1.PowerReserve();
		a1.setPoverReserve(a1.MoveLeft());
		a1.PowerReserve();
		a1.setPoverReserve(a1.MoveRight());
		a1.PowerReserve();
		a1.setPoverReserve(a1.MoveDovn());
		a1.PowerReserve();
		a1.setPoverReserve(a1.MoveForward());
		a1.PowerReserve();
		a1.TargetLost();
		a1.SteelsFly();
		a1.NuclearBombing(c.getBomb());
		a1.TurboSpeed();
		a1.TouchDown();

		c.EndTask();
	}

}
