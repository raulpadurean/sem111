package org.example;

public class Temperature {

    public Temperature(int[] temperatures){
        this.temperatures = temperatures;
    }

    public int[] temperatures;

    public double averageTemperature(){
        double avg = 0;

        for(int i=0; i<temperatures.length; i++){
            avg += temperatures[i];

        }

        avg/= temperatures.length;
        return avg;
    }

    public int minTemperature(){
        int min= temperatures[0];
        for(int i=1; i<temperatures.length;i++){
            if(temperatures[i]<min)
                min= temperatures[i];
        }
        return min;
    }

    public int maxTemperature(){
        int max= temperatures[0];
        for(int i=1; i<temperatures.length;i++){
            if(temperatures[i]>max)
                max= temperatures[i];
        }
        return max;
    }


    public int maxTemperatureDifference(){
       int max = 0;
       int day = 0;
       for(int i=0; i<temperatures.length-1; i++){
           if(temperatures[i+1]- temperatures[i]>max || temperatures[i] - temperatures[i+1]>max){
               day=i;
               if(temperatures[i+1] > temperatures[i])
                   max = temperatures[i+1];
               else
                   max = temperatures[i];
               }
           }
       return day;
       }

    }

}
