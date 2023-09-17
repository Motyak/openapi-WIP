# SaveShowsUserRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **List[str]** | A JSON array of the [Spotify IDs](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids).   A maximum of 50 items can be specified in one request. *Note: if the &#x60;ids&#x60; parameter is present in the query string, any IDs listed here in the body will be ignored.* | [optional] 

## Example

```python
from openapi_client.models.save_shows_user_request import SaveShowsUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SaveShowsUserRequest from a JSON string
save_shows_user_request_instance = SaveShowsUserRequest.from_json(json)
# print the JSON string representation of the object
print SaveShowsUserRequest.to_json()

# convert the object into a dict
save_shows_user_request_dict = save_shows_user_request_instance.to_dict()
# create an instance of SaveShowsUserRequest from a dict
save_shows_user_request_form_dict = save_shows_user_request.from_dict(save_shows_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


