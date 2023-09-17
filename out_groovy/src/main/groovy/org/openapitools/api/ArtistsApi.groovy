package org.openapitools.api;

import tommy.spotify.ApiUtils
import tommy.spotify.model.ArtistObject
import tommy.spotify.model.FollowArtistsUsersRequest
import tommy.spotify.model.GetAnAlbum401Response
import tommy.spotify.model.GetAnArtistsTopTracks200Response
import tommy.spotify.model.GetFollowed200Response
import tommy.spotify.model.GetMultipleArtists200Response
import tommy.spotify.model.PagingArtistDiscographyAlbumObject
import tommy.spotify.model.PagingArtistObject
import tommy.spotify.model.UnfollowArtistsUsersRequest

class ArtistsApi {
    String basePath = "https://api.spotify.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def checkCurrentUserFollows ( String type, String ids, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/following/contains"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }
        // verify required params are set
        if (ids == null) {
            throw new RuntimeException("missing required params ids")
        }

        if (type != null) {
            queryParams.put("type", type)
        }
        if (ids != null) {
            queryParams.put("ids", ids)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "array",
                    Boolean.class )

    }

    def followArtistsUsers ( String type, String ids, Map<String, Object> requestBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/following"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }
        // verify required params are set
        if (ids == null) {
            throw new RuntimeException("missing required params ids")
        }

        if (type != null) {
            queryParams.put("type", type)
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

    def getAnArtist ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/artists/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    ArtistObject.class )

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

    def getAnArtistsRelatedArtists ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/artists/${id}/related-artists"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetMultipleArtists200Response.class )

    }

    def getAnArtistsTopTracks ( String id, String market, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/artists/${id}/top-tracks"

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
                    GetAnArtistsTopTracks200Response.class )

    }

    def getFollowed ( String type, String after, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/following"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }

        if (type != null) {
            queryParams.put("type", type)
        }
        if (after != null) {
            queryParams.put("after", after)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetFollowed200Response.class )

    }

    def getMultipleArtists ( String ids, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/artists"

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
                    "GET", "",
                    GetMultipleArtists200Response.class )

    }

    def getUsersTopArtists ( String timeRange, Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/top/artists"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (timeRange != null) {
            queryParams.put("time_range", timeRange)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    PagingArtistObject.class )

    }

    def unfollowArtistsUsers ( String type, String ids, Map<String, Object> requestBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/following"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }
        // verify required params are set
        if (ids == null) {
            throw new RuntimeException("missing required params ids")
        }

        if (type != null) {
            queryParams.put("type", type)
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

}
