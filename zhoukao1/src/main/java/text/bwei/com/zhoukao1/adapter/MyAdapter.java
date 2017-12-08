package text.bwei.com.zhoukao1.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import text.bwei.com.zhoukao1.R;
import text.bwei.com.zhoukao1.bean.News;

/**
 * Created by dell on 2017/12/6.
 */

public class MyAdapter extends RecyclerView.Adapter {
    List<News.DataBean.SubjectsBean> list;

    public MyAdapter(List<News.DataBean.SubjectsBean> list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyviewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyviewHolder myviewHolder= (MyviewHolder) holder;
        myviewHolder.textView.setText(list.get(position).getDetail());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyviewHolder extends RecyclerView.ViewHolder{


        private final TextView textView;

        public MyviewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
//            textView = itemView.findViewById(R.id.text);
        }
    }

}
