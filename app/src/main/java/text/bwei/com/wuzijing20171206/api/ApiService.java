package text.bwei.com.wuzijing20171206.api;

import java.util.Map;

import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;
import text.bwei.com.wuzijing20171206.bean.News;

/**
 * Created by dell on 2017/12/6.
 */

public interface ApiService {
    @POST
    Observable<News> getDatas(@Url String url, @QueryMap Map<String, String> map);
}
