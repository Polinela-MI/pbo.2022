package modul03;

import java.util.ArrayList;
import java.util.List;

public class Modul03 {
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
			
			for(int i = (input*3)+1; i < args.length; i++) {
				String[] hadirPerKaryawan = args[i].split("!");
				for(int j = 0; j < hadirPerKaryawan.length; j++) {
					String[] temp = hadirPerKaryawan[j].split("-");
					
					listKaryawan.stream().filter(s -> s.getNik() == Integer.parseInt(temp[0])).findAny()
					.ifPresent(k -> {
						if(temp[1].equalsIgnoreCase("H")) {
							k.presensi();
						}
					});
				}
			}
			
			if(input != 0) {
				System.out.println("-------------------------");
				System.out.println("Karyawan PT. XYZ ABC Jaya");
				System.out.println("-------------------------");
				for (Karyawan k : listKaryawan) {
					System.out.println(k.getNik() + " - " + k.getNama() + " - Rp " + k.hitungGaji());
				}
			} else {
				System.out.println("Daftar karyawan kosong.");
			}
		}
	}
}
