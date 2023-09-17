# FollowersObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **str** | This will always be set to null, as the Web API does not support it at the moment.  | [optional] 
**total** | **int** | The total number of followers.  | [optional] 

## Example

```python
from openapi_client.models.followers_object import FollowersObject

# TODO update the JSON string below
json = "{}"
# create an instance of FollowersObject from a JSON string
followers_object_instance = FollowersObject.from_json(json)
# print the JSON string representation of the object
print FollowersObject.to_json()

# convert the object into a dict
followers_object_dict = followers_object_instance.to_dict()
# create an instance of FollowersObject from a dict
followers_object_form_dict = followers_object.from_dict(followers_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


