/* NAMA  :nur ainun zulkarnain
   STB	 : 13020180030
   KELAS : B1 TI
   HARI/TGL : SENIN, 16 MARET 2020
   WAKTU : 23.24 
*/

public class ainunzulkarnain{
	public static void main(String[] args){
			int detik, menit, jam, sisa1,sisa2;
			detik = 5200;
	
		jam = detik/3600;
		sisa1 = detik%3600;
		
		menit = (int) sisa1/60;
		sisa2 = sisa1%60;
		
		System.out.println("Hasil Konversi : " + detik + " Detik = " + jam + " Jam : " + menit + " Menit : " + sisa2 + " Detik");
	
	}
}