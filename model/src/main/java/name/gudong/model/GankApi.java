package name.gudong.model;

import io.reactivex.Observable;
import name.gudong.model.entity.GankList;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by GuDong on 2017/2/6 14:42.
 * Contact with gudong.name@gmail.com.
 */

public interface GankApi {
    @GET("search/query/{query}/category/{category}/count/{count}/page/{page}")
    Observable<GankList> searchGank(@Path("query") String query,
                                    @Path("category") String category,
                                    @Path("count") int count,
                                    @Path("page") int page);
}
