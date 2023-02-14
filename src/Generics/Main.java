package Generics;

import jdk.jshell.execution.Util;

public class Main {
    public static void main(String[] args) {

//        var user1 = new User(25);
//        var user2 = new User(20);
//        if (user1.compareTo(user2) < 0) {
//            System.out.println("User 1 < User 2");
//        } else if (user1 == user2) {
//            System.out.println("User 1 == User 2");
//        } else {
//            System.out.println("User 1 > User 2");
//        }

        var max = Utils.max(new User(10),
                                new User(20));

        System.out.println(max);

    }


}
