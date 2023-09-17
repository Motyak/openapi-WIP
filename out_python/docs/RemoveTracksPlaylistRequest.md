# RemoveTracksPlaylistRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tracks** | [**List[RemoveTracksPlaylistRequestTracksInner]**](RemoveTracksPlaylistRequestTracksInner.md) | An array of objects containing [Spotify URIs](/documentation/web-api/concepts/spotify-uris-ids) of the tracks or episodes to remove. For example: &#x60;{ \&quot;tracks\&quot;: [{ \&quot;uri\&quot;: \&quot;spotify:track:4iV5W9uYEdYUVa79Axb7Rh\&quot; },{ \&quot;uri\&quot;: \&quot;spotify:track:1301WleyT98MSxVHPZCA6M\&quot; }] }&#x60;. A maximum of 100 objects can be sent at once.  | 
**snapshot_id** | **str** | The playlist&#39;s snapshot ID against which you want to make the changes. The API will validate that the specified items exist and in the specified positions and make the changes, even if more recent changes have been made to the playlist.  | [optional] 

## Example

```python
from openapi_client.models.remove_tracks_playlist_request import RemoveTracksPlaylistRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RemoveTracksPlaylistRequest from a JSON string
remove_tracks_playlist_request_instance = RemoveTracksPlaylistRequest.from_json(json)
# print the JSON string representation of the object
print RemoveTracksPlaylistRequest.to_json()

# convert the object into a dict
remove_tracks_playlist_request_dict = remove_tracks_playlist_request_instance.to_dict()
# create an instance of RemoveTracksPlaylistRequest from a dict
remove_tracks_playlist_request_form_dict = remove_tracks_playlist_request.from_dict(remove_tracks_playlist_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


