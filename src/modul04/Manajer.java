package modul04;

public class Manajer extends Karyawan{
	int kinerja;
	
	public Manajer(int nik, String namaLengkap, int gajiPokok, int kinerja) {
		super(nik, namaLengkap, gajiPokok);
		this.kinerja = kinerja;
	}

	public int getKinerja() {
		return kinerja;
	}

	public void setKinerja(int kinerja) {
		this.kinerja = kinerja;
	}

	@Override
	public double hitungGaji() {
		setTunjanganTransport(getGajiPokok() * 0.1);
		double subtotal = getGajiPokok() + getTunjanganTransport();
		double performance = kinerja/100.0;
				
		if(kinerja > 50) {
			setMisc(getGajiPokok() * performance);
			subtotal = subtotal + getMisc();
		}
		
		setPajak(subtotal * 0.025);
		
		return (int)(subtotal - getPajak());
	}
}
