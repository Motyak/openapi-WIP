# LinkedTrackObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_urls** | [**ExternalUrlObject**](ExternalUrlObject.md) |  | [optional] 
**href** | **str** | A link to the Web API endpoint providing full details of the track.  | [optional] 
**id** | **str** | The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the track.  | [optional] 
**type** | **str** | The object type: \&quot;track\&quot;.  | [optional] 
**uri** | **str** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the track.  | [optional] 

## Example

```python
from openapi_client.models.linked_track_object import LinkedTrackObject

# TODO update the JSON string below
json = "{}"
# create an instance of LinkedTrackObject from a JSON string
linked_track_object_instance = LinkedTrackObject.from_json(json)
# print the JSON string representation of the object
print LinkedTrackObject.to_json()

# convert the object into a dict
linked_track_object_dict = linked_track_object_instance.to_dict()
# create an instance of LinkedTrackObject from a dict
linked_track_object_form_dict = linked_track_object.from_dict(linked_track_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


