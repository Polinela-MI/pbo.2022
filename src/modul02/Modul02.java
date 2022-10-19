package modul02;

import java.util.ArrayList;
import java.util.List;

public class Modul02 {
	public static void main(String[] args) {
		if(args.length > 0) {
			int input = Integer.parseInt(args[0]);
			Karyawan karyawan;
			
			List<Integer> nikList = new ArrayList<>();
			
			ArrayList<Karyawan> listKaryawan = new ArrayList<Karyawan>();
			
			for (int i = 1; i < input*3; i+=3) {
				int nik = Integer.parseInt(args[i]);
				
				if(!nikList.contains(nik)) {
					nikList.add(nik);
					karyawan = new Karyawan(nik, args[i+1], Integer.parseInt(args[i+2]));
					listKaryawan.add(karyawan);
				}
			}
			
			if(input != 0) {
				System.out.println("-------------------------");
				System.out.println("Karyawan PT. XYZ ABC Jaya");
				System.out.println("-------------------------");
				for (Karyawan karyawan2 : listKaryawan) {
					System.out.println(karyawan2);
				}
			} else {
				System.out.println("Daftar karyawan kosong.");
			}
		}
	}
}
