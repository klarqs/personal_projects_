package personal__;

public class Recursion__ {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);

        int result2 = sum(5, 10);
        System.out.println(result2);

        int resultThree = threeSum(5, 8, 10);
        System.out.println(resultThree);

        int result3 = 5 + num(4);
        System.out.println(result3);

        int result4 = sumNum(5, 10);
        System.out.println(result4);

        int result5 = evenNum(2);
        System.out.println(result5);

        double result6 = oddNum(49);
        System.out.println(result6);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

    public static int threeSum(int start, int middle, int end) {
        if (end > start) {
            return end + threeSum(start, middle,end - 1);
        } else {
            return end;
        }
    }

    public static int sumNum(int start, int end) {
        if (end < start) {
            return end + sumNum(start, end);
        } else {
            return end;
        }
    }

    public static int num(int number) {
        return number;
    }

    public static int evenNum(int number) {
        if (number <= 20) {
            return number + evenNum(number + 2);
        } else {
            return 0;
        }
    }

    public static double oddNum(int number) {
        if (number > 10) {
            return number + oddNum(number * 2);
        } else {
            return 0;
        }
    }
}

// Well, I'm still very confused about Recursions in Java though. I really don't understand.