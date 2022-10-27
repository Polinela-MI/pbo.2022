package uts.pkg1;

//soal class dan objects paket1
public class Misteri {
	//buat dua buah private instance variable dengan nama var1 bertipe integer, dan var2 bertipe String
	private int var1;
	private String var2;
	
	//tuliskan default constructor, yang didalamnya melakukan inisialisasi var1 = 0 dan var2 adalah string kosong
	public Misteri() {
		var1 = 0;
		var2 = "";
	}
	
	//tuliskan overloading constructor yang menerima sebuah parameter bertipe string, simpan nilai parameter pada instance variable var2, 
	//kemudian inisialisasi var1 sebagai panjang dari string yang disimpan pada var2
	public Misteri(String var2) {
		this.var2 = var2;
		var1 = var2.length();
	}

	//tuliskan accessor method dari var1
	public int getVar1() {
		return var1;
	}

	//tuliskan mutator method dari var1
	public void setVar1(int var1) {
		this.var1 = var1;
	}

	//tuliskan accessor method dari var2
	public String getVar2() {
		return var2;
	}

	//tuliskan mutator method dari var2
	public void setVar2(String var2) {
		this.var2 = var2;
	}
	
	//buatlah method misterius yang mengembalikan nilai String
	//String yang dikembalikan merupakan perulangan string var2 sebanyak var1
	//contoh: var2 = "apa", var1 = 3, maka misterius() menghasilkan "apaapaapa"
	public String misterius() {
		String xx = "";
		for(int i = 0; i < var1; i++) {
			xx += var2;
		}
		
		return xx;
	}
}
