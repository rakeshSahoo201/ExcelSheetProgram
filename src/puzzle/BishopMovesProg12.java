package puzzle;

public class BishopMovesProg12 {
    public static String canReach(int x1, int y1, int x2, int y2) {
        // If target is not the same color
        if ((x1 + y1) % 2 != (x2 + y2) % 2) {
            return "NO";
        }

        // Same diagonal
        if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            return "YES 1";
        }

        // Same color but not same diagonal
        return "YES 2";
    }

    public static void main(String[] args) {
        System.out.println(canReach(1, 1, 3, 3));  // YES 1
        System.out.println(canReach(1, 1, 4, 2));  // NO
        System.out.println(canReach(1, 1, 6, 4));  // YES 2
    }
}


