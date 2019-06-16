package demo.cxm.countm.db;

import org.litepal.LitePal;
import org.litepal.exceptions.DataSupportException;

import java.util.List;

import demo.cxm.countm.bean.User;
import demo.cxm.countm.tools;

public class Utils {
    public void add() {

    }

    public void select() {
        List<User> userList = LitePal.findAll(User.class);
    }

    public static double getmouth() {
        List<User> userList = LitePal.where("datemouth = ?", String.valueOf(tools.getMonth())).find(User.class);
        double counts = 0,counts_food=0;
        for (User user : userList) {
            counts = user.getMoney() + counts;
        }
        for (User user : userList){
            if(user.getType().equals("食物")){
                counts_food = counts_food +user.getMoney();
            }
        }
        return counts;
    }
    public static double getMouth_food(){
        List<User> userList = LitePal.where("datemouth = ?", String.valueOf(tools.getMonth())).find(User.class);
        double counts_food=0;

        for (User user : userList){
            if(user.getType().equals("食物")||user.getType().equals("饮料")){
                counts_food = counts_food +user.getMoney();
            }
        }
        return counts_food;
    }
}
