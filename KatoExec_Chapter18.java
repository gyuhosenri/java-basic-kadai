package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		// それぞれ3人分をインスタンス化
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		taro.setgivenName();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		ichiro.setgivenName();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		hanako.setgivenName();
		
		//exec呼び出し
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();

	}

}
