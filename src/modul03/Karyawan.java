package modul03;

public class Karyawan {
	private int nik;
	private String nama;
	private int gaji;
	private int hadir;
	
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
	
	public void presensi() {
		hadir++;
	}
	
	public int hitungGaji() {
		//tunjangan kinerja 10%
		//tunjangan transportasi 5%
		//pajak 2.5%
		
		int tunjKinerja =  (int)(gaji * 0.1);
		int tunjTransport = (int)(gaji * 0.05);
		int tunjMakan = 35000 * hadir;
		
		int subTotal = gaji + tunjKinerja + tunjTransport + tunjMakan;
		
		int pajak = (int) (subTotal * 0.025);
		
		return subTotal - pajak;
	}
}
