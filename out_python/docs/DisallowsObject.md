# DisallowsObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interrupting_playback** | **bool** | Interrupting playback. Optional field. | [optional] 
**pausing** | **bool** | Pausing. Optional field. | [optional] 
**resuming** | **bool** | Resuming. Optional field. | [optional] 
**seeking** | **bool** | Seeking playback location. Optional field. | [optional] 
**skipping_next** | **bool** | Skipping to the next context. Optional field. | [optional] 
**skipping_prev** | **bool** | Skipping to the previous context. Optional field. | [optional] 
**toggling_repeat_context** | **bool** | Toggling repeat context flag. Optional field. | [optional] 
**toggling_shuffle** | **bool** | Toggling shuffle flag. Optional field. | [optional] 
**toggling_repeat_track** | **bool** | Toggling repeat track flag. Optional field. | [optional] 
**transferring_playback** | **bool** | Transfering playback between devices. Optional field. | [optional] 

## Example

```python
from openapi_client.models.disallows_object import DisallowsObject

# TODO update the JSON string below
json = "{}"
# create an instance of DisallowsObject from a JSON string
disallows_object_instance = DisallowsObject.from_json(json)
# print the JSON string representation of the object
print DisallowsObject.to_json()

# convert the object into a dict
disallows_object_dict = disallows_object_instance.to_dict()
# create an instance of DisallowsObject from a dict
disallows_object_form_dict = disallows_object.from_dict(disallows_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


