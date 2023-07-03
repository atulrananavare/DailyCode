package LeetcodingPlan.Day3;

public class FindNearestPoint {

    public static void main(String[] args) {

        int[][] points={{1,2},{3,1},{2,4},{2,3},{4,4}};
        System.out.println(nearestValidPoint(3,4,points));
    }

    public static int nearestValidPoint(int x, int y, int[][] points) {
        int min = 10000;
        int index = -1;
        for(int i =0 ; i<points.length; i++){
            int dx = x - points[i][0];
            int dy = y - points[i][1];
            if(dx*dy==0 && Math.abs(dx+dy)<min){
                min = Math.abs(dx+dy);
                index =i;
            }
        }
        return index;
    }
}
