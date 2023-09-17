# FollowPlaylistRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**public** | **bool** | Defaults to &#x60;true&#x60;. If &#x60;true&#x60; the playlist will be included in user&#39;s public playlists, if &#x60;false&#x60; it will remain private.  | [optional] 

## Example

```python
from openapi_client.models.follow_playlist_request import FollowPlaylistRequest

# TODO update the JSON string below
json = "{}"
# create an instance of FollowPlaylistRequest from a JSON string
follow_playlist_request_instance = FollowPlaylistRequest.from_json(json)
# print the JSON string representation of the object
print FollowPlaylistRequest.to_json()

# convert the object into a dict
follow_playlist_request_dict = follow_playlist_request_instance.to_dict()
# create an instance of FollowPlaylistRequest from a dict
follow_playlist_request_form_dict = follow_playlist_request.from_dict(follow_playlist_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


