package org.openapitools.api;

import tommy.spotify.ApiUtils
import tommy.spotify.model.GetAnAlbum401Response
import tommy.spotify.model.GetMultipleShows200Response
import tommy.spotify.model.PagingSavedShowObject
import tommy.spotify.model.PagingSimplifiedEpisodeObject
import tommy.spotify.model.SaveShowsUserRequest
import tommy.spotify.model.ShowObject

class ShowsApi {
    String basePath = "https://api.spotify.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def checkUsersSavedShows ( String ids, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/shows/contains"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (ids == null) {
            throw new RuntimeException("missing required params ids")
        }

        if (ids != null) {
            queryParams.put("ids", ids)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    Boolean.class )

    }

    def getAShow ( String id, String market, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/shows/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (market != null) {
            queryParams.put("market", market)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ShowObject.class )

    }

    def getAShowsEpisodes ( String id, String market, Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/shows/${id}/episodes"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
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




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    PagingSimplifiedEpisodeObject.class )

    }

    def getMultipleShows ( String ids, String market, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/shows"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (ids == null) {
            throw new RuntimeException("missing required params ids")
        }

        if (market != null) {
            queryParams.put("market", market)
        }
        if (ids != null) {
            queryParams.put("ids", ids)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetMultipleShows200Response.class )

    }

    def getUsersSavedShows ( Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/shows"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    PagingSavedShowObject.class )

    }

    def removeShowsUser ( String ids, String market, SaveShowsUserRequest saveShowsUserRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/shows"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (ids == null) {
            throw new RuntimeException("missing required params ids")
        }

        if (ids != null) {
            queryParams.put("ids", ids)
        }
        if (market != null) {
            queryParams.put("market", market)
        }


        contentType = 'application/json';
        bodyParams = saveShowsUserRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def saveShowsUser ( String ids, SaveShowsUserRequest saveShowsUserRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/shows"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (ids == null) {
            throw new RuntimeException("missing required params ids")
        }

        if (ids != null) {
            queryParams.put("ids", ids)
        }


        contentType = 'application/json';
        bodyParams = saveShowsUserRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

}
