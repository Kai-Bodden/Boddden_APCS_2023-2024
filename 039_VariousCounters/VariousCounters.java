public class VariousCounters {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 103436;
        int count3 = 1000;

       while (count1 <= 100) {
            if (count1%2 == 0) {
                System.out.println(count1);
                count1++;
            }
            else {
                count1++;
            }
        }
        while (count2 <= 2000007) {
            if (count2%76 == 0) {
                System.out.println(count2);
                count2++;
            }
            else {
                count2++;
            }            
        }
        while (count3 <= 2000) {
            System.out.println(count3);
            count3 = count3 + 7;
            System.out.println(count3);
            count3 = count3 - 3;
            System.out.println(count3);
            count3 = count3 + 11;
            System.out.println(count3);
            count3 = count3 - 2;
        }
    }
}
