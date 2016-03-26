package tugas.pkg4;
public class BukuAlamat {
    private String nama, alamat, telepon, email;
    
    public BukuAlamat (String n, String a, String t, String e){
        nama = n;
        alamat = a;
        telepon= t;
        email = e;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String n) {
        nama = n;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String a) {
        alamat = a;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String t) {
        telepon = t;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        email = e;
    }
    
}
