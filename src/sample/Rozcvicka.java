package sample;

public class Rozcvicka {
    public static void main(String[] args) {

        vypisPismeno ( "skola" , 3);
    }

    public static void vypisPismeno(String s, int i) {

        if (i > 0 && i < s.length()) {
        System.out.println(s.charAt(i));

    } else {
            System.out.println("nesplnene podmienky");

        }
    }
}
