package test;

import java.util.Arrays;
import java.util.List;

public class Data{ 
    public static void showdata(Integer... values){
    	List<Integer> data = Arrays.asList(values); 
    	data.forEach(System.out::println);
    }
}