package it.develhope.enumerations;



public class Start {

    public static void main(String[] args) {


                enum Month {
                    JANUARY,
                    FEBRUARY,
                    MARCH,
                    APRIL,
                    MAY,
                    JUNE,
                    JULY,
                    AUGUST,
                    SEPTEMBER,
                    OCTOBER,
                    NOVEMBER,
                    DECEMBER;
                }

                for (Month month : Month.values()) {
                    String name= month.name();
                    if (name.endsWith("Y")){
                        System.out.println( name + " End with y");
                    }else {
                        System.out.println(name + " doesn't end with y");
                    }

                }
            }
        }

       
    

