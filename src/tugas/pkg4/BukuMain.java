package tugas.pkg4;
import java.util.Scanner;
public class BukuMain {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\tAPLIKASI BUKU ALAMAT MORIS");
    for (int j = 1; j > 0; j++){
        System.out.println("\t\tMenu");
        System.out.println("1. Input Data");
        System.out.println("2. Lihat Data");
        System.out.println("3. Delete Data");
        System.out.println("4. Exit");
        System.out.print("Masukkan pilihan anda : ");
        int pil = input.nextInt();
        switch(pil){
            case 1 :
                System.out.println("Input Data");
                System.out.print("Nama Lengkap : ");
                
                break;
            case 2 :
                System.out.println("Lihat Data");
                break;
            case 3 :
                System.out.println("Delete Data");
                break;
            case 4 :
                System.out.println("Terimakasih telah menggunakan Program ini . . . ");
                System.exit(0);
                break;
            default :
                System.out.println("Pilihan yang anda masukkan salah");
        } 
        System.out.println("Apakah Anda Ingin Kembali ke Menu ? <y/n>");
        String y = input.next();
            if ("y".equals(y)){
            } else if ("n".equals(y)){
                System.out.println("TERIMA KASIH");
                System.exit(0);
            }
    }
}
}
