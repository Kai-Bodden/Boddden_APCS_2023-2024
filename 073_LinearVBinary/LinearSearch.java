public class LinearSearch{
public int[] specialNumbers = {-8388, 9807, -4011, 5423, -4, 56, -990, 999};
    public static void main(String[] args) {
        //creating instance of my numbers
        OneThousandSortedRandomNumbers numbers = new OneThousandSortedRandomNumbers();

        //getting sorted array
        int[] sortedNumbers = numbers.getSortedNumbers();

        //starting my linear search instance
        LinearSearch searchOne = new LinearSearch();

        //linear search for all special numbers
        for(int num : searchOne.specialNumbers){
            int correctIndex = searchOne.linearSearch(sortedNumbers, num);
            if(correctIndex != -1){
                System.out.println("(Linear search) Special number " + num + " was found at index " + correctIndex);
            }
            else{
                System.out.println("(Linear search) Special number " + num + " was not found in the array");
            }
        }
    
    }
    //linear search method
    public int linearSearch(int[] arrToSearch , int target){
        for(int i = 0; i < arrToSearch.length; i++){
            System.out.println("This is the " + (i + 1) + " loop.");
            if(arrToSearch[i] == target){
                return i; //what returns if the target is found
            }
        }
        return -1; //if target isnt found, return -1
    }
}

