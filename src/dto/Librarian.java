package dto;

import java.util.Date;
public class Librarian {
    private String name;
    private long stu_number;
    private Date birth;
    private String unv;//소속대학
    private String phn_number;//전화번호
    private String position;//직책
    private String department;//소속학과

    public Librarian(String name, long stu_number, Date birth, String unv, String phn_number, String position, String department) {
        this.name = name;
        this.stu_number = stu_number;
        this.birth = birth;
        this.unv = unv;
        this.phn_number = phn_number;
        this.position = position;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getStu_number() {
        return stu_number;
    }
    public void setStu_number(long stu_number) {
        this.stu_number = stu_number;
    }
    public Date getBirth() {
        return birth;
    }
    public void setBirth(Date birth) {
        this.birth = birth;
    }
    public String getUnv() {
        return unv;
    }
    public void setUnv(String unv) {
        this.unv = unv;
    }
    public String getPhn_number() {
        return phn_number;
    }
    public void setPhn_number(String phn_number) {
        this.phn_number = phn_number;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

}