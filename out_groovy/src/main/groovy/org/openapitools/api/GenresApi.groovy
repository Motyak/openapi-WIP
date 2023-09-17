package org.openapitools.api;

import tommy.spotify.ApiUtils
import tommy.spotify.model.GetAnAlbum401Response
import tommy.spotify.model.GetRecommendationGenres200Response

class GenresApi {
    String basePath = "https://api.spotify.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getRecommendationGenres ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/recommendations/available-genre-seeds"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetRecommendationGenres200Response.class )

    }

}
