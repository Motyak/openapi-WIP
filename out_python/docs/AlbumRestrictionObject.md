# AlbumRestrictionObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **str** | The reason for the restriction. Albums may be restricted if the content is not available in a given market, to the user&#39;s subscription type, or when the user&#39;s account is set to not play explicit content. Additional reasons may be added in the future.  | [optional] 

## Example

```python
from openapi_client.models.album_restriction_object import AlbumRestrictionObject

# TODO update the JSON string below
json = "{}"
# create an instance of AlbumRestrictionObject from a JSON string
album_restriction_object_instance = AlbumRestrictionObject.from_json(json)
# print the JSON string representation of the object
print AlbumRestrictionObject.to_json()

# convert the object into a dict
album_restriction_object_dict = album_restriction_object_instance.to_dict()
# create an instance of AlbumRestrictionObject from a dict
album_restriction_object_form_dict = album_restriction_object.from_dict(album_restriction_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


