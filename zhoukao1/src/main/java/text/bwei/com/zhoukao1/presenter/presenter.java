package text.bwei.com.zhoukao1.presenter;

import java.util.List;

import text.bwei.com.zhoukao1.bean.News;
import text.bwei.com.zhoukao1.model.Imodel;
import text.bwei.com.zhoukao1.model.Onselect;
import text.bwei.com.zhoukao1.model.model;
import text.bwei.com.zhoukao1.view.Iview;

/**
 * Created by dell on 2017/12/6.
 */

public class presenter {
    Imodel imodel;
    Iview iview;

    public presenter(Iview iview) {
        this.iview = iview;
        imodel=new model();

    }
    public void getOk(String url){
        imodel.RequestSuccess(url, new Onselect() {
            @Override
            public void dataSuccess(List<News.DataBean.SubjectsBean> list) {
                iview.showSuccess(list);
            }

            @Override
            public void dataError(String s) {

            }
        });

    }
}
