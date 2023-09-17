# ImageObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | The source URL of the image.  | 
**height** | **int** | The image height in pixels.  | 
**width** | **int** | The image width in pixels.  | 

## Example

```python
from openapi_client.models.image_object import ImageObject

# TODO update the JSON string below
json = "{}"
# create an instance of ImageObject from a JSON string
image_object_instance = ImageObject.from_json(json)
# print the JSON string representation of the object
print ImageObject.to_json()

# convert the object into a dict
image_object_dict = image_object_instance.to_dict()
# create an instance of ImageObject from a dict
image_object_form_dict = image_object.from_dict(image_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


