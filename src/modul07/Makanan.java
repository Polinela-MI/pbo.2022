package modul07;

public class Makanan extends Produk{
	private String kadaluarsa;

	public Makanan(String namaBarang, int hargaBarang, String kadaluarsa) {
		super(namaBarang, hargaBarang);
		this.kadaluarsa = kadaluarsa;
	}

	public String getKadaluarsa() {
		return kadaluarsa;
	}

	public void setKadaluarsa(String kadaluarsa) {
		this.kadaluarsa = kadaluarsa;
	}

	@Override
	public String toString() {
		return getNamaBarang() + ": " + kadaluarsa;
	}
}
