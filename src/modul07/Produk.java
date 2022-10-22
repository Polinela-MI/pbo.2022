package modul07;

public class Produk {
	private String namaBarang;
	private int hargaBarang;
	
	public Produk(String namaBarang, int hargaBarang) {
		this.namaBarang = namaBarang;
		this.hargaBarang = hargaBarang;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public int getHargaBarang() {
		return hargaBarang;
	}

	public void setHargaBarang(int hargaBarang) {
		this.hargaBarang = hargaBarang;
	}
	
	public String toString() {
		return namaBarang;
	}
}
