package text.bwei.com.wuzijing20171206.presenter;

import java.util.List;

import text.bwei.com.wuzijing20171206.bean.News;
import text.bwei.com.wuzijing20171206.model.Imodel;
import text.bwei.com.wuzijing20171206.model.Onselect;
import text.bwei.com.wuzijing20171206.model.model;
import text.bwei.com.wuzijing20171206.view.Iview;

/**
 * Created by dell on 2017/12/6.
 */

public class presener {
    Imodel imodel;
    Iview iview;

    public presener(Iview iview) {
        this.iview = iview;
        imodel = new model();
    }

    public void getOk(String url, String key, int num) {
        imodel.Request(url, key, num, new Onselect() {
            @Override
            public void dataSuccess(List<News.NewslistBean> list) {
                iview.showSuccess(list);
            }

            @Override
            public void dataError(String s) {

            }
        });

    }

}
