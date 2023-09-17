# AddTracksToPlaylistRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uris** | **List[str]** | A JSON array of the [Spotify URIs](/documentation/web-api/concepts/spotify-uris-ids) to add. For example: &#x60;{\&quot;uris\&quot;: [\&quot;spotify:track:4iV5W9uYEdYUVa79Axb7Rh\&quot;,\&quot;spotify:track:1301WleyT98MSxVHPZCA6M\&quot;, \&quot;spotify:episode:512ojhOuo1ktJprKbVcKyQ\&quot;]}&#x60;&lt;br/&gt;A maximum of 100 items can be added in one request. _**Note**: if the &#x60;uris&#x60; parameter is present in the query string, any URIs listed here in the body will be ignored._  | [optional] 
**position** | **int** | The position to insert the items, a zero-based index. For example, to insert the items in the first position: &#x60;position&#x3D;0&#x60; ; to insert the items in the third position: &#x60;position&#x3D;2&#x60;. If omitted, the items will be appended to the playlist. Items are added in the order they appear in the uris array. For example: &#x60;{\&quot;uris\&quot;: [\&quot;spotify:track:4iV5W9uYEdYUVa79Axb7Rh\&quot;,\&quot;spotify:track:1301WleyT98MSxVHPZCA6M\&quot;], \&quot;position\&quot;: 3}&#x60;  | [optional] 

## Example

```python
from openapi_client.models.add_tracks_to_playlist_request import AddTracksToPlaylistRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AddTracksToPlaylistRequest from a JSON string
add_tracks_to_playlist_request_instance = AddTracksToPlaylistRequest.from_json(json)
# print the JSON string representation of the object
print AddTracksToPlaylistRequest.to_json()

# convert the object into a dict
add_tracks_to_playlist_request_dict = add_tracks_to_playlist_request_instance.to_dict()
# create an instance of AddTracksToPlaylistRequest from a dict
add_tracks_to_playlist_request_form_dict = add_tracks_to_playlist_request.from_dict(add_tracks_to_playlist_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


