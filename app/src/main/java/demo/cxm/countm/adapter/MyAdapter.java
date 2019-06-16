package demo.cxm.countm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.litepal.LitePal;

import java.util.List;

import demo.cxm.countm.R;
import demo.cxm.countm.bean.User;
import demo.cxm.countm.tools;
public class MyAdapter extends BaseAdapter {

    List<User> users;
    private LayoutInflater mInflater;
    private Context mContext;

    public MyAdapter(Context context, List<User> getuser) {
        mContext = context;
        users = getuser;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            //convertView = mInflater.inflate(R.layout.item_layout, null);
            convertView = mInflater.inflate(R.layout.item_layout, parent,false);
            User user = users.get(position);
            viewHolder = new ViewHolder(convertView, user);
            convertView.setTag(viewHolder);
        } else {
            //利用gettag（）进行优化，
            viewHolder = (ViewHolder) convertView.getTag();
        }

        return convertView;
    }


}

class ViewHolder {
    private TextView mtextView_time, mtextView_count;
    private ImageView imageView;


    public ViewHolder(View getview, User user) {
        mtextView_count = getview.findViewById(R.id.count_tv);
        mtextView_time = getview.findViewById(R.id.time_tv);
        imageView = getview.findViewById(R.id.image);
        //
        mtextView_time.setText(user.getDatemouth() + "月" + user.getDateday() + "");
        mtextView_count.setText(user.getMoney() + "元>" + user.getAbout());
        imageView.setImageResource(tools.get_image(user.getType()));
    }


}