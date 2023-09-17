package org.openapitools.api;

import tommy.spotify.ApiUtils
import tommy.spotify.model.ChapterObject
import tommy.spotify.model.GetAnAlbum401Response
import tommy.spotify.model.GetSeveralChapters200Response
import tommy.spotify.model.PagingSimplifiedChapterObject

class ChaptersApi {
    String basePath = "https://api.spotify.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getAChapter ( String id, String market, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/chapters/${id}"

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
                    ChapterObject.class )

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

    def getSeveralChapters ( String ids, String market, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/chapters"

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
                    GetSeveralChapters200Response.class )

    }

}
