# GetCategories200ResponseCategories


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **str** | A link to the Web API endpoint returning the full result of the request  | 
**limit** | **int** | The maximum number of items in the response (as set in the query or by default).  | 
**next** | **str** | URL to the next page of items. ( &#x60;null&#x60; if none)  | 
**offset** | **int** | The offset of the items returned (as set in the query or by default)  | 
**previous** | **str** | URL to the previous page of items. ( &#x60;null&#x60; if none)  | 
**total** | **int** | The total number of items available to return.  | 
**items** | [**List[CategoryObject]**](CategoryObject.md) |  | 

## Example

```python
from openapi_client.models.get_categories200_response_categories import GetCategories200ResponseCategories

# TODO update the JSON string below
json = "{}"
# create an instance of GetCategories200ResponseCategories from a JSON string
get_categories200_response_categories_instance = GetCategories200ResponseCategories.from_json(json)
# print the JSON string representation of the object
print GetCategories200ResponseCategories.to_json()

# convert the object into a dict
get_categories200_response_categories_dict = get_categories200_response_categories_instance.to_dict()
# create an instance of GetCategories200ResponseCategories from a dict
get_categories200_response_categories_form_dict = get_categories200_response_categories.from_dict(get_categories200_response_categories_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


