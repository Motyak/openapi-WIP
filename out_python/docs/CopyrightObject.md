# CopyrightObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** | The copyright text for this content.  | [optional] 
**type** | **str** | The type of copyright: &#x60;C&#x60; &#x3D; the copyright, &#x60;P&#x60; &#x3D; the sound recording (performance) copyright.  | [optional] 

## Example

```python
from openapi_client.models.copyright_object import CopyrightObject

# TODO update the JSON string below
json = "{}"
# create an instance of CopyrightObject from a JSON string
copyright_object_instance = CopyrightObject.from_json(json)
# print the JSON string representation of the object
print CopyrightObject.to_json()

# convert the object into a dict
copyright_object_dict = copyright_object_instance.to_dict()
# create an instance of CopyrightObject from a dict
copyright_object_form_dict = copyright_object.from_dict(copyright_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


