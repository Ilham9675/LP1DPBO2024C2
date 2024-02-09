<?php
class Partai {
    // Atribut-atribut private untuk menyimpan nama partai dan nama ketua
    private $nama_partai = "";
    private $ketua = "";

    // Konstruktor kelas untuk menginisialisasi objek Partai
    public function __construct($nama_partai = "", $ketua = "") {
        $this->nama_partai = $nama_partai;
        $this->ketua = $ketua;
    }

    // Metode untuk menambahkan nama partai
    public function add_nama_partai($nama_partai) {
        $this->nama_partai = $nama_partai;
    }

    // Metode untuk menambahkan nama ketua partai
    public function add_ketua($ketua) {
        $this->ketua = $ketua;
    }

    // Metode untuk menambahkan nama partai dan nama ketua sekaligus
    public function add_partai($nama_partai, $ketua) {
        $this->nama_partai = $nama_partai;
        $this->ketua = $ketua;
    }

    // Metode untuk menghapus nama partai dan nama ketua
    public function hapus() {
        $this->ketua = "";
        $this->nama_partai = "";
    }

    // Metode untuk mendapatkan nama partai
    public function get_nama_partai() {
        return $this->nama_partai;
    }

    // Metode untuk mendapatkan nama ketua partai
    public function get_ketua() {
        return $this->ketua;
    }
}
?>
