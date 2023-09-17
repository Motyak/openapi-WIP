# SavedEpisodeObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**added_at** | **datetime** | The date and time the episode was saved. Timestamps are returned in ISO 8601 format as Coordinated Universal Time (UTC) with a zero offset: YYYY-MM-DDTHH:MM:SSZ.  | [optional] 
**episode** | [**EpisodeObject**](EpisodeObject.md) |  | [optional] 

## Example

```python
from openapi_client.models.saved_episode_object import SavedEpisodeObject

# TODO update the JSON string below
json = "{}"
# create an instance of SavedEpisodeObject from a JSON string
saved_episode_object_instance = SavedEpisodeObject.from_json(json)
# print the JSON string representation of the object
print SavedEpisodeObject.to_json()

# convert the object into a dict
saved_episode_object_dict = saved_episode_object_instance.to_dict()
# create an instance of SavedEpisodeObject from a dict
saved_episode_object_form_dict = saved_episode_object.from_dict(saved_episode_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


