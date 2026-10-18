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

}