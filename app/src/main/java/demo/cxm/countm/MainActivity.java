package demo.cxm.countm;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.litepal.LitePal;

import java.util.List;

import demo.cxm.countm.adapter.MyAdapter;
import demo.cxm.countm.bean.User;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private ListView listView;
    private Button mouth_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //LitePal.getDatabase();  这句话会引起闪退？
        initView();

    }
    protected  void onRestart() {
        super.onRestart();
        List<User> userList = LitePal.findAll(User.class);
        MyAdapter myAdapter = new MyAdapter(this, userList);
        listView.setAdapter(myAdapter);
    }

    @SuppressLint("WrongViewCast")
    public void initView() {

        listView = findViewById(R.id.listview);
        textView = findViewById(R.id.go_count_iv);
        textView.setOnClickListener(this);
        mouth_button = findViewById(R.id.mouth_bt);
        mouth_button.setOnClickListener(this);
        //

        List<User> userList = LitePal.findAll(User.class);
        MyAdapter myAdapter = new MyAdapter(this, userList);
        listView.setAdapter(myAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.go_count_iv:
                Intent intent = new Intent(MainActivity.this, add_Activity.class);
                startActivity(intent);
                break;
            case R.id.mouth_bt:
                Intent intent1 = new Intent(MainActivity.this, mouth.class);
                startActivity(intent1);
                break;
        }
    }
}
