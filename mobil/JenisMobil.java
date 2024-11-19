package mobil;

public class JenisMobil extends MerekMobil {
    private String nama_jenis;
    private int tahun_rilis;
    private int kecepatan_kuda;
    private int tempat_duduk;
    private Double berat;

    public JenisMobil(String nama_merek, String nama_jenis, int tahun_rilis, int kecepatan_kuda, int tempat_duduk, Double berat) {
        super(nama_merek);
        this.tahun_rilis = tahun_rilis;
        this.kecepatan_kuda = kecepatan_kuda;
        this.tempat_duduk = tempat_duduk;
        this.nama_jenis = nama_jenis;
    }

    public String getNamaJenis() {
        return nama_jenis;
    }

    public void showSpecifications() {
        System.out.println("Car Specifications:");
        System.out.println("Merek Mobil: " + getNamaMerek());
        System.out.println("Jenis Mobil: " + nama_jenis);
        System.out.println("Tahun Rilis: " + tahun_rilis);
        System.out.println("Kecepatan Kuda: " + kecepatan_kuda + " HP");
        System.out.println("Tempat Duduk: " + tempat_duduk + " seats");
        System.out.println("Berat: " + berat + " tons");
    }
}

