package text.bwei.com.zhoukao1.api;

import retrofit2.http.GET;
import rx.Observable;
import text.bwei.com.zhoukao1.bean.News;

/**
 * Created by dell on 2017/12/6.
 */

public interface ApiService {
    @GET("umIPmfS6c83237d9c70c7c9510c9b0f97171a308d13b611?uri=homepage")
    Observable<News> getDates();
}
