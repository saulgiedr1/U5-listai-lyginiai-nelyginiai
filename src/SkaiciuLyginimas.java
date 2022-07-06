import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SkaiciuLyginimas {

    public static void main(String[] args) {

        int skaicius=16;
        boolean skaiciusLyginimui=arLyginis(skaicius);

        System.out.println("Skaicius yra lyginis = " + skaiciusLyginimui);

        ArrayList<Integer> skaitmuo= new ArrayList<>();
        
        skaitmuo.add(8);
        skaitmuo.add(10);
        skaitmuo.add(21);
        skaitmuo.add(16);
        skaitmuo.add(55);
        skaitmuo.add(30);

        System.out.println("skaitmuo = " + skaitmuo);
        System.out.println("Lyginių yra :" + lyginiuSkaitmenuYra(skaitmuo));
        System.out.println("Nelyginių yra :" + nelyginiuSkaitmenuYra(skaitmuo));
        System.out.println("Lyginiu Skaitmenu Suma yra :" + lyginiuSkaitmenuSuma(skaitmuo));
        System.out.println("Nelyginiu Skaitmenu Suma yra :" + nelyginiuSkaitmenuSuma(skaitmuo));


    }

    public static boolean arLyginis (int x){
        if(x % 2 == 0){
            return true;
        }
        else{
            return false;
        }

    }
    public static int lyginiuSkaitmenuYra(ArrayList<Integer> skaitmuo){
        int lyginiai=0;
        for (int i=0;  i < skaitmuo.size(); i++){
            if(skaitmuo.get(i) % 2 == 0) {
                lyginiai ++;
            }
        }
        return lyginiai;
    }
    public static int nelyginiuSkaitmenuYra(ArrayList<Integer> skaitmuo){
        int nelyginiai=0;
        for (int i=0;  i < skaitmuo.size(); i++)
            if (skaitmuo.get(i) % 2 != 0) {
                nelyginiai ++;
            }
        return nelyginiai;
    }

    public static int lyginiuSkaitmenuSuma(ArrayList<Integer> skaitmuo){
        int lyginiaisuma=0;
        for (int i=0;  i < skaitmuo.size(); i++){
            if(skaitmuo.get(i) % 2 == 0) {
                lyginiaisuma += skaitmuo.get(i) ;
            }
        }
        return lyginiaisuma;
    }
    public static int nelyginiuSkaitmenuSuma(ArrayList<Integer> skaitmuo){
        int nelyginiaisuma=0;
        for (int i=0;  i < skaitmuo.size(); i++){
            if(skaitmuo.get(i) % 2 != 0) {
                nelyginiaisuma += skaitmuo.get(i);
            }
        }
        return nelyginiaisuma;
    }



}

