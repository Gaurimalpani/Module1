package Classes;

class Subject {
    float maths;
    float english;
    float science;
    float history;
    float hindi;
}

public class Student {
    public static void main(String[] args) {
        Subject s1 = new Subject();
        Subject s2 = new Subject();
        float avg1, avg2;

        s1.maths = 98;
        s1.english = 84;
        s1.science = 96;
        s1.history = 92;
        s1.hindi = 80;

        s2.maths = 90;
        s2.english = 78;
        s2.science = 92;
        s2.history = 85;
        s2.hindi = 88;

        avg1 = (s1.maths + s1.english + s1.science + s1.history + s1.hindi)/5;
        avg2 = (s2.maths + s2.english + s2.science + s2.history + s2.hindi)/5;

        System.out.println("AVERAGE " + avg1);
        System.out.println("AVERAGE " + avg2);
    }
}