# ErrorObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **int** | The HTTP status code (also returned in the response header; see [Response Status Codes](/documentation/web-api/concepts/api-calls#response-status-codes) for more information).  | 
**message** | **str** | A short description of the cause of the error.  | 

## Example

```python
from openapi_client.models.error_object import ErrorObject

# TODO update the JSON string below
json = "{}"
# create an instance of ErrorObject from a JSON string
error_object_instance = ErrorObject.from_json(json)
# print the JSON string representation of the object
print ErrorObject.to_json()

# convert the object into a dict
error_object_dict = error_object_instance.to_dict()
# create an instance of ErrorObject from a dict
error_object_form_dict = error_object.from_dict(error_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


