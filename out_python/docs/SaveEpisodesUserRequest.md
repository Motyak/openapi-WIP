# SaveEpisodesUserRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **List[str]** | A JSON array of the [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). &lt;br/&gt;A maximum of 50 items can be specified in one request. _**Note**: if the &#x60;ids&#x60; parameter is present in the query string, any IDs listed here in the body will be ignored._  | 

## Example

```python
from openapi_client.models.save_episodes_user_request import SaveEpisodesUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SaveEpisodesUserRequest from a JSON string
save_episodes_user_request_instance = SaveEpisodesUserRequest.from_json(json)
# print the JSON string representation of the object
print SaveEpisodesUserRequest.to_json()

# convert the object into a dict
save_episodes_user_request_dict = save_episodes_user_request_instance.to_dict()
# create an instance of SaveEpisodesUserRequest from a dict
save_episodes_user_request_form_dict = save_episodes_user_request.from_dict(save_episodes_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


