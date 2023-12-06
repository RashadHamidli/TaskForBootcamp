package com.feature;

public class MySwitch {
    public static void main(String[] args) {
        var test = (int)test(111);
        System.out.println(test-2);
        System.out.println(test("salam"));
        System.out.println(test('a'));
    }

    public static Object test(Object object) {
        return switch (object) {
            case Integer i -> 1;
            case String s -> "String";
            default -> "Unknown Type";
        };
    }
}
