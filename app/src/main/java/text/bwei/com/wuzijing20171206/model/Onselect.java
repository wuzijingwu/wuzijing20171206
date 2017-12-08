package text.bwei.com.wuzijing20171206.model;

import java.util.List;

import text.bwei.com.wuzijing20171206.bean.News;

/**
 * Created by dell on 2017/12/6.
 */

public interface Onselect {
    void dataSuccess(List<News.NewslistBean> list);
    void dataError(String s);

}
