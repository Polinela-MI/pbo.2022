package modul07;

public class Fashion extends Produk{
	private String ukuran;

	public Fashion(String namaBarang, int hargaBarang, String ukuran) {
		super(namaBarang, hargaBarang);
		this.ukuran = ukuran;
	}

	public String getUkuran() {
		return ukuran;
	}

	public void setUkuran(String ukuran) {
		this.ukuran = ukuran;
	}

	@Override
	public String toString() {
		return getNamaBarang() + ", " + ukuran;
	}
	
}
