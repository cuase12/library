package dto;

import java.util.Date;

public class Announcement {
    private int list;//순위
    private String classification;//분류
    private String title;
    private String writer;
    private Date reportingdate;//작성일
    private int view;
    private String content;

    public Announcement( int list, String Classification, String title, String writer,
                         Date reportingdate, int view, String content ) {

        this.list = list;
        this.classification = Classification;
        this.title = title;
        this.writer = writer;
        this.reportingdate = reportingdate;
        this.view = view;
        this.content = content;
    }
    public int getView() {
        return view;
    }
    public void setView(int view) {
        this.view = view;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    public Date getReportingdate() {
        return reportingdate;
    }
    public void setReportingdate(Date reportingdate) {
        this.reportingdate = reportingdate;
    }
    public String getClassification() {
        return classification;
    }
    public void setClassification(String classification) {
        this.classification = classification;
    }
    public int getList() {
        return list;
    }
    public void setList(int list) {
        this.list = list;
    }
}
