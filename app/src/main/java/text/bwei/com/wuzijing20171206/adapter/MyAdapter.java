package text.bwei.com.wuzijing20171206.adapter;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import text.bwei.com.wuzijing20171206.R;
import text.bwei.com.wuzijing20171206.bean.News;

/**
 * Created by dell on 2017/12/6.
 */

public class MyAdapter extends RecyclerView.Adapter {
    List<News.NewslistBean> list;

    public MyAdapter(List<News.NewslistBean> list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.textView.setText(list.get(position).getTitle());
        Uri imgUrl = Uri.parse(list.get(position).getPicUrl());
//        SimpleDraweeView urlImg = (SimpleDraweeView) findViewById(R.id.sdv_image_url);
        myViewHolder.simpleDraweeView.setImageURI(imgUrl);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {


        private final SimpleDraweeView simpleDraweeView;
        private final TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
            simpleDraweeView = itemView.findViewById(R.id.sdv_image);


        }
    }


}
