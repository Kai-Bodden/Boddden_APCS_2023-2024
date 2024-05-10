public class BinarySearch {
    public int[] specialNumbers = {-8388, 9807, -4011, 5423, -4, 56, -990, 999};
    public static void main(String[] args) {
        // instance of numbers created
        OneThousandSortedRandomNumbers numbers = new OneThousandSortedRandomNumbers();

        // getting sorted array
        int[] sortedNumbers = numbers.getSortedNumbers();

        // binary search instantiated
        BinarySearch searchOne = new BinarySearch();

        for (int num : searchOne.specialNumbers) {
            int[] result = searchOne.binarySearch(sortedNumbers, num);
            int correctIndex = result[0];
            int loops = result[1];
            if (correctIndex != -1) {
                System.out.println("(Binary search) Special number " + num + " was found at index " + correctIndex + " after " + loops + " iterations");
            } else {
                System.out.println("(Binary search) Special number " + num + " was not found in the array");
            }
        }
    }

    public int[] binarySearch(int[] arrToSearch, int target) {
        // first, set the bounds of the search from the start/left - the end/right
        int left = 0;
        int right = arrToSearch.length - 1;
        int count = 0;

        // when the left side is less than or equal to the right side, the value can still be within, 
        // once this is no longer true, the value must not be in the array
        while (left <= right) {
            int middle = (left + right) / 2;
            count++; // increment count at each iteration

            // if the target is less than our middle, then the right bound moves to one less than the middle 
            // and as long as the while loop is true, will continue
            if (target < arrToSearch[middle]) {
                right = middle - 1;
            }
            // if the target is greater than our middle, then the left bound moves to one more than the middle 
            // and as long as the while loop is true, will continue
            else if (target > arrToSearch[middle]) {
                left = middle + 1;
            }
            // if the target is neither, then it must be the special number
            else {
                return new int[]{middle, count};
            }
        }
        // if the while loop is no longer true, the number must not be in the array
        return new int[]{-1, count};
    }
}


/*

3/3 - Compile/Content
1/1 - Formatting
1/1 - Comments

*/