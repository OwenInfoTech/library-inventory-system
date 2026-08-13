package com.oweninfotech.library;

public class Book extends Item {
    private String author;
    private int pages;

    public Book(int Id, String title, int pages, String author){
        super (Id, title);
        this.pages = pages;
        this.author = author;

    }
public int getPages(){
        return pages;
}
public String getAuthor(){
        return author;
}
@Override
public String getDetails(){
        return getTitle() + " by " + author + ", " + pages + " pages";
}

}
