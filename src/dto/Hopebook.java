package dto;

import java.util.Date;

public class Hopebook {
    private String title;
    private String author;
    private String publisher;
    private Date publishedDate;
    private int price;
    private String name;
    private long phn_number;//전화번호

    public Hopebook(String title, String author, String publisher, Date publishedDate,
                    int price, String name, long phn_number) {

        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.price = price;
        this.name = name;
        this.phn_number = phn_number;
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
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public Date getPublishedDate() {
        return publishedDate;
    }
    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPhn_number() {
        return phn_number;
    }
    public void setPhn_number(long phn_number) {
        this.phn_number = phn_number;
    }
}
