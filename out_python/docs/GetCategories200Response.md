# GetCategories200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categories** | [**GetCategories200ResponseCategories**](GetCategories200ResponseCategories.md) |  | 

## Example

```python
from openapi_client.models.get_categories200_response import GetCategories200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetCategories200Response from a JSON string
get_categories200_response_instance = GetCategories200Response.from_json(json)
# print the JSON string representation of the object
print GetCategories200Response.to_json()

# convert the object into a dict
get_categories200_response_dict = get_categories200_response_instance.to_dict()
# create an instance of GetCategories200Response from a dict
get_categories200_response_form_dict = get_categories200_response.from_dict(get_categories200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


