# SavedAlbumObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**added_at** | **datetime** | The date and time the album was saved Timestamps are returned in ISO 8601 format as Coordinated Universal Time (UTC) with a zero offset: YYYY-MM-DDTHH:MM:SSZ. If the time is imprecise (for example, the date/time of an album release), an additional field indicates the precision; see for example, release_date in an album object.  | [optional] 
**album** | [**AlbumObject**](AlbumObject.md) |  | [optional] 

## Example

```python
from openapi_client.models.saved_album_object import SavedAlbumObject

# TODO update the JSON string below
json = "{}"
# create an instance of SavedAlbumObject from a JSON string
saved_album_object_instance = SavedAlbumObject.from_json(json)
# print the JSON string representation of the object
print SavedAlbumObject.to_json()

# convert the object into a dict
saved_album_object_dict = saved_album_object_instance.to_dict()
# create an instance of SavedAlbumObject from a dict
saved_album_object_form_dict = saved_album_object.from_dict(saved_album_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


