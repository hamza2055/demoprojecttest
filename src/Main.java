public class Main {

    public static void main(String[] args){
        System.out.println("hello first aprogram run");
        int num = 5;
        System.out.println(Sum(num));

        System.out.println("Factorial of " + num + "is" + Factorial(num));

        int array[] = {0,10,-9,13,18,29};

        System.out.println("max is "  + findMax(array));

        System.out.println("min is "  + findMin(array));

        System.out.println("Average is "  + findAverage(array));
        //  for calculating factorial

    }


    public static Integer Sum(Integer num){
        if (num <=0)
            return 0;
        int sum = 0;
        for (int i =1; i<=num ;i ++){
            sum = sum+i;

        }

        return sum;

    }

    public static Integer Factorial(Integer num){
        if (num ==0)
            return 1;

         return Factorial(num -1) * num;

    }


    public static Integer findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];


        }
        return min;
    }

    public static Integer findAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum +  array[i];


        }
        int average = sum/array.length;

        return average;
    }

    public static Integer findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];


        }
        return max;
    }
}
