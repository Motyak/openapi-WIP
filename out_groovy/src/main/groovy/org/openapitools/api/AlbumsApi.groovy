package org.openapitools.api;

import tommy.spotify.ApiUtils
import tommy.spotify.model.AlbumObject
import tommy.spotify.model.GetAnAlbum401Response
import tommy.spotify.model.GetMultipleAlbums200Response
import tommy.spotify.model.GetNewReleases200Response
import tommy.spotify.model.PagingArtistDiscographyAlbumObject
import tommy.spotify.model.PagingSavedAlbumObject
import tommy.spotify.model.PagingSimplifiedTrackObject
import tommy.spotify.model.SaveAlbumsUserRequest

class AlbumsApi {
    String basePath = "https://api.spotify.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def checkUsersSavedAlbums ( String ids, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/albums/contains"

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

    def getAnAlbum ( String id, String market, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/albums/${id}"

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
                    AlbumObject.class )

    }

    def getAnAlbumsTracks ( String id, String market, Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/albums/${id}/tracks"

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
                    PagingSimplifiedTrackObject.class )

    }

    def getAnArtistsAlbums ( String id, String includeGroups, String market, Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/artists/${id}/albums"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (includeGroups != null) {
            queryParams.put("include_groups", includeGroups)
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
                    PagingArtistDiscographyAlbumObject.class )

    }

    def getMultipleAlbums ( String ids, String market, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/albums"

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
                    GetMultipleAlbums200Response.class )

    }

    def getNewReleases ( String country, Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/browse/new-releases"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


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
                    GetNewReleases200Response.class )

    }

    def getUsersSavedAlbums ( Integer limit, Integer offset, String market, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/albums"

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
        if (market != null) {
            queryParams.put("market", market)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    PagingSavedAlbumObject.class )

    }

    def removeAlbumsUser ( String ids, Map<String, Object> requestBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/albums"

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
        bodyParams = requestBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

    def saveAlbumsUser ( String ids, Map<String, Object> requestBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/albums"

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
        bodyParams = requestBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

}
