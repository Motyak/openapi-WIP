package org.openapitools.api;

import tommy.spotify.ApiUtils
import tommy.spotify.model.CategoryObject
import tommy.spotify.model.GetAnAlbum401Response
import tommy.spotify.model.GetCategories200Response
import tommy.spotify.model.PagingFeaturedPlaylistObject

class CategoriesApi {
    String basePath = "https://api.spotify.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getACategoriesPlaylists ( String categoryId, String country, Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/browse/categories/${category_id}/playlists"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (categoryId == null) {
            throw new RuntimeException("missing required params categoryId")
        }

        if (country != null) {
            queryParams.put("country", country)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    PagingFeaturedPlaylistObject.class )

    }

    def getACategory ( String categoryId, String country, String locale, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/browse/categories/${category_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (categoryId == null) {
            throw new RuntimeException("missing required params categoryId")
        }

        if (country != null) {
            queryParams.put("country", country)
        }
        if (locale != null) {
            queryParams.put("locale", locale)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CategoryObject.class )

    }

    def getCategories ( String country, String locale, Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/browse/categories"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (country != null) {
            queryParams.put("country", country)
        }
        if (locale != null) {
            queryParams.put("locale", locale)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetCategories200Response.class )

    }

}
