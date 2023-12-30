package az.company;

public class Test {
    public static void main(String[] args) {
        int[] arrInt = {21, 13, 56, 35, 41, 76, 4, 12, 46, 36, 19, 2};
        int i = minElemArr(arrInt);
        System.out.println(i);
        String[] arrStr = {"salam", "necesen?", "bazar", "senbe", "arif", "zerife", "r", "c", "aa"};
        String s = minElemArr(arrStr);
        System.out.println(s);

    }

    public static int minElemArr(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    public static String minElemArr(String[] str) {
        String min = str[0];
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() < min.length()) {
                min = str[i];
            }
        }
        return min;
    }

}
