public class Robots {

    private String type;
    private String acc;
    //constructor
    public Robots(String type , String acc){
        this.setType(type);
        this.setAcc(acc);
    }

    //setters and getters
    public void setType(String type){
        type = type.toUpperCase();
        if(type.equals("DRILLING") || type.equals("CUTTING")){
            this.type = type;
        } else {
            this.type = "Invalid";
        }
    }

    public void setAcc(String acc){
        acc = acc.toUpperCase();
        if(acc.equals("BIT") || acc.equals("BLADE")){
            this.acc = acc;
        } else {
            this.acc = "Invalid";
        }
    }

    public String getType(){
        return this.type;
    }
    public String getAcc(){
        return this.acc;
    }

    //---------------------------------------------------

    public static void typeInventory(){
        System.out.println("Drilling, Cutting");
    }
    public static void accInventory(){
        System.out.println("Bit, Blade");
    }
}
