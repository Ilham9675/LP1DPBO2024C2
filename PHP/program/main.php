<?php
require ('Partai.php');
require ('Bidang.php');
require ('Anggota.php');


$partai = new Partai("partaiA", "ketuaA");
$bidang = new Bidang("bidangA", "-");
$data[] = new Anggota("ilham","1","gambar/foto1.jpg",$partai,$bidang);

$partai = new Partai("partaiA", "ketuaA");
$bidang = new Bidang("bidangB", "-");
$data[] = new Anggota("akbar","2","gambar/foto2.jpeg",$partai,$bidang);

$partai = new Partai("partaiC", "ketuaC");
$bidang = new Bidang("bidangC", "-");
$data[] = new Anggota("budi","3","gambar/foto2.jpeg",$partai,$bidang);


$partai = new Partai("partaiD", "ketuaD");
$bidang = new Bidang("bidangC", "-");
$data[] = new Anggota("yanto","444","gambar/foto4.jpg",$partai,$bidang);

$partai = new Partai("partaiA", "ketuaA");
$bidang = new Bidang("bidangC", "-");
$data[] = new Anggota("tono","986","gambar/foto4.jpg",$partai,$bidang);

// Membuat header tabel
echo "<table border='1'>
        <tr>
            <th>Id</th>
            <th>Nama</th>
            <th>Nama bidang</th>
            <th>Nama partai</th>
            <th>foto</th>
        </tr>";

// Mengisi baris tabel dengan data
for ($i = 0; $i < count($data); $i++) {
    echo "<tr>";
    echo "<td>".$data[$i]->get_id()."</td>";
    echo "<td>".$data[$i]->get_nama()."</td>";
    echo "<td>".$data[$i]->get_bidang()."</td>";
    echo "<td>".$data[$i]->get_partai()."</td>";
    echo "<td><img src='".$data[$i]->get_foto()."' alt='".$data[$i]->get_nama()."' width='40'></td>";
    echo "</tr>";
}

// Menutup tabel
echo "</table>";


$data[3]->ubah_data_anggota("-","4","-","PartaiD","ketuaD","bidangD","-");
$data[4]->ubah_data_anggota("-","5","gambar/foto1.jpg","PartaiE","ketuaE","bidangE","-");

echo "data Anggota DPR dengan nama ".$data[3]->get_nama()." berhasil di ubah<br>";
echo "data Anggota DPR dengan nama ".$data[4]->get_nama()." berhasil di ubah<br><br>";

// Membuat header tabel
echo "<table border='1'>
        <tr>
            <th>Id</th>
            <th>Nama</th>
            <th>Nama bidang</th>
            <th>Nama partai</th>
            <th>Foto</th>
        </tr>";

// Mengisi baris tabel dengan data
for ($i = 0; $i < count($data); $i++) {
    echo "<tr>";
    echo "<td>".$data[$i]->get_id()."</td>";
    echo "<td>".$data[$i]->get_nama()."</td>";
    echo "<td>".$data[$i]->get_bidang()."</td>";
    echo "<td>".$data[$i]->get_partai()."</td>";
    echo "<td><img src='".$data[$i]->get_foto()."' alt='".$data[$i]->get_nama()."' width='40'></td>";
    echo "</tr>";
}

// Menutup tabel
echo "</table>";


echo "data Anggota DPR dengan nama ".$data[1]->get_nama()." berhasil di dihapus<br>";
$data[1]->hapus_data();
unset($data[1]);
$data = array_values($data); // Mengatur ulang indeks array setelah penghapusan
echo "data Anggota DPR dengan nama ".$data[1]->get_nama()." berhasil di dihapus<br><br>";
$data[1]->hapus_data();
unset($data[1]);
$data = array_values($data); // Mengatur ulang indeks array setelah penghapusan

// Membuat header tabel
echo "<table border='1'>
        <tr>
            <th>Id</th>
            <th>Nama</th>
            <th>Nama bidang</th>
            <th>Nama partai</th>
            <th>Foto</th>
        </tr>";

// Mengisi baris tabel dengan data
for ($i = 0; $i < count($data); $i++) {
    echo "<tr>";
    echo "<td>".$data[$i]->get_id()."</td>";
    echo "<td>".$data[$i]->get_nama()."</td>";
    echo "<td>".$data[$i]->get_bidang()."</td>";
    echo "<td>".$data[$i]->get_partai()."</td>";
    echo "<td><img src='".$data[$i]->get_foto()."' alt='".$data[$i]->get_nama()."' width='40'></td>";
    echo "</tr>";
}

// Menutup tabel
echo "</table>";
?>
