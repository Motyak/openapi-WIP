# PlayHistoryObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**track** | [**TrackObject**](TrackObject.md) |  | [optional] 
**played_at** | **datetime** | The date and time the track was played. | [optional] 
**context** | [**ContextObject**](ContextObject.md) |  | [optional] 

## Example

```python
from openapi_client.models.play_history_object import PlayHistoryObject

# TODO update the JSON string below
json = "{}"
# create an instance of PlayHistoryObject from a JSON string
play_history_object_instance = PlayHistoryObject.from_json(json)
# print the JSON string representation of the object
print PlayHistoryObject.to_json()

# convert the object into a dict
play_history_object_dict = play_history_object_instance.to_dict()
# create an instance of PlayHistoryObject from a dict
play_history_object_form_dict = play_history_object.from_dict(play_history_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


