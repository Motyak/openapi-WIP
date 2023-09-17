# openapi_client.GenresApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_recommendation_genres**](GenresApi.md#get_recommendation_genres) | **GET** /recommendations/available-genre-seeds | Get Available Genre Seeds 


# **get_recommendation_genres**
> GetRecommendationGenres200Response get_recommendation_genres()

Get Available Genre Seeds 

Retrieve a list of available genres seed parameter values for [recommendations](/documentation/web-api/reference/get-recommendations). 

### Example

* OAuth Authentication (oauth_2_0):
```python
import time
import os
import openapi_client
from openapi_client.models.get_recommendation_genres200_response import GetRecommendationGenres200Response
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
    api_instance = openapi_client.GenresApi(api_client)

    try:
        # Get Available Genre Seeds 
        api_response = api_instance.get_recommendation_genres()
        print("The response of GenresApi->get_recommendation_genres:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling GenresApi->get_recommendation_genres: %s\n" % e)
```



### Parameters
This endpoint does not need any parameter.

### Return type

[**GetRecommendationGenres200Response**](GetRecommendationGenres200Response.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A set of genres |  -  |
**401** | Bad or expired token. This can happen if the user revoked a token or the access token has expired. You should re-authenticate the user.  |  -  |
**403** | Bad OAuth request (wrong consumer key, bad nonce, expired timestamp...). Unfortunately, re-authenticating the user won&#39;t help here.  |  -  |
**429** | The app has exceeded its rate limits.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

