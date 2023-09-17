# PlaylistTrackObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**added_at** | **datetime** | The date and time the track or episode was added. _**Note**: some very old playlists may return &#x60;null&#x60; in this field._  | [optional] 
**added_by** | [**PlaylistUserObject**](PlaylistUserObject.md) |  | [optional] 
**is_local** | **bool** | Whether this track or episode is a [local file](/documentation/web-api/concepts/playlists/#local-files) or not.  | [optional] 
**track** | [**PlaylistTrackObjectTrack**](PlaylistTrackObjectTrack.md) |  | [optional] 

## Example

```python
from openapi_client.models.playlist_track_object import PlaylistTrackObject

# TODO update the JSON string below
json = "{}"
# create an instance of PlaylistTrackObject from a JSON string
playlist_track_object_instance = PlaylistTrackObject.from_json(json)
# print the JSON string representation of the object
print PlaylistTrackObject.to_json()

# convert the object into a dict
playlist_track_object_dict = playlist_track_object_instance.to_dict()
# create an instance of PlaylistTrackObject from a dict
playlist_track_object_form_dict = playlist_track_object.from_dict(playlist_track_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


