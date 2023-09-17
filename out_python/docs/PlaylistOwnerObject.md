# PlaylistOwnerObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_urls** | [**ExternalUrlObject**](ExternalUrlObject.md) |  | [optional] 
**followers** | [**FollowersObject**](FollowersObject.md) |  | [optional] 
**href** | **str** | A link to the Web API endpoint for this user.  | [optional] 
**id** | **str** | The [Spotify user ID](/documentation/web-api/concepts/spotify-uris-ids) for this user.  | [optional] 
**type** | **str** | The object type.  | [optional] 
**uri** | **str** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for this user.  | [optional] 
**display_name** | **str** | The name displayed on the user&#39;s profile. &#x60;null&#x60; if not available.  | [optional] 

## Example

```python
from openapi_client.models.playlist_owner_object import PlaylistOwnerObject

# TODO update the JSON string below
json = "{}"
# create an instance of PlaylistOwnerObject from a JSON string
playlist_owner_object_instance = PlaylistOwnerObject.from_json(json)
# print the JSON string representation of the object
print PlaylistOwnerObject.to_json()

# convert the object into a dict
playlist_owner_object_dict = playlist_owner_object_instance.to_dict()
# create an instance of PlaylistOwnerObject from a dict
playlist_owner_object_form_dict = playlist_owner_object.from_dict(playlist_owner_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


