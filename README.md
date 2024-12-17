ReservasiMejaTubes

# Reservasi Meja Tubes

## Deskripsi Proyek
Reservasi Meja Tubes adalah aplikasi berbasis Java Swing yang digunakan untuk mengelola pemesanan meja di restoran atau kafe. Proyek ini dibuat sebagai bagian dari tugas besar (TUBES) untuk memenuhi kebutuhan sistem reservasi yang mudah digunakan, terstruktur, dan efisien.

Aplikasi ini memiliki beberapa fitur utama, antara lain:
- Login Panel: Admin dapat login untuk mengelola reservasi.
- Menu Panel: Tampilan menu dan pilihan meja.
- Pelanggan Panel: Mengelola data pelanggan.
- Reservasi Panel: Membuat dan melihat status reservasi meja.
- Admin Panel: Panel khusus untuk admin dalam mengatur sistem.

## Fitur Utama
1. Manajemen Data Admin: Admin dapat login dan mengatur sistem.
2. Manajemen Data Pelanggan**: Menyimpan informasi pelanggan (nama, email, nomor telepon).
3. Reservasi Meja: Membuat, mengubah, dan membatalkan reservasi meja.
4. Riwayat Login: Mencatat riwayat login admin untuk keamanan sistem.
5. Ketersediaan Meja: Menampilkan informasi kapasitas dan status ketersediaan meja.

## Struktur Proyek
Berikut adalah struktur file dan class utama dalam proyek ini:
ReservasiMejaTubes/ │ ├── src/ │ └── reservasimejatubes/ │ ├── AdminPanel.java # Panel Admin │ ├── DatabaseConnection.java # Koneksi ke Database MySQL │ ├── LoginPanel.java # Panel Login │ ├── MenuPanel.java # Panel Menu Utama │ ├── PelangganPanel.java # Panel untuk pelanggan │ ├── ReservasiMejaTubes.java # Class Utama (Main) │ ├── ReservasiPanel.java # Panel Reservasi │ └── README.md # Dokumentasi proyek
## Prasyarat
Sebelum menjalankan aplikasi ini, pastikan Anda telah menginstal:
- JDK (Java Development Kit): Versi 8 atau lebih baru
- NetBeans atau IDE lain yang mendukung proyek Java
- MySQL Server: Untuk manajemen database
- Connector/J: Driver JDBC untuk koneksi MySQL dengan Java

## Instalasi

### 1. Clone Repository
bash
git clone [https://github.com/username/ReservasiMejaTubes.git](https://github.com/Dimasputra2530/ReservasiMejaTubes.git)
cd ReservasiMejaTubes

*Konfigurasi Database*
- Buka file DatabaseConnection.java.
- Ubah URL, username, dan password sesuai konfigurasi MySQL Anda:
  Salin kode
  String url = "jdbc:mysql://localhost:3306/reservasi_meja_db";
  String user = "root";
  String password = "password";
