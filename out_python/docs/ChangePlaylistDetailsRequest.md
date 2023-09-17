# ChangePlaylistDetailsRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The new name for the playlist, for example &#x60;\&quot;My New Playlist Title\&quot;&#x60;  | [optional] 
**public** | **bool** | If &#x60;true&#x60; the playlist will be public, if &#x60;false&#x60; it will be private.  | [optional] 
**collaborative** | **bool** | If &#x60;true&#x60;, the playlist will become collaborative and other users will be able to modify the playlist in their Spotify client. &lt;br/&gt; _**Note**: You can only set &#x60;collaborative&#x60; to &#x60;true&#x60; on non-public playlists._  | [optional] 
**description** | **str** | Value for playlist description as displayed in Spotify Clients and in the Web API.  | [optional] 

## Example

```python
from openapi_client.models.change_playlist_details_request import ChangePlaylistDetailsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ChangePlaylistDetailsRequest from a JSON string
change_playlist_details_request_instance = ChangePlaylistDetailsRequest.from_json(json)
# print the JSON string representation of the object
print ChangePlaylistDetailsRequest.to_json()

# convert the object into a dict
change_playlist_details_request_dict = change_playlist_details_request_instance.to_dict()
# create an instance of ChangePlaylistDetailsRequest from a dict
change_playlist_details_request_form_dict = change_playlist_details_request.from_dict(change_playlist_details_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


