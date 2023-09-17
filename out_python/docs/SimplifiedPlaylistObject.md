# SimplifiedPlaylistObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collaborative** | **bool** | &#x60;true&#x60; if the owner allows other users to modify the playlist.  | [optional] 
**description** | **str** | The playlist description. _Only returned for modified, verified playlists, otherwise_ &#x60;null&#x60;.  | [optional] 
**external_urls** | [**ExternalUrlObject**](ExternalUrlObject.md) |  | [optional] 
**href** | **str** | A link to the Web API endpoint providing full details of the playlist.  | [optional] 
**id** | **str** | The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the playlist.  | [optional] 
**images** | [**List[ImageObject]**](ImageObject.md) | Images for the playlist. The array may be empty or contain up to three images. The images are returned by size in descending order. See [Working with Playlists](/documentation/web-api/concepts/playlists). _**Note**: If returned, the source URL for the image (&#x60;url&#x60;) is temporary and will expire in less than a day._  | [optional] 
**name** | **str** | The name of the playlist.  | [optional] 
**owner** | [**PlaylistOwnerObject**](PlaylistOwnerObject.md) |  | [optional] 
**public** | **bool** | The playlist&#39;s public/private status: &#x60;true&#x60; the playlist is public, &#x60;false&#x60; the playlist is private, &#x60;null&#x60; the playlist status is not relevant. For more about public/private status, see [Working with Playlists](/documentation/web-api/concepts/playlists)  | [optional] 
**snapshot_id** | **str** | The version identifier for the current playlist. Can be supplied in other requests to target a specific playlist version  | [optional] 
**tracks** | [**PlaylistTracksRefObject**](PlaylistTracksRefObject.md) |  | [optional] 
**type** | **str** | The object type: \&quot;playlist\&quot;  | [optional] 
**uri** | **str** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the playlist.  | [optional] 

## Example

```python
from openapi_client.models.simplified_playlist_object import SimplifiedPlaylistObject

# TODO update the JSON string below
json = "{}"
# create an instance of SimplifiedPlaylistObject from a JSON string
simplified_playlist_object_instance = SimplifiedPlaylistObject.from_json(json)
# print the JSON string representation of the object
print SimplifiedPlaylistObject.to_json()

# convert the object into a dict
simplified_playlist_object_dict = simplified_playlist_object_instance.to_dict()
# create an instance of SimplifiedPlaylistObject from a dict
simplified_playlist_object_form_dict = simplified_playlist_object.from_dict(simplified_playlist_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


