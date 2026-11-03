# FitTrack – Sistem Keanggotaan Gym

## Identitas

- Nama: Annisa Azzuhra Maghfirah
- NPM: 250810701100045
- Kelas: A
- Mata Kuliah: Praktikum Pemrograman Berorientasi Objek

## Deskripsi

FitTrack merupakan program sederhana berbasis Java yang digunakan untuk mengelola data keanggotaan gym. Program ini menyimpan informasi member berupa nama, nomor telepon, tanggal pendaftaran, dan jenis paket keanggotaan. Program juga menerapkan validasi pada setiap data agar informasi yang disimpan sesuai dengan ketentuan.

## Fitur Program

1. Membuat data member menggunakan konstruktor dengan empat parameter.
2. Membuat data member menggunakan konstruktor tiga parameter dengan paket Basic sebagai nilai default.
3. Memvalidasi nama, nomor telepon, tanggal pendaftaran, dan jenis paket.
4. Menolak data yang tidak valid tanpa mengubah nilai sebelumnya.
5. Menampilkan informasi member menggunakan method `toString()`.
6. Menampilkan seluruh data member menggunakan array dan perulangan.

## Konsep Object-Oriented Programming (OOP)

| Konsep | Penerapan |
|---|---|
| Class dan Object | Class `Member` digunakan sebagai cetak biru untuk membuat objek member. |
| Encapsulation | Atribut dibuat `private` dan diakses melalui getter serta setter. |
| Constructor | Digunakan untuk menginisialisasi objek member dengan data yang diberikan. |
| Method | Getter, setter, dan `toString()` digunakan untuk mengelola serta menampilkan data. |
| Validation | Setter memeriksa data sebelum menyimpannya agar data tidak valid dapat ditolak. |

## Struktur Project

```text
tugas1-fittrack/
├── src/
│   ├── Member.java
│   └── TesFitTrack.java
├── .gitignore
└── README.md
```

## Prasyarat

- Java Development Kit (JDK) 25
- IDE Visual Studio Code atau IntelliJ IDEA
- Terminal untuk menjalankan program melalui command line

## Cara Menjalankan Program

### 1. Menggunakan Visual Studio Code

1. Buka folder project `tugas1-fittrack` di Visual Studio Code.
2. Pastikan ekstensi Java sudah terpasang.
3. Buka file `TesFitTrack.java`.
4. Jalankan program melalui tombol **Run Java** pada method `main()`.

### 2. Menggunakan Command Line

Pastikan terminal berada di direktori utama project, kemudian jalankan perintah berikut:

```bash
javac -d out src/Member.java src/TesFitTrack.java
java -cp out TesFitTrack
```

Perintah pertama digunakan untuk mengompilasi file Java ke folder `out`, sedangkan perintah kedua digunakan untuk menjalankan program.

## Contoh Hasil Program

Program menampilkan proses pembuatan member, pengujian validasi data, dan daftar seluruh member.

### 1. Pengujian Validasi

Ketika program menerima data yang tidak sesuai ketentuan, program akan menampilkan pesan penolakan dan mempertahankan nilai sebelumnya.

Contoh pengujian:
- Nomor telepon tidak diawali angka 0 atau kurang dari 10 digit.
- Nama kosong atau hanya berisi spasi.
- Jenis paket tidak termasuk Basic, Premium, atau VIP.
- Tanggal pendaftaran kosong.

### 2. Daftar Seluruh Member

Program menampilkan seluruh objek member yang telah dibuat menggunakan perulangan.


## Nilai Default

Program menggunakan beberapa nilai default untuk memastikan objek tetap memiliki data ketika menerima input yang tidak valid.

| Atribut | Nilai Default |
|---|---|
| Nama | Tanpa Nama |
| Nomor Telepon | Belum diisi |
| Tanggal Daftar | Belum diisi |
| Jenis Paket | Basic |

Nilai default tersebut digunakan agar objek tetap dapat dibuat meskipun terdapat data yang ditolak saat proses validasi. Dengan demikian, atribut tetap memiliki nilai yang dapat digunakan oleh program.

## Batasan dan Pengembangan Selanjutnya

Program FitTrack masih menggunakan penyimpanan data sederhana melalui objek dan array sehingga data belum tersimpan secara permanen. Program juga belum dilengkapi dengan fitur untuk mengubah, menghapus, atau mencari data member. Untuk pengembangan selanjutnya, program dapat ditambahkan fitur pengelolaan data member yang lebih lengkap serta penyimpanan data menggunakan basis data.