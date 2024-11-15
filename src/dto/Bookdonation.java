package dto;

import java.util.Date;

public class Bookdonation {
    private String name;
    private long telephone;
    private long phn_number;
    private String email;
    private String field;
    private String booktitle;
    private String publishing;
    private Date PublishedDate;
    private String reason;
    public Bookdonation(String name,long telephone,long phn_number,String email
            ,String field,String booktitle,String publishing,Date PublishedDate,String reason ) {
        this.name = name;
        this.telephone = telephone;
        this.phn_number = phn_number;
        this.email = email;
        this.field = field;
        this.booktitle = booktitle;
        this.publishing = publishing;
        this.PublishedDate = PublishedDate;
        this.reason = reason;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getTelephone() {
        return telephone;
    }
    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }
    public long getPhn_number() {
        return phn_number;
    }
    public void setPhn_number(long phn_number) {
        this.phn_number = phn_number;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    public String getBooktitle() {
        return booktitle;
    }
    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }
    public String getPublishing() {
        return publishing;
    }
    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }
    public Date getPublishedDate() {
        return PublishedDate;
    }
    public void setPublishedDate(Date publishedDate) {
        PublishedDate = publishedDate;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }

}
