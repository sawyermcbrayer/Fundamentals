public class AreaCalculator {
    private static final String INVALID_OPERATORS_MESSAGE = "Negative Numbers = Invalid!";
    public static double area(double radius){
        if (radius < 0){
            System.out.println(INVALID_OPERATORS_MESSAGE);
            return -1;
        }
        double outputz = (radius*radius)*Math.PI;
        System.out.println(outputz);
        return outputz;
    }
    public static double area(double x , double y){
        if (x < 0 || y < 0 ){
            System.out.println(INVALID_OPERATORS_MESSAGE);
            return -1;
        }
        double outputz2= x * y;
        System.out.println(outputz2);
        return  outputz2;
    }
}
