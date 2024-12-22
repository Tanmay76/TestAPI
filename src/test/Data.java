package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data{ 
    public static void showdata(Integer... values){
    	List<Integer> data = Arrays.asList(values); 
    	 Map<Integer,Integer> resultMap = new HashMap<Integer,Integer>();
    	data.forEach(System.out::println);
    }
    
    public void passByValue(int a) {
    	a = 10;
    	System.out.println("Inside method: " + a);
    }
    
    public void passByRefer(User user) {
    	user.setAge(25);  
    	System.out.println("Inside method: " + user.toString());
    }
}