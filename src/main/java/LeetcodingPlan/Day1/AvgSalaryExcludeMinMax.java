package LeetcodingPlan.Day1;

import java.util.Arrays;

public class AvgSalaryExcludeMinMax {

    public static void main(String[] args) {
        int[] arr = {4000, 3000, 1000, 2000};
        System.out.println(average(arr));
    }

//    Input: salary = [4000,3000,1000,2000]
//    Output: 2500.00000
//    Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
//    Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500

    public static double average(int[] salary) {
        Arrays.sort(salary);
        double avg = 0.0;

        if(salary.length<2){
            return 0.0;
        }
        for (int i = 1; i < salary.length - 1; i++) {
            avg += salary[i];
        }
        return avg / (salary.length - 2);
    }
}
