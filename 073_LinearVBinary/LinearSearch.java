public class LinearSearch{
public int[] specialNumbers = {-8388, 9807, -4011, 5423, -4, 56, -990, 999};
    public static void main(String[] args) {
        LinearSearch searchOne = new LinearSearch();
        int correctIndex = searchOne.

    
    }

    public int linearSearch(int[] arrToSearch , int target){
        for(int i = 0; i < arrToSearch.length; i++){
            System.out.println("This is the " + (i + 1) + " loop.");
            if(arrToSearch[i] == target){
                return i;
            }
        }
        return -1;
    }
}

