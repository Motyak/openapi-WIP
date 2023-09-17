package org.openapitools.api;

import tommy.spotify.ApiUtils
import tommy.spotify.model.CurrentlyPlayingContextObject
import tommy.spotify.model.CurrentlyPlayingObject
import tommy.spotify.model.CursorPagingPlayHistoryObject
import tommy.spotify.model.GetAUsersAvailableDevices200Response
import tommy.spotify.model.GetAnAlbum401Response
import tommy.spotify.model.QueueObject
import tommy.spotify.model.StartAUsersPlaybackRequest
import tommy.spotify.model.TransferAUsersPlaybackRequest

class PlayerApi {
    String basePath = "https://api.spotify.com/v1"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def addToQueue ( String uri, String deviceId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/player/queue"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (uri == null) {
            throw new RuntimeException("missing required params uri")
        }

        if (uri != null) {
            queryParams.put("uri", uri)
        }
        if (deviceId != null) {
            queryParams.put("device_id", deviceId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def getAUsersAvailableDevices ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/player/devices"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    GetAUsersAvailableDevices200Response.class )

    }

    def getInformationAboutTheUsersCurrentPlayback ( String market, String additionalTypes, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/player"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (market != null) {
            queryParams.put("market", market)
        }
        if (additionalTypes != null) {
            queryParams.put("additional_types", additionalTypes)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CurrentlyPlayingContextObject.class )

    }

    def getQueue ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/player/queue"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    QueueObject.class )

    }

    def getRecentlyPlayed ( Integer limit, Integer after, Integer before, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/player/recently-played"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (after != null) {
            queryParams.put("after", after)
        }
        if (before != null) {
            queryParams.put("before", before)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CursorPagingPlayHistoryObject.class )

    }

    def getTheUsersCurrentlyPlayingTrack ( String market, String additionalTypes, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/player/currently-playing"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (market != null) {
            queryParams.put("market", market)
        }
        if (additionalTypes != null) {
            queryParams.put("additional_types", additionalTypes)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    CurrentlyPlayingObject.class )

    }

    def pauseAUsersPlayback ( String deviceId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/player/pause"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (deviceId != null) {
            queryParams.put("device_id", deviceId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def seekToPositionInCurrentlyPlayingTrack ( Integer positionMs, String deviceId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/player/seek"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (positionMs == null) {
            throw new RuntimeException("missing required params positionMs")
        }

        if (positionMs != null) {
            queryParams.put("position_ms", positionMs)
        }
        if (deviceId != null) {
            queryParams.put("device_id", deviceId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def setRepeatModeOnUsersPlayback ( String state, String deviceId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/player/repeat"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (state == null) {
            throw new RuntimeException("missing required params state")
        }

        if (state != null) {
            queryParams.put("state", state)
        }
        if (deviceId != null) {
            queryParams.put("device_id", deviceId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def setVolumeForUsersPlayback ( Integer volumePercent, String deviceId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/player/volume"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (volumePercent == null) {
            throw new RuntimeException("missing required params volumePercent")
        }

        if (volumePercent != null) {
            queryParams.put("volume_percent", volumePercent)
        }
        if (deviceId != null) {
            queryParams.put("device_id", deviceId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def skipUsersPlaybackToNextTrack ( String deviceId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/player/next"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (deviceId != null) {
            queryParams.put("device_id", deviceId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def skipUsersPlaybackToPreviousTrack ( String deviceId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/player/previous"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (deviceId != null) {
            queryParams.put("device_id", deviceId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    null )

    }

    def startAUsersPlayback ( String deviceId, Map<String, Object> requestBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/player/play"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (deviceId != null) {
            queryParams.put("device_id", deviceId)
        }


        contentType = 'application/json';
        bodyParams = requestBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def toggleShuffleForUsersPlayback ( Boolean state, String deviceId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/player/shuffle"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (state == null) {
            throw new RuntimeException("missing required params state")
        }

        if (state != null) {
            queryParams.put("state", state)
        }
        if (deviceId != null) {
            queryParams.put("device_id", deviceId)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

    def transferAUsersPlayback ( Map<String, Object> requestBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/me/player"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType




        contentType = 'application/json';
        bodyParams = requestBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PUT", "",
                    null )

    }

}
