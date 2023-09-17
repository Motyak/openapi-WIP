# openapi_client.CategoriesApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_a_categories_playlists**](CategoriesApi.md#get_a_categories_playlists) | **GET** /browse/categories/{category_id}/playlists | Get Category&#39;s Playlists 
[**get_a_category**](CategoriesApi.md#get_a_category) | **GET** /browse/categories/{category_id} | Get Single Browse Category 
[**get_categories**](CategoriesApi.md#get_categories) | **GET** /browse/categories | Get Several Browse Categories 


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
    api_instance = openapi_client.CategoriesApi(api_client)
    category_id = 'dinner' # str | 
    country = 'SE' # str |  (optional)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get Category's Playlists 
        api_response = api_instance.get_a_categories_playlists(category_id, country=country, limit=limit, offset=offset)
        print("The response of CategoriesApi->get_a_categories_playlists:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CategoriesApi->get_a_categories_playlists: %s\n" % e)
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

# **get_a_category**
> CategoryObject get_a_category(category_id, country=country, locale=locale)

Get Single Browse Category 

Get a single category used to tag items in Spotify (on, for example, the Spotify player’s “Browse” tab). 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.category_object import CategoryObject
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
    api_instance = openapi_client.CategoriesApi(api_client)
    category_id = 'dinner' # str | 
    country = 'SE' # str |  (optional)
    locale = 'sv_SE' # str |  (optional)

    try:
        # Get Single Browse Category 
        api_response = api_instance.get_a_category(category_id, country=country, locale=locale)
        print("The response of CategoriesApi->get_a_category:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CategoriesApi->get_a_category: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category_id** | **str**|  | 
 **country** | **str**|  | [optional] 
 **locale** | **str**|  | [optional] 

### Return type

[**CategoryObject**](CategoryObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A category |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_categories**
> GetCategories200Response get_categories(country=country, locale=locale, limit=limit, offset=offset)

Get Several Browse Categories 

Get a list of categories used to tag items in Spotify (on, for example, the Spotify player’s “Browse” tab). 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.get_categories200_response import GetCategories200Response
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
    api_instance = openapi_client.CategoriesApi(api_client)
    country = 'SE' # str |  (optional)
    locale = 'sv_SE' # str |  (optional)
    limit = 20 # int |  (optional) (default to 20)
    offset = 0 # int |  (optional) (default to 0)

    try:
        # Get Several Browse Categories 
        api_response = api_instance.get_categories(country=country, locale=locale, limit=limit, offset=offset)
        print("The response of CategoriesApi->get_categories:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CategoriesApi->get_categories: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **str**|  | [optional] 
 **locale** | **str**|  | [optional] 
 **limit** | **int**|  | [optional] [default to 20]
 **offset** | **int**|  | [optional] [default to 0]

### Return type

[**GetCategories200Response**](GetCategories200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A paged set of categories |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

