# ChapterRestrictionObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **str** | The reason for the restriction. Supported values: - &#x60;market&#x60; - The content item is not available in the given market. - &#x60;product&#x60; - The content item is not available for the user&#39;s subscription type. - &#x60;explicit&#x60; - The content item is explicit and the user&#39;s account is set to not play explicit content. - &#x60;payment_required&#x60; - Payment is required to play the content item.  Additional reasons may be added in the future. **Note**: If you use this field, make sure that your application safely handles unknown values.  | [optional] 

## Example

```python
from openapi_client.models.chapter_restriction_object import ChapterRestrictionObject

# TODO update the JSON string below
json = "{}"
# create an instance of ChapterRestrictionObject from a JSON string
chapter_restriction_object_instance = ChapterRestrictionObject.from_json(json)
# print the JSON string representation of the object
print ChapterRestrictionObject.to_json()

# convert the object into a dict
chapter_restriction_object_dict = chapter_restriction_object_instance.to_dict()
# create an instance of ChapterRestrictionObject from a dict
chapter_restriction_object_form_dict = chapter_restriction_object.from_dict(chapter_restriction_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


