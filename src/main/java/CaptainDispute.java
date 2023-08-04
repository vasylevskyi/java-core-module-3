package main.java;

public class CaptainDispute {
    public String evenOrOdd(int number) {
        String result = (number % 2 == 0 ) ? "even" : "odd";
        return result;
    }
    public int findMin(int[] triple) {
        int min = triple[1] < triple[0] ? triple[1] : triple[0];
        min = triple[2] < min ? triple[2] : min;
        return min;
    }

    public static void main(String[] args) {
        CaptainDispute captainDispute = new CaptainDispute();

        //Should be even
        System.out.println(captainDispute.evenOrOdd(10));

        //Should be odd
        System.out.println(captainDispute.evenOrOdd(5));

        System.out.println(captainDispute.findMin(new int[] {1, 10, 3}));

        System.out.println(captainDispute.findMin(new int[] {50, 4, 100}));
    }
}
