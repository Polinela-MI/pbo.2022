package modul04;

public class KaryawanParuhWaktu extends Karyawan{
	int totalJamKerja;

	public KaryawanParuhWaktu(int nik, String namaLengkap, int gajiPokok, int totalJamKerja) {
		super(nik, namaLengkap, gajiPokok);
		this.totalJamKerja = totalJamKerja;
	}

	public int getTotalJamKerja() {
		return totalJamKerja;
	}

	public void setTotalJamKerja(int totalJamKerja) {
		this.totalJamKerja = totalJamKerja;
	}

	@Override
	public double hitungGaji() {
		int HOURS_WORKED = 20;
		int OVERTIME_PAY = 2000;
		int selisih = totalJamKerja - HOURS_WORKED;
		
		int weeklyPay = getGajiPokok() * HOURS_WORKED;
		setTunjanganTransport(weeklyPay * 0.05);
		
		int selisihGaji;
		if(selisih < 0) {
			setMisc(selisih * getGajiPokok());
		} else {
			setMisc(selisih * (getGajiPokok() + OVERTIME_PAY));
		}
		
		double subTotal = weeklyPay + getTunjanganTransport() + getMisc();
		setPajak(subTotal * 0.025);
		
		return (int)(subTotal - getPajak());
	}
}
