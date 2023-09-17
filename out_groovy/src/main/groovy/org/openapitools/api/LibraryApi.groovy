package org.openapitools.api;

import tommy.spotify.ApiUtils
import tommy.spotify.model.ChangePlaylistDetailsRequest
import tommy.spotify.model.CreatePlaylistRequest
import tommy.spotify.model.FollowArtistsUsersRequest
import tommy.spotify.model.GetAnAlbum401Response
import tommy.spotify.model.GetFollowed200Response
import tommy.spotify.model.PagingArtistObject
import tommy.spotify.model.PagingPlaylistObject
import tommy.spotify.model.PagingSavedAlbumObject
import tommy.spotify.model.PagingSavedAudiobookObject
import tommy.spotify.model.PagingSavedEpisodeObject
import tommy.spotify.model.PagingSavedShowObject
import tommy.spotify.model.PagingSavedTrackObject
import tommy.spotify.model.PagingTrackObject
import tommy.spotify.model.PlaylistObject
import tommy.spotify.model.RemoveEpisodesUserRequest
import tommy.spotify.model.SaveAlbumsUserRequest
import tommy.spotify.model.SaveEpisodesUserRequest
import tommy.spotify.model.SaveShowsUserRequest
import tommy.spotify.model.SaveTracksUserRequest
import tommy.spotify.model.UnfollowArtistsUsersRequest

class LibraryApi {
    String basePath = "https://api.spotify.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

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

    def checkUsersSavedEpisodes ( String ids, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/episodes/contains"

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

    def checkUsersSavedTracks ( String ids, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/tracks/contains"

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

    def getUsersSavedEpisodes ( String market, Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/episodes"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


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
                    PagingSavedEpisodeObject.class )

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

    def getUsersSavedTracks ( String market, Integer limit, Integer offset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/tracks"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


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
                    PagingSavedTrackObject.class )

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

    def removeEpisodesUser ( String ids, Map<String, Object> requestBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/episodes"

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

    def removeTracksUser ( String ids, Map<String, Object> requestBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/tracks"

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

    def saveEpisodesUser ( String ids, Map<String, Object> requestBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/episodes"

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

    def saveTracksUser ( String ids, Map<String, Object> requestBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/tracks"

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
