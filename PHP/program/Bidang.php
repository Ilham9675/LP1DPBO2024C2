<?php
class Bidang {
    // Variabel untuk menyimpan nama bidang dan deskripsi bidang
    private $nama_bidang = '';
    private $description = '';

    // Konstruktor dengan parameter, inisialisasi nama_bidang dan description sesuai parameter yang diberikan
    public function __construct($nama_bidang = '', $description = '') {
        $this->nama_bidang = $nama_bidang;
        $this->description = $description;
    }

    // Method untuk menambahkan nama bidang
    public function add_nama_bidang($nama_bidang) {
        $this->nama_bidang = $nama_bidang;
    }

    // Method untuk menambahkan deskripsi bidang
    public function add_description($description) {
        $this->description = $description;
    }

    // Method untuk menambahkan nama bidang dan deskripsi sekaligus
    public function add_bidang($nama_bidang, $description) {
        $this->nama_bidang = $nama_bidang;
        $this->description = $description;
    }

    // Method untuk menghapus nama bidang dan deskripsi
    public function hapus() {
        $this->nama_bidang = "";
        $this->description = "-";
    }

    // Method untuk mendapatkan nama bidang
    public function get_nama_bidang() {
        return $this->nama_bidang;
    }

    // Method untuk mendapatkan deskripsi bidang
    public function get_description() {
        return $this->description;
    }
}
?>