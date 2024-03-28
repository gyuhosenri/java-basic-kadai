package kadai_018;

abstract public class Kato_Chapter18 {
	
	public String familyName = "加藤"; //性
	public String givenName  = ""; //名
	public String address    = "東京都中野区◯×"; //住所
	
	//共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です" );
		System.out.println("住所は" + this.address + "です");
	}
	
	//個別の紹介を出力する
	abstract public void eachIntroduce();
	
	//紹介を実行する
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
		System.out.println("");
		
	}
			
}
