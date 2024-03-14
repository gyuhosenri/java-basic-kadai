package kadai_015;

public class Car_Chapter15 {

	private int gear = 1; // ギア
	private int speed = 10; // 速度

	public Car_Chapter15(int i, int j) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	// コントラクタ（初期化処理）
	public void car(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;

	}

	// 現在のギアからチェンジ後のギアを表示
	public void gearChange(int afterGear) {
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
		gear = afterGear;
		speed = switch (afterGear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		};
	}

	public void run() {

		System.out.println("速度は時速" + speed + "kmです");
	}

}
