from Partai import Partai  # Import kelas Partai
from Bidang import Bidang  # Import kelas Bidang
from Anggota import Anggota  # Import kelas Anggota

# Variabel untuk menandai apakah program harus tetap berjalan atau berhenti
cek = 0  

# Variabel untuk menyesuaikan lebar kolom di output
kolom1 = 4  
kolom2 = 6  
kolom3 = 13  
kolom4 = 13  

# List untuk menyimpan data anggota
data = []  

# Perulangan untuk menampilkan menu utama dan memproses pilihan pengguna
while cek == 0:
    # Inisialisasi variabel lokal
    i = 0
    n = 0
    j = 0

    # Menampilkan header dan menu utama
    print("+=======================================================+")
    print("+ Selamat datang di sistem data Dewan Perwakilan Rakyat +")
    print("+=======================================================+")
    print("Berikut fitur-fitur yang tersedia di sistem : ")
    print("1. Tambah")
    print("2. Hapus")
    print("3. Mengubah")
    print("4. Menampilkan")
    print("5. Keluar")
    pilihan = input("Pilihan : ")

    try:
        n = int(pilihan)
    except ValueError:
        print("Input bukan bilangan bulat!")

    # Memproses pilihan pengguna
    if n == 1:
        # Memasukkan data anggota baru
        anggota = Anggota()
        bidang = Bidang()
        partai = Partai()
        print("Memasukan data Anggota : ")
        id_input = input("Id : ")
        if len(id_input) + 2 > kolom1:
            kolom1 = len(id_input) + 2
        nama_input = input("Nama : ")
        if len(nama_input) + 2 > kolom2:
            kolom2 = len(nama_input) + 2
        nama_bidang_input = input("Nama bidang : ")
        if len(nama_bidang_input) + 2 > kolom3:
            kolom3 = len(nama_bidang_input) + 2
        description_input = input("Description bidang : ")
        nama_partai_input = input("Nama partai : ")
        if len(nama_partai_input) + 2 > kolom4:
            kolom4 = len(nama_partai_input) + 2
        ketua_input = input("Ketua : ")

        bidang.add_bidang(nama_bidang_input, description_input)
        partai.add_partai(nama_partai_input, ketua_input)
        anggota.add_anggota(nama_input, id_input, partai, bidang)
        data.append(anggota)
        print()
    elif n == 2:
        # Menghapus data anggota
        print("Menghapus data Anggota berdasarkan : ")
        print("1.Nama")
        print("2.Id")
        print("3.Back")
        m = 0
        pilihan = input("Pilihan : ")

        try:
            m = int(pilihan)
        except ValueError:
            print("The input is not an integer!")

        if m == 1:
            nama_yang_dicari = input("Masukan nama : ")
            tes = 0
            for i in range(len(data)):
                if nama_yang_dicari == data[i].get_nama():
                    data[i].hapus_data()
                    data.pop(i)
                    tes = 1
            if tes == 1:
                print("Data berhasil di hapus")
                print()
            else:
                print("Data tidak ditemukan")
                print()
        elif m == 2:
            id_yang_dicari = input("Masukan id : ")
            tes = 0
            for i in range(len(data)):
                if id_yang_dicari == data[i].get_id():
                    data[i].hapus_data()
                    data.pop(i)
                    tes = 1
            if tes == 1:
                print("Data berhasil di hapus")
                print()
            else:
                print("Data tidak ditemukan")
                print()
    elif n == 3:
        # Mengubah data anggota
        print("Mengubah data Anggota berdasarkan : ")
        print("1.Nama")
        print("2.Id")
        print("3.Back")
        m = 0
        pilihan = input("Pilihan : ")

        try:
            m = int(pilihan)
        except ValueError:
            print("The input is not an integer!")

        if m == 1 or m == 2:
            nama_yang_dicari = "-"
            id_yang_dicari = "-"
            if m == 1:
                nama_yang_dicari = input("masukan nama : ")
            else:
                id_yang_dicari = input("masukan id : ")
            tes = 0
            for i in range(len(data)):
                if nama_yang_dicari == data[i].get_nama() or id_yang_dicari == data[i].get_id():
                    for j in range(kolom1 + kolom2 + kolom3 + kolom4 + 5):
                        print("-", end="")
                    print()
                    print("|", end=" ")
                    print("Data yang diubah".center(kolom1 + kolom2 + kolom3 + kolom4 + 1) + " |")
                    for j in range(kolom1 + kolom2 + kolom3 + kolom4 + 5):
                        print("-", end="")
                    print()
                    print("| Id" + " " * (kolom1 - 4) + " | Nama" + " " * (kolom2 - 6) + " | Nama Bidang" 
                          + " " * (kolom3 - 13) + " | Nama Partai" + " " * (kolom4 - 13) + " |")
                    for j in range(kolom1 + kolom2 + kolom3 + kolom4 + 5):
                        print("-", end="")
                    print()
                    print("| " + data[i].get_id() 
                          + " " * (kolom1 - len(data[i].get_id()) - 2) + " | " + data[i].get_nama() 
                          + " " * (kolom2 - len(data[i].get_nama()) - 2) + " | " + data[i].get_bidang() 
                          + " " * (kolom3 - len(data[i].get_bidang()) - 2) + " | " + data[i].get_partai() 
                          + " " * (kolom4 - len(data[i].get_partai()) - 2) + " |")
                    for j in range(kolom1 + kolom2 + kolom3 + kolom4 + 5):
                        print("-", end="")
                    print()
                    print("Data baru : ")
                    print("Memasukan data Anggota : ")
                    id_input = input("Id : ")
                    if len(id_input) + 2 > kolom1:
                        kolom1 = len(id_input) + 2
                    nama_input = input("Nama : ")
                    if len(nama_input) + 2 > kolom2:
                        kolom2 = len(nama_input) + 2
                    nama_bidang_input = input("Nama Bidang : ")
                    if len(nama_bidang_input) + 2 > kolom3:
                        kolom3 = len(nama_bidang_input) + 2
                    description_input = input("Description Bidang : ")
                    nama_partai_input = input("Nama Partai : ")
                    if len(nama_partai_input) + 2 > kolom4:
                        kolom4 = len(nama_partai_input) + 2
                    ketua_input = input("Ketua : ")

                    data[i].ubah_data_anggota(nama_input, id_input, nama_partai_input, ketua_input,nama_bidang_input, description_input)
                    tes = 1
            if tes == 1:
                print("Data berhasil di ubah")
                print()
            else:
                print("Data tidak ditemukan")
                print()
    elif n == 4:
        # Menampilkan data anggota
        for j in range(kolom1 + kolom2 + kolom3 + kolom4 + 5):
            print("-", end="")
        print()
        print("|", end=" ")
        print("Anggota Dewan Perwakilan Rakyat".center(kolom1 + kolom2 + kolom3 + kolom4 + 1) + " |")
        for j in range(kolom1 + kolom2 + kolom3 + kolom4 + 5):
            print("-", end="")
        print("")
        print("| Id" + " " * (kolom1 - 4) + " | Nama" + " " * (kolom2 - 6) + " | Nama bidang" 
              + " " * (kolom3 - 13) + " | Nama partai" + " " * (kolom4 - 13) + " |")
        for i in range(len(data)):
            for j in range(kolom1 + kolom2 + kolom3 + kolom4 + 5):
                print("-", end="")
            print()
            
            print("| " + data[i].get_id() 
                  + " " * (kolom1 - len(data[i].get_id()) - 2) + " | " + data[i].get_nama() 
                  + " " * (kolom2 - len(data[i].get_nama()) - 2) + " | " + data[i].get_bidang() 
                  + " " * (kolom3 - len(data[i].get_bidang()) - 2) + " | " + data[i].get_partai() 
                  + " " * (kolom4 - len(data[i].get_partai()) - 2) + " |")
        for j in range(kolom1 + kolom2 + kolom3 + kolom4 + 5):
            print("-", end="")
        print()
        print()
    else:
        # Menghentikan program
        cek = 1


