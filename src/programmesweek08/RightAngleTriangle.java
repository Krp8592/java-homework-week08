package programmeweek08;

/**
 * Display right angle triangle of @ using nested for loops.
 */

public class RightAngleTriangle {
    public static void main(String[] args) {
        int x;
        int y;
        int z = 7;

        for (x = 1; x < z; x++) {
            for (y = 1; y < +x; y++) {
                System.out.print("@");
            }
            System.out.println(" ");
        }

    }
}
