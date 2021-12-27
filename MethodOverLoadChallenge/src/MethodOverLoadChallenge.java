public class MethodOverLoadChallenge {
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet < 0 || inches < 0 || inches > 12){
            System.out.println("Invalid Feet or Inches");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += (inches * 2.54);
        System.out.println(feet + " feet, " + inches + " inches equals: " + centimeters);
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            System.out.println("Invalid Feet or Inches");
            return -1;
        }
        double feetFromInches = inches / 12;
        double inchesRemainder = inches % 12;
        System.out.println(inches + " inches equals " + feetFromInches + " feet, and " + inchesRemainder + " inches!");
        return calcFeetAndInchesToCentimeters(feetFromInches , inchesRemainder);

    }
}
