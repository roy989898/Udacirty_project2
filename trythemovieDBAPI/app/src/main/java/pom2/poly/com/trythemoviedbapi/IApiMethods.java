package pom2.poly.com.trythemoviedbapi;

import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by User on 10/1/2016.
 */
public interface IApiMethods {
//http://api.themoviedb.org/3/movie/top_rated?api_key=db9db09d5d4c08b057a2aefbeea458b0
//http://api.themoviedb.org/3/movie/popular?api_key=db9db09d5d4c08b057a2aefbeea458b0&page=100
   
    Movie_LIST getCurators(
            @Query("api_key") String key
    );
}
