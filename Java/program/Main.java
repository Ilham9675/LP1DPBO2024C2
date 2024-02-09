import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // Deklarasi variabel dan inisialisasi nilai awal
        int cek = 0; // variabel untuk memeriksa apakah program masih berjalan
        String nama,id,nama_bidang,nama_partai,description,ketua; // variabel untuk menyimpan input dari pengguna
        
        // Deklarasi variabel untuk menentukan lebar kolom pada tampilan
        int kolom1 = 4, kolom2 = 6, kolom3 = 13, kolom4 = 13;
        
        // Membuat ArrayList untuk menyimpan objek Anggota
        ArrayList<Anggota> data = new ArrayList<>();
        
        // Loop utama program
        do{
            int i = 0,n = 0,j = 0;
            // Menampilkan menu
            System.out.println("+=======================================================+");
            System.out.println("+ Selamat datang di sistem data Dewan Perwakilan Rakyat +");
            System.out.println("+=======================================================+");
            System.out.println("Berikut fitur-fitur yang tersedia di sistem : ");
            System.out.println("1.Nambah");
            System.out.println("2.Menghapus"); 
            System.out.println("3.Mengubah");
            System.out.println("4.Menampilkan");
            System.out.println("5.Keluar");
            System.out.print("Pilihan : ");

            // Meminta input dari pengguna
            Scanner sc = new Scanner(System.in);

            try{
                n = sc.nextInt(); // Membaca pilihan pengguna
            }
            catch(Exception e){
                System.out.println("The input is not an integer!"); // Menangani kesalahan jika input bukan angka
            }

            // Menangani pilihan pengguna
            if(n == 1){
                // Menambahkan anggota baru
                Anggota anggota = new Anggota();
                Bidang bidang = new Bidang();
                Partai partai = new Partai();
                System.out.println("Memasukan data Anggota : ");
                System.out.print("Id : ");
                id = sc.next();
                if((id.length() + 2) > kolom1){
                    kolom1 = id.length() + 2;
                }
                System.out.print("Nama : ");
                nama = sc.next();
                if((nama.length() + 2) > kolom2){
                    kolom2 = nama.length() + 2;
                }
                
                System.out.print("Nama bidang : ");
                nama_bidang = sc.next();
                if((nama_bidang.length() + 2) > kolom3){
                    kolom3 = nama_bidang.length() + 2;
                }
                System.out.print("Description bidang : ");
                description = sc.next();
                System.out.print("Nama partai : ");
                nama_partai = sc.next();
                if((nama_partai.length() + 2) > kolom4){
                    kolom4 = nama_partai.length() + 2;
                }
                System.out.print("Ketua : ");
                ketua = sc.next();

                // Menambahkan data anggota ke ArrayList
                bidang.add_bidang(nama_bidang, description);
                partai.add_partai(nama_partai, ketua);
                anggota.add_anggota(nama, id, partai, bidang);
                data.add(anggota);
                System.out.println();
            }else if(n == 2){
                // Menghapus anggota
                System.out.println("Menghapus data Anggota berdasarkan : ");
                System.out.println("1.Nama");
                System.out.println("2.Id");
                System.out.println("3.Back");
                int m = 0;
                System.out.print("Pilihan : ");
                try{
                    m = sc.nextInt();
                }
                catch(Exception e){
                    System.out.println("The input is not an integer!");
                }

                if(m == 1){
                    String nama_yang_dicari;
                    System.out.print("Masukan nama : ");
                    nama_yang_dicari = sc.next();
                    int tes = 0;
                    for(i = 0;i < data.size();i++){
                        if(nama_yang_dicari.equals(data.get(i).get_nama())){
                            data.get(i).hapus_data();
                            data.remove(i);
                            tes = 1;
                        }
                    }
                    if(tes == 1){
                        System.out.println("Data berhasil di hapus");
                        System.out.println();
                    }else{
                        System.out.println("Data tidak ditemukan");
                        System.out.println();
                    }
                }else if(m == 2){
                    String id_yang_dicari;
                    System.out.print("Masukan id : ");
                    id_yang_dicari = sc.next();
                    int tes = 0;
                    for(i = 0;i < data.size();i++){
                        if(id_yang_dicari.equals(data.get(i).get_id())){
                            data.get(i).hapus_data();
                            data.remove(i);
                            tes = 1;
                        }
                    }
                    if(tes == 1){
                        System.out.println("Data berhasil di hapus");
                        System.out.println();
                    }else{
                        System.out.println("Data tidak ditemukan");
                        System.out.println();
                    }
                }

                
            }else if(n == 3){
                // Mengubah data anggota
                System.out.println("Mengubah data Anggota berdasarkan : ");
                System.out.println("1.Nama");
                System.out.println("2.Id");
                System.out.println("3.Back");
                int m = 0;
                System.out.print("Pilihan : ");
                try{
                    m = sc.nextInt();
                }
                catch(Exception e){
                    System.out.println("The input is not an integer!");
                }

                if((m == 1) || (m == 2)){
                    String nama_yang_dicari = "-";
                    String id_yang_dicari = "-";
                    if(m == 1){
                        System.out.print("masukan nama : ");
                        nama_yang_dicari = sc.next();
                    }else{
                        System.out.print("masukan id : ");
                        id_yang_dicari = sc.next();
                    }
                    int tes = 0;
                    for(i = 0;i < data.size();i++){
                        if((nama_yang_dicari.equals(data.get(i).get_nama()) || (id_yang_dicari.equals(data.get(i).get_id())))){
                            for(j = 0;j < (kolom1+kolom2+kolom3+kolom4 + 5);j++){
                                System.out.print("-");
                            }
                            System.out.println();
                            System.out.print("|");
                            for(j = 0;j < (kolom1+kolom2+kolom3+kolom4 + 3 - 16) / 2;j++){
                                System.out.print(" ");
                            }
                            System.out.print("Data yang diubah");
                            for(j = 0;j < (kolom1+kolom2+kolom3+kolom4 + 3 - 16) / 2;j++){
                                System.out.print(" ");
                            }
                            if((kolom1+kolom2+kolom3+kolom4 + 3 - 16) % 2 == 0){
                                System.out.println("|");
                            }else{
                                System.out.println(" |");
                            }
                            for(j = 0;j < (kolom1+kolom2+kolom3+kolom4 + 5);j++){
                                System.out.print("-");
                            }
                            System.out.println();
                            System.out.print("| ");
                            System.out.print("Id");
                            for(j = 0;j < kolom1 - 4;j++){
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            System.out.print("Nama");
                            for(j = 0;j < kolom2 - 6;j++){
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            System.out.print("Nama Bidang");
                            for(j = 0;j < kolom3 - 13;j++){
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            System.out.print("Nama Partai");
                            for(j = 0;j < kolom4 - 13;j++){
                                System.out.print(" ");
                            }
                            System.out.println(" |");
                            for(j = 0;j < (kolom1+kolom2+kolom3+kolom4 + 5);j++){
                                System.out.print("-");
                            }
                            System.out.println();
                            System.out.print("| ");
                            
                            System.out.print(data.get(i).get_id());
                            for(j = 0;j < kolom1 - (data.get(i).get_id().length()+2);j++){
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            System.out.print(data.get(i).get_nama());
                            for(j = 0;j < kolom2 - (data.get(i).get_nama().length()+2);j++){
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            System.out.print(data.get(i).get_bidang());
                            for(j = 0;j < kolom3 - (data.get(i).get_bidang().length()+2);j++){
                                System.out.print(" ");
                            }
                            System.out.print(" | ");
                            System.out.print(data.get(i).get_partai());
                            for(j = 0;j < kolom4 - (data.get(i).get_partai().length()+2);j++){
                                System.out.print(" ");
                            }
                            System.out.println(" |");
                            for(j = 0;j < (kolom1+kolom2+kolom3+kolom4 + 5);j++){
                                System.out.print("-");
                            }
                            System.out.println();
                            System.out.println("Data baru : ");
                            System.out.println("Memasukan data Anggota : ");
                            System.out.print("Id : ");
                            id = sc.next();
                            if((id.length() + 2) > kolom1){
                                kolom1 = id.length() + 2;
                            }
                            System.out.print("Nama : ");
                            nama = sc.next();
                            if((nama.length() + 2) > kolom2){
                                kolom2 = nama.length() + 2;
                            }
                            
                            System.out.print("Nama Bidang : ");
                            nama_bidang = sc.next();
                            if((nama_bidang.length() + 2) > kolom3){
                                kolom3 = nama_bidang.length() + 2;
                            }
                            System.out.print("Description Bidang : ");
                            description = sc.next();
                            System.out.print("Nama Partai : ");
                            nama_partai = sc.next();
                            if((nama_partai.length() + 2) > kolom4){
                                kolom4 = nama_partai.length() + 2;
                            }
                            System.out.print("Ketua : ");
                            ketua = sc.next();
                            
                            // Mengubah data anggota
                            data.get(i).ubah_data_anggota(nama, id, nama_partai, ketua, nama_bidang, description);
                            tes = 1;
                        }
                    }
                    if(tes == 1){
                        System.out.println("Data berhasil di ubah");
                        System.out.println();
                    }else{
                        System.out.println("Data tidak ditemukan");
                        System.out.println();
                    }
                }
            }else if(n == 4){
                // Menampilkan data anggota
                for(j = 0;j < (kolom1+kolom2+kolom3+kolom4 + 5);j++){
                    System.out.print("-");
                }
                System.out.println();
                System.out.print("|");
                for(j = 0;j < (kolom1+kolom2+kolom3+kolom4 + 3 - 31) / 2;j++){
                    System.out.print(" ");
                }
                System.out.print("Anggota Dewan Perwakilan Rakyat");
                for(j = 0;j < (kolom1+kolom2+kolom3+kolom4 + 3 - 31) / 2;j++){
                    System.out.print(" ");
                }
                if((kolom1+kolom2+kolom3+kolom4 + 3 - 31) % 2 == 0){
                    System.out.println("|");
                }else{
                    System.out.println(" |");
                }
                for(j = 0;j < (kolom1+kolom2+kolom3+kolom4 + 5);j++){
                    System.out.print("-");
                }
                System.out.println();
                System.out.print("| ");
                System.out.print("Id");
                for(j = 0;j < kolom1 - 4;j++){
                    System.out.print(" ");
                }
                System.out.print(" | ");
                System.out.print("Nama");
                for(j = 0;j < kolom2 - 6;j++){
                    System.out.print(" ");
                }
                System.out.print(" | ");
                System.out.print("Nama bidang");
                for(j = 0;j < kolom3 - 13;j++){
                    System.out.print(" ");
                }
                System.out.print(" | ");
                System.out.print("Nama partai");
                for(j = 0;j < kolom4 - 13;j++){
                    System.out.print(" ");
                }
                System.out.println(" |");
                for(i = 0;i < data.size();i++){
                    for(j = 0;j < (kolom1+kolom2+kolom3+kolom4 + 5);j++){
                        System.out.print("-");
                    }
                    System.out.println();
                    System.out.print("| ");
                    
                    System.out.print(data.get(i).get_id());
                    for(j = 0;j < kolom1 - (data.get(i).get_id().length()+2);j++){
                        System.out.print(" ");
                    }
                    System.out.print(" | ");
                    System.out.print(data.get(i).get_nama());
                    for(j = 0;j < kolom2 - (data.get(i).get_nama().length()+2);j++){
                        System.out.print(" ");
                    }
                    System.out.print(" | ");
                    System.out.print(data.get(i).get_bidang());
                    for(j = 0;j < kolom3 - (data.get(i).get_bidang().length()+2);j++){
                        System.out.print(" ");
                    }
                    System.out.print(" | ");
                    System.out.print(data.get(i).get_partai());
                    for(j = 0;j < kolom4 - (data.get(i).get_partai().length()+2);j++){
                        System.out.print(" ");
                    }
                    System.out.println(" |");
                }
                for(j = 0;j < (kolom1+kolom2+kolom3+kolom4 + 5);j++){
                    System.out.print("-");
                }
                System.out.println();
                System.out.println();
            }else{
                cek = 1;
            }


        }while(cek == 0);
    }
}
