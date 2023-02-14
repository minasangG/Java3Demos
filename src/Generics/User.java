package Generics;

public class User implements Comparable<User> {


    private final int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User others) {
        return points - others.points;
//        if(points < others.points)
//        return -1;
//
//        if (points == points) {
//            return 0;
//        }
//
//        if (points == points) {
//            return 0;
//        }
    }

    @Override
    public String toString() {
        return "Points = " + points;
    }

}
