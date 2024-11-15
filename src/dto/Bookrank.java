package dto;

public class Bookrank {
    private String booknumber;
    private String title;
    private String category;
    private int loancount;//빌린횟수
    private int rank;
    private int searchdate;//검색일

    public Bookrank(String booknumber, String title, String category, int loancount, int rank, int searchdate) {

        this.booknumber = booknumber;
        this.title = title;
        this.category = category;
        this.loancount = loancount;
        this.rank = rank;
        this.searchdate = searchdate;
    }
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
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getLoancount() {
        return loancount;
    }
    public void setLoancount(int loancount) {
        this.loancount = loancount;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public int getSearch() {
        return searchdate;
    }
    public void setSearch(int search) {
        this.searchdate = searchdate;
    }

}
