package uts.pkg2;

//soal class & object paket2
public class Misteri {
	//buat dua buah private instance variable dengan nama var1 bertipe boolean, dan var2 bertipe integer
	private boolean var1;
	private String var2;
	
	//tuliskan default constructor, yang didalamnya melakukan inisialisasi var1 = false dan var2 sebagai string kosong
	public Misteri() {
		var1 = false;
		var2 = "";
	}
	
	//tuliskan overloading constructor yang menerima sebuah parameter bertipe integer, simpan nilai parameter pada instance variable var2, 
	//kemudian inisialisasi var1 dengan nilai true jika nilai panjang var2 lebih dari sama dengan 2 
	public Misteri(String var2) {
		this.var2 = var2;
		var1 = (var2.length() >= 2);
	}

	//tuliskan accessor method untuk var1
	public boolean isVar1() {
		return var1;
	}

	//tuliskan mutator method untuk var1
	public void setVar1(boolean var1) {
		this.var1 = var1;
	}

	//tuliskan accessor method untuk var2
	public String getVar2() {
		return var2;
	}

	//tuliskan mutator method untuk var2
	public void setVar2(String var2) {
		this.var2 = var2;
	}
	
	//buatlah sebuah method misterius yang mengembalikan string kosong jika nilai dari var1 = false,
	//jika nilai var1 = true, maka kembalikan dua karakter terakhir dari var2 yang diulang sebanyak tiga kali.
	public String misterius() {
		if(var1){
			int size = var2.length();
			return var2.substring(size - 2) + var2.substring(size - 2) + var2.substring(size - 2);
		}
		return "";
	}
}
