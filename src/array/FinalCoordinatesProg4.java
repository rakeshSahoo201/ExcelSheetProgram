package array;

public class FinalCoordinatesProg4 {


        public static int[] getFinalCoordinates(int x, int y, String directions) {
            String[] tokens = directions.split("\\s+");

            for (String token : tokens) {
                int repeat = 1;
                String dir = token;

                // Handle cases like "2*RIGHT"
                if (token.contains("*")) {
                    String[] parts = token.split("\\*");
                    repeat = Integer.parseInt(parts[0]);
                    dir = parts[1];
                }

                // Apply movement based on direction
                for (int i = 0; i < repeat; i++) {
                    switch (dir.toUpperCase()) {
                        case "U":
                        case "UP":
                            y += 1;
                            break;
                        case "D":
                        case "DOWN":
                            y -= 1;
                            break;
                        case "R":
                        case "RIGHT":
                            x += 1;
                            break;
                        case "L":
                        case "LEFT":
                            x -= 1;
                            break;
                    }
                }
            }

            return new int[]{x, y};
        }

        public static void main(String[] args) {
            // Test cases
            int[] result1 = getFinalCoordinates(0, 0, "UUU");
            System.out.println("Final Coordinates: (" + result1[0] + "," + result1[1] + ")");  // (0,3)

            int[] result2 = getFinalCoordinates(0, 0, "URRDDL");
            System.out.println("Final Coordinates: (" + result2[0] + "," + result2[1] + ")");  // (1,-1)

            int[] result3 = getFinalCoordinates(0, 0, "DOWN UP 2*RIGHT DOWN 3*LEFT");
            System.out.println("Final Coordinates: (" + result3[0] + "," + result3[1] + ")");  // (-1,-1)
        }
    }


