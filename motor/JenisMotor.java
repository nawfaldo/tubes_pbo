package motor;

public class JenisMotor extends MerekMotor {
    private String nama_jenis;
    private int tahun_rilis;
    private int kecepatan_kuda;
    private Double berat;

    public JenisMotor(String nama_merek, String nama_jenis, int tahun_rilis, int kecepatan_kuda, Double berat) {
        super(nama_merek);
        this.tahun_rilis = tahun_rilis;
        this.kecepatan_kuda = kecepatan_kuda;
        this.nama_jenis = nama_jenis;
    }

    public String getNamaJenis() {
        return nama_jenis;
    }

    public void showSpecifications() {
        System.out.println("Motorcycle Specifications:");
        System.out.println("Merek Motor: " + getNamaMerek());
        System.out.println("Jenis Motor: " + nama_jenis);
        System.out.println("Tahun Rilis: " + tahun_rilis);
        System.out.println("Kecepatan Kuda: " + kecepatan_kuda + " HP");
        System.out.println("Berat: " + berat + " tons");
    }
}