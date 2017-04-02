import java.util.Scanner;

	public class HasilIP {
	
	public static Scanner input = new Scanner(System.in);
	public static int isWithinRange(float x, float min, float max) { //cek range ip
	byte result = 1;//return 1 jika x valid
	if (x < min || x > max) {
	result = 0;
	}
	return result;
	}
	
	public static void main(String[] args) {
	float ip = 0, total_ip = 0, rata = 0;
	int jml_mhs = 0, mhs_lulus = 0, mhs_gagal = 0;
	boolean exit = false;

		System.out.println();
		System.out.println("----------KETERANGAN---------");
		System.out.println("1.jika ingin berhenti memasukan nilai IP Mahasiswa tuliskan -999");
		System.out.println("2.jika data IP salah, data diabaikan");
		System.out.println("------------INPUT------------");
		System.out.println();
		do {
		System.out.print("IP Mahasiswa : ");
		ip = input.nextFloat();
		if (isWithinRange(ip, 0, 4) == 1) {
		jml_mhs++;
		if (isWithinRange(ip, 2.75f, 4) == 1) {
		mhs_lulus++;
		}
		else {
		mhs_gagal++;
		}
		total_ip += ip;
		}
		else if (ip < 0) {
		exit = true;
		}
		else {
			//abaikan
		}
		}	 while (!exit);

		System.out.println("\n--------------------------------------\n");
		System.out.println("------------OUTPUT-------------");
		System.out.println();
		if (jml_mhs > 0) {
		rata = total_ip / jml_mhs;
			System.out.println("Banyak Mahasiswa : " + jml_mhs);
			System.out.println("Banyak Mahasiswa Lulus (IP >= 2.75) : " + mhs_lulus);
			System.out.println("Banyak Mahasiswa Tidak Lulus : " + mhs_gagal);
			System.out.println("Rata-Rata IP Mahasiswa : " + rata);
		}
		else {
		System.out.println("Tidak ada data.");
		}
		}
	}