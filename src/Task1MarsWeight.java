public class Task1MarsWeight {

    static float earthWeightMuratuly = 84.0f;
    static float marsGravityFactorMuratuly = 0.38f;
    static float marsWeightFloatMuratuly;
    static double marsWeightDoubleMuratuly;
    static int marsWeightIntMuratuly;
    static char marsWeightCharMuratuly;
    static int charMathResultMuratuly;

    public static void main(String[] args) {

        System.out.println("Step 1: Earth weight stored as float: " + earthWeightMuratuly);
        marsWeightFloatMuratuly = earthWeightMuratuly * marsGravityFactorMuratuly;
        System.out.println("Step 2: Calculated Mars weight using float: " + marsWeightFloatMuratuly);
        marsWeightDoubleMuratuly = marsWeightFloatMuratuly;
        System.out.printf("Step 3: Result assigned to double with 4 decimal places: %.4f\n", marsWeightDoubleMuratuly);
        marsWeightIntMuratuly = (int) marsWeightDoubleMuratuly;
        System.out.println("Step 4: Cast double to int: " + marsWeightIntMuratuly);
        marsWeightCharMuratuly = (char) marsWeightIntMuratuly;
        System.out.println("Step 5: Cast int to char (ASCII character): " + marsWeightCharMuratuly);
        charMathResultMuratuly = marsWeightCharMuratuly + 5;
        System.out.println("Step 6: Performed math operation on char and stored result in int: " + charMathResultMuratuly);
    }
}