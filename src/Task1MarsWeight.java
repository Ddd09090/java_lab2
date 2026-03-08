public class Task1MarsWeight {

    static float earthWeightMuratuly = 84.0f;
    static float marsGravityFactorMuratuly = 0.38f;
    static float marsWeightFloatMuratuly;
    static double marsWeightDoubleMuratuly;
    static int marsWeightIntMuratuly;
    static char marsWeightCharMuratuly;
    static int charMathResultMuratuly;

    public static void main(String[] args) {

        System.out.println("Earth weiht stored as float: " + earthWeightMuratuly);
        marsWeightFloatMuratuly = earthWeightMuratuly * marsGravityFactorMuratuly;
        System.out.println("Calculated Mars weight using float: " + marsWeightFloatMuratuly);
        marsWeightDoubleMuratuly = marsWeightFloatMuratuly;
        System.out.printf("Result assigned to double with 4 decimal places: %.4f\n", marsWeightDoubleMuratuly);
        marsWeightIntMuratuly = (int) marsWeightDoubleMuratuly;
        System.out.println("Cast double to int: " + marsWeightIntMuratuly);
        marsWeightCharMuratuly = (char) marsWeightIntMuratuly;
        System.out.println("Cast int to char: " + marsWeightCharMuratuly);
        charMathResultMuratuly = marsWeightCharMuratuly + 5;
        System.out.println("Performed math operation on char and stored result in int: " + charMathResultMuratuly);
    }
}