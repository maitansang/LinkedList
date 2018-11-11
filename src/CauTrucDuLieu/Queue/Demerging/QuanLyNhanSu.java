package CauTrucDuLieu.Queue.Demerging;

import java.util.Date;

public class QuanLyNhanSu {
    private String name;
    private String date;
    private String sex;
    private Date date1;

    public QuanLyNhanSu(String name, String date, String sex) {
        this.name = name;
        this.date = date;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    @Override
    public String toString() {
        return "QuanLyNhanSu{" +
                "name='" + name + '\'' +

                ", sex='" + sex + '\'' +
                ", date1=" + date1 +
                '}';
    }
}
