package modul05;

public class Karyawan {
	public static int currentNIK = 0;
	private int nik;
	private String namaLengkap;
	private int gajiPokok;
	
	private double tunjanganTransport;
	private double misc;
	private double pajak;
	
	public Karyawan(String namaLengkap, int gajiPokok) {
		this.nik = ++currentNIK;
		this.namaLengkap = namaLengkap;
		this.gajiPokok = gajiPokok;
	}
	
	public double getTunjanganTransport() {
		return tunjanganTransport;
	}



	public void setTunjanganTransport(double tunjanganTransport) {
		this.tunjanganTransport = tunjanganTransport;
	}



	public double getMisc() {
		return misc;
	}



	public void setMisc(double misc) {
		this.misc = misc;
	}



	public double getPajak() {
		return pajak;
	}



	public void setPajak(double pajak) {
		this.pajak = pajak;
	}



	public int getNik() {
		return nik;
	}
	
	public void setNik(int nik) {
		this.nik = nik;
	}
	
	public String getNamaLengkap() {
		return namaLengkap;
	}
	
	public void setNamaLengkap(String namaLengkap) {
		this.namaLengkap = namaLengkap;
	}
	public int getGajiPokok() {
		return gajiPokok;
	}
	
	public void setGajiPokok(int gajiPokok) {
		this.gajiPokok = gajiPokok;
	}
	
	public double hitungGaji() {
		tunjanganTransport = gajiPokok * 0.05;
		double subtotal = gajiPokok + tunjanganTransport;
		
		pajak = subtotal * 0.025;
		
		return (subtotal - pajak);
	}
}
