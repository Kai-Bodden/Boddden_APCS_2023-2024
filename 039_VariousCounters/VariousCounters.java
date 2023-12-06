public class VariousCounters {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 103436;
        int count3 = 1000;

        //while the count is less than 100, it will print every even number
       while (count1 <= 100) {
            if (count1%2 == 0) {
                System.out.println(count1);
                count1++;
            }
            else {
                count1++;
            }
        }
        //every number divisible by 76
        while (count2 <= 2000007) {
            if (count2%76 == 0) {
                System.out.println(count2);
                count2++;
            }
            else {
                count2++;
            }            
        }
        //will add subtract add subtract until the count reaches 2000
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

/*

1/1 - Compiles
1/1 - Content
1/1 - Formatting
1/1 - Comments

*/