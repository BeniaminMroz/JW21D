package DAY4;

public class HalfLooper {
    public static void main(String[] arguments) {
        int[] denver = {1_700_000, 4_600_000, 2_100_000};
        int[] philadelphia = {1_800_00, 5_000_000, 2_500_000};
        int[] total = new int[denver.length];
        int sum = 0;

        for (int i = 0; i < denver.length; i++) {
            total[i] = denver[1] + philadelphia[1];
            System.out.format("Produkcja w " + (i + 2012) + ": %,d%n", total[i]);
            sum += total[i];
        }

        System.out.format("Średnia produkcja: %,d%n", (sum / denver.length));
    }
}
