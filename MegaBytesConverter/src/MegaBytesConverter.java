public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int calc1 = kiloBytes / 1024;
            int calc2 = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + calc1 + " MB and " + calc2 + " KB");
        }
    }
}
