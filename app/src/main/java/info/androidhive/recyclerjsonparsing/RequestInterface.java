package info.androidhive.recyclerjsonparsing;

import retrofit2.Call;
import retrofit2.http.GET;
/**
 * Created by Sony on 08-07-2016.
 */
public interface RequestInterface {

    @GET("android/jsonandroid")
    Call<JsonResponse> getJSON();
}
