# CursorPagingObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **str** | A link to the Web API endpoint returning the full result of the request. | [optional] 
**limit** | **int** | The maximum number of items in the response (as set in the query or by default). | [optional] 
**next** | **str** | URL to the next page of items. ( &#x60;null&#x60; if none) | [optional] 
**cursors** | [**CursorObject**](CursorObject.md) |  | [optional] 
**total** | **int** | The total number of items available to return. | [optional] 

## Example

```python
from openapi_client.models.cursor_paging_object import CursorPagingObject

# TODO update the JSON string below
json = "{}"
# create an instance of CursorPagingObject from a JSON string
cursor_paging_object_instance = CursorPagingObject.from_json(json)
# print the JSON string representation of the object
print CursorPagingObject.to_json()

# convert the object into a dict
cursor_paging_object_dict = cursor_paging_object_instance.to_dict()
# create an instance of CursorPagingObject from a dict
cursor_paging_object_form_dict = cursor_paging_object.from_dict(cursor_paging_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


