# AuthorObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the author.  | [optional] 

## Example

```python
from openapi_client.models.author_object import AuthorObject

# TODO update the JSON string below
json = "{}"
# create an instance of AuthorObject from a JSON string
author_object_instance = AuthorObject.from_json(json)
# print the JSON string representation of the object
print AuthorObject.to_json()

# convert the object into a dict
author_object_dict = author_object_instance.to_dict()
# create an instance of AuthorObject from a dict
author_object_form_dict = author_object.from_dict(author_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


