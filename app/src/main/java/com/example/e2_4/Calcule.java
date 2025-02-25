package com.example.e2_4;

public class Calcule {
    public static Double Adition(String txt){
        String[] nombresStr = txt.split("\\+");
        Double[] nombres=new Double[nombresStr.length];
        Double total = 0.0;
        for(int i=0;i<nombresStr.length;i++){
            nombres[i]=Double.parseDouble(nombresStr[i]);
            total+=nombres[i];
        }
        return total;
    }

    public static Double soustraction(String txt){
        String[] nombresStr = txt.split("―");
        Double[] nombres=new Double[nombresStr.length];
        for(int i=0;i<nombresStr.length;i++){
            nombres[i]=Double.parseDouble(nombresStr[i]);
        }
        Double total=nombres[0];
        for(int i=1;i<nombres.length;i++){
            total-=nombres[i];
        }
        return total;
    }

    public static Double multiplication(String txt){
        String[] nombresStr = txt.split("X");
        Double[] nombres=new Double[nombresStr.length];
        for(int i=0;i<nombresStr.length;i++){
            nombres[i]=Double.parseDouble(nombresStr[i]);
        }
        Double total=nombres[0];
        for(int i=1;i<nombres.length;i++){
            total*=nombres[i];
        }
        return total;
    }

    public static Double division(String txt){
        String[] nombresStr = txt.split("/");
        Double[] nombres=new Double[nombresStr.length];
        for(int i=0;i<nombresStr.length;i++){
            nombres[i]=Double.parseDouble(nombresStr[i]);
        }
        Double total=nombres[0];
        for(int i=1;i<nombres.length;i++){
            total/=nombres[i];
        }
        return total;
    }
}
