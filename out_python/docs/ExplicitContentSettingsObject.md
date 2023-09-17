# ExplicitContentSettingsObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter_enabled** | **bool** | When &#x60;true&#x60;, indicates that explicit content should not be played.  | [optional] 
**filter_locked** | **bool** | When &#x60;true&#x60;, indicates that the explicit content setting is locked and can&#39;t be changed by the user.  | [optional] 

## Example

```python
from openapi_client.models.explicit_content_settings_object import ExplicitContentSettingsObject

# TODO update the JSON string below
json = "{}"
# create an instance of ExplicitContentSettingsObject from a JSON string
explicit_content_settings_object_instance = ExplicitContentSettingsObject.from_json(json)
# print the JSON string representation of the object
print ExplicitContentSettingsObject.to_json()

# convert the object into a dict
explicit_content_settings_object_dict = explicit_content_settings_object_instance.to_dict()
# create an instance of ExplicitContentSettingsObject from a dict
explicit_content_settings_object_form_dict = explicit_content_settings_object.from_dict(explicit_content_settings_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


