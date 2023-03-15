import java.util.Scanner;
import java.text.DecimalFormat;

public class Segitiga<T extends Number>{ //bounded type parameter / tipe parameter yg dibatasi
    private T alas;
    private T tinggi;

    //mothod void set dengan Tipe Parameter T
    public Segitiga (T alas, T tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    //Method Return Get Yang Mengembalikan Nilai
    public int getResultAsInt(){
        return (int) (0.5 * alas.intValue() * tinggi.intValue());
    }
    public double getResultDouble(){
        return 0.5 * alas.doubleValue() * tinggi.doubleValue();
    }

    public static void main(String[] args) {
        Driver();
    }

    public static void Driver() {
        Scanner type = new Scanner(System.in);
        DecimalFormat doub = new DecimalFormat("#.##");
        System.out.println("Mau menampilkan hasil luas dalam bentuk?");
        System.out.println("1. Hasil to Int\n2. Hasil to Double");
        System.out.println("Masukan Pilihan 1 / 2 : ");
        int pilih = type.nextInt();

        switch (pilih){
            case 1:
                System.out.println("INTEGER");
                System.out.print("Alas   : ");
                int alas1 = type.nextInt();
                System.out.print("Tinggi : ");
                int tinggi1 = type.nextInt();

                Segitiga<Integer> intSegitiga = new Segitiga<>(alas1, tinggi1);
                System.out.println("Hasil Integer : " + intSegitiga.getResultAsInt());
                break;

            case 2:
                System.out.println("DOUBLE");
                System.out.print("Alas   : ");
                double alas2 = type.nextDouble();
                System.out.print("Tinggi : ");
                double tinggi2 = type.nextDouble();

                Segitiga<Double> doubSegitiga = new Segitiga<>(alas2, tinggi2);
                System.out.println("Hasil Double : " + doub.format(doubSegitiga.getResultDouble()));
                break;
            default:
                System.out.println("Pilihan Invalid");
                Driver();
        }
        System.out.println("\nIngin Keluar?");
        System.out.println("1. Ya\n2. Tidak\n");
        System.out.println("Pilih : ");
        int exit = type.nextInt();

        switch (exit){
            case 1 : break;
            case 2 : Driver();
        }
    }
}
