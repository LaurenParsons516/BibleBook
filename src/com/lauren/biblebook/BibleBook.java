package com.lauren.biblebook;

public class BibleBook {
    private String bookName;
    private int chapterNum;
    private String contentSum;

    public BibleBook(String bookName, int chapterNum, String contentSum){
        this.bookName = bookName;
        this.chapterNum = chapterNum;
        this.contentSum = contentSum;
    }

    public BibleBook(String colonDelimited){
        String[] bookParts = colonDelimited.split(":");
        this.bookName = bookParts[0];
        this.chapterNum = Integer.parseInt(bookParts[1]);
        this.contentSum = bookParts[2];
    }

    public void displayReasonably() {
        System.out.println("Book Name: " + this.bookName + " (" + this.chapterNum  + ") - " + this.contentSum);
    }

    public void displayUnreasonably() {
        String bookObj = "Book Name: " + this.bookName + " (" + this.chapterNum  + ") - " + this.contentSum;
        for (int i = bookObj.length() - 1; i >= 0; i--) {
            if(i % 2 == 1) {
                System.out.print(Character.toUpperCase(bookObj.charAt(i)));
            } else {
                System.out.print(Character.toLowerCase(bookObj.charAt(i)));
            }
        }
        System.out.println();
    }

    public static void sortOnChapterCount(BibleBook[] bibleBookArray) {
        int numSwaps;
        BibleBook temp;
        do {
            numSwaps = 0;
            for(int i = 0; i < bibleBookArray.length - 1; i++) {
                if (bibleBookArray[i].chapterNum > bibleBookArray[i+1].chapterNum) {
                    temp = bibleBookArray[i];
                    bibleBookArray[i] = bibleBookArray[i+1];
                    bibleBookArray[i+1] = temp;
                    numSwaps++;
                }
            }
        } while (numSwaps > 0);
    }

    public static void sortOnName(BibleBook[] bibleBookArray) {
        int numSwaps;
        BibleBook temp;
        do {
            numSwaps = 0;
            for(int i = 0; i < bibleBookArray.length - 1; i++) {
                if (bibleBookArray[i].bookName.compareTo(bibleBookArray[i+1].bookName) > 0) {
                    temp = bibleBookArray[i];
                    bibleBookArray[i] = bibleBookArray[i+1];
                    bibleBookArray[i+1] = temp;
                    numSwaps++;
                }
            }
        } while (numSwaps > 0);
    }

    public String getContentSum() {
        return contentSum;
    }

    public String getBookName(){
        return  bookName;
    }

}
