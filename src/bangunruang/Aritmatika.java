package bangunruang;
public class Aritmatika { //deklarasi kelas
    double volumekubus(double a) {
    return a*a*a; //rumus volume kubus
    }
    double luaskubus(double a) {
    return 6*a*a; //rumus luas permukaan kubus
    }
    double volumebalok(double a, double b, double c) {
    return a*b*c; //rumus volume balok
    }
    double luasbalok(double a, double b, double c) {
    return 2*a+2*b+2*c; //rumus luas permukaan balok
    }
    double volumetabung(double a, double b) {
    return (22/7)*a*a*b; //rumus volume tabung
    }
    double luastabung(double a, double b) {
    return 2*(22/7)*a*b; //rumus luas permukaan tabung
    }
}
