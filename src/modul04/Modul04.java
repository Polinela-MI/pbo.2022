package modul04;

import java.util.Scanner;

public class Modul04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Registrasi Data Karyawan");
		System.out.println("========================");
		System.out.println("Pilih Jenis Karyawan: ");
		System.out.println("1. Karyawan Paruh Waktu");
		System.out.println("2. Karyawan Penuh Waktu");
		System.out.println("3. Manajer");
		System.out.println("========================");
		System.out.println("Pilihan: ");
		int pilihan = scanner.nextInt();
		System.out.println("NIK: ");
		int nik = scanner.nextInt();
		System.out.println("Gaji Pokok per Jam: ");
		int gajiPokok = scanner.nextInt();
		
		if(pilihan == 1) {
			System.out.println("Total Jam Kerja: ");
			int jamKerja = scanner.nextInt();
			System.out.println("Nama Karyawan: ");
			String nama = scanner.next();
			
			KaryawanParuhWaktu kpt = new KaryawanParuhWaktu(nik, nama, gajiPokok, jamKerja);
			
			System.out.println("========================");
			System.out.println("Gaji yang diterima oleh " + kpt.getNamaLengkap() + 
					"("+kpt.getNik()+") adalah Rp "+kpt.hitungGaji());
		} else if(pilihan == 2) {
			System.out.println("Total Jam Kerja: ");
			int jamKerja = scanner.nextInt();
			System.out.println("Nama Karyawan: ");
			String nama = scanner.next();
			
			KaryawanPenuhWaktu kft = new KaryawanPenuhWaktu(nik, nama, gajiPokok, jamKerja);
			
			System.out.println("========================");
			System.out.println("Gaji yang diterima oleh " + kft.getNamaLengkap() + 
					"("+kft.getNik()+") adalah Rp "+kft.hitungGaji());
		} else {
			System.out.println("Kinerja minggu ini: ");
			int kinerja = scanner.nextInt();
			System.out.println("Nama Karyawan: ");
			String nama = scanner.next();
			
			Manajer mjr = new Manajer(nik, nama, gajiPokok, kinerja);
			
			System.out.println("========================");
			System.out.println("Gaji yang diterima oleh " + mjr.getNamaLengkap() + 
					"("+mjr.getNik()+") adalah Rp "+mjr.hitungGaji());
		}
		
		
	}
}
