package puzzle;
import java.util.*;
public class StudentAverage15 {

        public static void main(String[] args) {
            String[][] input = {
                    {"Charles", "84"},
                    {"John", "100"},
                    {"Andy", "37"},
                    {"John", "23"},
                    {"Charles", "20"}
            };

            // Map to hold student -> list of marks
            Map<String, List<Integer>> studentMarks = new HashMap<>();

            for (String[] entry : input) {
                String name = entry[0];
                int mark = Integer.parseInt(entry[1]);
                studentMarks.computeIfAbsent(name, k -> new ArrayList<>()).add(mark);
            }

            double highestAvg = Double.NEGATIVE_INFINITY;
            String topStudent = "";

            for (Map.Entry<String, List<Integer>> entry : studentMarks.entrySet()) {
                List<Integer> marks = entry.getValue();
                double avg = marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
                if (avg > highestAvg) {
                    highestAvg = avg;
                    topStudent = entry.getKey();
                }
            }

            System.out.println("Highest average: " + highestAvg);
            System.out.println("Top student: " + topStudent);
        }
    }



