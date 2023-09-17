package org.openapitools.api;

import tommy.spotify.ApiUtils
import tommy.spotify.model.AddTracksToPlaylistRequest
import tommy.spotify.model.AudioAnalysisObject
import tommy.spotify.model.AudioFeaturesObject
import java.math.BigDecimal
import tommy.spotify.model.GetAnAlbum401Response
import tommy.spotify.model.GetAnArtistsTopTracks200Response
import tommy.spotify.model.GetSeveralAudioFeatures200Response
import tommy.spotify.model.PagingPlaylistTrackObject
import tommy.spotify.model.PagingSavedTrackObject
import tommy.spotify.model.PagingSimplifiedTrackObject
import tommy.spotify.model.PagingTrackObject
import tommy.spotify.model.RecommendationsObject
import tommy.spotify.model.RemoveTracksPlaylistRequest
import tommy.spotify.model.ReorderOrReplacePlaylistsTracks200Response
import tommy.spotify.model.ReorderOrReplacePlaylistsTracksRequest
import tommy.spotify.model.SaveAlbumsUserRequest
import tommy.spotify.model.SaveTracksUserRequest
import tommy.spotify.model.TrackObject

class TracksApi {
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

    def getAudioAnalysis ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/audio-analysis/${id}"

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
                    AudioAnalysisObject.class )

    }

    def getAudioFeatures ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/audio-features/${id}"

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
                    AudioFeaturesObject.class )

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

    def getRecommendations ( Integer limit, String market, String seedArtists, String seedGenres, String seedTracks, BigDecimal minAcousticness, BigDecimal maxAcousticness, BigDecimal targetAcousticness, BigDecimal minDanceability, BigDecimal maxDanceability, BigDecimal targetDanceability, Integer minDurationMs, Integer maxDurationMs, Integer targetDurationMs, BigDecimal minEnergy, BigDecimal maxEnergy, BigDecimal targetEnergy, BigDecimal minInstrumentalness, BigDecimal maxInstrumentalness, BigDecimal targetInstrumentalness, Integer minKey, Integer maxKey, Integer targetKey, BigDecimal minLiveness, BigDecimal maxLiveness, BigDecimal targetLiveness, BigDecimal minLoudness, BigDecimal maxLoudness, BigDecimal targetLoudness, Integer minMode, Integer maxMode, Integer targetMode, Integer minPopularity, Integer maxPopularity, Integer targetPopularity, BigDecimal minSpeechiness, BigDecimal maxSpeechiness, BigDecimal targetSpeechiness, BigDecimal minTempo, BigDecimal maxTempo, BigDecimal targetTempo, Integer minTimeSignature, Integer maxTimeSignature, Integer targetTimeSignature, BigDecimal minValence, BigDecimal maxValence, BigDecimal targetValence, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/recommendations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (market != null) {
            queryParams.put("market", market)
        }
        if (seedArtists != null) {
            queryParams.put("seed_artists", seedArtists)
        }
        if (seedGenres != null) {
            queryParams.put("seed_genres", seedGenres)
        }
        if (seedTracks != null) {
            queryParams.put("seed_tracks", seedTracks)
        }
        if (minAcousticness != null) {
            queryParams.put("min_acousticness", minAcousticness)
        }
        if (maxAcousticness != null) {
            queryParams.put("max_acousticness", maxAcousticness)
        }
        if (targetAcousticness != null) {
            queryParams.put("target_acousticness", targetAcousticness)
        }
        if (minDanceability != null) {
            queryParams.put("min_danceability", minDanceability)
        }
        if (maxDanceability != null) {
            queryParams.put("max_danceability", maxDanceability)
        }
        if (targetDanceability != null) {
            queryParams.put("target_danceability", targetDanceability)
        }
        if (minDurationMs != null) {
            queryParams.put("min_duration_ms", minDurationMs)
        }
        if (maxDurationMs != null) {
            queryParams.put("max_duration_ms", maxDurationMs)
        }
        if (targetDurationMs != null) {
            queryParams.put("target_duration_ms", targetDurationMs)
        }
        if (minEnergy != null) {
            queryParams.put("min_energy", minEnergy)
        }
        if (maxEnergy != null) {
            queryParams.put("max_energy", maxEnergy)
        }
        if (targetEnergy != null) {
            queryParams.put("target_energy", targetEnergy)
        }
        if (minInstrumentalness != null) {
            queryParams.put("min_instrumentalness", minInstrumentalness)
        }
        if (maxInstrumentalness != null) {
            queryParams.put("max_instrumentalness", maxInstrumentalness)
        }
        if (targetInstrumentalness != null) {
            queryParams.put("target_instrumentalness", targetInstrumentalness)
        }
        if (minKey != null) {
            queryParams.put("min_key", minKey)
        }
        if (maxKey != null) {
            queryParams.put("max_key", maxKey)
        }
        if (targetKey != null) {
            queryParams.put("target_key", targetKey)
        }
        if (minLiveness != null) {
            queryParams.put("min_liveness", minLiveness)
        }
        if (maxLiveness != null) {
            queryParams.put("max_liveness", maxLiveness)
        }
        if (targetLiveness != null) {
            queryParams.put("target_liveness", targetLiveness)
        }
        if (minLoudness != null) {
            queryParams.put("min_loudness", minLoudness)
        }
        if (maxLoudness != null) {
            queryParams.put("max_loudness", maxLoudness)
        }
        if (targetLoudness != null) {
            queryParams.put("target_loudness", targetLoudness)
        }
        if (minMode != null) {
            queryParams.put("min_mode", minMode)
        }
        if (maxMode != null) {
            queryParams.put("max_mode", maxMode)
        }
        if (targetMode != null) {
            queryParams.put("target_mode", targetMode)
        }
        if (minPopularity != null) {
            queryParams.put("min_popularity", minPopularity)
        }
        if (maxPopularity != null) {
            queryParams.put("max_popularity", maxPopularity)
        }
        if (targetPopularity != null) {
            queryParams.put("target_popularity", targetPopularity)
        }
        if (minSpeechiness != null) {
            queryParams.put("min_speechiness", minSpeechiness)
        }
        if (maxSpeechiness != null) {
            queryParams.put("max_speechiness", maxSpeechiness)
        }
        if (targetSpeechiness != null) {
            queryParams.put("target_speechiness", targetSpeechiness)
        }
        if (minTempo != null) {
            queryParams.put("min_tempo", minTempo)
        }
        if (maxTempo != null) {
            queryParams.put("max_tempo", maxTempo)
        }
        if (targetTempo != null) {
            queryParams.put("target_tempo", targetTempo)
        }
        if (minTimeSignature != null) {
            queryParams.put("min_time_signature", minTimeSignature)
        }
        if (maxTimeSignature != null) {
            queryParams.put("max_time_signature", maxTimeSignature)
        }
        if (targetTimeSignature != null) {
            queryParams.put("target_time_signature", targetTimeSignature)
        }
        if (minValence != null) {
            queryParams.put("min_valence", minValence)
        }
        if (maxValence != null) {
            queryParams.put("max_valence", maxValence)
        }
        if (targetValence != null) {
            queryParams.put("target_valence", targetValence)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    RecommendationsObject.class )

    }

    def getSeveralAudioFeatures ( String ids, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/audio-features"

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
                    GetSeveralAudioFeatures200Response.class )

    }

    def getSeveralTracks ( String ids, String market, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/tracks"

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
                    GetAnArtistsTopTracks200Response.class )

    }

    def getTrack ( String id, String market, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/tracks/${id}"

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
                    TrackObject.class )

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

}
