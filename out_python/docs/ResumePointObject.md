# ResumePointObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fully_played** | **bool** | Whether or not the episode has been fully played by the user.  | [optional] 
**resume_position_ms** | **int** | The user&#39;s most recent position in the episode in milliseconds.  | [optional] 

## Example

```python
from openapi_client.models.resume_point_object import ResumePointObject

# TODO update the JSON string below
json = "{}"
# create an instance of ResumePointObject from a JSON string
resume_point_object_instance = ResumePointObject.from_json(json)
# print the JSON string representation of the object
print ResumePointObject.to_json()

# convert the object into a dict
resume_point_object_dict = resume_point_object_instance.to_dict()
# create an instance of ResumePointObject from a dict
resume_point_object_form_dict = resume_point_object.from_dict(resume_point_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


