package test;

import java.util.*;
// static import
import static java.lang.System.out;

public class Series{

    public class FibonacciSeries{
        // 0,1,1,2,3,5,8....N        
        public List<Integer> generateNfibonacciNumber(int num){
            List<Integer> data = new ArrayList<Integer>();
            data.add(0);
            data.add(1);
            for(int i = 0 ; i < num -2 ; i++){
                data.add(data.get(i) + data.get(i+1));
            }
            return data;
        }

    }

    public static void printSeries(List<Integer> series){
    	series.stream().forEach(out::println);
//        for(Integer num :series){
//            System.out.println(num);
//        }
    }
}