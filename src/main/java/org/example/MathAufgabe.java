package org.example;

public class MathAufgabe {


    public double add(double x, double y){
        return x+y;
    }

    public double sub(double x, double y){
        return x-y;
    }

    public double mul(double x, int y){
        double result=0;

        for(int i=0;i<y;i++)
            result +=x;

        return result;
    }

    public boolean isPerfect(int nr){

        int[] factors = new int[]{};

        for(int i=1; i<nr; i++){
            if(nr%i==0){
                factors= add(factors,i);
            }
        }
        int sum =0;
        for(int i=0;i<factors.length; i++){
            sum += factors[i];
        }

        return nr == sum;
    }
    public int[] add(int[] arr, int val){
        int[] result = new int[arr.length + 1];

        for (int i=0; i<arr.length; i++){
            result[i] = arr[i];
        }
        result[result.length - 1] = val;
        return result;

    }

}
