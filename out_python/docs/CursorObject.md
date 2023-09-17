# CursorObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**after** | **str** | The cursor to use as key to find the next page of items. | [optional] 
**before** | **str** | The cursor to use as key to find the previous page of items. | [optional] 

## Example

```python
from openapi_client.models.cursor_object import CursorObject

# TODO update the JSON string below
json = "{}"
# create an instance of CursorObject from a JSON string
cursor_object_instance = CursorObject.from_json(json)
# print the JSON string representation of the object
print CursorObject.to_json()

# convert the object into a dict
cursor_object_dict = cursor_object_instance.to_dict()
# create an instance of CursorObject from a dict
cursor_object_form_dict = cursor_object.from_dict(cursor_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


