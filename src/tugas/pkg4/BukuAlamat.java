package tugas.pkg4;
import java.util.Scanner;
public class BukuAlamat {
    private String nama, alamat, telepon, email;
    Scanner input = new Scanner(System.in);
    public BukuAlamat (){
        nama = "";
        alamat = "";
        telepon = "";
        email = "";
    }
    public BukuAlamat (String n, String a, String t, String e){
        nama = n;
        alamat = a;
        telepon= t;
        email = e;
    }
    public String getNama() {
        return nama;
    }
    public void setNama() {  
        System.out.print("Nama\t: ");
        nama = input.next();
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat() {
        System.out.print("Alamat\t: ");
        alamat = input.next();
    }
    public String getTelepon() {
        return telepon;
    }
    public void setTelepon() { 
        System.out.print("Telepon\t: ");
        telepon = input.next();
    }
    public String getEmail() {
        return email;
    }
    public void setEmail() {
        System.out.print("E-Mail\t: ");
        email = input.next();
    }
    public static void displayBuku (BukuAlamat[] buku){
        for (int i = 0; i < buku.length; i++){
            System.out.println("Data Ke-"+(i+1));
            if(buku[i].getNama().equals(""))
                System.out.println("Deleted");
            else {
                System.out.println("Nama\t : "+buku[i].getNama()+"\t");
                System.out.println("Alamat\t : "+buku[i].getAlamat()+"\t");
                System.out.println("Telepon\t : "+buku[i].getTelepon()+"\t");
                System.out.println("E-Mail\t : "+buku[i].getEmail()+"\t");
                System.out.println("");
            }
        }
    }
    public static void inputBuku (BukuAlamat[] buku, int i){
        buku[i] = new BukuAlamat();
        buku[i].setNama();
        buku[i].setAlamat();
        buku[i].setTelepon();
        buku[i].setEmail();
        System.out.println("");
    }
    public static void deleteBuku (BukuAlamat[] buku, int x){
        --x;
        buku[x] = new BukuAlamat();
        System.out.println("");
    }
    public static void editBuku (BukuAlamat[] buku, int x){
        --x;
        buku[x] = new BukuAlamat();
        buku[x].setNama();
        buku[x].setAlamat();
        buku[x].setTelepon();
        buku[x].setEmail();
        System.out.println("");
    }
}
