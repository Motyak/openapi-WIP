# ContextObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The object type, e.g. \&quot;artist\&quot;, \&quot;playlist\&quot;, \&quot;album\&quot;, \&quot;show\&quot;.  | [optional] 
**href** | **str** | A link to the Web API endpoint providing full details of the track. | [optional] 
**external_urls** | [**ExternalUrlObject**](ExternalUrlObject.md) |  | [optional] 
**uri** | **str** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the context.  | [optional] 

## Example

```python
from openapi_client.models.context_object import ContextObject

# TODO update the JSON string below
json = "{}"
# create an instance of ContextObject from a JSON string
context_object_instance = ContextObject.from_json(json)
# print the JSON string representation of the object
print ContextObject.to_json()

# convert the object into a dict
context_object_dict = context_object_instance.to_dict()
# create an instance of ContextObject from a dict
context_object_form_dict = context_object.from_dict(context_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


