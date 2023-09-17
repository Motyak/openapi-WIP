package org.openapitools.api;

import tommy.spotify.ApiUtils
import tommy.spotify.model.AudiobookObject
import tommy.spotify.model.GetAnAlbum401Response
import tommy.spotify.model.GetMultipleAudiobooks200Response
import tommy.spotify.model.PagingSavedAudiobookObject
import tommy.spotify.model.PagingSimplifiedChapterObject

class AudiobooksApi {
    String basePath = "https://api.spotify.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def checkUsersSavedAudiobooks ( String ids, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/audiobooks/contains"

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

    def getAnAudiobook ( String id, String market, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/audiobooks/${id}"

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
                    AudiobookObject.class )

    }

    def getAudiobookChapters ( String id, String market, Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/audiobooks/${id}/chapters"

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
                    PagingSimplifiedChapterObject.class )

    }

    def getMultipleAudiobooks ( String ids, String market, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/audiobooks"

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




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetMultipleAudiobooks200Response.class )

    }

    def getUsersSavedAudiobooks ( Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/audiobooks"

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
                    PagingSavedAudiobookObject.class )

    }

    def removeAudiobooksUser ( String ids, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/audiobooks"

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
                    "DELETE", "",
                    null )

    }

    def saveAudiobooksUser ( String ids, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/audiobooks"

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
                    "PUT", "",
                    null )

    }

}
