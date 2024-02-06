#include <bits/stdc++.h>
#include "DPR.cpp"


using namespace std;

int main(){
    int cek = 0;
    string name,id,nama_bidang,nama_partai,description,ketua;
    Anggota anggota;
    Bidang bidang;
    Partai partai;
    list<Anggota> data;
    do{

        int i,n = 0;
        cout << "1.nambah\n";
        cout << "2.mengapus\n";
        cout << "3.mengubah\n";
        cout << "4.menampilkan\n";
        cout << "5.keluar\n";
        cout << "pilihan : ";
        cin >> n;

        if(n == 1){
            cout << "id : ";
            cin >> id;
            cout << "nama : ";
            cin >> name;
            cout << "nama bidang : ";
            cin >> nama_bidang;
            cout << "deskripsi bidang : ";
            cin >> description;
            cout << "nama partai : ";
            cin >> nama_partai;
            cout << "ketua partai : ";
            cin >> ketua;

            partai.add_ketua(ketua);
            partai.add_nama_partai(nama_partai);

            bidang.add_nama_bidang(nama_bidang);
            bidang.add_description(description);
            
            
            anggota.tambah_data(name,id,bidang,partai);
            data.push_back(anggota);
            cout << "\n";
        }else if(n == 2){
            cout << "Hapus data:\n";
            cout << "1.nama\n";
            cout << "2.id\n";
            cout << "3.back\n";
            int m;
            cout << "masukan :";
            cin >> m;
            if(m == 1){
                string nama_yang_dicari;
                cout << "masukan nama :";
                cin >> nama_yang_dicari;
                int tes = 0;
                for(list<Anggota>::iterator it = data.begin();it != data.end();it++,i++){
                    if(nama_yang_dicari == it->get_name()){
                        it->hapus_data();
                        it = data.erase(it);
                        tes = 1;
                    }
                }


                if(tes == 0){
                    cout << "data tidak ditemukan\n";
                }else{
                    cout << "data berhasil di hapus\n";
                }
            }else if(m == 2){
                string id_yang_dicari;
                cout << "masukan id : ";
                cin >> id_yang_dicari;
                int tes = 0;
                for(list<Anggota>::iterator it = data.begin();it != data.end();it++,i++){
                    if(id_yang_dicari == it->get_id()){
                        it->hapus_data();
                        it = data.erase(it);
                        tes = 1;
                    }
                }


                if(tes == 0){
                    cout << "data tidak ditemukan\n";
                }else{
                    cout << "data berhasil di hapus\n";
                }
            }
            
        }else if(n == 3){
            cout << "mangubah data\n";
            cout << "1.nama\n";
            cout << "2.id\n";
            cout << "3.back\n";
            int m;
            cout << "masukan : ";
            cin >> m;
            if(m == 1){
                string nama_yang_dicari;
                cout << "masukan nama : ";
                cin >> nama_yang_dicari;
                int tes = 0;
                for(list<Anggota>::iterator it = data.begin();it != data.end();it++,i++){
                    if(nama_yang_dicari == it->get_name()){
                        
                        cout << "data sebelumnya:\n";
                        cout << "id : " << it->get_id() << "\n";
                        cout << "nama : " << it->get_name() << "\n";
                        cout << "nama bidang : " << it->get_bidang() << "\n";
                        cout << "nama partai : " << it->get_partai() << "\n";
                        cout << "\ndata yang ubah:\n";
                        cout << "id : ";
                        cin >> id;
                        cout << "nama : ";
                        cin >> name;
                        cout << "nama bidang : ";
                        cin >> nama_bidang;
                        cout << "deskripsi bidang : ";
                        cin >> description;
                        cout << "nama partai : ";
                        cin >> nama_partai;
                        cout << "ketua partai : ";
                        cin >> ketua;
                        partai.add_ketua(ketua);
                        partai.add_nama_partai(nama_partai);

                        bidang.add_nama_bidang(nama_bidang);
                        bidang.add_description(description);
                        it->ubah_data(name,id,bidang,partai);
                        tes = 1;
                    }
                }

                if(tes == 0){
                    cout << "data tidak ditemukan\n";
                }else{
                    cout << "data berhasil diubah\n";
                }
            }else if(m == 2){
                string id_yang_dicari;
                cout << "masukan id : ";
                cin >> id_yang_dicari;
                int tes = 0;
                for(list<Anggota>::iterator it = data.begin();it != data.end();it++,i++){
                    if(id_yang_dicari == it->get_id()){
                        
                        cout << "data sebelimnya:\n";
                        cout << "id : " << it->get_id() << "\n";
                        cout << "nama : " << it->get_name() << "\n";
                        cout << "nama bidang : " << it->get_bidang() << "\n";
                        cout << "nama partai : " << it->get_partai() << "\n";
                        cout << "\ndata yang ubah:\n";
                        cout << "id : ";
                        cin >> id;
                        cout << "nama : ";
                        cin >> name;
                        cout << "nama bidang : ";
                        cin >> nama_bidang;
                        cout << "deskripsi bidang : ";
                        cin >> description;
                        cout << "nama partai : ";
                        cin >> nama_partai;
                        cout << "ketua partai : ";
                        cin >> ketua;
                        partai.add_ketua(ketua);
                        partai.add_nama_partai(nama_partai);

                        bidang.add_nama_bidang(nama_bidang);
                        bidang.add_description(description);
                        it->ubah_data(name,id,bidang,partai);
                        tes = 1;
                    }
                }

                if(tes == 0){
                    cout << "data tidak ditemukan\n";
                }else{
                    cout << "data berhasil diubah\n";
                }
            }
            
        }else if(n == 4){
            i = 0;
            cout << "menampilkan data\n";
            for(list<Anggota>::iterator it = data.begin();it != data.end();it++,i++){
                if(it->get_name() != ""){
                    cout << "nama ke-" << (i + 1) << "\n";
                    cout << "id : " << it->get_id() << "\n";
                    cout << "nama : " << it->get_name() << "\n";
                    cout << "nama bidang : " << it->get_bidang() << "\n";
                    cout << "nama partai : " << it->get_partai() << "\n\n";
                }
            }

        }else{
            cek = 1;
        }
    }while(cek == 0);
    

    return 0;
}