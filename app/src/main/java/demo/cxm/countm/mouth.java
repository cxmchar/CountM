package demo.cxm.countm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import demo.cxm.countm.db.Utils;

public class mouth extends AppCompatActivity {
    private TextView mouth, count, count_class;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mouth);
        init();
        mouth.setText("本月是" + tools.getMonth() + "月");
        count.setText("本月支出共计：" + String.valueOf(Utils.getmouth()));
        count_class.setText(String.valueOf(Utils.getMouth_food()));
    }

    public void init() {
        mouth = findViewById(R.id.mouth_tv);
        count = findViewById(R.id.counts_tv);
        count_class = findViewById(R.id.countsfood_mouth_tv);
    }
}
