package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // write your code
//        int value = 1;
//
//        if (value == 1){
//            System.out.println("Value is one");
//        } else if (value ==2 ){
//            System.out.println("value is two");
//        } else{
//            System.out.println("value is not one or 2");
//        }
//          int switchValue = 1;
//          switch(switchValue){
//              case 1:
//                  System.out.println("Value was one");
//                  break;
//              case 2:
//                  System.out.println("Value was two");
//                  break;
//              case 3: case 4: case 5:
//                  System.out.println("Was a 3, 4 or 5");
//                  System.out.println("processing example here: " + switchValue);
//                  break;
//              default:
//                  System.out.println("Was neither one or two");
//                  break;
//          }
        //byte short char int
        char switchChar = 'D';

        switch (switchChar){
            case 'A':
                System.out.println("A found");
                break;
            case 'B':
                System.out.println("B found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("C , D or E found");
                break;
            default:
                System.out.println("Char not found...");
                break;
        }

        String month = "january";

        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case"june":
                System.out.println("Jun");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
