package com.lauren.biblebook;

import java.io.File;
import  java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("/home/lauren/IdeaProjects/BibleBook/src/com/lauren/biblebook/bibleBookList"));
        while(input.hasNext()){
            BibleBook s = new BibleBook(input.nextLine());
            s.displayReasonably();
        }
        input.close();

    }
}
