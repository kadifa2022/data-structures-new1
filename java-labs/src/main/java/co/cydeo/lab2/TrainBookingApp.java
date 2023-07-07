package co.cydeo.lab2;



import java.util.Scanner;//* you csn use all classes belongs to java.util. package

public class TrainBookingApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);// if you want to use any property belongs to class we need to create object

        System.out.println("Do you have a bag? (Yes:true, No:false)");
        boolean hasBag = scanner.nextBoolean();//capturing value
        System.out.println("Direct transport only? (Yes:true, No:false)");
        boolean nonStop = scanner.nextBoolean();

        System.out.println("Choose your travel type(Train:1 , Bus:2 , Flight:3");
        int transportType = scanner.nextInt();

        System.out.println("From: ");
        String from = scanner.next();

        System.out.println("To:");
        String destination = scanner.next();

        String train1 = "TR001";
        String train2 = "TR002";
        String train3 = "TR003";
        String train4 = "TR004";
        String bus1 = "BS001";
        String bus2 = "BS002";
        String bus3 = "BS003";
        String flight1 = "FL001";
        String flight2 = "FL001";
        String flight3 = "FL001";

        if (!(from.equalsIgnoreCase("Berlin") && destination.equalsIgnoreCase("Amsterdam"))) {
            System.out.println("For now, we can only serve your Berlin-Amsterdam transportation. Please change destinations");
            return; // stop JVM execution will stop here
        }
        switch (transportType) {
            case 1:// train
                if (nonStop && hasBag) {
                    System.out.println("You can take " + train3);
                    return;
                } else if (!nonStop && hasBag) {
                    System.out.println("You can take " + train4);
                    return;
                } else if (nonStop) {//(nonStop && !hasBag)// condition is already true
                    System.out.println("You can take " + train1);
                    return;
                } else {
                    System.out.println("You can take " + train1 + train2 + train3 + train4);
                }
                break;
            case 2://buss
                System.out.println("You can take " + bus1 + bus2 + bus3);
                break;
            case 3://flight
                if (nonStop && hasBag) {
                    System.out.println("Could not find any flight  for you - please check other options and retry it");
                    return;
                } else if (!nonStop && hasBag) {
                    System.out.println(" You can take " + flight1);
                    return;
                } else if (nonStop && !hasBag) {
                    System.out.println("you can take " + flight2);
                    return;
                } else {
                    System.out.println("you can take" + flight1 + flight2 + flight3);
                }
                break;
            default:// no other transportations
                System.out.println("Invalid transportation");
        }

    }


}
