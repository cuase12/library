package dto;

import java.util.List;

public class Library {
    private List<Book> booklist;
    private List<User> userlist;
    private int bookinventory;
    private int bookloan;  // bookloan 필드 추가

    // 생성자
    public Library(List<Book> booklist, List<User> userlist, int bookinventory) {
        this.booklist = booklist;
        this.userlist = userlist;
        this.bookinventory = bookinventory;
    }

    // Getter 및 Setter 메서드
    public List<Book> getBooklist() {
        return booklist;
    }

    public void setBooklist(List<Book> booklist) {
        this.booklist = booklist;
    }

    public List<User> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<User> userlist) {
        this.userlist = userlist;
    }

    public int getBookinventory() {
        return bookinventory;
    }

    public void setBookinventory(int bookinventory) {
        this.bookinventory = bookinventory;
    }

    public int getBookloan() {
        return bookloan;
    }

    public void setBookloan(int bookloan) {
        this.bookloan = bookloan;
    }
}
