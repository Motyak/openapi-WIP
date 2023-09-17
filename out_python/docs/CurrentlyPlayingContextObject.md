# CurrentlyPlayingContextObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device** | [**DeviceObject**](DeviceObject.md) |  | [optional] 
**repeat_state** | **str** | off, track, context | [optional] 
**shuffle_state** | **bool** | If shuffle is on or off. | [optional] 
**context** | [**ContextObject**](ContextObject.md) |  | [optional] 
**timestamp** | **int** | Unix Millisecond Timestamp when data was fetched. | [optional] 
**progress_ms** | **int** | Progress into the currently playing track or episode. Can be &#x60;null&#x60;. | [optional] 
**is_playing** | **bool** | If something is currently playing, return &#x60;true&#x60;. | [optional] 
**item** | [**QueueObjectCurrentlyPlaying**](QueueObjectCurrentlyPlaying.md) |  | [optional] 
**currently_playing_type** | **str** | The object type of the currently playing item. Can be one of &#x60;track&#x60;, &#x60;episode&#x60;, &#x60;ad&#x60; or &#x60;unknown&#x60;.  | [optional] 
**actions** | [**DisallowsObject**](DisallowsObject.md) |  | [optional] 

## Example

```python
from openapi_client.models.currently_playing_context_object import CurrentlyPlayingContextObject

# TODO update the JSON string below
json = "{}"
# create an instance of CurrentlyPlayingContextObject from a JSON string
currently_playing_context_object_instance = CurrentlyPlayingContextObject.from_json(json)
# print the JSON string representation of the object
print CurrentlyPlayingContextObject.to_json()

# convert the object into a dict
currently_playing_context_object_dict = currently_playing_context_object_instance.to_dict()
# create an instance of CurrentlyPlayingContextObject from a dict
currently_playing_context_object_form_dict = currently_playing_context_object.from_dict(currently_playing_context_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


