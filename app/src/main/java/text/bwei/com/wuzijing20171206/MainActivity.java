package text.bwei.com.wuzijing20171206;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import text.bwei.com.wuzijing20171206.adapter.MyAdapter;
import text.bwei.com.wuzijing20171206.api.Api;
import text.bwei.com.wuzijing20171206.bean.News;
import text.bwei.com.wuzijing20171206.presenter.presener;
import text.bwei.com.wuzijing20171206.view.Iview;

public class MainActivity extends AppCompatActivity implements Iview {

    private RecyclerView recyclerView;
    private int num=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.reycler);
        presener presener = new presener(this);
        presener.getOk(Api.UYT,Api.key,num);


    }


    @Override
    public void showSuccess(List<News.NewslistBean> list) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(list));
    }

    @Override
    public void showError(String s) {

    }
}
