package com.daily.july;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr ={2,4,5,8,9,14,17,18,19,21,23,25,78,89,100,129,230};

        BinarySearch search = new BinarySearch();
        System.out.println(search.binarySearch(arr,9));

    }

    public int binarySearch(int[] arr, int numberToFind){

        int low=0;
        int high=arr.length-1;

        while (low<=high){
            int midPosition =(low+high)/2;
            int middleNum = arr[midPosition];

            if(middleNum==numberToFind){
                return midPosition;
            }

            if(numberToFind< middleNum){
                high=midPosition-1;
            }
            else{
                low =midPosition+1;
            }

        }
        return -1; //if not found
    }


}
