package text.bwei.com.zhoukao1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import text.bwei.com.zhoukao1.adapter.MyAdapter;
import text.bwei.com.zhoukao1.api.Api;
import text.bwei.com.zhoukao1.bean.News;
import text.bwei.com.zhoukao1.presenter.presenter;
import text.bwei.com.zhoukao1.view.Iview;

public class MainActivity extends AppCompatActivity implements Iview{

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        presenter presenter = new presenter(this);
        presenter.getOk(Api.URL);

    }

    @Override
    public void showSuccess(List<News.DataBean.SubjectsBean> list) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(list));
    }

    @Override
    public void ahowError(String s) {

    }
}
