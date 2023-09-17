# CategoryObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **str** | A link to the Web API endpoint returning full details of the category.  | 
**icons** | [**List[ImageObject]**](ImageObject.md) | The category icon, in various sizes.  | 
**id** | **str** | The [Spotify category ID](/documentation/web-api/concepts/spotify-uris-ids) of the category.  | 
**name** | **str** | The name of the category.  | 

## Example

```python
from openapi_client.models.category_object import CategoryObject

# TODO update the JSON string below
json = "{}"
# create an instance of CategoryObject from a JSON string
category_object_instance = CategoryObject.from_json(json)
# print the JSON string representation of the object
print CategoryObject.to_json()

# convert the object into a dict
category_object_dict = category_object_instance.to_dict()
# create an instance of CategoryObject from a dict
category_object_form_dict = category_object.from_dict(category_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


