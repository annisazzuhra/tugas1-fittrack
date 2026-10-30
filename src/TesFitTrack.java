/**
 * Menguji class Member pada sistem keanggotaan gym FitTrack.
 * Pengujian mencakup pembuatan objek, validasi data, dan
 * penampilan seluruh data member.
 */
public class TesFitTrack {

    /**
     * Membuat objek member, menguji penolakan data tidak valid,
     * dan menampilkan daftar member.
     *
     * @param args argumen command line yang tidak digunakan
     */
    public static void main(String[] args) {

        System.out.println("=== Membuat Member ===");

        Member[] daftarMember = {
            new Member(
                    "Keisya Zahira",
                    "081234567890",
                    "17-08-2026",
                    Member.PAKET_PREMIUM
            ),
            new Member(
                    "Kimy Veronica",
                    "082198765432",
                    "18-08-2026",
                    Member.PAKET_VIP
            ),
            new Member(
                    "Rayyan khalif",
                    "085711112222",
                    "19-08-2026",
                    Member.PAKET_BASIC
            ),
            new Member(
                    "Shea Azalea",
                    "087833334444",
                    "20-08-2026"
            ),
            new Member(
                    "Raka Abyasa",
                    "81234",
                    "21-08-2026",
                    "Gold"
            )
        };

        System.out.println();
        System.out.println("=== Uji Setter dengan Data Tidak Valid ===");

        Member uji = daftarMember[0];

        System.out.println(
                "Nomor telepon sebelum: " + uji.getNoTelepon()
        );

        uji.setNoTelepon("12345");

        System.out.println(
                "Nomor telepon sesudah: " + uji.getNoTelepon()
        );
        
        System.out.println();
        System.out.println("=== Uji Nama Tidak Valid ===");

        uji.setNama("   ");

        System.out.println(
                "Nama setelah pengujian: " + uji.getNama()
        );

        System.out.println();
        System.out.println("=== Daftar Seluruh Member ===");

        for (int i = 0; i < daftarMember.length; i++) {
            System.out.println(
                    (i + 1) + ". " + daftarMember[i].toString()
            );
        }
    }
}