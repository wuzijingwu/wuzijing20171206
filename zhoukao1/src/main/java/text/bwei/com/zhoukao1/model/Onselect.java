package text.bwei.com.zhoukao1.model;

import java.util.List;

import text.bwei.com.zhoukao1.bean.News;

/**
 * Created by dell on 2017/12/6.
 */

public interface Onselect {
    void dataSuccess(List<News.DataBean.SubjectsBean> list);
    void dataError(String s);
}
