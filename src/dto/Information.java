package dto;

import java.util.Date;

public class Information {
    private String college;//단과대
    private int loanremaining;//대출잔여량
    private String Loanavailability;//대출가능여부
    private String state;//상태
    private Date elapsedtime;//경과일
    private int Loancode;//대출코드

    public Information(String college,int loanremaining,String Loanavailability,
                       String state,Date elapsedtime,int Loancode) {
        this.college = college;
        this.loanremaining = loanremaining;
        this.Loanavailability = Loanavailability;
        this.state = state;
        this.elapsedtime = elapsedtime;
        this.Loancode = Loancode;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public int getLoanremaining() {
        return loanremaining;
    }
    public void setLoanremaining(int loanremaining) {
        this.loanremaining = loanremaining;
    }
    public String getLoanavailability() {
        return Loanavailability;
    }
    public void setLoanavailability(String Loanavailability) {
        this.Loanavailability = Loanavailability;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Date getElapsedtime() {
        return elapsedtime;
    }
    public void setElapsedtime(Date elapsedtime) {
        this.elapsedtime = elapsedtime;
    }
    public int getLoancode() {
        return Loancode;
    }
    public void setLoancode(int Loancode) {
        this.Loancode = Loancode;
    }
}
