package demo.cxm.countm.bean;

import org.litepal.crud.LitePalSupport;
import org.litepal.exceptions.DataSupportException;

import java.util.Date;

public class User extends LitePalSupport {

    private int datemouth;
    private int dateday;
    private int num;
    private double money;
    //对于类型是用整形还是字符串型呢？
    //private String type;
    private String type;
    private String about;

    public int getDatemouth() {
        return datemouth;
    }

    public void setDatemouth(int datemouth) {
        this.datemouth = datemouth;
    }

    public int getDateday() {
        return dateday;
    }

    public void setDateday(int dateday) {
        this.dateday = dateday;
    }

    public String getAbout() {

        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }



    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
