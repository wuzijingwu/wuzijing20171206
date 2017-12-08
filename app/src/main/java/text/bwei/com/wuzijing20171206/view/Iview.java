package text.bwei.com.wuzijing20171206.view;

import java.util.List;

import text.bwei.com.wuzijing20171206.bean.News;

/**
 * Created by dell on 2017/12/6.
 */

public interface Iview {
    void showSuccess(List<News.NewslistBean> list);
    void showError(String s);

}
