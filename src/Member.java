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

}