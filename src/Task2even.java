public class Task2even {

    public static void main(String[] args) {

        int randomNumberMuratuly = (int)(Math.random() * 100) + 1;

        System.out.println("Generated random number between 1 and 100: " + randomNumberMuratuly);

        if (randomNumberMuratuly % 2 == 0) {
            System.out.println("The number is EVEN.");
        } else {
            System.out.println("The number is ODD.");
        }
    }
}

