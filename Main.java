package guntingBatuKertas;
import java.util.Scanner;

public class Main {
	
	static void Rules() {
		System.out.println("\n------------------------- ATURAN PERMAINAN -------------------------");
		System.out.println("1. PLAYER DIMINTA UNTUK MEMILIH ANTARA GUNTING, BATU, ATAU KERTAS"+
						   "\n2. GUNTING DITUNJUKAN DENGAN (1), BATU (2), KERTAS(3)"+
						   "\n3. SETELAH PLAYER MEMILIH MAKA BOT JUGA AKAN OTOMATIS MEMILIH"+
						   "\n4. PERTANDINGAN AKAN BERLANGSUNG SELAMA 3X JIKA SKOR IMBANG MAKA HASIL SERI\n");
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Start obj = new Start();
		
		System.out.println("PERMAINAN GUNTING BATU KERTAS");
		System.out.println("1 --> GUNTING\n"+"2 --> BATU\n"+"3 --> KERTAS");
		Rules();
		
		int sumBot = 0;
		int sumPlayer = 0;
		for(int i = 0; i < 3; i++) {
			System.out.print("PLAYER MEMILIH: ");
			int choose = in.nextInt();
			obj.setPlayerOption(choose);
			System.out.print("BOT MEMILIH: "+obj.getBotOption()+"\n");
			System.out.println("("+obj.winner()+")"+"\n");
			if(obj.winner().equalsIgnoreCase("NBL_BOT WIN")) {
				sumBot++;
			}else if(obj.winner().equalsIgnoreCase("PLAYER WIN") ) {
				sumPlayer++;
			}
		}
		System.out.println("------------ HASIL AKHIR ------------");
		System.out.println("BOT = "+sumBot);
		System.out.println("PLAYER = "+ sumPlayer);
		
		if(sumPlayer > sumBot) {
			System.out.println("SELAMAT ANDA MEMENANGKAN PERMAINAN:))");
		}else if(sumPlayer < sumBot){
			System.out.println("YAHHH.. JANGAN PUTUS ASA TETAP SEMANGAT!!");
		}else {
			System.out.println("HASIL SERI KALIAN SEMUA LUAR BIASA:* ");
		}
		in.close();
	}

}
