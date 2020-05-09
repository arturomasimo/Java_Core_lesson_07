package lession7;

public class ControlCenter {
	private String nameCenter;
	private String nameOperation;
	private String tagret;
	private int bomb;
	static String nickName;

	public ControlCenter(String nameCenter, String nameOperation, String tagret, int bomb) {
		super();
		this.nameCenter = nameCenter;
		this.nameOperation = nameOperation;
		this.tagret = tagret;
		this.bomb = bomb;
	}

	public void EndTask() {
		System.out.println(getNameCenter() + ": Oперація " + getNameOperation() + " по ліквідації " + getTagret()
				+ " завершена вдало");
		System.out.println(getNameCenter() + ": Дякую за успішну операцію, " + nickName);

	}

	public void StartTask() {
		System.out.println(
				getNameCenter() + ": Початок операції " + getNameOperation() + " по ліквідації " + getTagret());
		System.out.println(getNameCenter() + ": " + nickName + " дозволяю розпочати операцію");
	}

	public String getNameCenter() {
		return nameCenter;
	}

	public void setNameCenter(String nameCenter) {
		this.nameCenter = nameCenter;
	}

	public String getNameOperation() {
		return nameOperation;
	}

	public void setNameOperation(String nameOperation) {
		this.nameOperation = nameOperation;
	}

	public String getTagret() {
		return tagret;
	}

	public void setTagret(String tagret) {
		this.tagret = tagret;
	}

	public int getBomb() {
		return bomb;
	}

	public void setBomb(int bomb) {
		this.bomb = bomb;
	}

	public static String getNickName() {
		return nickName;
	}

	public static void setNickName(String nickName) {
		ControlCenter.nickName = nickName;
	}

}
