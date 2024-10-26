package test;
import java.util.*;

public class LargestNumber{
     
    private List<Integer> inputNumberList = null;

    public void setInputNumberList(List<Integer> inputNumberList){
        this.inputNumberList = inputNumberList;
    }

    public Integer findMax() throws Exception{        
        if(this.inputNumberList == null || this.inputNumberList.isEmpty()){
            throw new Exception("Input Number List is empty!!!");
        }
        int max = this.inputNumberList.get(0);
        for(int num : this.inputNumberList){
            if(num > max){
                max = num;
            }
        }
       return max;
    }

     


}
