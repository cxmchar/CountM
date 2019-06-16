package demo.cxm.countm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.Toast;

import java.util.Calendar;

import demo.cxm.countm.bean.User;

import static android.media.CamcorderProfile.get;

public class add_Activity extends AppCompatActivity implements View.OnClickListener {

    private EditText mtype, mmoney, mnum;
    private Button button, btdrink, btfood, btshop, bttrans;
    private String sourceid ="默认";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_);
        ini();

        button.setOnClickListener(this);

    }

    public void ini() {
        mtype = findViewById(R.id.type_et);
        mmoney = findViewById(R.id.money_et);
        //mnum = findViewById(R.id.num_et);
        button = findViewById(R.id.add);
        btdrink = findViewById(R.id.drink_bt);
        btfood = findViewById(R.id.food_bt);
        btshop = findViewById(R.id.study_bt);
        bttrans = findViewById(R.id.transport_bt);
        btdrink.setOnClickListener(this);
        btfood.setOnClickListener(this);
        bttrans.setOnClickListener(this);
        btshop.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add:
                String moneys = mmoney.getText().toString();
                String about = mtype.getText().toString();
                //String nums = mnum.getText().toString();

                double money = Double.valueOf(moneys);
                //int num = Integer.valueOf(nums);
                int mouth = tools.getMonth();
                int day = tools.getDay();
                //
                //这里应该要进行一下封装，判空之类的

                User user = new User();
                user.setMoney(money);
                //user.setNum(num);
                user.setAbout(about);
                user.setType(sourceid);
                user.setDatemouth(mouth);
                user.setDateday(day);
                user.save();
                //
                Toast.makeText(getBaseContext(), "增加成功", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(add_Activity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.drink_bt:
                sourceid = "饮料";
                break;
            case R.id.food_bt:
                sourceid = "食物";
                break;
            case R.id.study_bt:
                sourceid = "购物";
                break;
            case R.id.transport_bt:
                sourceid = "交通";
                break;

        }
    }
}
