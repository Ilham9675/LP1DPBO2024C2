<?php
require_once 'Bidang.php'; // Import kelas Bidang
require_once 'Partai.php'; // Import kelas Partai

class Anggota {
    private $nama = ""; // Nama anggota (private)
    private $id = ""; // ID anggota (private)
    private $bidang; // Objek Bidang yang menunjukkan bidang keahlian anggota (private)
    private $partai; // Objek Partai yang menunjukkan partai politik anggota (private)
    private $link_foto; // Objek Link Foto yang menunjukkan link foto

    public function __construct($nama = "", $id = "",$link_foto = "", $partai = null, $bidang = null) {
        /*
        Konstruktor kelas Anggota
        */
        $this->nama = $nama;
        $this->id = $id;
        $this->link_foto = $link_foto;
        $this->partai = $partai ? $partai : new Partai(); // Menginisialisasi objek Partai
        $this->bidang = $bidang ? $bidang : new Bidang(); // Menginisialisasi objek Bidang
    }

    // Metode-metode untuk menambahkan informasi anggota
    public function add_nama($nama) {
        $this->nama = $nama;
    }

    public function add_id($id) {
        $this->id = $id;
    }

    public function add_foto($link_foto) {
        $this->link_foto = $link_foto;
    }

    public function add_bidang($bidang) {
        $this->bidang = $bidang;
    }

    public function add_partai($partai) {
        $this->partai = $partai;
    }

    public function add_anggota($nama, $id, $partai, $bidang) {
        $this->nama = $nama;
        $this->id = $id;
        $this->partai = $partai;
        $this->bidang = $bidang;
    }

    // Metode-metode untuk mendapatkan informasi anggota
    public function get_nama() {
        return $this->nama;
    }

    public function get_id() {
        return $this->id;
    }

    public function get_foto() {
        return $this->link_foto;
    }

    public function get_partai() {
        return $this->partai->get_nama_partai();
    }

    public function get_bidang() {
        return $this->bidang->get_nama_bidang();
    }

    // Metode untuk mengubah data anggota
    public function ubah_data_anggota($nama, $id, $link_foto ,$nama_partai, $ketua, $nama_bidang, $description) {
        if ($nama !== "-") {
            $this->nama = $nama;
        }
        if ($id !== "-") {
            $this->id = $id;
        }

        if ($link_foto !== "-") {
            $this->link_foto = $link_foto;
        }

        if ($nama_partai !== "-") {
            $this->partai->add_nama_partai($nama_partai);
        }

        if ($ketua !== "-") {
            $this->partai->add_ketua($ketua);
        }

        if ($nama_bidang !== "-") {
            $this->bidang->add_nama_bidang($nama_bidang);
        }

        if ($description !== "-") {
            $this->bidang->add_description($description);
        }
    }

    // Metode untuk menghapus data anggota
    public function hapus_data() {
        $this->nama = "";
        $this->id = "";
        $this->bidang->hapus();
        $this->partai->hapus();
    }
}
?>
