package com.app;

import java.util.*;

public class FirstApp {
    private static List<Integer> list;
    private static String name;
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        runApp();
    }

    public static void runApp() {
        String[][] arr = {
                {"WW1 baslanmasi tarixi", "1918"},
                {"WW2 baslanmasi tarixi", "1941"},
                {"BMT yaradilmasi tarixi", "1945"},
                {"MDB yaradilmasi tarixi", "1991"}
        };

        String randomYear = getRandom(arr);
        int correctYear = getYear(arr, randomYear);

        System.out.println("Let the game begin!");
        System.out.print("Adinizi daxil edin: ");
        name = scanner.nextLine();
        System.out.println("Tesadufu secilmis hadise: " + randomYear);
        System.out.print("tarix texmin edin: ");

        list = new ArrayList<>();
        checkCorrect(correctYear);
    }

    private static void checkCorrect( int correctYear) {
        int yourTry = 0;
        while (true) {
            int userEnterYear = scanner.nextInt();
            if (userEnterYear == correctYear) {
                yourTry++;
                System.out.println("Tebrikler! " + name + " cavab dogrudur.");
                System.out.println("dogru tarix: " +correctYear+ "\nsizin cehdleriniz: " + yourTry + "\nsizin daxil etdiyiniz cavablar: ");
                list.add(userEnterYear);
                Collections.sort(list);
                for (int year : list) {
                    System.out.print(year + ", ");
                }
                break;
            } else if (userEnterYear < correctYear) {
                System.out.println("Daxil etdiyiniz tarix hadise tarixinden kicikdir, zehmet olmasa yeniden daxil edin");
                yourTry++;
                list.add(userEnterYear);
            } else {
                System.out.println("Daxil etdiyiniz tarix hadise tarixinden boyukdur, zehmet olmasa yeniden daxil edin");
                yourTry++;
                list.add(userEnterYear);
            }
        }
    }

    private static String getRandom(String[][] arr) {
        Random random = new Random();
        int row = random.nextInt(arr.length);
        return arr[row][0];
    }

    private static int getYear(String[][] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0].equals(search)) {
                return Integer.parseInt(arr[i][1]);
            }
        }
        return -1;
    }
}

