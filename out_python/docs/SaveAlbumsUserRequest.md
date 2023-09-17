# SaveAlbumsUserRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **List[str]** | A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For example: &#x60;[\&quot;4iV5W9uYEdYUVa79Axb7Rh\&quot;, \&quot;1301WleyT98MSxVHPZCA6M\&quot;]&#x60;&lt;br/&gt;A maximum of 50 items can be specified in one request. _**Note**: if the &#x60;ids&#x60; parameter is present in the query string, any IDs listed here in the body will be ignored._  | [optional] 

## Example

```python
from openapi_client.models.save_albums_user_request import SaveAlbumsUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SaveAlbumsUserRequest from a JSON string
save_albums_user_request_instance = SaveAlbumsUserRequest.from_json(json)
# print the JSON string representation of the object
print SaveAlbumsUserRequest.to_json()

# convert the object into a dict
save_albums_user_request_dict = save_albums_user_request_instance.to_dict()
# create an instance of SaveAlbumsUserRequest from a dict
save_albums_user_request_form_dict = save_albums_user_request.from_dict(save_albums_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


