package LeetcodingPlan.Day5;

public class CheckIfTheLineStraightLine {

    public static void main(String[] args) {

        int[][] points = {{1, 2}, {2, 3}, {3, 4}, {5, 6}, {6, 7}};
        System.out.println(checkStraightLine(points));
    }
    /*
    slope = (y2 - y1) / (x2 - x1)
     */
    public static boolean checkStraightLine(int[][] coordinates) {
        int dy = coordinates[1][1] - coordinates[0][1];
        int dx = coordinates[1][0] - coordinates[0][0];

        for (int i = 2; i < coordinates.length; i++) {
            int curr_dy = coordinates[i][1] - coordinates[i - 1][1];
            int curr_dx = coordinates[i][0] - coordinates[i - 1][0];
            if (dy * curr_dx != dx * curr_dy)
                return false;
        }
        return true;
    }
}
