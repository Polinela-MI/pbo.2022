package modul07;

public class Elektronik extends Produk {
	private int garansi;

	public Elektronik(String namaBarang, int hargaBarang, int garansi) {
		super(namaBarang, hargaBarang);
		this.garansi = garansi;
	}

	public int getGaransi() {
		return garansi;
	}

	public void setGaransi(int garansi) {
		this.garansi = garansi;
	}
	
}
