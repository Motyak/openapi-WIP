# openapi_client.ChaptersApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_a_chapter**](ChaptersApi.md#get_a_chapter) | **GET** /chapters/{id} | Get a Chapter 
[**get_audiobook_chapters**](ChaptersApi.md#get_audiobook_chapters) | **GET** /audiobooks/{id}/chapters | Get Audiobook Chapters 
[**get_several_chapters**](ChaptersApi.md#get_several_chapters) | **GET** /chapters | Get Several Chapters 


# **get_a_chapter**
> ChapterObject get_a_chapter(id, market=market)

Get a Chapter 

Get Spotify catalog information for a single chapter.<br /> **Note: Chapters are only available for the US, UK, Ireland, New Zealand and Australia markets.** 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.chapter_object import ChapterObject
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
    api_instance = openapi_client.ChaptersApi(api_client)
    id = '0D5wENdkdwbqlrHoaJ9g29' # str | 
    market = 'ES' # str |  (optional)

    try:
        # Get a Chapter 
        api_response = api_instance.get_a_chapter(id, market=market)
        print("The response of ChaptersApi->get_a_chapter:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ChaptersApi->get_a_chapter: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **market** | **str**|  | [optional] 

### Return type

[**ChapterObject**](ChapterObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A Chapter |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
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
    api_instance = openapi_client.ChaptersApi(api_client)
    id = '7iHfbu1YPACw6oZPAFJtqe' # str | 
    market = 'ES' # str |  (optional)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get Audiobook Chapters 
        api_response = api_instance.get_audiobook_chapters(id, market=market, limit=limit, offset=offset)
        print("The response of ChaptersApi->get_audiobook_chapters:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ChaptersApi->get_audiobook_chapters: %s\n" % e)
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

# **get_several_chapters**
> GetSeveralChapters200Response get_several_chapters(ids, market=market)

Get Several Chapters 

Get Spotify catalog information for several chapters identified by their Spotify IDs.<br /> **Note: Chapters are only available for the US, UK, Ireland, New Zealand and Australia markets.** 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.get_several_chapters200_response import GetSeveralChapters200Response
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
    api_instance = openapi_client.ChaptersApi(api_client)
    ids = '0IsXVP0JmcB2adSE338GkK,3ZXb8FKZGU0EHALYX6uCzU,0D5wENdkdwbqlrHoaJ9g29' # str | 
    market = 'ES' # str |  (optional)

    try:
        # Get Several Chapters 
        api_response = api_instance.get_several_chapters(ids, market=market)
        print("The response of ChaptersApi->get_several_chapters:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ChaptersApi->get_several_chapters: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **str**|  | 
 **market** | **str**|  | [optional] 

### Return type

[**GetSeveralChapters200Response**](GetSeveralChapters200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of chapters |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

