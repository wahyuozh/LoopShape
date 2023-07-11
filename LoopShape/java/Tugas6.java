/*NAMA : WAHYU OZORAH MANURUNG
NPM: G1A022060
KELAS B2
*/
package LoopShape.java; //Package

public class Tugas6 { 
    //1. Rectangle

    public static void main(String[] args) {
      for (int i=1; i<=4; i++) // awalan dengan inisialisasi i=1 dan baris kebawahnya akan berulangn sebanyak 4 line
      {
           for (int j=0; j<=4; j++){ // ini untuk membuat kesamping yang mana pada soal kesampingnya ada 5 dan saya buat dari0-4
            if(i==1||i==4||j==0||j==4){ // ini untuk membuat bagian tengah hilang yang mana di if kan yang bakal terisi
            
              System.out.print("#"); // di esekusi jika memenuhi kondisi if diatas
        
            }else{ // jika tidak memenuhi
            
           System.out.print(" "); //maka akan meesekusi ini
            }
          }
      System.out.println(""); //ini akan membuat baris baru sehinggu membentuk persegi
           }          
System.out.print("\n"); //membuat kelang line 
//2. triangel 
for(int i=1; i<=5; i++) { // membuat awalan dengan 5 baris yang inisialisasi dimulai dari 1 
	for (int j=1; j<=i; j++) { // membuat baris dengan inisialisasi dari 1 namun baris nya akan mengurang dari pada i saat di esekusi
    		if (i==5|| j==1|| j==i) { // ini adalah yang akan di esekusi untuk menghasilkan # sehingga nanti akan menghasilkan segitiga 
    		
    		System.out.print("#"); // ini adalah yang akan di esekusi 
    		}
    	else { // jika if tadi tidak bisa di esekusi maka akan membuat kosong
    		System.out.print(" "); // inilah yang akan membuat kosong, dan harus di kelang atau kasih spasi
    		
    	}
}
	System.out.println(""); // membuat # nanti akan berulang dengan line baru 
	}
}}


