# openapi_client.AudiobooksApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check_users_saved_audiobooks**](AudiobooksApi.md#check_users_saved_audiobooks) | **GET** /me/audiobooks/contains | Check User&#39;s Saved Audiobooks 
[**get_an_audiobook**](AudiobooksApi.md#get_an_audiobook) | **GET** /audiobooks/{id} | Get an Audiobook 
[**get_audiobook_chapters**](AudiobooksApi.md#get_audiobook_chapters) | **GET** /audiobooks/{id}/chapters | Get Audiobook Chapters 
[**get_multiple_audiobooks**](AudiobooksApi.md#get_multiple_audiobooks) | **GET** /audiobooks | Get Several Audiobooks 
[**get_users_saved_audiobooks**](AudiobooksApi.md#get_users_saved_audiobooks) | **GET** /me/audiobooks | Get User&#39;s Saved Audiobooks 
[**remove_audiobooks_user**](AudiobooksApi.md#remove_audiobooks_user) | **DELETE** /me/audiobooks | Remove User&#39;s Saved Audiobooks 
[**save_audiobooks_user**](AudiobooksApi.md#save_audiobooks_user) | **PUT** /me/audiobooks | Save Audiobooks for Current User 


# **check_users_saved_audiobooks**
> List[bool] check_users_saved_audiobooks(ids)

Check User's Saved Audiobooks 

Check if one or more audiobooks are already saved in the current Spotify user's library. 

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
    api_instance = openapi_client.AudiobooksApi(api_client)
    ids = '18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe' # str | 

    try:
        # Check User's Saved Audiobooks 
        api_response = api_instance.check_users_saved_audiobooks(ids)
        print("The response of AudiobooksApi->check_users_saved_audiobooks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AudiobooksApi->check_users_saved_audiobooks: %s\n" % e)
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

# **get_an_audiobook**
> AudiobookObject get_an_audiobook(id, market=market)

Get an Audiobook 

Get Spotify catalog information for a single audiobook.<br /> **Note: Audiobooks are only available for the US, UK, Ireland, New Zealand and Australia markets.** 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.audiobook_object import AudiobookObject
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
    api_instance = openapi_client.AudiobooksApi(api_client)
    id = '7iHfbu1YPACw6oZPAFJtqe' # str | 
    market = 'ES' # str |  (optional)

    try:
        # Get an Audiobook 
        api_response = api_instance.get_an_audiobook(id, market=market)
        print("The response of AudiobooksApi->get_an_audiobook:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AudiobooksApi->get_an_audiobook: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **market** | **str**|  | [optional] 

### Return type

[**AudiobookObject**](AudiobookObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An Audiobook |  -  |
**400** | The request contains malformed data in path, query parameters, or body.  |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**404** | The requested resource cannot be found.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_audiobook_chapters**
> PagingSimplifiedChapterObject get_audiobook_chapters(id, market=market, limit=limit, offset=offset)

Get Audiobook Chapters 

Get Spotify catalog information about an audiobook's chapters.<br /> **Note: Audiobooks are only available for the US, UK, Ireland, New Zealand and Australia markets.** 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.paging_simplified_chapter_object import PagingSimplifiedChapterObject
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
    api_instance = openapi_client.AudiobooksApi(api_client)
    id = '7iHfbu1YPACw6oZPAFJtqe' # str | 
    market = 'ES' # str |  (optional)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get Audiobook Chapters 
        api_response = api_instance.get_audiobook_chapters(id, market=market, limit=limit, offset=offset)
        print("The response of AudiobooksApi->get_audiobook_chapters:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AudiobooksApi->get_audiobook_chapters: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **market** | **str**|  | [optional] 
 **limit** | **int**|  | [optional] [default to 20]
 **offset** | **int**|  | [optional] [default to 0]

### Return type

[**PagingSimplifiedChapterObject**](PagingSimplifiedChapterObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of chapters |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_multiple_audiobooks**
> GetMultipleAudiobooks200Response get_multiple_audiobooks(ids, market=market)

Get Several Audiobooks 

Get Spotify catalog information for several audiobooks identified by their Spotify IDs.<br /> **Note: Audiobooks are only available for the US, UK, Ireland, New Zealand and Australia markets.** 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.get_multiple_audiobooks200_response import GetMultipleAudiobooks200Response
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
    api_instance = openapi_client.AudiobooksApi(api_client)
    ids = '18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe' # str | 
    market = 'ES' # str |  (optional)

    try:
        # Get Several Audiobooks 
        api_response = api_instance.get_multiple_audiobooks(ids, market=market)
        print("The response of AudiobooksApi->get_multiple_audiobooks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AudiobooksApi->get_multiple_audiobooks: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **str**|  | 
 **market** | **str**|  | [optional] 

### Return type

[**GetMultipleAudiobooks200Response**](GetMultipleAudiobooks200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of audiobooks |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_users_saved_audiobooks**
> PagingSavedAudiobookObject get_users_saved_audiobooks(limit=limit, offset=offset)

Get User's Saved Audiobooks 

Get a list of the audiobooks saved in the current Spotify user's 'Your Music' library. 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.paging_saved_audiobook_object import PagingSavedAudiobookObject
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
    api_instance = openapi_client.AudiobooksApi(api_client)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get User's Saved Audiobooks 
        api_response = api_instance.get_users_saved_audiobooks(limit=limit, offset=offset)
        print("The response of AudiobooksApi->get_users_saved_audiobooks:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AudiobooksApi->get_users_saved_audiobooks: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**|  | [optional] [default to 20]
 **offset** | **int**|  | [optional] [default to 0]

### Return type

[**PagingSavedAudiobookObject**](PagingSavedAudiobookObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Pages of saved audiobooks |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_audiobooks_user**
> remove_audiobooks_user(ids)

Remove User's Saved Audiobooks 

Remove one or more audiobooks from the Spotify user's library. 

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
    api_instance = openapi_client.AudiobooksApi(api_client)
    ids = '18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe' # str | 

    try:
        # Remove User's Saved Audiobooks 
        api_instance.remove_audiobooks_user(ids)
    except Exception as e:
        print("Exception when calling AudiobooksApi->remove_audiobooks_user: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **str**|  | 

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
**200** | Audiobook(s) have been removed from the library |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_audiobooks_user**
> save_audiobooks_user(ids)

Save Audiobooks for Current User 

Save one or more audiobooks to the current Spotify user's library. 

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
    api_instance = openapi_client.AudiobooksApi(api_client)
    ids = '18yVqkdbdRvS24c0Ilj2ci,1HGw3J3NxZO1TP1BTtVhpZ,7iHfbu1YPACw6oZPAFJtqe' # str | 

    try:
        # Save Audiobooks for Current User 
        api_instance.save_audiobooks_user(ids)
    except Exception as e:
        print("Exception when calling AudiobooksApi->save_audiobooks_user: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **str**|  | 

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
**200** | Audiobook(s) are saved to the library |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

