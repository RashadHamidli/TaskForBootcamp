package com.app;

import java.util.*;

public class Game {
    private static List<Integer> list;

    public static void main(String[] args) {
        game();
    }

    public static void game() {
        String[][] arr = {
                {"WW1 baslanmasi tarixi", "1918"},
                {"WW2 baslanmasi tarixi", "1941"},
                {"BMT yaradilmasi tarixi", "1945"},
                {"SSRI dagilmasi tarixi", "1991"}
        };

        String randomYear = getRandom(arr);
        int enterYear = getYear(arr, randomYear);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let the game begin!");
        System.out.print("Adinizi daxil edin: ");
        String name = scanner.nextLine();
        System.out.println("Tesadufu secilmis hadise: " + randomYear);
        System.out.print("tarix texmin edin: ");

        list = new ArrayList<>();

        check(scanner, enterYear);

        System.out.println("Tebrikler! " + name + " cavab dogrudur.");
        System.out.println("dogru tarix: " + enterYear + "\nsizin daxil etdiyiniz cavablar: ");
        Collections.sort(list);
        for (int year : list) {
            System.out.print(year + ", ");
        }
    }

    private static void check(Scanner scanner, int correctYear) {
        while (true) {
            int userEnter = scanner.nextInt();
            list.add(userEnter);
            if (userEnter == correctYear) {
                break;
            } else if (userEnter < correctYear) {
                System.out.println("Daxil etdiyiniz tarix hadise tarixinden kicikdir, zehmet olmasa yeniden daxil edin");
            } else {
                System.out.println("Daxil etdiyiniz tarix hadise tarixinden boyukdur, zehmet olmasa yeniden daxil edin");
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

