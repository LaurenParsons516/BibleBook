package com.lauren.biblebook;

public class Main {
    public static void main(String[] args) {
        BibleBook book1 = new BibleBook("Matthew", 28, "Matthew's point of view of Jesus' birth, teaching, death, resurrection, and ascension.");
        BibleBook book2 = new BibleBook("Mark", 16, "Mark's point of view of Jesus' birth, teaching, death, resurrection, and ascension.");
        BibleBook book3 = new BibleBook("Luke", 24, "Luke's point of view of Jesus' birth, teaching, death, resurrection, and ascension.");

        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        book1.displayReasonably();
        book2.displayReasonably();
        book3.displayReasonably();

        System.out.println("------------------------------------------------------------------------------------------------------------------------");

        book1.displayUnreasonably();
        book2.displayUnreasonably();
        book3.displayUnreasonably();

        System.out.println("------------------------------------------------------------------------------------------------------------------------");


    }
}
