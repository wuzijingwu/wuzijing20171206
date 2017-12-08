package text.bwei.com.zhoukao1.view;

import java.util.List;

import text.bwei.com.zhoukao1.bean.News;

/**
 * Created by dell on 2017/12/6.
 */

public interface Iview {
    void showSuccess(List<News.DataBean.SubjectsBean> list);
    void ahowError(String s);

}
