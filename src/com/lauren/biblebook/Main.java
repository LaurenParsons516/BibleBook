package com.lauren.biblebook;

import java.io.File;
import  java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<BibleBook> bibleBooks = new ArrayList<>();
        Scanner input = new Scanner(new File("/home/lauren/IdeaProjects/BibleBook/src/com/lauren/biblebook/bibleBookList"));
        while(input.hasNext()) {
            BibleBook book = new BibleBook(input.nextLine());
            bibleBooks.add(book);
        }
        input.close();

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter keyword: ");
        String keyWord = userInput.nextLine();

        for(int i = 0; i < bibleBooks.size(); i++){
            BibleBook currentBook = bibleBooks.get(i);
            if(currentBook.getContentSum().contains(keyWord)) {
                System.out.println(currentBook.getBookName());
                break;
            }
        }

    }
}
