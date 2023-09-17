# QueueObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currently_playing** | [**QueueObjectCurrentlyPlaying**](QueueObjectCurrentlyPlaying.md) |  | [optional] 
**queue** | [**List[QueueObjectQueueInner]**](QueueObjectQueueInner.md) | The tracks or episodes in the queue. Can be empty. | [optional] 

## Example

```python
from openapi_client.models.queue_object import QueueObject

# TODO update the JSON string below
json = "{}"
# create an instance of QueueObject from a JSON string
queue_object_instance = QueueObject.from_json(json)
# print the JSON string representation of the object
print QueueObject.to_json()

# convert the object into a dict
queue_object_dict = queue_object_instance.to_dict()
# create an instance of QueueObject from a dict
queue_object_form_dict = queue_object.from_dict(queue_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


