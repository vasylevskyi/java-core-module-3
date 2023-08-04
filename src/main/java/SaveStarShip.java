package main.java;

import java.util.*;

public class SaveStarShip {

    public int calculateDistance(int distance) {
            if (distance < 0) {
                return distance * -1;
            }
            return distance;
    }
    public String[] getPlanets(String galaxy) {
        if (galaxy.equals("Miaru")) {
            return new String[] {"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            return new String[] {"Earth", "Mars", "Jupiter"};
        } else if (galaxy.equals("DangerBanger")) {
            return new String[] {"Fobius", "Demius"};
        } else {
            return new String[0];
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        int fuelAmount;
        if (fuel.equals("STAR100")) {
            fuelAmount = count * 70;
        } else if (fuel.equals("STAR500")) {
            fuelAmount = count * 120;
        } else if (fuel.equals("STAR1000")) {
            fuelAmount = count * 200;
        } else {
             fuelAmount = count * 50;
        }
        return fuelAmount;
    }

    public int roundSpeed(int speed) {
        int firstDigit = speed / 10;
        int lastDigit = speed % 10;

        if (lastDigit >= 5) {
            firstDigit++;
        }
        return firstDigit * 10;
    }


    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < (long) 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateNeededFuel(int distance) {
        int neededFuel;
        if (distance <= 20) {
            neededFuel = 1000;
        } else {
            neededFuel = 1000 + (distance - 20) * 5;
        }
        return neededFuel;
    }

    public void calculateMaxPower() {
/*        Scanner scanner = new Scanner(System.in);
        int speed1 = scanner.nextInt();
        int speed2 = scanner.nextInt();
        int speed3 = scanner.nextInt();

        int max = speed1;
        if (speed2 > max) {
            max = speed2;
        }
        if (speed3 > max) {
            max = speed3;
        }

        float coeff = 0.7f;
        if (max < 10) {
            coeff = 0.7f;
        } else if (max > 10 && max < 100) {
            coeff = 1.2f;
        } else {
            coeff = 2.1f;
        }

        float maxPower = (float) max * coeff;
        System.out.println(maxPower);
        scanner.close();*/

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = calculateMax(a, b, c);
        if (max < 10) {
            System.out.println(max * 0.7f);
        } else if ((max >=10) && (max <= 100)) {
            System.out.println(max * 1.2f);
        } else {
            System.out.println(max * 2.1f);
        }
        scanner.close();
    }
    public int calculateMax(int a, int b, int c ) {
        if ((a > b) && (a > c) ) {
            return a;
        } else if ((b > a) && (b > c)) {
            return b;
        } else {
            return c;
        }
    }

    public String getMyPrizes(int ticket) {
        String result = "";
        if (ticket % 10 == 0) {
            result += "crystall";
        }

        if (ticket % 10 == 7) {
            result += " chip";
        }

        if (ticket > 200) {
            result += " coin";
        }
        return result.strip();
    }
    public boolean isHangarOk(int side1, int side2, int price) {
        int square = side1 * side2;
        int meterPrice = (int) (price / square);
        double sideIsMoreTimes = side1 > side2 ? ((double) side1 / (double) side2) : ((double) side2 / (double) side1);

        if ((sideIsMoreTimes <= 2) && (square >= 1500) && (meterPrice <= 1000)) {
            return true;
        } else {
            return false;
        }
    }


    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        //Should be Earth
        System.out.println(ship.choosePlanet(10));

        //Should be 700
        System.out.println(ship.calculateFuelPrice("STAR100", 10));

        //Should be 60
        System.out.println(ship.roundSpeed(55));

        //Should be 1005
        System.out.println(ship.calculateNeededFuel(1001));

        //Test stdin data - 1 3 5.
        //Console ouput should be 3.5
        ship.calculateMaxPower();

        //Should be "crystall coin"
        System.out.println(ship.getMyPrizes(250));

        //Should be true
        System.out.println(ship.isHangarOk(45, 90, 2397600));
    }
}
