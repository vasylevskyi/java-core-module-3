package main.java;

public class CaptainDisputeAgain {
    public int findMin(int[] triple) {
        int min = triple[1] < triple[0] ? triple[1] : triple[0];
        min = triple[2] < min ? triple[2] : min;
        return min;
    }

    public static void main(String[] args) {
        CaptainDisputeAgain captainDispute = new CaptainDisputeAgain();

        System.out.println(captainDispute.findMin(new int[] {1, 10, 3}));

        System.out.println(captainDispute.findMin(new int[] {50, 4, 100}));
    }
}