package tugas.pkg4;
import java.util.Arrays;
import java.util.Scanner;
public class BukuMain {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    BukuAlamat[] buku = new BukuAlamat[0];
    int i=0;
    
    System.out.println("APLIKASI BUKU ALAMAT MORIS");
    for (int j = 1; j > 0; j++){
        System.out.println("==========================");
        System.out.println("\tMenu");
        System.out.println("1. Input Data");
        System.out.println("2. Edit Data");
        System.out.println("3. Delete Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Exit");
        System.out.print("Masukkan pilihan anda : ");
        int pil = input.nextInt();
        System.out.println("==========================");
        switch(pil){
            case 1 :
                System.out.println("\t>>Input Data<<");
                buku = Arrays.copyOf(buku, buku.length + 1);
                BukuAlamat.inputBuku(buku, i);
                i++;
                break;
            case 2 :
                System.out.println("\t>>Edit Data<<");
                BukuAlamat.displayBuku(buku);
                System.out.print("Edit data nomor : ");
                i = input.nextInt();
                if ((i-1)<buku.length){
                    BukuAlamat.editBuku(buku, i);
                } else 
                    System.out.println("Data tidak tepat");;
                break;
            case 3 :
                System.out.println("\t>>Delete Data<<");
                BukuAlamat.displayBuku(buku);
                System.out.print("Delete data nomor : ");
                i = input.nextInt();
                BukuAlamat.deleteBuku(buku, i);
                break;
            case 4 :
                System.out.println("\t>>Lihat Data<<");
                BukuAlamat.displayBuku(buku);
                break;
            case 5 :
                System.out.println("Terimakasih telah menggunakan Program ini . . . ");
                System.exit(0);
                break;
            default :
                System.out.println("Pilihan yang anda masukkan salah");
        } 
        System.out.print("Apakah Anda Ingin Kembali ke Menu ? <y/n> : ");
        String y = input.next();
            if ("y".equals(y)){
            } else if ("n".equals(y)){
                System.out.println("TERIMA KASIH");
                System.exit(0);
            }
    }
}
}
