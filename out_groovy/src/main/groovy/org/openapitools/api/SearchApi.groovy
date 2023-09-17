package org.openapitools.api;

import tommy.spotify.ApiUtils
import tommy.spotify.model.GetAnAlbum401Response
import tommy.spotify.model.Search200Response

class SearchApi {
    String basePath = "https://api.spotify.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def search ( String q, List<String> type, String market, Integer limit, Integer offset, String includeExternal, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/search"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (q == null) {
            throw new RuntimeException("missing required params q")
        }
        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }

        if (q != null) {
            queryParams.put("q", q)
        }
        if (type != null) {
            queryParams.put("type", type)
        }
        if (market != null) {
            queryParams.put("market", market)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }
        if (includeExternal != null) {
            queryParams.put("include_external", includeExternal)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Search200Response.class )

    }

}
