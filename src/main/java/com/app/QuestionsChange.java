package com.app;

import java.util.*;

public class QuestionsChange {
    private static List<Integer> list;
    private static String name;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        runApp();
        scanner.close();
    }

    public static void runApp() {

        String[][] arr = {
                {"WW1 baslanmasi tarixi", "1918"},
                {"WW2 baslanmasi tarixi", "1941"},
                {"BMT yaradilmasi tarixi", "1945"},
                {"MDB yaradilmasi tarixi", "1991"}
        };
        int num = random.nextInt(arr.length);

        String event = arr[num][0];
        int eventYear = Integer.parseInt(arr[num][1]);

        System.out.println("Let the game begin!");
        System.out.print("Adinizi daxil edin: ");
        name = scanner.nextLine();
        System.out.println("Tesadufu secilmis hadise: " + event);
        System.out.print("tarix texmin edin: ");

        list = new ArrayList<>();
        checkCorrect(eventYear);
    }

    private static void checkCorrect(int i) {
        int yourTry = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int userEnterYear = scanner.nextInt();
            if (userEnterYear == i) {
                yourTry++;
                System.out.println("Tebrikler! " + name + " cavab dogrudur.");
                System.out.println("dogru tarix: " + i + "\nsizin cehdleriniz: " + yourTry + "\nsizin daxil etdiyiniz cavablar: ");
                sb.append(userEnterYear);
                String result = sb.toString();
                System.out.println(result);
                break;
            } else if (userEnterYear < i) {
                System.out.println("Daxil etdiyiniz tarix hadise tarixinden kicikdir, yeniden daxil edin");
                yourTry++;
                sb.append(userEnterYear);
            } else {
                System.out.println("Daxil etdiyiniz tarix hadise tarixinden boyukdur, yeniden daxil edin");
                yourTry++;
                sb.append(userEnterYear);
            }
        }
    }
}
