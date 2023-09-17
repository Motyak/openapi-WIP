# openapi_client.TracksApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_tracks_to_playlist**](TracksApi.md#add_tracks_to_playlist) | **POST** /playlists/{playlist_id}/tracks | Add Items to Playlist 
[**check_users_saved_tracks**](TracksApi.md#check_users_saved_tracks) | **GET** /me/tracks/contains | Check User&#39;s Saved Tracks 
[**get_an_albums_tracks**](TracksApi.md#get_an_albums_tracks) | **GET** /albums/{id}/tracks | Get Album Tracks 
[**get_an_artists_top_tracks**](TracksApi.md#get_an_artists_top_tracks) | **GET** /artists/{id}/top-tracks | Get Artist&#39;s Top Tracks 
[**get_audio_analysis**](TracksApi.md#get_audio_analysis) | **GET** /audio-analysis/{id} | Get Track&#39;s Audio Analysis 
[**get_audio_features**](TracksApi.md#get_audio_features) | **GET** /audio-features/{id} | Get Track&#39;s Audio Features 
[**get_playlists_tracks**](TracksApi.md#get_playlists_tracks) | **GET** /playlists/{playlist_id}/tracks | Get Playlist Items 
[**get_recommendations**](TracksApi.md#get_recommendations) | **GET** /recommendations | Get Recommendations 
[**get_several_audio_features**](TracksApi.md#get_several_audio_features) | **GET** /audio-features | Get Tracks&#39; Audio Features 
[**get_several_tracks**](TracksApi.md#get_several_tracks) | **GET** /tracks | Get Several Tracks 
[**get_track**](TracksApi.md#get_track) | **GET** /tracks/{id} | Get Track 
[**get_users_saved_tracks**](TracksApi.md#get_users_saved_tracks) | **GET** /me/tracks | Get User&#39;s Saved Tracks 
[**get_users_top_tracks**](TracksApi.md#get_users_top_tracks) | **GET** /me/top/tracks | Get User&#39;s Top Tracks 
[**remove_tracks_playlist**](TracksApi.md#remove_tracks_playlist) | **DELETE** /playlists/{playlist_id}/tracks | Remove Playlist Items 
[**remove_tracks_user**](TracksApi.md#remove_tracks_user) | **DELETE** /me/tracks | Remove User&#39;s Saved Tracks 
[**reorder_or_replace_playlists_tracks**](TracksApi.md#reorder_or_replace_playlists_tracks) | **PUT** /playlists/{playlist_id}/tracks | Update Playlist Items 
[**save_tracks_user**](TracksApi.md#save_tracks_user) | **PUT** /me/tracks | Save Tracks for Current User 


# **add_tracks_to_playlist**
> ReorderOrReplacePlaylistsTracks200Response add_tracks_to_playlist(playlist_id, position=position, uris=uris, request_body=request_body)

Add Items to Playlist 

Add one or more items to a user's playlist. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.reorder_or_replace_playlists_tracks200_response import ReorderOrReplacePlaylistsTracks200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    playlist_id = '3cEYpjA9oz9GiPac4AsH4n' # str | 
    position = 0 # int |  (optional)
    uris = 'spotify:track:4iV5W9uYEdYUVa79Axb7Rh,spotify:track:1301WleyT98MSxVHPZCA6M' # str |  (optional)
    request_body = None # Dict[str, object] |  (optional)

    try:
        # Add Items to Playlist 
        api_response = api_instance.add_tracks_to_playlist(playlist_id, position=position, uris=uris, request_body=request_body)
        print("The response of TracksApi->add_tracks_to_playlist:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TracksApi->add_tracks_to_playlist: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlist_id** | **str**|  | 
 **position** | **int**|  | [optional] 
 **uris** | **str**|  | [optional] 
 **request_body** | [**Dict[str, object]**](object.md)|  | [optional] 

### Return type

[**ReorderOrReplacePlaylistsTracks200Response**](ReorderOrReplacePlaylistsTracks200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A snapshot ID for the playlist |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **check_users_saved_tracks**
> List[bool] check_users_saved_tracks(ids)

Check User's Saved Tracks 

Check if one or more tracks is already saved in the current Spotify user's 'Your Music' library. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    ids = '7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B' # str | 

    try:
        # Check User's Saved Tracks 
        api_response = api_instance.check_users_saved_tracks(ids)
        print("The response of TracksApi->check_users_saved_tracks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TracksApi->check_users_saved_tracks: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **str**|  | 

### Return type

**List[bool]**

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Array of booleans |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_an_albums_tracks**
> PagingSimplifiedTrackObject get_an_albums_tracks(id, market=market, limit=limit, offset=offset)

Get Album Tracks 

Get Spotify catalog information about an album’s tracks. Optional parameters can be used to limit the number of tracks returned. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.paging_simplified_track_object import PagingSimplifiedTrackObject
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    id = '4aawyAB9vmqN3uQ7FjRGTy' # str | 
    market = 'ES' # str |  (optional)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get Album Tracks 
        api_response = api_instance.get_an_albums_tracks(id, market=market, limit=limit, offset=offset)
        print("The response of TracksApi->get_an_albums_tracks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TracksApi->get_an_albums_tracks: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **market** | **str**|  | [optional] 
 **limit** | **int**|  | [optional] [default to 20]
 **offset** | **int**|  | [optional] [default to 0]

### Return type

[**PagingSimplifiedTrackObject**](PagingSimplifiedTrackObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of tracks |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_an_artists_top_tracks**
> GetAnArtistsTopTracks200Response get_an_artists_top_tracks(id, market=market)

Get Artist's Top Tracks 

Get Spotify catalog information about an artist's top tracks by country. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.get_an_artists_top_tracks200_response import GetAnArtistsTopTracks200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    id = '0TnOYISbd1XYRBk9myaseg' # str | 
    market = 'ES' # str |  (optional)

    try:
        # Get Artist's Top Tracks 
        api_response = api_instance.get_an_artists_top_tracks(id, market=market)
        print("The response of TracksApi->get_an_artists_top_tracks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TracksApi->get_an_artists_top_tracks: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **market** | **str**|  | [optional] 

### Return type

[**GetAnArtistsTopTracks200Response**](GetAnArtistsTopTracks200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of tracks |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_audio_analysis**
> AudioAnalysisObject get_audio_analysis(id)

Get Track's Audio Analysis 

Get a low-level audio analysis for a track in the Spotify catalog. The audio analysis describes the track’s structure and musical content, including rhythm, pitch, and timbre. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.audio_analysis_object import AudioAnalysisObject
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    id = '11dFghVXANMlKmJXsNCbNl' # str | 

    try:
        # Get Track's Audio Analysis 
        api_response = api_instance.get_audio_analysis(id)
        print("The response of TracksApi->get_audio_analysis:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TracksApi->get_audio_analysis: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 

### Return type

[**AudioAnalysisObject**](AudioAnalysisObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Audio analysis for one track |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_audio_features**
> AudioFeaturesObject get_audio_features(id)

Get Track's Audio Features 

Get audio feature information for a single track identified by its unique Spotify ID. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.audio_features_object import AudioFeaturesObject
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    id = '11dFghVXANMlKmJXsNCbNl' # str | 

    try:
        # Get Track's Audio Features 
        api_response = api_instance.get_audio_features(id)
        print("The response of TracksApi->get_audio_features:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TracksApi->get_audio_features: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 

### Return type

[**AudioFeaturesObject**](AudioFeaturesObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Audio features for one track |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_playlists_tracks**
> PagingPlaylistTrackObject get_playlists_tracks(playlist_id, market=market, fields=fields, limit=limit, offset=offset, additional_types=additional_types)

Get Playlist Items 

Get full details of the items of a playlist owned by a Spotify user. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.paging_playlist_track_object import PagingPlaylistTrackObject
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    playlist_id = '3cEYpjA9oz9GiPac4AsH4n' # str | 
    market = 'ES' # str |  (optional)
    fields = 'items(added_by.id,track(name,href,album(name,href)))' # str |  (optional)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)
    additional_types = 'additional_types_example' # str |  (optional)

    try:
        # Get Playlist Items 
        api_response = api_instance.get_playlists_tracks(playlist_id, market=market, fields=fields, limit=limit, offset=offset, additional_types=additional_types)
        print("The response of TracksApi->get_playlists_tracks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TracksApi->get_playlists_tracks: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlist_id** | **str**|  | 
 **market** | **str**|  | [optional] 
 **fields** | **str**|  | [optional] 
 **limit** | **int**|  | [optional] [default to 20]
 **offset** | **int**|  | [optional] [default to 0]
 **additional_types** | **str**|  | [optional] 

### Return type

[**PagingPlaylistTrackObject**](PagingPlaylistTrackObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of tracks |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_recommendations**
> RecommendationsObject get_recommendations(limit=limit, market=market, seed_artists=seed_artists, seed_genres=seed_genres, seed_tracks=seed_tracks, min_acousticness=min_acousticness, max_acousticness=max_acousticness, target_acousticness=target_acousticness, min_danceability=min_danceability, max_danceability=max_danceability, target_danceability=target_danceability, min_duration_ms=min_duration_ms, max_duration_ms=max_duration_ms, target_duration_ms=target_duration_ms, min_energy=min_energy, max_energy=max_energy, target_energy=target_energy, min_instrumentalness=min_instrumentalness, max_instrumentalness=max_instrumentalness, target_instrumentalness=target_instrumentalness, min_key=min_key, max_key=max_key, target_key=target_key, min_liveness=min_liveness, max_liveness=max_liveness, target_liveness=target_liveness, min_loudness=min_loudness, max_loudness=max_loudness, target_loudness=target_loudness, min_mode=min_mode, max_mode=max_mode, target_mode=target_mode, min_popularity=min_popularity, max_popularity=max_popularity, target_popularity=target_popularity, min_speechiness=min_speechiness, max_speechiness=max_speechiness, target_speechiness=target_speechiness, min_tempo=min_tempo, max_tempo=max_tempo, target_tempo=target_tempo, min_time_signature=min_time_signature, max_time_signature=max_time_signature, target_time_signature=target_time_signature, min_valence=min_valence, max_valence=max_valence, target_valence=target_valence)

Get Recommendations 

Recommendations are generated based on the available information for a given seed entity and matched against similar artists and tracks. If there is sufficient information about the provided seeds, a list of tracks will be returned together with pool size details.  For artists and tracks that are very new or obscure there might not be enough data to generate a list of tracks. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.recommendations_object import RecommendationsObject
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    limit = 20 # int |  (optional) (default to 20)
    market = 'ES' # str |  (optional)
    seed_artists = '4NHQUGzhtTLFvgF5SZesLK' # str |  (optional)
    seed_genres = 'classical,country' # str |  (optional)
    seed_tracks = '0c6xIDDpzE81m2q797ordA' # str |  (optional)
    min_acousticness = 3.4 # float |  (optional)
    max_acousticness = 3.4 # float |  (optional)
    target_acousticness = 3.4 # float |  (optional)
    min_danceability = 3.4 # float |  (optional)
    max_danceability = 3.4 # float |  (optional)
    target_danceability = 3.4 # float |  (optional)
    min_duration_ms = 56 # int |  (optional)
    max_duration_ms = 56 # int |  (optional)
    target_duration_ms = 56 # int |  (optional)
    min_energy = 3.4 # float |  (optional)
    max_energy = 3.4 # float |  (optional)
    target_energy = 3.4 # float |  (optional)
    min_instrumentalness = 3.4 # float |  (optional)
    max_instrumentalness = 3.4 # float |  (optional)
    target_instrumentalness = 3.4 # float |  (optional)
    min_key = 56 # int |  (optional)
    max_key = 56 # int |  (optional)
    target_key = 56 # int |  (optional)
    min_liveness = 3.4 # float |  (optional)
    max_liveness = 3.4 # float |  (optional)
    target_liveness = 3.4 # float |  (optional)
    min_loudness = 3.4 # float |  (optional)
    max_loudness = 3.4 # float |  (optional)
    target_loudness = 3.4 # float |  (optional)
    min_mode = 56 # int |  (optional)
    max_mode = 56 # int |  (optional)
    target_mode = 56 # int |  (optional)
    min_popularity = 56 # int |  (optional)
    max_popularity = 56 # int |  (optional)
    target_popularity = 56 # int |  (optional)
    min_speechiness = 3.4 # float |  (optional)
    max_speechiness = 3.4 # float |  (optional)
    target_speechiness = 3.4 # float |  (optional)
    min_tempo = 3.4 # float |  (optional)
    max_tempo = 3.4 # float |  (optional)
    target_tempo = 3.4 # float |  (optional)
    min_time_signature = 56 # int |  (optional)
    max_time_signature = 56 # int |  (optional)
    target_time_signature = 56 # int |  (optional)
    min_valence = 3.4 # float |  (optional)
    max_valence = 3.4 # float |  (optional)
    target_valence = 3.4 # float |  (optional)

    try:
        # Get Recommendations 
        api_response = api_instance.get_recommendations(limit=limit, market=market, seed_artists=seed_artists, seed_genres=seed_genres, seed_tracks=seed_tracks, min_acousticness=min_acousticness, max_acousticness=max_acousticness, target_acousticness=target_acousticness, min_danceability=min_danceability, max_danceability=max_danceability, target_danceability=target_danceability, min_duration_ms=min_duration_ms, max_duration_ms=max_duration_ms, target_duration_ms=target_duration_ms, min_energy=min_energy, max_energy=max_energy, target_energy=target_energy, min_instrumentalness=min_instrumentalness, max_instrumentalness=max_instrumentalness, target_instrumentalness=target_instrumentalness, min_key=min_key, max_key=max_key, target_key=target_key, min_liveness=min_liveness, max_liveness=max_liveness, target_liveness=target_liveness, min_loudness=min_loudness, max_loudness=max_loudness, target_loudness=target_loudness, min_mode=min_mode, max_mode=max_mode, target_mode=target_mode, min_popularity=min_popularity, max_popularity=max_popularity, target_popularity=target_popularity, min_speechiness=min_speechiness, max_speechiness=max_speechiness, target_speechiness=target_speechiness, min_tempo=min_tempo, max_tempo=max_tempo, target_tempo=target_tempo, min_time_signature=min_time_signature, max_time_signature=max_time_signature, target_time_signature=target_time_signature, min_valence=min_valence, max_valence=max_valence, target_valence=target_valence)
        print("The response of TracksApi->get_recommendations:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TracksApi->get_recommendations: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**|  | [optional] [default to 20]
 **market** | **str**|  | [optional] 
 **seed_artists** | **str**|  | [optional] 
 **seed_genres** | **str**|  | [optional] 
 **seed_tracks** | **str**|  | [optional] 
 **min_acousticness** | **float**|  | [optional] 
 **max_acousticness** | **float**|  | [optional] 
 **target_acousticness** | **float**|  | [optional] 
 **min_danceability** | **float**|  | [optional] 
 **max_danceability** | **float**|  | [optional] 
 **target_danceability** | **float**|  | [optional] 
 **min_duration_ms** | **int**|  | [optional] 
 **max_duration_ms** | **int**|  | [optional] 
 **target_duration_ms** | **int**|  | [optional] 
 **min_energy** | **float**|  | [optional] 
 **max_energy** | **float**|  | [optional] 
 **target_energy** | **float**|  | [optional] 
 **min_instrumentalness** | **float**|  | [optional] 
 **max_instrumentalness** | **float**|  | [optional] 
 **target_instrumentalness** | **float**|  | [optional] 
 **min_key** | **int**|  | [optional] 
 **max_key** | **int**|  | [optional] 
 **target_key** | **int**|  | [optional] 
 **min_liveness** | **float**|  | [optional] 
 **max_liveness** | **float**|  | [optional] 
 **target_liveness** | **float**|  | [optional] 
 **min_loudness** | **float**|  | [optional] 
 **max_loudness** | **float**|  | [optional] 
 **target_loudness** | **float**|  | [optional] 
 **min_mode** | **int**|  | [optional] 
 **max_mode** | **int**|  | [optional] 
 **target_mode** | **int**|  | [optional] 
 **min_popularity** | **int**|  | [optional] 
 **max_popularity** | **int**|  | [optional] 
 **target_popularity** | **int**|  | [optional] 
 **min_speechiness** | **float**|  | [optional] 
 **max_speechiness** | **float**|  | [optional] 
 **target_speechiness** | **float**|  | [optional] 
 **min_tempo** | **float**|  | [optional] 
 **max_tempo** | **float**|  | [optional] 
 **target_tempo** | **float**|  | [optional] 
 **min_time_signature** | **int**|  | [optional] 
 **max_time_signature** | **int**|  | [optional] 
 **target_time_signature** | **int**|  | [optional] 
 **min_valence** | **float**|  | [optional] 
 **max_valence** | **float**|  | [optional] 
 **target_valence** | **float**|  | [optional] 

### Return type

[**RecommendationsObject**](RecommendationsObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of recommendations |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_several_audio_features**
> GetSeveralAudioFeatures200Response get_several_audio_features(ids)

Get Tracks' Audio Features 

Get audio features for multiple tracks based on their Spotify IDs. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.get_several_audio_features200_response import GetSeveralAudioFeatures200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    ids = '7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B' # str | 

    try:
        # Get Tracks' Audio Features 
        api_response = api_instance.get_several_audio_features(ids)
        print("The response of TracksApi->get_several_audio_features:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TracksApi->get_several_audio_features: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **str**|  | 

### Return type

[**GetSeveralAudioFeatures200Response**](GetSeveralAudioFeatures200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of audio features |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_several_tracks**
> GetAnArtistsTopTracks200Response get_several_tracks(ids, market=market)

Get Several Tracks 

Get Spotify catalog information for multiple tracks based on their Spotify IDs. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.get_an_artists_top_tracks200_response import GetAnArtistsTopTracks200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    ids = '7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B' # str | 
    market = 'ES' # str |  (optional)

    try:
        # Get Several Tracks 
        api_response = api_instance.get_several_tracks(ids, market=market)
        print("The response of TracksApi->get_several_tracks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TracksApi->get_several_tracks: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **str**|  | 
 **market** | **str**|  | [optional] 

### Return type

[**GetAnArtistsTopTracks200Response**](GetAnArtistsTopTracks200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of tracks |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_track**
> TrackObject get_track(id, market=market)

Get Track 

Get Spotify catalog information for a single track identified by its unique Spotify ID. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.track_object import TrackObject
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    id = '11dFghVXANMlKmJXsNCbNl' # str | 
    market = 'ES' # str |  (optional)

    try:
        # Get Track 
        api_response = api_instance.get_track(id, market=market)
        print("The response of TracksApi->get_track:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TracksApi->get_track: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **market** | **str**|  | [optional] 

### Return type

[**TrackObject**](TrackObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A track |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_users_saved_tracks**
> PagingSavedTrackObject get_users_saved_tracks(market=market, limit=limit, offset=offset)

Get User's Saved Tracks 

Get a list of the songs saved in the current Spotify user's 'Your Music' library. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.paging_saved_track_object import PagingSavedTrackObject
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    market = 'ES' # str |  (optional)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get User's Saved Tracks 
        api_response = api_instance.get_users_saved_tracks(market=market, limit=limit, offset=offset)
        print("The response of TracksApi->get_users_saved_tracks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TracksApi->get_users_saved_tracks: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **str**|  | [optional] 
 **limit** | **int**|  | [optional] [default to 20]
 **offset** | **int**|  | [optional] [default to 0]

### Return type

[**PagingSavedTrackObject**](PagingSavedTrackObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of tracks |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_users_top_tracks**
> PagingTrackObject get_users_top_tracks(time_range=time_range, limit=limit, offset=offset)

Get User's Top Tracks 

Get the current user's top tracks based on calculated affinity. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.paging_track_object import PagingTrackObject
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    time_range = 'medium_term' # str |  (optional) (default to 'medium_term')
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get User's Top Tracks 
        api_response = api_instance.get_users_top_tracks(time_range=time_range, limit=limit, offset=offset)
        print("The response of TracksApi->get_users_top_tracks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TracksApi->get_users_top_tracks: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **time_range** | **str**|  | [optional] [default to &#39;medium_term&#39;]
 **limit** | **int**|  | [optional] [default to 20]
 **offset** | **int**|  | [optional] [default to 0]

### Return type

[**PagingTrackObject**](PagingTrackObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of tracks |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_tracks_playlist**
> ReorderOrReplacePlaylistsTracks200Response remove_tracks_playlist(playlist_id, remove_tracks_playlist_request=remove_tracks_playlist_request)

Remove Playlist Items 

Remove one or more items from a user's playlist. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.remove_tracks_playlist_request import RemoveTracksPlaylistRequest
from openapi_client.models.reorder_or_replace_playlists_tracks200_response import ReorderOrReplacePlaylistsTracks200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    playlist_id = '3cEYpjA9oz9GiPac4AsH4n' # str | 
    remove_tracks_playlist_request = openapi_client.RemoveTracksPlaylistRequest() # RemoveTracksPlaylistRequest |  (optional)

    try:
        # Remove Playlist Items 
        api_response = api_instance.remove_tracks_playlist(playlist_id, remove_tracks_playlist_request=remove_tracks_playlist_request)
        print("The response of TracksApi->remove_tracks_playlist:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TracksApi->remove_tracks_playlist: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlist_id** | **str**|  | 
 **remove_tracks_playlist_request** | [**RemoveTracksPlaylistRequest**](RemoveTracksPlaylistRequest.md)|  | [optional] 

### Return type

[**ReorderOrReplacePlaylistsTracks200Response**](ReorderOrReplacePlaylistsTracks200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A snapshot ID for the playlist |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_tracks_user**
> remove_tracks_user(ids, request_body=request_body)

Remove User's Saved Tracks 

Remove one or more tracks from the current user's 'Your Music' library. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    ids = '7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B' # str | 
    request_body = None # Dict[str, object] |  (optional)

    try:
        # Remove User's Saved Tracks 
        api_instance.remove_tracks_user(ids, request_body=request_body)
    except Exception as e:
        print("Exception when calling TracksApi->remove_tracks_user: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **str**|  | 
 **request_body** | [**Dict[str, object]**](object.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Track removed |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reorder_or_replace_playlists_tracks**
> ReorderOrReplacePlaylistsTracks200Response reorder_or_replace_playlists_tracks(playlist_id, uris=uris, request_body=request_body)

Update Playlist Items 

Either reorder or replace items in a playlist depending on the request's parameters. To reorder items, include `range_start`, `insert_before`, `range_length` and `snapshot_id` in the request's body. To replace items, include `uris` as either a query parameter or in the request's body. Replacing items in a playlist will overwrite its existing items. This operation can be used for replacing or clearing items in a playlist. <br/> **Note**: Replace and reorder are mutually exclusive operations which share the same endpoint, but have different parameters. These operations can't be applied together in a single request. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.reorder_or_replace_playlists_tracks200_response import ReorderOrReplacePlaylistsTracks200Response
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    playlist_id = '3cEYpjA9oz9GiPac4AsH4n' # str | 
    uris = 'uris_example' # str |  (optional)
    request_body = None # Dict[str, object] |  (optional)

    try:
        # Update Playlist Items 
        api_response = api_instance.reorder_or_replace_playlists_tracks(playlist_id, uris=uris, request_body=request_body)
        print("The response of TracksApi->reorder_or_replace_playlists_tracks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TracksApi->reorder_or_replace_playlists_tracks: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlist_id** | **str**|  | 
 **uris** | **str**|  | [optional] 
 **request_body** | [**Dict[str, object]**](object.md)|  | [optional] 

### Return type

[**ReorderOrReplacePlaylistsTracks200Response**](ReorderOrReplacePlaylistsTracks200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A snapshot ID for the playlist |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_tracks_user**
> save_tracks_user(ids, request_body=request_body)

Save Tracks for Current User 

Save one or more tracks to the current user's 'Your Music' library. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.spotify.com/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.spotify.com/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.TracksApi(api_client)
    ids = '7ouMYWpwJ422jRcDASZB7P,4VqPOruhp5EdPBeR92t6lQ,2takcwOaAZWiXQijPHIx7B' # str | 
    request_body = None # Dict[str, object] |  (optional)

    try:
        # Save Tracks for Current User 
        api_instance.save_tracks_user(ids, request_body=request_body)
    except Exception as e:
        print("Exception when calling TracksApi->save_tracks_user: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **str**|  | 
 **request_body** | [**Dict[str, object]**](object.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Track saved |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

