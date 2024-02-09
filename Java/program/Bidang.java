public class Bidang {
    // Variabel untuk menyimpan nama bidang dan deskripsi bidang
    private String nama_bidang;
    private String description;

    // Konstruktor tanpa parameter, inisialisasi nama_bidang dengan string kosong dan description dengan tanda "-"
    public Bidang(){
        this.nama_bidang = "";
        this.description = "-";
    }

    // Konstruktor dengan parameter, inisialisasi nama_bidang dan description sesuai parameter yang diberikan
    public Bidang(String nama_bidang, String description){
        this.nama_bidang = nama_bidang;
        this.description = description;
    }

    // Method untuk menambahkan nama bidang
    public void add_nama_bidang(String nama_bidang){
        this.nama_bidang = nama_bidang;
    }

    // Method untuk menambahkan deskripsi bidang
    public void add_description(String description){
        this.description = description;
    }

    // Method untuk menambahkan nama bidang dan deskripsi sekaligus
    public void add_bidang(String nama_bidang, String description){
        this.nama_bidang = nama_bidang;
        this.description = description;
    }

    // Method untuk menghapus nama bidang dan deskripsi
    public void hapus(){
        this.nama_bidang = "";
        this.description = "-";
    }

    // Method untuk mendapatkan nama bidang
    public String get_nama_bidang(){
        return this.nama_bidang;
    }

    // Method untuk mendapatkan deskripsi bidang
    public String get_description(){
        return this.description;
    }
}
