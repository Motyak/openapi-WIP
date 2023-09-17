# PlaylistUserObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_urls** | [**ExternalUrlObject**](ExternalUrlObject.md) |  | [optional] 
**followers** | [**FollowersObject**](FollowersObject.md) |  | [optional] 
**href** | **str** | A link to the Web API endpoint for this user.  | [optional] 
**id** | **str** | The [Spotify user ID](/documentation/web-api/concepts/spotify-uris-ids) for this user.  | [optional] 
**type** | **str** | The object type.  | [optional] 
**uri** | **str** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for this user.  | [optional] 

## Example

```python
from openapi_client.models.playlist_user_object import PlaylistUserObject

# TODO update the JSON string below
json = "{}"
# create an instance of PlaylistUserObject from a JSON string
playlist_user_object_instance = PlaylistUserObject.from_json(json)
# print the JSON string representation of the object
print PlaylistUserObject.to_json()

# convert the object into a dict
playlist_user_object_dict = playlist_user_object_instance.to_dict()
# create an instance of PlaylistUserObject from a dict
playlist_user_object_form_dict = playlist_user_object.from_dict(playlist_user_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


