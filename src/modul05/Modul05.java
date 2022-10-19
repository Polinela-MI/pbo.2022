package modul05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;



public class Modul05 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static List<Karyawan> listKaryawan = new ArrayList<>();
	
	public static void main(String[] args) {
		int menuChoose = 0;
		
		do {
			System.out.println("-----------------------------------------");
			System.out.println("   Sistem Kepegawaian PT. XYZ ABC Jaya");
			System.out.println("-----------------------------------------");
			System.out.println("1. Registrasi Karyawan");
			System.out.println("2. Lihat Daftar Karyawan");
			System.out.println("3. Cetak Slip Gaji");
			System.out.println("-----------------------------------------");
			System.out.println("Pilih menu (1 - 3, 0: keluar dari menu):");
			
			try {
				menuChoose = Integer.parseInt(br.readLine());
				
				if(menuChoose == 1) {
					registerKaryawan();
				} else if(menuChoose == 2) {
					lihatKaryawan();
				} else if(menuChoose == 3) {
					System.out.println("Masukkan NIK:");
					int nikUser = Integer.parseInt(br.readLine());
					
					for(int i = 0; i < listKaryawan.size(); i++) {
						if(listKaryawan.get(i).getNik() == nikUser) {
							cetakSlipGaji(listKaryawan.get(i));
							break;
						}
					}
					
				} else if(menuChoose > 3) {
					System.out.println("Menu tidak tersedia.");
				} 
				
			} catch (NumberFormatException | IOException e) {
				System.out.println("");
			}
			
		} while(menuChoose > 0);
		
		System.out.println("Anda keluar dari Sistem Kepegawaian!");
	}
	
	public static void registerKaryawan() {
		KaryawanParuhWaktu kpt;
		KaryawanPenuhWaktu kft;
		Manajer mjr;
		
		String namaLengkap;
		String kodeKaryawan;
		int gajiPokok;
		int jamKerja;
		int kinerja;
		
		try {
			System.out.println("Masukkan nama lengkap:");
			namaLengkap = br.readLine();
			System.out.println("Masukkan kode karyawan:");
			kodeKaryawan = br.readLine();
			
			if(kodeKaryawan.equalsIgnoreCase("KPT")) {
				System.out.println("Masukkan gaji pokok per jam:");
				gajiPokok = Integer.parseInt(br.readLine());
				System.out.println("Masukkan total jam kerja minggu ini:");
				jamKerja = Integer.parseInt(br.readLine());
				
				kpt = new KaryawanParuhWaktu(namaLengkap, gajiPokok, jamKerja);
				listKaryawan.add(kpt);
				
			} else if(kodeKaryawan.equalsIgnoreCase("KFT")) {
				System.out.println("Masukkan gaji pokok per jam:");
				gajiPokok = Integer.parseInt(br.readLine());
				System.out.println("Masukkan total jam kerja minggu ini:");
				jamKerja = Integer.parseInt(br.readLine());
				
				kft = new KaryawanPenuhWaktu(namaLengkap, gajiPokok, jamKerja);
				listKaryawan.add(kft);
				
			} else if(kodeKaryawan.equalsIgnoreCase("MJR")) {
				System.out.println("Masukkan gaji pokok mingguan:");
				gajiPokok = Integer.parseInt(br.readLine());
				System.out.println("Masukkan nilai kinerja minggu ini (0 - 100):");
				kinerja = Integer.parseInt(br.readLine());
				
				mjr = new Manajer(namaLengkap, gajiPokok, kinerja);
				listKaryawan.add(mjr);
			}
			
		} catch(IOException e) {
			
		}
	}
	
	public static void lihatKaryawan() {
		System.out.println("-------------------------------------");
		System.out.println("  Daftar Karyawan PT XYZ ABC Jaya");
		System.out.println("-------------------------------------");
		
		listKaryawan.forEach(k -> {
			System.out.println(k.getNik()+" - "+ k.getNamaLengkap() +" - Rp "+k.hitungGaji());
		});
	}

	
	public static void cetakSlipGaji(Karyawan k) {
		double gajiYangDiterima = k.hitungGaji();
		double gajiSblmPajak = gajiYangDiterima + k.getPajak();
		
		String informasiKinerja = "";
		String gajiPokokMingguan = "";
		String miscInfo = "";
		
		if(k instanceof Manajer) {
			Manajer mjr = (Manajer) k;
			informasiKinerja = "Kinerja = " + mjr.getKinerja() + "%";
			gajiPokokMingguan = "Gaji Pokok Rp " + k.getGajiPokok();
			miscInfo = "Bonus Rp " + k.getMisc();
		} else if(k instanceof KaryawanParuhWaktu) {
			KaryawanParuhWaktu kpw = (KaryawanParuhWaktu) k;
			informasiKinerja = "Total jam kerja: " + kpw.getTotalJamKerja();
			gajiPokokMingguan = "Gaji Pokok Rp " + (k.getGajiPokok() * 20);
			if(k.getMisc() < 0) {
				miscInfo = "Penalty Rp " + k.getMisc();
			} else if(k.getMisc() > 0) {
				miscInfo = "Lembur Rp " + k.getMisc();
			} 
		} else if(k instanceof KaryawanPenuhWaktu) {
			KaryawanPenuhWaktu kpw = (KaryawanPenuhWaktu) k;
			informasiKinerja = "Total jam kerja: " + kpw.getTotalJamKerja();
			gajiPokokMingguan = "Gaji Pokok Rp " + (k.getGajiPokok() * 40);
			if(k.getMisc() < 0) {
				miscInfo = "Penalty Rp " + k.getMisc();
			} else if(k.getMisc() > 0) {
				miscInfo = "Lembur Rp " + k.getMisc();
			} 
		}
		
		System.out.println(k.getNik() + " - " + k.getNamaLengkap() + "         " + informasiKinerja);
		System.out.println("======================================================================");
		System.out.println(gajiPokokMingguan);
		System.out.println("Tunjangan Transportasi Rp " + k.getTunjanganTransport());
		System.out.println(miscInfo);
		System.out.println("Pajak Rp " + k.getPajak());
		System.out.println("Gaji sebelum pajak Rp " + gajiSblmPajak);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Gaji yang diterima Rp " + gajiYangDiterima);
	}
}
