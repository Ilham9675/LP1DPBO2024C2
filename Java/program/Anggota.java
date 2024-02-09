public class Anggota {
    // Variabel untuk menyimpan nama anggota, ID anggota, partai yang diikuti, dan bidang yang diikuti
    private String nama;
    private String id;
    private Partai partai;
    private Bidang bidang;

    // Konstruktor tanpa parameter, inisialisasi nama dan id dengan string kosong
    public Anggota(){
        this.nama = "";
        this.id = "";
    }

    // Konstruktor dengan parameter, inisialisasi nama, id, partai, dan bidang sesuai parameter yang diberikan
    public Anggota(String nama, String id, Partai partai, Bidang bidang){
        this.nama = nama;
        this.id = id;
        this.partai = partai;
        this.bidang = bidang;
    }

    // Method untuk menambahkan nama anggota
    public void add_nama(String nama){
        this.nama = nama;
    }

    // Method untuk menambahkan ID anggota
    public void add_id(String id){
        this.id = id;
    }

    // Method untuk menambahkan bidang yang diikuti oleh anggota
    public void add_bidang(Bidang bidang){
        this.bidang = bidang;
    }

    // Method untuk menambahkan partai yang diikuti oleh anggota
    public void add_partai(Partai partai){
        this.partai = partai;
    }

    // Method untuk menambahkan nama, id, partai, dan bidang anggota sekaligus
    public void add_anggota(String nama, String id, Partai partai, Bidang bidang){
        this.nama = nama;
        this.id = id;
        this.partai = partai;
        this.bidang = bidang;
    }

    // Method untuk mendapatkan nama anggota
    public String get_nama(){
        return this.nama;
    }

    // Method untuk mendapatkan ID anggota
    public String get_id(){
        return this.id;
    }

    // Method untuk mendapatkan nama partai yang diikuti oleh anggota
    public String get_partai(){
        return this.partai.get_nama_partai();
    }

    // Method untuk mendapatkan nama bidang yang diikuti oleh anggota
    public String get_bidang(){
        return this.bidang.get_nama_bidang();
    }

    // Method untuk mengubah data anggota, termasuk nama, id, nama partai, ketua partai, nama bidang, dan deskripsi bidang
    public void ubah_data_anggota(String nama, String id, String nama_partai, String ketua, String nama_bidang, String description){
        if(!nama.equals("-")){
            this.nama = nama;
        }
        if (!id.equals("-")){
            this.id = id;
        }

        if(!nama_partai.equals("-")){
            this.partai.add_nama_partai(nama_partai);
        }

        if(!ketua.equals("-")){
            this.partai.add_ketua(ketua);
        }

        if(!nama_bidang.equals("-")){
            this.bidang.add_nama_bidang(nama_bidang);
        }

        if(!description.equals("-")){
            this.bidang.add_description(description);
        }
    }

    // Method untuk menghapus data anggota, termasuk nama, id, partai, dan bidang
    public void hapus_data(){
        this.nama = "";
        this.id = "";
        this.bidang.hapus();
        this.partai.hapus();
    }
}
