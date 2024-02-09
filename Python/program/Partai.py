class Partai:
    # Atribut-atribut private untuk menyimpan nama partai dan nama ketua
    __nama_partai = ""
    __ketua = ""

    # Konstruktor kelas untuk menginisialisasi objek Partai
    def __init__(self, nama_partai="", ketua=""):
        self.__nama_partai = nama_partai
        self.__ketua = ketua

    # Metode untuk menambahkan nama partai
    def add_nama_partai(self, nama_partai):
        self.__nama_partai = nama_partai

    # Metode untuk menambahkan nama ketua partai
    def add_ketua(self, ketua):
        self.__ketua = ketua

    # Metode untuk menambahkan nama partai dan nama ketua sekaligus
    def add_partai(self, nama_partai, ketua):
        self.__nama_partai = nama_partai
        self.__ketua = ketua
    
    # Metode untuk menghapus nama partai dan nama ketua
    def hapus(self):
        self.__ketua = ""
        self.__nama_partai = ""

    # Metode untuk mendapatkan nama partai
    def get_nama_partai(self):
        return self.__nama_partai

    # Metode untuk mendapatkan nama ketua partai
    def get_ketua(self):
        return self.__ketua
