package LeetcodingPlan.Day4;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        HappyNumber hp=new HappyNumber();
        System.out.println(hp.isHappy(19));
    }

    /**
     * Write an algorithm to determine if a number n is happy.
     * <p>
     * A happy number is a number defined by the following process:
     * <p>
     * Starting with any positive integer, replace the number by the sum of the squares of its digits.
     * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
     * Those numbers for which this process ends in 1 are happy.
     * Return true if n is a happy number, and false if not.
     *
     * @param n
     * @return
     */
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=getNext(n);
        }
        return n==1;
    }
    public int getNext(int n){
        int sum=0;
        while(n>0){
            int d = n%10;
            sum+=d*d;
            n=n/10;
        }
        return sum;
    }
}
