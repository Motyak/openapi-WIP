package org.openapitools.api;

import tommy.spotify.ApiUtils
import tommy.spotify.model.GetAnAlbum401Response
import tommy.spotify.model.GetAvailableMarkets200Response

class MarketsApi {
    String basePath = "https://api.spotify.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getAvailableMarkets ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/markets"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetAvailableMarkets200Response.class )

    }

}
