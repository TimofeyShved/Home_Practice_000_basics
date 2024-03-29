package com.company;

public class Main {

    public static void main(String[] args) {

        // создаём и заполняем
        float[] arrFloat = new float[20];
        for (int i = 0; i < arrFloat.length; i++){
            arrFloat[i] = (float) Math.random();
        }

        // находим
        float max = arrFloat[0];
        float min = arrFloat[0];
        float sr = 0;

        for (int i = 0; i < arrFloat.length; i++){
            if (arrFloat[i] > max){ max = arrFloat[i];}
            if (arrFloat[i] < min){ min = arrFloat[i];}
            sr = sr + arrFloat[i];
        }
        sr = sr/arrFloat.length;

        // вывод
        System.out.println("Array");
        for (int i = 0; i < arrFloat.length; i++){
            System.out.print(arrFloat[i] + " / ");
        }
        System.out.println("\n Number:");
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Sr: "+sr);

    }
}
