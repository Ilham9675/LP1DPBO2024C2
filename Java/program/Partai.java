public class Partai {

    // Variabel untuk menyimpan nama partai dan ketua partai
    private String nama_partai;
    private String ketua;

    // Konstruktor tanpa parameter, inisialisasi nama_partai dengan string kosong dan ketua dengan tanda "-"
    public Partai(){
        this.nama_partai = "";
        this.ketua = "-";
    }

    // Konstruktor dengan parameter, inisialisasi nama_partai dan ketua sesuai parameter yang diberikan
    public Partai(String nama_partai,String ketua){
        this.nama_partai = nama_partai;
        this.ketua = ketua;
    }

    // Method untuk menambahkan nama partai
    public void add_nama_partai(String nama_partai){
        this.nama_partai = nama_partai;
    }

    // Method untuk menambahkan nama ketua partai
    public void add_ketua(String ketua){
        this.ketua = ketua;
    }

    // Method untuk menambahkan nama partai dan ketua sekaligus
    public void add_partai(String nama_partai,String ketua){
        this.nama_partai = nama_partai;
        this.ketua = ketua;
    }

    // Method untuk menghapus nama partai dan ketua
    public void hapus(){
        this.nama_partai = "";
        this.ketua = "-";
    }

    // Method untuk mendapatkan nama partai
    public String get_nama_partai(){
        return this.nama_partai;
    }

    // Method untuk mendapatkan nama ketua partai
    public String get_ketua(){
        return this.ketua;
    }
}
