public class Task3blocks {

    public static void main(String[] args) {

        int amountOfBricksMuratuly = 80; // odd number between 50 and 100
        int containerCapacityMuratuly = 7; // even number between 5 and 10
        System.out.println("Number of brics " + amountOfBricksMuratuly);
        System.out.println("Container capacity " + containerCapacityMuratuly);
        int fullContainersMuratuly = amountOfBricksMuratuly / containerCapacityMuratuly;
        System.out.println("Number of full containrs " + fullContainersMuratuly);
        int remainingBricksMuratuly = amountOfBricksMuratuly % containerCapacityMuratuly;
        System.out.println("Bricks in the not completely full container " + remainingBricksMuratuly);
        int totalContainersMuratuly = fullContainersMuratuly;
        if (remainingBricksMuratuly > 0) {
            totalContainersMuratuly++;
        }
        System.out.println("Total containers needed full + not ful: " + totalContainersMuratuly);
    }
}