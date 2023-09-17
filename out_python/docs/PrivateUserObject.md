# PrivateUserObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **str** | The country of the user, as set in the user&#39;s account profile. An [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). _This field is only available when the current user has granted access to the [user-read-private](/documentation/web-api/concepts/scopes/#list-of-scopes) scope._  | [optional] 
**display_name** | **str** | The name displayed on the user&#39;s profile. &#x60;null&#x60; if not available.  | [optional] 
**email** | **str** | The user&#39;s email address, as entered by the user when creating their account. _**Important!** This email address is unverified; there is no proof that it actually belongs to the user._ _This field is only available when the current user has granted access to the [user-read-email](/documentation/web-api/concepts/scopes/#list-of-scopes) scope._  | [optional] 
**explicit_content** | [**ExplicitContentSettingsObject**](ExplicitContentSettingsObject.md) |  | [optional] 
**external_urls** | [**ExternalUrlObject**](ExternalUrlObject.md) |  | [optional] 
**followers** | [**FollowersObject**](FollowersObject.md) |  | [optional] 
**href** | **str** | A link to the Web API endpoint for this user.  | [optional] 
**id** | **str** | The [Spotify user ID](/documentation/web-api/concepts/spotify-uris-ids) for the user.  | [optional] 
**images** | [**List[ImageObject]**](ImageObject.md) | The user&#39;s profile image. | [optional] 
**product** | **str** | The user&#39;s Spotify subscription level: \&quot;premium\&quot;, \&quot;free\&quot;, etc. (The subscription level \&quot;open\&quot; can be considered the same as \&quot;free\&quot;.) _This field is only available when the current user has granted access to the [user-read-private](/documentation/web-api/concepts/scopes/#list-of-scopes) scope._  | [optional] 
**type** | **str** | The object type: \&quot;user\&quot;  | [optional] 
**uri** | **str** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the user.  | [optional] 

## Example

```python
from openapi_client.models.private_user_object import PrivateUserObject

# TODO update the JSON string below
json = "{}"
# create an instance of PrivateUserObject from a JSON string
private_user_object_instance = PrivateUserObject.from_json(json)
# print the JSON string representation of the object
print PrivateUserObject.to_json()

# convert the object into a dict
private_user_object_dict = private_user_object_instance.to_dict()
# create an instance of PrivateUserObject from a dict
private_user_object_form_dict = private_user_object.from_dict(private_user_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


