# SavedTrackObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**added_at** | **datetime** | The date and time the track was saved. Timestamps are returned in ISO 8601 format as Coordinated Universal Time (UTC) with a zero offset: YYYY-MM-DDTHH:MM:SSZ. If the time is imprecise (for example, the date/time of an album release), an additional field indicates the precision; see for example, release_date in an album object.  | [optional] 
**track** | [**TrackObject**](TrackObject.md) |  | [optional] 

## Example

```python
from openapi_client.models.saved_track_object import SavedTrackObject

# TODO update the JSON string below
json = "{}"
# create an instance of SavedTrackObject from a JSON string
saved_track_object_instance = SavedTrackObject.from_json(json)
# print the JSON string representation of the object
print SavedTrackObject.to_json()

# convert the object into a dict
saved_track_object_dict = saved_track_object_instance.to_dict()
# create an instance of SavedTrackObject from a dict
saved_track_object_form_dict = saved_track_object.from_dict(saved_track_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


