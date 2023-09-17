# openapi_client.AlbumsApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check_users_saved_albums**](AlbumsApi.md#check_users_saved_albums) | **GET** /me/albums/contains | Check User&#39;s Saved Albums 
[**get_an_album**](AlbumsApi.md#get_an_album) | **GET** /albums/{id} | Get Album 
[**get_an_albums_tracks**](AlbumsApi.md#get_an_albums_tracks) | **GET** /albums/{id}/tracks | Get Album Tracks 
[**get_an_artists_albums**](AlbumsApi.md#get_an_artists_albums) | **GET** /artists/{id}/albums | Get Artist&#39;s Albums 
[**get_multiple_albums**](AlbumsApi.md#get_multiple_albums) | **GET** /albums | Get Several Albums 
[**get_new_releases**](AlbumsApi.md#get_new_releases) | **GET** /browse/new-releases | Get New Releases 
[**get_users_saved_albums**](AlbumsApi.md#get_users_saved_albums) | **GET** /me/albums | Get User&#39;s Saved Albums 
[**remove_albums_user**](AlbumsApi.md#remove_albums_user) | **DELETE** /me/albums | Remove Users&#39; Saved Albums 
[**save_albums_user**](AlbumsApi.md#save_albums_user) | **PUT** /me/albums | Save Albums for Current User 


# **check_users_saved_albums**
> List[bool] check_users_saved_albums(ids)

Check User's Saved Albums 

Check if one or more albums is already saved in the current Spotify user's 'Your Music' library. 

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
    api_instance = openapi_client.AlbumsApi(api_client)
    ids = '382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc' # str | 

    try:
        # Check User's Saved Albums 
        api_response = api_instance.check_users_saved_albums(ids)
        print("The response of AlbumsApi->check_users_saved_albums:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AlbumsApi->check_users_saved_albums: %s\n" % e)
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

# **get_an_album**
> AlbumObject get_an_album(id, market=market)

Get Album 

Get Spotify catalog information for a single album. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.album_object import AlbumObject
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
    api_instance = openapi_client.AlbumsApi(api_client)
    id = '4aawyAB9vmqN3uQ7FjRGTy' # str | 
    market = 'ES' # str |  (optional)

    try:
        # Get Album 
        api_response = api_instance.get_an_album(id, market=market)
        print("The response of AlbumsApi->get_an_album:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AlbumsApi->get_an_album: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **market** | **str**|  | [optional] 

### Return type

[**AlbumObject**](AlbumObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An album |  -  |
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
    api_instance = openapi_client.AlbumsApi(api_client)
    id = '4aawyAB9vmqN3uQ7FjRGTy' # str | 
    market = 'ES' # str |  (optional)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get Album Tracks 
        api_response = api_instance.get_an_albums_tracks(id, market=market, limit=limit, offset=offset)
        print("The response of AlbumsApi->get_an_albums_tracks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AlbumsApi->get_an_albums_tracks: %s\n" % e)
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

# **get_an_artists_albums**
> PagingArtistDiscographyAlbumObject get_an_artists_albums(id, include_groups=include_groups, market=market, limit=limit, offset=offset)

Get Artist's Albums 

Get Spotify catalog information about an artist's albums. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.paging_artist_discography_album_object import PagingArtistDiscographyAlbumObject
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
    api_instance = openapi_client.AlbumsApi(api_client)
    id = '0TnOYISbd1XYRBk9myaseg' # str | 
    include_groups = 'single,appears_on' # str |  (optional)
    market = 'ES' # str |  (optional)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get Artist's Albums 
        api_response = api_instance.get_an_artists_albums(id, include_groups=include_groups, market=market, limit=limit, offset=offset)
        print("The response of AlbumsApi->get_an_artists_albums:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AlbumsApi->get_an_artists_albums: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **include_groups** | **str**|  | [optional] 
 **market** | **str**|  | [optional] 
 **limit** | **int**|  | [optional] [default to 20]
 **offset** | **int**|  | [optional] [default to 0]

### Return type

[**PagingArtistDiscographyAlbumObject**](PagingArtistDiscographyAlbumObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of albums |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_multiple_albums**
> GetMultipleAlbums200Response get_multiple_albums(ids, market=market)

Get Several Albums 

Get Spotify catalog information for multiple albums identified by their Spotify IDs. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.get_multiple_albums200_response import GetMultipleAlbums200Response
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
    api_instance = openapi_client.AlbumsApi(api_client)
    ids = '382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc' # str | 
    market = 'ES' # str |  (optional)

    try:
        # Get Several Albums 
        api_response = api_instance.get_multiple_albums(ids, market=market)
        print("The response of AlbumsApi->get_multiple_albums:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AlbumsApi->get_multiple_albums: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **str**|  | 
 **market** | **str**|  | [optional] 

### Return type

[**GetMultipleAlbums200Response**](GetMultipleAlbums200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of albums |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_new_releases**
> GetNewReleases200Response get_new_releases(country=country, limit=limit, offset=offset)

Get New Releases 

Get a list of new album releases featured in Spotify (shown, for example, on a Spotify player’s “Browse” tab). 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.get_new_releases200_response import GetNewReleases200Response
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
    api_instance = openapi_client.AlbumsApi(api_client)
    country = 'SE' # str |  (optional)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get New Releases 
        api_response = api_instance.get_new_releases(country=country, limit=limit, offset=offset)
        print("The response of AlbumsApi->get_new_releases:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AlbumsApi->get_new_releases: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **str**|  | [optional] 
 **limit** | **int**|  | [optional] [default to 20]
 **offset** | **int**|  | [optional] [default to 0]

### Return type

[**GetNewReleases200Response**](GetNewReleases200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A paged set of albums |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_users_saved_albums**
> PagingSavedAlbumObject get_users_saved_albums(limit=limit, offset=offset, market=market)

Get User's Saved Albums 

Get a list of the albums saved in the current Spotify user's 'Your Music' library. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.paging_saved_album_object import PagingSavedAlbumObject
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
    api_instance = openapi_client.AlbumsApi(api_client)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)
    market = 'ES' # str |  (optional)

    try:
        # Get User's Saved Albums 
        api_response = api_instance.get_users_saved_albums(limit=limit, offset=offset, market=market)
        print("The response of AlbumsApi->get_users_saved_albums:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AlbumsApi->get_users_saved_albums: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**|  | [optional] [default to 20]
 **offset** | **int**|  | [optional] [default to 0]
 **market** | **str**|  | [optional] 

### Return type

[**PagingSavedAlbumObject**](PagingSavedAlbumObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of albums |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_albums_user**
> remove_albums_user(ids, request_body=request_body)

Remove Users' Saved Albums 

Remove one or more albums from the current user's 'Your Music' library. 

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
    api_instance = openapi_client.AlbumsApi(api_client)
    ids = '382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc' # str | 
    request_body = None # Dict[str, object] |  (optional)

    try:
        # Remove Users' Saved Albums 
        api_instance.remove_albums_user(ids, request_body=request_body)
    except Exception as e:
        print("Exception when calling AlbumsApi->remove_albums_user: %s\n" % e)
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
**200** | Album(s) have been removed from the library |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_albums_user**
> save_albums_user(ids, request_body=request_body)

Save Albums for Current User 

Save one or more albums to the current user's 'Your Music' library. 

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
    api_instance = openapi_client.AlbumsApi(api_client)
    ids = '382ObEPsp2rxGrnsizN5TX,1A2GTWGtFfWp7KSQTwWOyo,2noRn2Aes5aoNVsU6iWThc' # str | 
    request_body = None # Dict[str, object] |  (optional)

    try:
        # Save Albums for Current User 
        api_instance.save_albums_user(ids, request_body=request_body)
    except Exception as e:
        print("Exception when calling AlbumsApi->save_albums_user: %s\n" % e)
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
**200** | The album is saved |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

