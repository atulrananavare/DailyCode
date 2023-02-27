package LeetcodingPlan.Day2;

public class NumberOf1Bits {

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));

        int a = 12;
        int b = 25;

        System.out.println("Demonstrating & operator\n");
        int c = a & b;
        System.out.println(a + " & " + b + " = " + c);
    }
    // you need to treat n as an unsigned value
//    Input: n = 00000000000000000000000000001011
//    Output: 3
//    Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
    public static int hammingWeight(int n) {
        int ones = 0;
        while(n!=0) {
            ones = ones + (n & 1);
            n = n>>>1;
        }
        return ones;
    }

    public static int printBinaryNumbers(int n) {
        String str=String.valueOf(n);
        char[] arr=str.toCharArray();
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==1){
                count++;
            }
        }
        return count;
    }
}
