package ict.kosovo.growth.basic.ora_5;
//operatori ternar perbhet prej tri pjeseve
// pjesa e shprehjes krahasuese ? vlera kur eshte e sakte : vlera kur eshte e pasakt
//shkurt ?:
public class ExampleWithTernaryOperator {
    public static void main(String[] args) {
        int numri = -10;
        System.out.println(
                numri > 0 ? "Numri eshte pozitiv" : "Numri eshte negative!"
        );

        int vleraAbsoluteENumrit = numri < 0 ? -numri : numri;

        System.out.println("Vlera absolute: " + vleraAbsoluteENumrit);
    }
}
