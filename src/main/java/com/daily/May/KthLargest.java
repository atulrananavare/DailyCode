package com.daily.May;

import java.util.PriorityQueue;

public class KthLargest {

    public int kVal;
    private PriorityQueue<Integer> heap = new PriorityQueue<>();

    public static void main(String[] args) {
        //KthLargest kthLargest=new KthLargest();

    }
    public KthLargest(int k, int[] nums) {
        kVal=k;
        for (var n : nums) add(n);
    }

    public int add(int val) {
        heap.offer(val);
        if (heap.size() > kVal)
            heap.poll();
        return heap.peek();
    }
}