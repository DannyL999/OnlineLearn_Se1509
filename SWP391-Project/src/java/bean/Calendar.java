/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Phong
 */
public class Calendar {
    int countmonth; 
    int countdate; 
    String month; 
    String date; 

    public Calendar() {
    }

    public Calendar(int countmonth, int countdate, String month, String date) {
        this.countmonth = countmonth;
        this.countdate = countdate;
        this.month = month;
        this.date = date;
    }

    public int getCountmonth() {
        return countmonth;
    }

    public int getCountdate() {
        return countdate;
    }

    public String getMonth() {
        return month;
    }

    public String getDate() {
        return date;
    }

    public void setCountmonth(int countmonth) {
        this.countmonth = countmonth;
    }

    public void setCountdate(int countdate) {
        this.countdate = countdate;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Calendar{" + "countmonth=" + countmonth + ", countdate=" + countdate + ", month=" + month + ", date=" + date + '}';
    }
    
    
}
