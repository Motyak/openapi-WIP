# PublicUserObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**display_name** | **str** | The name displayed on the user&#39;s profile. &#x60;null&#x60; if not available.  | [optional] 
**external_urls** | [**ExternalUrlObject**](ExternalUrlObject.md) |  | [optional] 
**followers** | [**FollowersObject**](FollowersObject.md) |  | [optional] 
**href** | **str** | A link to the Web API endpoint for this user.  | [optional] 
**id** | **str** | The [Spotify user ID](/documentation/web-api/concepts/spotify-uris-ids) for this user.  | [optional] 
**images** | [**List[ImageObject]**](ImageObject.md) | The user&#39;s profile image.  | [optional] 
**type** | **str** | The object type.  | [optional] 
**uri** | **str** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for this user.  | [optional] 

## Example

```python
from openapi_client.models.public_user_object import PublicUserObject

# TODO update the JSON string below
json = "{}"
# create an instance of PublicUserObject from a JSON string
public_user_object_instance = PublicUserObject.from_json(json)
# print the JSON string representation of the object
print PublicUserObject.to_json()

# convert the object into a dict
public_user_object_dict = public_user_object_instance.to_dict()
# create an instance of PublicUserObject from a dict
public_user_object_form_dict = public_user_object.from_dict(public_user_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


