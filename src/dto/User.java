package dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String name;
    private Date birth;
    private long stu_number; // 학번
    private String unv; // 소속 대학
    private long phn_number; // 전화번호
    private String department; // 소속 학과
    private List<String> interest = new ArrayList<>();
    private List<String> borrow = new ArrayList<>();

    // 생성자
    public User(String name, Date birth, long stu_number, String unv, long phn_number, String department, List<String> interest, List<String> borrow) {
        this.name = name;
        this.birth = birth;
        this.stu_number = stu_number;
        this.unv = unv;
        this.phn_number = phn_number;
        this.department = department;
        this.interest = interest;
        this.borrow = borrow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public long getStu_number() {
        return stu_number;
    }

    public void setStu_number(long stu_number) {
        this.stu_number = stu_number;
    }

    public String getUnv() {
        return unv;
    }

    public void setUnv(String unv) {
        this.unv = unv;
    }

    public long getPhn_number() {
        return phn_number;
    }

    public void setPhn_number(long phn_number) {
        this.phn_number = phn_number;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getInterest() {
        return interest;
    }

    public void setInterest(List<String> interest) {
        this.interest = interest;
    }

    public List<String> getBorrow() {
        return borrow;
    }

    public void setBorrow(List<String> borrow) {
        this.borrow = borrow;
    }
}
