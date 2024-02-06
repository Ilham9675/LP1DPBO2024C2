
#include <iostream>
#include <string>

using namespace std;

class Bidang{
    private:
        string nama_bidang,description;
    public:
        Bidang(){
            nama_bidang  = "";
            description = "-";
        }

        Bidang(string nama_bidang,string description){
            this->nama_bidang = nama_bidang;
            this->description = description;
        }

        void add_nama_bidang(string nama_bidang){
            this->nama_bidang = nama_bidang;
        }

        void add_description(string description){
            this->description = description;
        }

        void hapus(){
            nama_bidang  = "";
            description = "-";
        }

        string get_nama_bidang(){
            return this->nama_bidang;
        }

        string get_description(){
            return this->description;
        }
        ~Bidang(){

        }
};

class Partai{
    private:
        string nama_partai;
        string ketua;
    public:
        Partai(){
            this->nama_partai = "";
            this->ketua = "-";
        }

        Partai(string nama_partai,string ketua){
            this->nama_partai = nama_partai;
            this->ketua = ketua;
            
        }

        void add_nama_partai(string nama_partai){
            this->nama_partai = nama_partai;
        }

        void add_ketua(string katua){
            this->ketua = katua;
        }

        void hapus(){
            this->nama_partai = "";
            this->ketua = "-";
        }

        string get_nama_partai(){
            return this->nama_partai;
        }

        string get_ketua(){
            return this->ketua;
        }

        ~Partai(){

        }

};

class Anggota{
    private:
        string name,id;
        Bidang bidang;
        Partai partai;
    public:
        Anggota(){
            this->name = "";
            this->id = "";
        }

        string get_name(){
            return this->name;
        }

        void set_name(string name){
            this->name = name;
        }

        string get_id(){
            return this->id;
        }

        void set_id(char id){
            this->id = id;
        }

        string get_bidang(){
            return this->bidang.get_nama_bidang();
        }

        void set_bidang(string nama_bidang){
            this->bidang.add_nama_bidang(nama_bidang);
        }

        string get_partai(){
            return this->partai.get_nama_partai();
        }
        
        void set_partai(string nama_partai){
            this->partai.add_ketua(nama_partai);
        }

        void tambah_data(string name,string id,Bidang bidang,Partai partai){
            this->name = name;
            this->id = id;
            this->bidang = bidang;
            this->partai = partai;
        }

        void ubah_data(string name,string id,Bidang bidang,Partai partai){
            this->name = name;
            this->id = id;
            this->bidang = bidang;
            this->partai = partai;
        }

        void hapus_data(){
            this->name = "";
            this->id = "";
            this->bidang.hapus();
            this->partai.hapus();
        }

        
        
        ~Anggota(){
            
        }

};


