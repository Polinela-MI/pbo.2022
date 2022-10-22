package modul07;

import java.util.ArrayList;
import java.util.Scanner;

public class Main07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Produk> prodList = new ArrayList<>();
		ArrayList<Produk> keranjangBelanja = new ArrayList<>();
		int totalBelanja = 0;
		int pilih = 0;
		String all_items = ""
				+ "makanan#susu#15000#oct-2022;" +
				"fashion#sweater#55000#M;" +
				"fashion#denim jeans#150000#L;" +
				"makanan#keju#25000#dec-2022;" +
				"elektronik#lenovo thinkpad#12500000#24;" +
				"elektronik#lg monitor#800000#15;" +
				"fashion#piyama bayi#35000#S;";
		
		
		
		for(String produk : all_items.split(";")) {
			String[] items = produk.split("#");
			switch (items[0].toLowerCase()) {
			case "makanan":
				prodList.add(new Makanan(items[1], Integer.parseInt(items[2]), items[3]));
				break;

			case "fashion":
				prodList.add(new Fashion(items[1], Integer.parseInt(items[2]), items[3]));
				break;
				
			case "elektronik":
				prodList.add(new Elektronik(items[1], Integer.parseInt(items[2]), Integer.parseInt(items[3])));
				break;
				
			}
		}
		
		for(int i = 0; i < prodList.size(); i++) {
			System.out.println((i+1) + ". " + prodList.get(i));
		}
		
		do {
			System.out.println("Beli apa? (0: selesai)");
			pilih = scanner.nextInt();
			if(pilih > 0) {
				keranjangBelanja.add(prodList.get(pilih - 1));
				totalBelanja += prodList.get(pilih-1).getHargaBarang();
			}
		}while(pilih != 0);
		
		System.out.println("======================================");
		System.out.println("Terima kasih! Belanjaan Anda:");
		for(Produk p : keranjangBelanja) {
			System.out.println(p);
		}
		System.out.println("Total Belanjaan: " + totalBelanja);
		
		
	}
}
