package modul02;

public class Karyawan {
	int nik;
	String nama;
	int gaji;
	
	public Karyawan(int nik, String nama, int gaji) {
		this.nik = nik;
		this.nama = nama;
		this.gaji = gaji;
	}
	
	public int getNik() {
		return nik;
	}
	public void setNik(int nik) {
		this.nik = nik;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getGaji() {
		return gaji;
	}
	public void setGaji(int gaji) {
		this.gaji = gaji;
	}
}
