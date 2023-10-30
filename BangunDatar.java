import java.util.*;

class datar {
    protected double keliling;
    protected double luas;

    public datar(double k, double l) {
        super();
        keliling = k;
        luas = l;
    }

    protected void awal() {
        System.out.println("Menghitung Keliling dan Luas Bangun Datar");
    }
}

class blingkaran extends datar {
    double jari;
    double phi = 3.14;

    public blingkaran(double k, double l) {
        super(k, l);
    }

    public void setjari() {
        Scanner input = new Scanner(System.in);

        System.out.println("Menghitung Lingkaran");
        System.out.println("Masukan Jari");
        jari = input.nextDouble();
    }

    private double luasLingkaran() {

        luas = phi * jari * jari;
        return luas;
    }

    private double KelLingkaran() {

        keliling = 2 * phi * jari;
        return luas;
    }

    public void TampilLingkaran() {
        System.out.println("Luas Lingkaran" + luasLingkaran());
        System.out.println("Keliling Lingkaran" + KelLingkaran());
    }

}

public class BangunDatar {
    public static void main(String[]args){
        //1,1 sbg constractor
        blingkaran l = new blingkaran(1,1);
        1.awal();
        1.setjari();
        1.TampilLingkaran();
    }
}