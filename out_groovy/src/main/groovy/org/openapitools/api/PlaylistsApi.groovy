package org.openapitools.api;

import tommy.spotify.ApiUtils
import tommy.spotify.model.AddTracksToPlaylistRequest
import tommy.spotify.model.ChangePlaylistDetailsRequest
import tommy.spotify.model.CreatePlaylistRequest
import tommy.spotify.model.FollowPlaylistRequest
import tommy.spotify.model.GetAnAlbum401Response
import tommy.spotify.model.ImageObject
import tommy.spotify.model.PagingFeaturedPlaylistObject
import tommy.spotify.model.PagingPlaylistObject
import tommy.spotify.model.PagingPlaylistTrackObject
import tommy.spotify.model.PlaylistObject
import tommy.spotify.model.RemoveTracksPlaylistRequest
import tommy.spotify.model.ReorderOrReplacePlaylistsTracks200Response
import tommy.spotify.model.ReorderOrReplacePlaylistsTracksRequest

class PlaylistsApi {
    String basePath = "https://api.spotify.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def addTracksToPlaylist ( String playlistId, Integer position, String uris, Map<String, Object> requestBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/playlists/${playlist_id}/tracks"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (playlistId == null) {
            throw new RuntimeException("missing required params playlistId")
        }

        if (position != null) {
            queryParams.put("position", position)
        }
        if (uris != null) {
            queryParams.put("uris", uris)
        }


        contentType = 'application/json';
        bodyParams = requestBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    ReorderOrReplacePlaylistsTracks200Response.class )

    }

    def changePlaylistDetails ( String playlistId, Map<String, Object> requestBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/playlists/${playlist_id}"

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

    def createPlaylist ( String userId, Map<String, Object> requestBody, Closure onSuccess, Closure onFailure)  {
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



        contentType = 'application/json';
        bodyParams = requestBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    PlaylistObject.class )

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

    def getAListOfCurrentUsersPlaylists ( Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/playlists"

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
                    PagingPlaylistObject.class )

    }

    def getFeaturedPlaylists ( String country, String locale, String timestamp, Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/browse/featured-playlists"

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
        if (timestamp != null) {
            queryParams.put("timestamp", timestamp)
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

    def getPlaylist ( String playlistId, String market, String fields, String additionalTypes, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/playlists/${playlist_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (playlistId == null) {
            throw new RuntimeException("missing required params playlistId")
        }

        if (market != null) {
            queryParams.put("market", market)
        }
        if (fields != null) {
            queryParams.put("fields", fields)
        }
        if (additionalTypes != null) {
            queryParams.put("additional_types", additionalTypes)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    PlaylistObject.class )

    }

    def getPlaylistCover ( String playlistId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/playlists/${playlist_id}/images"

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
                    "GET", "array",
                    ImageObject.class )

    }

    def getPlaylistsTracks ( String playlistId, String market, String fields, Integer limit, Integer offset, String additionalTypes, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/playlists/${playlist_id}/tracks"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (playlistId == null) {
            throw new RuntimeException("missing required params playlistId")
        }

        if (market != null) {
            queryParams.put("market", market)
        }
        if (fields != null) {
            queryParams.put("fields", fields)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }
        if (additionalTypes != null) {
            queryParams.put("additional_types", additionalTypes)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    PagingPlaylistTrackObject.class )

    }

    def removeTracksPlaylist ( String playlistId, RemoveTracksPlaylistRequest removeTracksPlaylistRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/playlists/${playlist_id}/tracks"

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
        bodyParams = removeTracksPlaylistRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "DELETE", "",
                    ReorderOrReplacePlaylistsTracks200Response.class )

    }

    def reorderOrReplacePlaylistsTracks ( String playlistId, String uris, Map<String, Object> requestBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/playlists/${playlist_id}/tracks"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (playlistId == null) {
            throw new RuntimeException("missing required params playlistId")
        }

        if (uris != null) {
            queryParams.put("uris", uris)
        }


        contentType = 'application/json';
        bodyParams = requestBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    ReorderOrReplacePlaylistsTracks200Response.class )

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

    def uploadCustomPlaylistCover ( String playlistId, String body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/playlists/${playlist_id}/images"

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
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }



        contentType = 'image/jpeg';
        bodyParams = body


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

}
