class Bidang:
    # Atribut-atribut private
    __nama_bidang = ""
    __description = "-"

    # Konstruktor kelas
    def __init__(self, nama="", description="-"):
        # Mengatur nilai awal untuk atribut-atribut
        self.__nama_bidang = nama
        self.__description = description

    # Metode untuk menambahkan nama bidang
    def add_nama_bidang(self, nama):
        self.__nama_bidang = nama
    
    # Metode untuk menambahkan deskripsi bidang
    def add_description(self, description):
        self.__description = description

    # Metode untuk menambahkan nama dan deskripsi bidang sekaligus
    def add_bidang(self, nama, description):
        self.__nama_bidang = nama
        self.__description = description

    # Metode untuk menghapus nama dan deskripsi bidang
    def hapus(self):
        self.__nama_bidang = ""
        self.__description = "-"

    # Metode untuk mendapatkan nama bidang
    def get_nama_bidang(self):
        return self.__nama_bidang

    # Metode untuk mendapatkan deskripsi bidang
    def get_description(self):
        return self.__description
