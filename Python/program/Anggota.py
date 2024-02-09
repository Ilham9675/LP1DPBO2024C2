from Bidang import Bidang  # Import kelas Bidang
from Partai import Partai  # Import kelas Partai

class Anggota:
    __nama = ""  # Nama anggota (private)
    __id = ""  # ID anggota (private)
    __bidang = Bidang()  # Objek Bidang yang menunjukkan bidang keahlian anggota (private)
    __partai = Partai()  # Objek Partai yang menunjukkan partai politik anggota (private)

    def __init__(self, nama="", id="", partai=None, bidang=None):
        """
        Konstruktor kelas Anggota
        """
        self.__nama = nama
        self.__id = id
        self.__partai = partai if partai else Partai()  # Menginisialisasi objek Partai
        self.__bidang = bidang if bidang else Bidang()  # Menginisialisasi objek Bidang

    # Metode-metode untuk menambahkan informasi anggota
    def add_nama(self, nama):
        self.__nama = nama

    def add_id(self, id):
        self.__id = id

    def add_bidang(self, bidang):
        self.__bidang = bidang

    def add_partai(self, partai):
        self.__partai = partai

    def add_anggota(self, nama, id, partai, bidang):
        self.__nama = nama
        self.__id = id
        self.__partai = partai
        self.__bidang = bidang

    # Metode-metode untuk mendapatkan informasi anggota
    def get_nama(self):
        return self.__nama

    def get_id(self):
        return self.__id

    def get_partai(self):
        return self.__partai.get_nama_partai()

    def get_bidang(self):
        return self.__bidang.get_nama_bidang()

    # Metode untuk mengubah data anggota
    def ubah_data_anggota(self, nama, id, nama_partai, ketua, nama_bidang, description):
        if nama != "-":
            self.__nama = nama
        if id != "-":
            self.__id = id

        if nama_partai != "-":
            self.__partai.add_nama_partai(nama_partai)

        if ketua != "-":
            self.__partai.add_ketua(ketua)

        if nama_bidang != "-":
            self.__bidang.add_nama_bidang(nama_bidang)

        if description != "-":
            self.__bidang.add_description(description)

    # Metode untuk menghapus data anggota
    def hapus_data(self):
        self.__nama = ""
        self.__id = ""
        self.__bidang.hapus()
        self.__partai.hapus()
