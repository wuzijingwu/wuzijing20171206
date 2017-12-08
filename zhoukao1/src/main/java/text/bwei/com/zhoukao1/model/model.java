package text.bwei.com.zhoukao1.model;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import text.bwei.com.zhoukao1.api.ApiService;
import text.bwei.com.zhoukao1.bean.News;

/**
 * Created by dell on 2017/12/6.
 */

public class model implements Imodel {
    @Override
    public void RequestSuccess(String url, final Onselect onselect) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);

        Observable<News> dates = apiService.getDates();

        dates.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<News>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(News news) {
                        List<News.DataBean.SubjectsBean> subjects = news.getData().getSubjects();
                        onselect.dataSuccess(subjects);
                    }
                });
    }
}
