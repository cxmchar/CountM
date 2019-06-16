package demo.cxm.countm;

import java.util.Calendar;
import java.util.List;

import demo.cxm.countm.bean.User;

public class tools {
    public static int get_image(String type) {
        int source = R.drawable.circle;
        switch (type) {
            case "食物":
                source = R.drawable.ic_category_cost_food_24dp;
                break;
            case "饮料":
                source = R.drawable.ic_category_cost_drink_24dp;
                break;
            case "交通":
                source = R.drawable.ic_category_cost_transport_24dp;
                break;
            case "购物":
                source = R.drawable.ic_category_cost_shop_24dp;
                break;
            case "学习":
                source = R.drawable.ic_category_cost_study_24dp;
                break;
            case "默认":
                source = R.drawable.ic_category_earn_work_24dp;
                break;
        }
        return source;

    }

    /*
    获取当前日期
     */
    public static int getMonth() {
        Calendar cd = Calendar.getInstance();
        return cd.get(Calendar.MONTH) + 1;
    }

    public static int getDay() {
        Calendar cd = Calendar.getInstance();
        return cd.get(Calendar.DATE);
    }
    /*
    ,,,本来想反置数组的，但是报错，延后再看看
     */
    public static List<User> setLiset(List<User> userList) {
        int count = userList.size();
        List<User> users = null;
        for (int i = 0; i < count; i++) {
            users.set(i, userList.get(count--));
        }
        return users;
    }
    /*

     */

}
