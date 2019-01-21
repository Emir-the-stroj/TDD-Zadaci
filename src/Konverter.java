public class Konverter {


    public double kilogrameUFunte(double broj, double funta ){
        return broj * funta;
    }

    public double funteUKIlograme(double broj, double funta) {
        return broj / funta;
    }


   public double centiUInche(double broj, double inch) {
        return broj / inch;
    }

    public double inchiUCente(double broj, double inch) {
        return broj * inch;
    }

    public double celzijusiUFahrenheite(double broj, double vrijednost1, double vrijednost2) {
    return broj * vrijednost1 + vrijednost2;
    }

    public double fahrenheitUCelzijus(double broj, double vrijednost1, double vrijednost2) {
    return (broj - vrijednost1)/vrijednost2;
    }
}
