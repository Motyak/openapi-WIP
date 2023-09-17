package org.openapitools.api;

import tommy.spotify.ApiUtils
import tommy.spotify.model.FollowArtistsUsersRequest
import tommy.spotify.model.FollowPlaylistRequest
import tommy.spotify.model.GetAnAlbum401Response
import tommy.spotify.model.GetFollowed200Response
import tommy.spotify.model.PagingArtistObject
import tommy.spotify.model.PagingPlaylistObject
import tommy.spotify.model.PagingTrackObject
import tommy.spotify.model.PrivateUserObject
import tommy.spotify.model.PublicUserObject
import tommy.spotify.model.UnfollowArtistsUsersRequest

class UsersApi {
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

    def checkIfUserFollowsPlaylist ( String playlistId, String ids, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/playlists/${playlist_id}/followers/contains"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (playlistId == null) {
            throw new RuntimeException("missing required params playlistId")
        }
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

    def followPlaylist ( String playlistId, Map<String, Object> requestBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/playlists/${playlist_id}/followers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (playlistId == null) {
            throw new RuntimeException("missing required params playlistId")
        }



        contentType = 'application/json';
        bodyParams = requestBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def getCurrentUsersProfile ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    PrivateUserObject.class )

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

    def getListUsersPlaylists ( String userId, Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/${user_id}/playlists"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }

        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    PagingPlaylistObject.class )

    }

    def getUsersProfile ( String userId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/users/${user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    PublicUserObject.class )

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

    def getUsersTopTracks ( String timeRange, Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/top/tracks"

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
                    PagingTrackObject.class )

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

    def unfollowPlaylist ( String playlistId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/playlists/${playlist_id}/followers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (playlistId == null) {
            throw new RuntimeException("missing required params playlistId")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    null )

    }

}
