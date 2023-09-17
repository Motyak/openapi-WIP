# openapi_client.PlayerApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_to_queue**](PlayerApi.md#add_to_queue) | **POST** /me/player/queue | Add Item to Playback Queue 
[**get_a_users_available_devices**](PlayerApi.md#get_a_users_available_devices) | **GET** /me/player/devices | Get Available Devices 
[**get_information_about_the_users_current_playback**](PlayerApi.md#get_information_about_the_users_current_playback) | **GET** /me/player | Get Playback State 
[**get_queue**](PlayerApi.md#get_queue) | **GET** /me/player/queue | Get the User&#39;s Queue 
[**get_recently_played**](PlayerApi.md#get_recently_played) | **GET** /me/player/recently-played | Get Recently Played Tracks 
[**get_the_users_currently_playing_track**](PlayerApi.md#get_the_users_currently_playing_track) | **GET** /me/player/currently-playing | Get Currently Playing Track 
[**pause_a_users_playback**](PlayerApi.md#pause_a_users_playback) | **PUT** /me/player/pause | Pause Playback 
[**seek_to_position_in_currently_playing_track**](PlayerApi.md#seek_to_position_in_currently_playing_track) | **PUT** /me/player/seek | Seek To Position 
[**set_repeat_mode_on_users_playback**](PlayerApi.md#set_repeat_mode_on_users_playback) | **PUT** /me/player/repeat | Set Repeat Mode 
[**set_volume_for_users_playback**](PlayerApi.md#set_volume_for_users_playback) | **PUT** /me/player/volume | Set Playback Volume 
[**skip_users_playback_to_next_track**](PlayerApi.md#skip_users_playback_to_next_track) | **POST** /me/player/next | Skip To Next 
[**skip_users_playback_to_previous_track**](PlayerApi.md#skip_users_playback_to_previous_track) | **POST** /me/player/previous | Skip To Previous 
[**start_a_users_playback**](PlayerApi.md#start_a_users_playback) | **PUT** /me/player/play | Start/Resume Playback 
[**toggle_shuffle_for_users_playback**](PlayerApi.md#toggle_shuffle_for_users_playback) | **PUT** /me/player/shuffle | Toggle Playback Shuffle 
[**transfer_a_users_playback**](PlayerApi.md#transfer_a_users_playback) | **PUT** /me/player | Transfer Playback 


# **add_to_queue**
> add_to_queue(uri, device_id=device_id)

Add Item to Playback Queue 

Add an item to the end of the user's current playback queue. 

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
    api_instance = openapi_client.PlayerApi(api_client)
    uri = 'spotify:track:4iV5W9uYEdYUVa79Axb7Rh' # str | 
    device_id = '0d1841b0976bae2a3a310dd74c0f3df354899bc8' # str |  (optional)

    try:
        # Add Item to Playback Queue 
        api_instance.add_to_queue(uri, device_id=device_id)
    except Exception as e:
        print("Exception when calling PlayerApi->add_to_queue: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uri** | **str**|  | 
 **device_id** | **str**|  | [optional] 

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
**204** | Command received |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_a_users_available_devices**
> GetAUsersAvailableDevices200Response get_a_users_available_devices()

Get Available Devices 

Get information about a user’s available devices. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.get_a_users_available_devices200_response import GetAUsersAvailableDevices200Response
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
    api_instance = openapi_client.PlayerApi(api_client)

    try:
        # Get Available Devices 
        api_response = api_instance.get_a_users_available_devices()
        print("The response of PlayerApi->get_a_users_available_devices:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlayerApi->get_a_users_available_devices: %s\n" % e)
```



### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAUsersAvailableDevices200Response**](GetAUsersAvailableDevices200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of devices |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_information_about_the_users_current_playback**
> CurrentlyPlayingContextObject get_information_about_the_users_current_playback(market=market, additional_types=additional_types)

Get Playback State 

Get information about the user’s current playback state, including track or episode, progress, and active device. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.currently_playing_context_object import CurrentlyPlayingContextObject
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
    api_instance = openapi_client.PlayerApi(api_client)
    market = 'ES' # str |  (optional)
    additional_types = 'additional_types_example' # str |  (optional)

    try:
        # Get Playback State 
        api_response = api_instance.get_information_about_the_users_current_playback(market=market, additional_types=additional_types)
        print("The response of PlayerApi->get_information_about_the_users_current_playback:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlayerApi->get_information_about_the_users_current_playback: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **str**|  | [optional] 
 **additional_types** | **str**|  | [optional] 

### Return type

[**CurrentlyPlayingContextObject**](CurrentlyPlayingContextObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information about playback |  -  |
**204** | Playback not available or active |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_queue**
> QueueObject get_queue()

Get the User's Queue 

Get the list of objects that make up the user's queue. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.queue_object import QueueObject
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
    api_instance = openapi_client.PlayerApi(api_client)

    try:
        # Get the User's Queue 
        api_response = api_instance.get_queue()
        print("The response of PlayerApi->get_queue:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlayerApi->get_queue: %s\n" % e)
```



### Parameters
This endpoint does not need any parameter.

### Return type

[**QueueObject**](QueueObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information about the queue |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_recently_played**
> CursorPagingPlayHistoryObject get_recently_played(limit=limit, after=after, before=before)

Get Recently Played Tracks 

Get tracks from the current user's recently played tracks. _**Note**: Currently doesn't support podcast episodes._ 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.cursor_paging_play_history_object import CursorPagingPlayHistoryObject
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
    api_instance = openapi_client.PlayerApi(api_client)
    limit = 20 # int |  (optional) (default to 20)
    after = 1484811043508 # int |  (optional)
    before = 56 # int |  (optional)

    try:
        # Get Recently Played Tracks 
        api_response = api_instance.get_recently_played(limit=limit, after=after, before=before)
        print("The response of PlayerApi->get_recently_played:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlayerApi->get_recently_played: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**|  | [optional] [default to 20]
 **after** | **int**|  | [optional] 
 **before** | **int**|  | [optional] 

### Return type

[**CursorPagingPlayHistoryObject**](CursorPagingPlayHistoryObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A paged set of tracks |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_the_users_currently_playing_track**
> CurrentlyPlayingObject get_the_users_currently_playing_track(market=market, additional_types=additional_types)

Get Currently Playing Track 

Get the object currently being played on the user's Spotify account. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.currently_playing_object import CurrentlyPlayingObject
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
    api_instance = openapi_client.PlayerApi(api_client)
    market = 'ES' # str |  (optional)
    additional_types = 'additional_types_example' # str |  (optional)

    try:
        # Get Currently Playing Track 
        api_response = api_instance.get_the_users_currently_playing_track(market=market, additional_types=additional_types)
        print("The response of PlayerApi->get_the_users_currently_playing_track:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling PlayerApi->get_the_users_currently_playing_track: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **market** | **str**|  | [optional] 
 **additional_types** | **str**|  | [optional] 

### Return type

[**CurrentlyPlayingObject**](CurrentlyPlayingObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information about the currently playing track |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pause_a_users_playback**
> pause_a_users_playback(device_id=device_id)

Pause Playback 

Pause playback on the user's account. 

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
    api_instance = openapi_client.PlayerApi(api_client)
    device_id = '0d1841b0976bae2a3a310dd74c0f3df354899bc8' # str |  (optional)

    try:
        # Pause Playback 
        api_instance.pause_a_users_playback(device_id=device_id)
    except Exception as e:
        print("Exception when calling PlayerApi->pause_a_users_playback: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device_id** | **str**|  | [optional] 

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
**204** | Playback paused |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **seek_to_position_in_currently_playing_track**
> seek_to_position_in_currently_playing_track(position_ms, device_id=device_id)

Seek To Position 

Seeks to the given position in the user’s currently playing track. 

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
    api_instance = openapi_client.PlayerApi(api_client)
    position_ms = 25000 # int | 
    device_id = '0d1841b0976bae2a3a310dd74c0f3df354899bc8' # str |  (optional)

    try:
        # Seek To Position 
        api_instance.seek_to_position_in_currently_playing_track(position_ms, device_id=device_id)
    except Exception as e:
        print("Exception when calling PlayerApi->seek_to_position_in_currently_playing_track: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **position_ms** | **int**|  | 
 **device_id** | **str**|  | [optional] 

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
**204** | Command sent |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_repeat_mode_on_users_playback**
> set_repeat_mode_on_users_playback(state, device_id=device_id)

Set Repeat Mode 

Set the repeat mode for the user's playback. Options are repeat-track, repeat-context, and off. 

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
    api_instance = openapi_client.PlayerApi(api_client)
    state = 'context' # str | 
    device_id = '0d1841b0976bae2a3a310dd74c0f3df354899bc8' # str |  (optional)

    try:
        # Set Repeat Mode 
        api_instance.set_repeat_mode_on_users_playback(state, device_id=device_id)
    except Exception as e:
        print("Exception when calling PlayerApi->set_repeat_mode_on_users_playback: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **str**|  | 
 **device_id** | **str**|  | [optional] 

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
**204** | Command sent |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **set_volume_for_users_playback**
> set_volume_for_users_playback(volume_percent, device_id=device_id)

Set Playback Volume 

Set the volume for the user’s current playback device. 

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
    api_instance = openapi_client.PlayerApi(api_client)
    volume_percent = 50 # int | 
    device_id = '0d1841b0976bae2a3a310dd74c0f3df354899bc8' # str |  (optional)

    try:
        # Set Playback Volume 
        api_instance.set_volume_for_users_playback(volume_percent, device_id=device_id)
    except Exception as e:
        print("Exception when calling PlayerApi->set_volume_for_users_playback: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **volume_percent** | **int**|  | 
 **device_id** | **str**|  | [optional] 

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
**204** | Command sent |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **skip_users_playback_to_next_track**
> skip_users_playback_to_next_track(device_id=device_id)

Skip To Next 

Skips to next track in the user’s queue. 

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
    api_instance = openapi_client.PlayerApi(api_client)
    device_id = '0d1841b0976bae2a3a310dd74c0f3df354899bc8' # str |  (optional)

    try:
        # Skip To Next 
        api_instance.skip_users_playback_to_next_track(device_id=device_id)
    except Exception as e:
        print("Exception when calling PlayerApi->skip_users_playback_to_next_track: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device_id** | **str**|  | [optional] 

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
**204** | Command sent |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **skip_users_playback_to_previous_track**
> skip_users_playback_to_previous_track(device_id=device_id)

Skip To Previous 

Skips to previous track in the user’s queue. 

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
    api_instance = openapi_client.PlayerApi(api_client)
    device_id = '0d1841b0976bae2a3a310dd74c0f3df354899bc8' # str |  (optional)

    try:
        # Skip To Previous 
        api_instance.skip_users_playback_to_previous_track(device_id=device_id)
    except Exception as e:
        print("Exception when calling PlayerApi->skip_users_playback_to_previous_track: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device_id** | **str**|  | [optional] 

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
**204** | Command sent |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **start_a_users_playback**
> start_a_users_playback(device_id=device_id, request_body=request_body)

Start/Resume Playback 

Start a new context or resume current playback on the user's active device. 

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
    api_instance = openapi_client.PlayerApi(api_client)
    device_id = '0d1841b0976bae2a3a310dd74c0f3df354899bc8' # str |  (optional)
    request_body = None # Dict[str, object] |  (optional)

    try:
        # Start/Resume Playback 
        api_instance.start_a_users_playback(device_id=device_id, request_body=request_body)
    except Exception as e:
        print("Exception when calling PlayerApi->start_a_users_playback: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **device_id** | **str**|  | [optional] 
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
**204** | Playback started |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **toggle_shuffle_for_users_playback**
> toggle_shuffle_for_users_playback(state, device_id=device_id)

Toggle Playback Shuffle 

Toggle shuffle on or off for user’s playback. 

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
    api_instance = openapi_client.PlayerApi(api_client)
    state = true # bool | 
    device_id = '0d1841b0976bae2a3a310dd74c0f3df354899bc8' # str |  (optional)

    try:
        # Toggle Playback Shuffle 
        api_instance.toggle_shuffle_for_users_playback(state, device_id=device_id)
    except Exception as e:
        print("Exception when calling PlayerApi->toggle_shuffle_for_users_playback: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **state** | **bool**|  | 
 **device_id** | **str**|  | [optional] 

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
**204** | Command sent |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transfer_a_users_playback**
> transfer_a_users_playback(request_body=request_body)

Transfer Playback 

Transfer playback to a new device and determine if it should start playing. 

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
    api_instance = openapi_client.PlayerApi(api_client)
    request_body = None # Dict[str, object] |  (optional)

    try:
        # Transfer Playback 
        api_instance.transfer_a_users_playback(request_body=request_body)
    except Exception as e:
        print("Exception when calling PlayerApi->transfer_a_users_playback: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
**204** | Playback transferred |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

