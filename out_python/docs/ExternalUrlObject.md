# ExternalUrlObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**spotify** | **str** | The [Spotify URL](/documentation/web-api/concepts/spotify-uris-ids) for the object.  | [optional] 

## Example

```python
from openapi_client.models.external_url_object import ExternalUrlObject

# TODO update the JSON string below
json = "{}"
# create an instance of ExternalUrlObject from a JSON string
external_url_object_instance = ExternalUrlObject.from_json(json)
# print the JSON string representation of the object
print ExternalUrlObject.to_json()

# convert the object into a dict
external_url_object_dict = external_url_object_instance.to_dict()
# create an instance of ExternalUrlObject from a dict
external_url_object_form_dict = external_url_object.from_dict(external_url_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


