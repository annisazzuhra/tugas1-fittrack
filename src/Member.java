/**
 * Merepresentasikan satu member yang terdaftar di FitTrack.
 * Class ini menyimpan data pribadi member dan memastikan setiap
 * perubahan data lolos validasi sebelum disimpan.
 */
public class Member {

    private static final String AWALAN_TELEPON = "0";
    private static final int MIN_PANJANG_TELEPON = 10;

    public static final String PAKET_BASIC = "Basic";
    public static final String PAKET_PREMIUM = "Premium";
    public static final String PAKET_VIP = "VIP";

    private String nama = "Tanpa Nama";
    private String noTelepon = "Belum diisi";
    private String tanggalDaftar = "Belum diisi";
    private String jenisPaket = PAKET_BASIC;

    /**
     * Membuat objek member dengan empat data lengkap.
     * Setiap data diisi melalui setter agar melewati validasi.
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     * @param jenisPaket jenis paket keanggotaan member
     */
    public Member(String nama, String noTelepon,
                  String tanggalDaftar, String jenisPaket) {
        setNama(nama);
        setNoTelepon(noTelepon);
        setTanggalDaftar(tanggalDaftar);
        setJenisPaket(jenisPaket);
    }

    /**
     * Membuat objek member dengan paket Basic secara otomatis.
     *
     * @param nama nama lengkap member
     * @param noTelepon nomor telepon member
     * @param tanggalDaftar tanggal pendaftaran member
     */
    public Member(String nama, String noTelepon,
                  String tanggalDaftar) {
        this(nama, noTelepon, tanggalDaftar, PAKET_BASIC);
    }
    
    /**
     * Mengambil nama member yang tersimpan.
     *
     * @return nama member
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengubah nama member setelah melalui validasi.
     * Jika nama kosong atau hanya berisi spasi, nama lama
     * dipertahankan dan pesan penolakan dicetak.
     *
     * @param nama nama baru member yang tidak boleh kosong
     *             atau hanya berisi spasi
     */
    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            cetakPenolakan(
                    "Nama",
                    "Nama tidak boleh kosong atau hanya berisi spasi",
                    this.nama
            );
            return;
        }

        this.nama = nama.trim();
    }

    /**
     * Mengambil nomor telepon member yang tersimpan.
     *
     * @return nomor telepon member
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * Mengubah nomor telepon member setelah melalui validasi format.
     * Jika format tidak valid, nomor lama dipertahankan dan pesan
     * penolakan dicetak.
     *
     * @param noTelepon nomor telepon baru, wajib diawali angka 0
     *        dan memiliki panjang minimal 10 digit
     */
    public void setNoTelepon(String noTelepon) {
        if (noTelepon == null
                || !noTelepon.startsWith(AWALAN_TELEPON)
                || noTelepon.length() < MIN_PANJANG_TELEPON
                || !noTelepon.matches("[0-9]+")) {

            cetakPenolakan(
                    "Nomor telepon",
                    "Nomor telepon harus diawali angka 0 "
                            + "dan minimal 10 digit angka",
                    this.noTelepon
            );
            return;
        }

        this.noTelepon = noTelepon;
    }

    /**
     * Mengambil tanggal pendaftaran member yang tersimpan.
     *
     * @return tanggal pendaftaran member
     */
    public String getTanggalDaftar() {
        return tanggalDaftar;
    }

    /**
     * Mengubah tanggal pendaftaran setelah melalui validasi.
     * Jika tanggal kosong, tanggal lama dipertahankan dan pesan
     * penolakan dicetak.
     *
     * @param tanggalDaftar tanggal pendaftaran baru yang tidak
     *        boleh kosong atau hanya berisi spasi
     */
    public void setTanggalDaftar(String tanggalDaftar) {
        if (tanggalDaftar == null
                || tanggalDaftar.trim().isEmpty()) {

            cetakPenolakan(
                    "Tanggal daftar",
                    "Tanggal daftar tidak boleh kosong",
                    this.tanggalDaftar
            );
            return;
        }

        this.tanggalDaftar = tanggalDaftar.trim();
    }

    /**
     * Mengambil jenis paket keanggotaan member.
     *
     * @return jenis paket member
     */
    public String getJenisPaket() {
        return jenisPaket;
    }

    /**
     * Mengubah jenis paket setelah memeriksa pilihan yang tersedia.
     * Jika paket tidak sesuai, paket lama dipertahankan dan pesan
     * penolakan dicetak.
     *
     * @param jenisPaket jenis paket Basic, Premium, atau VIP
     */
    public void setJenisPaket(String jenisPaket) {
        if (PAKET_BASIC.equals(jenisPaket)
                || PAKET_PREMIUM.equals(jenisPaket)
                || PAKET_VIP.equals(jenisPaket)) {

            this.jenisPaket = jenisPaket;
            return;
        }

        cetakPenolakan(
                "Jenis paket",
                "Jenis paket hanya boleh Basic, Premium, atau VIP",
                this.jenisPaket
        );
    }

    /**
     * Mengubah data member menjadi teks dengan label setiap atribut.
     *
     * @return teks berisi nama, nomor telepon, tanggal daftar,
     *         dan jenis paket member
     */
    @Override
    public String toString() {
        return "Member{nama='" + nama
                + "', noTelepon='" + noTelepon
                + "', tanggalDaftar='" + tanggalDaftar
                + "', jenisPaket='" + jenisPaket + "'}";
    }

    /**
     * Mencetak alasan penolakan data dan nilai lama yang dipertahankan.
     *
     * @param atribut nama atribut yang datanya ditolak
     * @param alasan alasan data tidak dapat disimpan
     * @param nilaiDipertahankan nilai lama yang tetap digunakan
     */
    private void cetakPenolakan(
            String atribut,
            String alasan,
            String nilaiDipertahankan) {

        System.out.println(
                "[DITOLAK] " + atribut + ": " + alasan
                        + ". Nilai dipertahankan: "
                        + nilaiDipertahankan
        );
    }
}