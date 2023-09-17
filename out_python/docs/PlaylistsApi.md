# openapi_client.PlaylistsApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_tracks_to_playlist**](PlaylistsApi.md#add_tracks_to_playlist) | **POST** /playlists/{playlist_id}/tracks | Add Items to Playlist 
[**change_playlist_details**](PlaylistsApi.md#change_playlist_details) | **PUT** /playlists/{playlist_id} | Change Playlist Details 
[**check_if_user_follows_playlist**](PlaylistsApi.md#check_if_user_follows_playlist) | **GET** /playlists/{playlist_id}/followers/contains | Check if Users Follow Playlist 
[**create_playlist**](PlaylistsApi.md#create_playlist) | **POST** /users/{user_id}/playlists | Create Playlist 
[**follow_playlist**](PlaylistsApi.md#follow_playlist) | **PUT** /playlists/{playlist_id}/followers | Follow Playlist 
[**get_a_categories_playlists**](PlaylistsApi.md#get_a_categories_playlists) | **GET** /browse/categories/{category_id}/playlists | Get Category&#39;s Playlists 
[**get_a_list_of_current_users_playlists**](PlaylistsApi.md#get_a_list_of_current_users_playlists) | **GET** /me/playlists | Get Current User&#39;s Playlists 
[**get_featured_playlists**](PlaylistsApi.md#get_featured_playlists) | **GET** /browse/featured-playlists | Get Featured Playlists 
[**get_list_users_playlists**](PlaylistsApi.md#get_list_users_playlists) | **GET** /users/{user_id}/playlists | Get User&#39;s Playlists 
[**get_playlist**](PlaylistsApi.md#get_playlist) | **GET** /playlists/{playlist_id} | Get Playlist 
[**get_playlist_cover**](PlaylistsApi.md#get_playlist_cover) | **GET** /playlists/{playlist_id}/images | Get Playlist Cover Image 
[**get_playlists_tracks**](PlaylistsApi.md#get_playlists_tracks) | **GET** /playlists/{playlist_id}/tracks | Get Playlist Items 
[**remove_tracks_playlist**](PlaylistsApi.md#remove_tracks_playlist) | **DELETE** /playlists/{playlist_id}/tracks | Remove Playlist Items 
[**reorder_or_replace_playlists_tracks**](PlaylistsApi.md#reorder_or_replace_playlists_tracks) | **PUT** /playlists/{playlist_id}/tracks | Update Playlist Items 
[**unfollow_playlist**](PlaylistsApi.md#unfollow_playlist) | **DELETE** /playlists/{playlist_id}/followers | Unfollow Playlist 
[**upload_custom_playlist_cover**](PlaylistsApi.md#upload_custom_playlist_cover) | **PUT** /playlists/{playlist_id}/images | Add Custom Playlist Cover Image 


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
    api_instance = openapi_client.PlaylistsApi(api_client)
    playlist_id = '3cEYpjA9oz9GiPac4AsH4n' # str | 
    position = 0 # int |  (optional)
    uris = 'spotify:track:4iV5W9uYEdYUVa79Axb7Rh,spotify:track:1301WleyT98MSxVHPZCA6M' # str |  (optional)
    request_body = None # Dict[str, object] |  (optional)

    try:
        # Add Items to Playlist 
        api_response = api_instance.add_tracks_to_playlist(playlist_id, position=position, uris=uris, request_body=request_body)
        print("The response of PlaylistsApi->add_tracks_to_playlist:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlaylistsApi->add_tracks_to_playlist: %s\n" % e)
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

# **change_playlist_details**
> change_playlist_details(playlist_id, request_body=request_body)

Change Playlist Details 

Change a playlist's name and public/private state. (The user must, of course, own the playlist.) 

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
    api_instance = openapi_client.PlaylistsApi(api_client)
    playlist_id = '3cEYpjA9oz9GiPac4AsH4n' # str | 
    request_body = None # Dict[str, object] |  (optional)

    try:
        # Change Playlist Details 
        api_instance.change_playlist_details(playlist_id, request_body=request_body)
    except Exception as e:
        print("Exception when calling PlaylistsApi->change_playlist_details: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlist_id** | **str**|  | 
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
**200** | Playlist updated |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **check_if_user_follows_playlist**
> List[bool] check_if_user_follows_playlist(playlist_id, ids)

Check if Users Follow Playlist 

Check to see if one or more Spotify users are following a specified playlist. 

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
    api_instance = openapi_client.PlaylistsApi(api_client)
    playlist_id = '3cEYpjA9oz9GiPac4AsH4n' # str | 
    ids = 'jmperezperez,thelinmichael,wizzler' # str | 

    try:
        # Check if Users Follow Playlist 
        api_response = api_instance.check_if_user_follows_playlist(playlist_id, ids)
        print("The response of PlaylistsApi->check_if_user_follows_playlist:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlaylistsApi->check_if_user_follows_playlist: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlist_id** | **str**|  | 
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

# **create_playlist**
> PlaylistObject create_playlist(user_id, request_body=request_body)

Create Playlist 

Create a playlist for a Spotify user. (The playlist will be empty until you [add tracks](/documentation/web-api/reference/add-tracks-to-playlist).) 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.playlist_object import PlaylistObject
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
    api_instance = openapi_client.PlaylistsApi(api_client)
    user_id = 'smedjan' # str | 
    request_body = None # Dict[str, object] |  (optional)

    try:
        # Create Playlist 
        api_response = api_instance.create_playlist(user_id, request_body=request_body)
        print("The response of PlaylistsApi->create_playlist:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlaylistsApi->create_playlist: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**|  | 
 **request_body** | [**Dict[str, object]**](object.md)|  | [optional] 

### Return type

[**PlaylistObject**](PlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | A playlist |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **follow_playlist**
> follow_playlist(playlist_id, request_body=request_body)

Follow Playlist 

Add the current user as a follower of a playlist. 

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
    api_instance = openapi_client.PlaylistsApi(api_client)
    playlist_id = '3cEYpjA9oz9GiPac4AsH4n' # str | 
    request_body = None # Dict[str, object] |  (optional)

    try:
        # Follow Playlist 
        api_instance.follow_playlist(playlist_id, request_body=request_body)
    except Exception as e:
        print("Exception when calling PlaylistsApi->follow_playlist: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlist_id** | **str**|  | 
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
**200** | Playlist followed |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_a_categories_playlists**
> PagingFeaturedPlaylistObject get_a_categories_playlists(category_id, country=country, limit=limit, offset=offset)

Get Category's Playlists 

Get a list of Spotify playlists tagged with a particular category. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.paging_featured_playlist_object import PagingFeaturedPlaylistObject
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
    api_instance = openapi_client.PlaylistsApi(api_client)
    category_id = 'dinner' # str | 
    country = 'SE' # str |  (optional)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get Category's Playlists 
        api_response = api_instance.get_a_categories_playlists(category_id, country=country, limit=limit, offset=offset)
        print("The response of PlaylistsApi->get_a_categories_playlists:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlaylistsApi->get_a_categories_playlists: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category_id** | **str**|  | 
 **country** | **str**|  | [optional] 
 **limit** | **int**|  | [optional] [default to 20]
 **offset** | **int**|  | [optional] [default to 0]

### Return type

[**PagingFeaturedPlaylistObject**](PagingFeaturedPlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A paged set of playlists |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_a_list_of_current_users_playlists**
> PagingPlaylistObject get_a_list_of_current_users_playlists(limit=limit, offset=offset)

Get Current User's Playlists 

Get a list of the playlists owned or followed by the current Spotify user. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.paging_playlist_object import PagingPlaylistObject
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
    api_instance = openapi_client.PlaylistsApi(api_client)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get Current User's Playlists 
        api_response = api_instance.get_a_list_of_current_users_playlists(limit=limit, offset=offset)
        print("The response of PlaylistsApi->get_a_list_of_current_users_playlists:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlaylistsApi->get_a_list_of_current_users_playlists: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**|  | [optional] [default to 20]
 **offset** | **int**|  | [optional] [default to 0]

### Return type

[**PagingPlaylistObject**](PagingPlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A paged set of playlists |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_featured_playlists**
> PagingFeaturedPlaylistObject get_featured_playlists(country=country, locale=locale, timestamp=timestamp, limit=limit, offset=offset)

Get Featured Playlists 

Get a list of Spotify featured playlists (shown, for example, on a Spotify player's 'Browse' tab). 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.paging_featured_playlist_object import PagingFeaturedPlaylistObject
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
    api_instance = openapi_client.PlaylistsApi(api_client)
    country = 'SE' # str |  (optional)
    locale = 'sv_SE' # str |  (optional)
    timestamp = '2014-10-23T09:00:00' # str |  (optional)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get Featured Playlists 
        api_response = api_instance.get_featured_playlists(country=country, locale=locale, timestamp=timestamp, limit=limit, offset=offset)
        print("The response of PlaylistsApi->get_featured_playlists:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlaylistsApi->get_featured_playlists: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **str**|  | [optional] 
 **locale** | **str**|  | [optional] 
 **timestamp** | **str**|  | [optional] 
 **limit** | **int**|  | [optional] [default to 20]
 **offset** | **int**|  | [optional] [default to 0]

### Return type

[**PagingFeaturedPlaylistObject**](PagingFeaturedPlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A paged set of playlists |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_list_users_playlists**
> PagingPlaylistObject get_list_users_playlists(user_id, limit=limit, offset=offset)

Get User's Playlists 

Get a list of the playlists owned or followed by a Spotify user. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.paging_playlist_object import PagingPlaylistObject
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
    api_instance = openapi_client.PlaylistsApi(api_client)
    user_id = 'smedjan' # str | 
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get User's Playlists 
        api_response = api_instance.get_list_users_playlists(user_id, limit=limit, offset=offset)
        print("The response of PlaylistsApi->get_list_users_playlists:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlaylistsApi->get_list_users_playlists: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**|  | 
 **limit** | **int**|  | [optional] [default to 20]
 **offset** | **int**|  | [optional] [default to 0]

### Return type

[**PagingPlaylistObject**](PagingPlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A paged set of playlists |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_playlist**
> PlaylistObject get_playlist(playlist_id, market=market, fields=fields, additional_types=additional_types)

Get Playlist 

Get a playlist owned by a Spotify user. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.playlist_object import PlaylistObject
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
    api_instance = openapi_client.PlaylistsApi(api_client)
    playlist_id = '3cEYpjA9oz9GiPac4AsH4n' # str | 
    market = 'ES' # str |  (optional)
    fields = 'items(added_by.id,track(name,href,album(name,href)))' # str |  (optional)
    additional_types = 'additional_types_example' # str |  (optional)

    try:
        # Get Playlist 
        api_response = api_instance.get_playlist(playlist_id, market=market, fields=fields, additional_types=additional_types)
        print("The response of PlaylistsApi->get_playlist:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlaylistsApi->get_playlist: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlist_id** | **str**|  | 
 **market** | **str**|  | [optional] 
 **fields** | **str**|  | [optional] 
 **additional_types** | **str**|  | [optional] 

### Return type

[**PlaylistObject**](PlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A playlist |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_playlist_cover**
> List[ImageObject] get_playlist_cover(playlist_id)

Get Playlist Cover Image 

Get the current image associated with a specific playlist. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.image_object import ImageObject
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
    api_instance = openapi_client.PlaylistsApi(api_client)
    playlist_id = '3cEYpjA9oz9GiPac4AsH4n' # str | 

    try:
        # Get Playlist Cover Image 
        api_response = api_instance.get_playlist_cover(playlist_id)
        print("The response of PlaylistsApi->get_playlist_cover:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlaylistsApi->get_playlist_cover: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlist_id** | **str**|  | 

### Return type

[**List[ImageObject]**](ImageObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of images |  -  |
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
    api_instance = openapi_client.PlaylistsApi(api_client)
    playlist_id = '3cEYpjA9oz9GiPac4AsH4n' # str | 
    market = 'ES' # str |  (optional)
    fields = 'items(added_by.id,track(name,href,album(name,href)))' # str |  (optional)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)
    additional_types = 'additional_types_example' # str |  (optional)

    try:
        # Get Playlist Items 
        api_response = api_instance.get_playlists_tracks(playlist_id, market=market, fields=fields, limit=limit, offset=offset, additional_types=additional_types)
        print("The response of PlaylistsApi->get_playlists_tracks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlaylistsApi->get_playlists_tracks: %s\n" % e)
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
    api_instance = openapi_client.PlaylistsApi(api_client)
    playlist_id = '3cEYpjA9oz9GiPac4AsH4n' # str | 
    remove_tracks_playlist_request = openapi_client.RemoveTracksPlaylistRequest() # RemoveTracksPlaylistRequest |  (optional)

    try:
        # Remove Playlist Items 
        api_response = api_instance.remove_tracks_playlist(playlist_id, remove_tracks_playlist_request=remove_tracks_playlist_request)
        print("The response of PlaylistsApi->remove_tracks_playlist:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlaylistsApi->remove_tracks_playlist: %s\n" % e)
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
    api_instance = openapi_client.PlaylistsApi(api_client)
    playlist_id = '3cEYpjA9oz9GiPac4AsH4n' # str | 
    uris = 'uris_example' # str |  (optional)
    request_body = None # Dict[str, object] |  (optional)

    try:
        # Update Playlist Items 
        api_response = api_instance.reorder_or_replace_playlists_tracks(playlist_id, uris=uris, request_body=request_body)
        print("The response of PlaylistsApi->reorder_or_replace_playlists_tracks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlaylistsApi->reorder_or_replace_playlists_tracks: %s\n" % e)
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

# **unfollow_playlist**
> unfollow_playlist(playlist_id)

Unfollow Playlist 

Remove the current user as a follower of a playlist. 

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
    api_instance = openapi_client.PlaylistsApi(api_client)
    playlist_id = '3cEYpjA9oz9GiPac4AsH4n' # str | 

    try:
        # Unfollow Playlist 
        api_instance.unfollow_playlist(playlist_id)
    except Exception as e:
        print("Exception when calling PlaylistsApi->unfollow_playlist: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlist_id** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Playlist unfollowed |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_custom_playlist_cover**
> upload_custom_playlist_cover(playlist_id, body)

Add Custom Playlist Cover Image 

Replace the image used to represent a specific playlist. 

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
    api_instance = openapi_client.PlaylistsApi(api_client)
    playlist_id = '3cEYpjA9oz9GiPac4AsH4n' # str | 
    body = 'body_example' # str | 

    try:
        # Add Custom Playlist Cover Image 
        api_instance.upload_custom_playlist_cover(playlist_id, body)
    except Exception as e:
        print("Exception when calling PlaylistsApi->upload_custom_playlist_cover: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **playlist_id** | **str**|  | 
 **body** | **str**|  | 

### Return type

void (empty response body)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: image/jpeg
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Image uploaded |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

