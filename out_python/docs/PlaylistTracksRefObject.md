# PlaylistTracksRefObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **str** | A link to the Web API endpoint where full details of the playlist&#39;s tracks can be retrieved.  | [optional] 
**total** | **int** | Number of tracks in the playlist.  | [optional] 

## Example

```python
from openapi_client.models.playlist_tracks_ref_object import PlaylistTracksRefObject

# TODO update the JSON string below
json = "{}"
# create an instance of PlaylistTracksRefObject from a JSON string
playlist_tracks_ref_object_instance = PlaylistTracksRefObject.from_json(json)
# print the JSON string representation of the object
print PlaylistTracksRefObject.to_json()

# convert the object into a dict
playlist_tracks_ref_object_dict = playlist_tracks_ref_object_instance.to_dict()
# create an instance of PlaylistTracksRefObject from a dict
playlist_tracks_ref_object_form_dict = playlist_tracks_ref_object.from_dict(playlist_tracks_ref_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


