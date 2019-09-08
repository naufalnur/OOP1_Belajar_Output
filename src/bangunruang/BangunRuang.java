package bangunruang;
import java.util.Scanner;
public class BangunRuang {
    public static void main(String[] args) { //method main
        do {
        Scanner sc = new Scanner(System.in); //deklarasi variabel untuk meng-input
        Aritmatika aritmatika = new Aritmatika(); //deklarasi objek
        System.out.println("--------MENU--------"); //pilihan menu utama
        System.out.println("Pilih Bangun Ruang");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("4. Keluar");
        System.out.print("Pilih : ");
        int pilih = sc.nextInt(); //meng-input pilihan yang ada pada menu
        System.out.println();
        
        switch (pilih) {
            case 1:
                {
                    System.out.println("Menghitung Volume dan Luas Permukaan Kubus");
                    System.out.print("Masukan sisi : ");
                    double input = sc.nextInt();
                    System.out.println();
                    //pemanggilan nama kelas.method
                    System.out.println(aritmatika.volumekubus(input) + "cm3 volumenya ");
                    System.out.println(aritmatika.luaskubus(input) + "cm2 luas permukaannya");
                    System.out.println();
                    break;
                }
            case 2:
                {
                    double p, l ,t;
                    System.out.println("Menghitung Volume dan Luas Permukaan Balok");
                    System.out.print("Masukan panjang : ");
                    p = sc.nextInt();
                    System.out.print("Masukan lebar : ");
                    l = sc.nextInt();
                    System.out.print("Masukan tinggi : ");
                    t = sc.nextInt();
                    System.out.println();
                    //pemanggilan nama kelas.method
                    System.out.println(aritmatika.volumebalok(p,l,t) + "cm3 volumenya");
                    System.out.println(aritmatika.luasbalok(p,l,t) + "cm2 luas permukaannya");
                    System.out.println();
                    break;
                }
            case 3:
                {
                    double s, t;
                    System.out.println("Menghitung Volume dan Luas Permukaan Tabung");
                    System.out.print("Masukan panjang rusuk : ");
                    s = sc.nextInt();
                    System.out.print("Masukan tinggi tabung : ");
                    t = sc.nextInt();
                    System.out.println();
                    //pemanggilan nama kelas.method
                    System.out.println(aritmatika.volumetabung(s,t) + "cm3 volumenya");
                    System.out.println(aritmatika.luastabung(s,t) + "cm2 luas permukaannya");
                    System.out.println();
                    break;
                }
            case 4:
                {
                System.exit(0);
                }
            default:
                    System.out.println("Pilihan salah, masukan pilihan yang benar(1-4)!");
                    System.out.println();
                break;
            }
        }
        while(true);
    }
}
