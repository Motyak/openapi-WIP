# GetFollowed200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artists** | [**CursorPagingSimplifiedArtistObject**](CursorPagingSimplifiedArtistObject.md) |  | 

## Example

```python
from openapi_client.models.get_followed200_response import GetFollowed200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetFollowed200Response from a JSON string
get_followed200_response_instance = GetFollowed200Response.from_json(json)
# print the JSON string representation of the object
print GetFollowed200Response.to_json()

# convert the object into a dict
get_followed200_response_dict = get_followed200_response_instance.to_dict()
# create an instance of GetFollowed200Response from a dict
get_followed200_response_form_dict = get_followed200_response.from_dict(get_followed200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


