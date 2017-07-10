package com.example.android.findabook;

public class Book {

    /**
     * Book information: Title / Author / website url
     */

    private String bookTitle;
    private String bookAuthor;
    public final String bookUrl;
    private String bookThumbnailUrl;

    //public Book(String bookTitle, String bookAuthor, Url)

    public Book(String bookTitle, String bookAuthor, String bookThumbnailUrl, String bookUrl) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookUrl = bookUrl;
        this.bookThumbnailUrl = bookThumbnailUrl;
    }

    /**
     * Return the book title
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Return the book author
     */
    public String getBookAuthor() {
        return bookAuthor;
    }

    /**
     * Return the book url
     */
    public String getUrl() {
        return bookUrl;
    }

    /**
     * Return the book thumbnail
     */
    public String getBookThumbnail() {
        return bookThumbnailUrl;
    }
}
