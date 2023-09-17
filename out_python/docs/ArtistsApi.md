# openapi_client.ArtistsApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check_current_user_follows**](ArtistsApi.md#check_current_user_follows) | **GET** /me/following/contains | Check If User Follows Artists or Users 
[**follow_artists_users**](ArtistsApi.md#follow_artists_users) | **PUT** /me/following | Follow Artists or Users 
[**get_an_artist**](ArtistsApi.md#get_an_artist) | **GET** /artists/{id} | Get Artist 
[**get_an_artists_albums**](ArtistsApi.md#get_an_artists_albums) | **GET** /artists/{id}/albums | Get Artist&#39;s Albums 
[**get_an_artists_related_artists**](ArtistsApi.md#get_an_artists_related_artists) | **GET** /artists/{id}/related-artists | Get Artist&#39;s Related Artists 
[**get_an_artists_top_tracks**](ArtistsApi.md#get_an_artists_top_tracks) | **GET** /artists/{id}/top-tracks | Get Artist&#39;s Top Tracks 
[**get_followed**](ArtistsApi.md#get_followed) | **GET** /me/following | Get Followed Artists 
[**get_multiple_artists**](ArtistsApi.md#get_multiple_artists) | **GET** /artists | Get Several Artists 
[**get_users_top_artists**](ArtistsApi.md#get_users_top_artists) | **GET** /me/top/artists | Get User&#39;s Top Artists 
[**unfollow_artists_users**](ArtistsApi.md#unfollow_artists_users) | **DELETE** /me/following | Unfollow Artists or Users 


# **check_current_user_follows**
> List[bool] check_current_user_follows(type, ids)

Check If User Follows Artists or Users 

Check to see if the current user is following one or more artists or other Spotify users. 

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
    api_instance = openapi_client.ArtistsApi(api_client)
    type = 'artist' # str | 
    ids = '2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6' # str | 

    try:
        # Check If User Follows Artists or Users 
        api_response = api_instance.check_current_user_follows(type, ids)
        print("The response of ArtistsApi->check_current_user_follows:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ArtistsApi->check_current_user_follows: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**|  | 
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

# **follow_artists_users**
> follow_artists_users(type, ids, request_body=request_body)

Follow Artists or Users 

Add the current user as a follower of one or more artists or other Spotify users. 

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
    api_instance = openapi_client.ArtistsApi(api_client)
    type = 'artist' # str | 
    ids = '2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6' # str | 
    request_body = None # Dict[str, object] |  (optional)

    try:
        # Follow Artists or Users 
        api_instance.follow_artists_users(type, ids, request_body=request_body)
    except Exception as e:
        print("Exception when calling ArtistsApi->follow_artists_users: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**|  | 
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
**204** | Artist or user followed |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_an_artist**
> ArtistObject get_an_artist(id)

Get Artist 

Get Spotify catalog information for a single artist identified by their unique Spotify ID. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.artist_object import ArtistObject
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
    api_instance = openapi_client.ArtistsApi(api_client)
    id = '0TnOYISbd1XYRBk9myaseg' # str | 

    try:
        # Get Artist 
        api_response = api_instance.get_an_artist(id)
        print("The response of ArtistsApi->get_an_artist:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ArtistsApi->get_an_artist: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 

### Return type

[**ArtistObject**](ArtistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An artist |  -  |
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
    api_instance = openapi_client.ArtistsApi(api_client)
    id = '0TnOYISbd1XYRBk9myaseg' # str | 
    include_groups = 'single,appears_on' # str |  (optional)
    market = 'ES' # str |  (optional)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get Artist's Albums 
        api_response = api_instance.get_an_artists_albums(id, include_groups=include_groups, market=market, limit=limit, offset=offset)
        print("The response of ArtistsApi->get_an_artists_albums:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ArtistsApi->get_an_artists_albums: %s\n" % e)
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

# **get_an_artists_related_artists**
> GetMultipleArtists200Response get_an_artists_related_artists(id)

Get Artist's Related Artists 

Get Spotify catalog information about artists similar to a given artist. Similarity is based on analysis of the Spotify community's listening history. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.get_multiple_artists200_response import GetMultipleArtists200Response
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
    api_instance = openapi_client.ArtistsApi(api_client)
    id = '0TnOYISbd1XYRBk9myaseg' # str | 

    try:
        # Get Artist's Related Artists 
        api_response = api_instance.get_an_artists_related_artists(id)
        print("The response of ArtistsApi->get_an_artists_related_artists:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ArtistsApi->get_an_artists_related_artists: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 

### Return type

[**GetMultipleArtists200Response**](GetMultipleArtists200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of artists |  -  |
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
    api_instance = openapi_client.ArtistsApi(api_client)
    id = '0TnOYISbd1XYRBk9myaseg' # str | 
    market = 'ES' # str |  (optional)

    try:
        # Get Artist's Top Tracks 
        api_response = api_instance.get_an_artists_top_tracks(id, market=market)
        print("The response of ArtistsApi->get_an_artists_top_tracks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ArtistsApi->get_an_artists_top_tracks: %s\n" % e)
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

# **get_followed**
> GetFollowed200Response get_followed(type, after=after, limit=limit)

Get Followed Artists 

Get the current user's followed artists. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.get_followed200_response import GetFollowed200Response
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
    api_instance = openapi_client.ArtistsApi(api_client)
    type = 'artist' # str | 
    after = '0I2XqVXqHScXjHhk6AYYRe' # str |  (optional)
    limit = 20 # int |  (optional) (default to 20)

    try:
        # Get Followed Artists 
        api_response = api_instance.get_followed(type, after=after, limit=limit)
        print("The response of ArtistsApi->get_followed:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ArtistsApi->get_followed: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**|  | 
 **after** | **str**|  | [optional] 
 **limit** | **int**|  | [optional] [default to 20]

### Return type

[**GetFollowed200Response**](GetFollowed200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A paged set of artists |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_multiple_artists**
> GetMultipleArtists200Response get_multiple_artists(ids)

Get Several Artists 

Get Spotify catalog information for several artists based on their Spotify IDs. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.get_multiple_artists200_response import GetMultipleArtists200Response
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
    api_instance = openapi_client.ArtistsApi(api_client)
    ids = '2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6' # str | 

    try:
        # Get Several Artists 
        api_response = api_instance.get_multiple_artists(ids)
        print("The response of ArtistsApi->get_multiple_artists:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ArtistsApi->get_multiple_artists: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **str**|  | 

### Return type

[**GetMultipleArtists200Response**](GetMultipleArtists200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of artists |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_users_top_artists**
> PagingArtistObject get_users_top_artists(time_range=time_range, limit=limit, offset=offset)

Get User's Top Artists 

Get the current user's top artists based on calculated affinity. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.paging_artist_object import PagingArtistObject
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
    api_instance = openapi_client.ArtistsApi(api_client)
    time_range = 'medium_term' # str |  (optional) (default to 'medium_term')
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get User's Top Artists 
        api_response = api_instance.get_users_top_artists(time_range=time_range, limit=limit, offset=offset)
        print("The response of ArtistsApi->get_users_top_artists:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ArtistsApi->get_users_top_artists: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **time_range** | **str**|  | [optional] [default to &#39;medium_term&#39;]
 **limit** | **int**|  | [optional] [default to 20]
 **offset** | **int**|  | [optional] [default to 0]

### Return type

[**PagingArtistObject**](PagingArtistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of artists |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unfollow_artists_users**
> unfollow_artists_users(type, ids, request_body=request_body)

Unfollow Artists or Users 

Remove the current user as a follower of one or more artists or other Spotify users. 

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
    api_instance = openapi_client.ArtistsApi(api_client)
    type = 'artist' # str | 
    ids = '2CIMQHirSU0MQqyYHq0eOx,57dN52uHvrHOxijzpIgu3E,1vCWHaC5f2uS3yhpwWbIA6' # str | 
    request_body = None # Dict[str, object] |  (optional)

    try:
        # Unfollow Artists or Users 
        api_instance.unfollow_artists_users(type, ids, request_body=request_body)
    except Exception as e:
        print("Exception when calling ArtistsApi->unfollow_artists_users: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **str**|  | 
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
**200** | Artist or user unfollowed |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

