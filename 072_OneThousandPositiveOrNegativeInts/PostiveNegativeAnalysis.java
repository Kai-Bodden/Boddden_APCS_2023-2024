import java.util.ArrayList;
public class PostiveNegativeAnalysis {
    private ArrayList<Integer> oneThousandIntegers;

    //placing my array into my new constructor
    public PostiveNegativeAnalysis(ArrayList<Integer> oneThousandIntegers){
        this.oneThousandIntegers = oneThousandIntegers;
    }

    //creating my methods
    public int getTotalPositive(){
        int count = 0;
        for (int num : oneThousandIntegers){
            if (num > 0){
                count ++;
            }
        }
        return count;
    }

    public int getTotalNegative(){
        int count = 0;
        for (int num : oneThousandIntegers){
            if (num < 0){
                count ++;
            }
        }
        return count;
    }

    public int getSumPositive(){
        int sum = 0;
        for (int num : oneThousandIntegers){
            if (num > 0){
                sum += num;
            }
        }
        return sum;
    }

    public int getSumNegative(){
        int sum = 0; 
        for (int num : oneThousandIntegers){
            if (num < 0){ 
            sum += num; 
            }
        }
        return sum;
    }
    
}
