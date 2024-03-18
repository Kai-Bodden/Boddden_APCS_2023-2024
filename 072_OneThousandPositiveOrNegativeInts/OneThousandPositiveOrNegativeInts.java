import java.util.ArrayList;
public class OneThousandPositiveOrNegativeInts {
    private ArrayList<Integer> oneThousandIntegers = new ArrayList<>();

    public OneThousandPositiveOrNegativeInts(){
        for(int i = 0; i < 1000; i++){
            int randomNum = ((int)(1 + (Math.random() * 2000000))) - 1000000;
            oneThousandIntegers.add(randomNum);
        }
    }
}
