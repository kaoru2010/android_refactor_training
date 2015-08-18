package jp.yumemi.lab.refactorme.module.qiita.api;

import java.util.List;

import jp.yumemi.lab.refactorme.module.qiita.entity.QiitaItem;
import retrofit.http.GET;
import retrofit.http.Path;

/**
* Created by k_morishita on 15/08/14.
*/
public interface QiitaApiService {

    @GET("/api/v2/items")
    public List<QiitaItem> getItems();

    @GET("/api/v2/tags/{tag}/items")
    public List<QiitaItem> getItemsByTag(@Path("tag") String tag);

}
