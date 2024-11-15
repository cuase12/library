package dto;

import java.io.File;
import java.util.Date;

public class Book {
    private String booknumber;
    private String title;
    private String author;
    private Date PublishedDate;
    private String publishing;
    private String Category;
    private int price;
    private int page;
    private String location;
    private String bookState;//도서상태
    public File image;


    // 기본 생성자
    public Book() {}

    // 모든 필드를 포함한 생성자
    public Book(String booknumber,String title,String author,Date PublishedDate,String publishing,String Category
            ,int price,int page,String location,String bookState,File image) {
        this.booknumber = booknumber;
        this.title = title;
        this.author = author;
        this.PublishedDate = PublishedDate;
        this.publishing = publishing;
        this.Category = Category;
        this.price = price;
        this.page = page;
        this.location = location;
        this.bookState = bookState;
        this.image = image;
    }

    // Getter 및 Setter 메서드


    public String getBooknumber() {
        return booknumber;
    }

    public void setBooknumber(String booknumber) {
        this.booknumber = booknumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishedDate() {
        return PublishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        PublishedDate = publishedDate;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return bookState;
    }

    public void setState(String state) {
        this.bookState = bookState;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }
}
