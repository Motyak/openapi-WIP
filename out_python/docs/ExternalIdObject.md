# ExternalIdObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isrc** | **str** | [International Standard Recording Code](http://en.wikipedia.org/wiki/International_Standard_Recording_Code)  | [optional] 
**ean** | **str** | [International Article Number](http://en.wikipedia.org/wiki/International_Article_Number_%28EAN%29)  | [optional] 
**upc** | **str** | [Universal Product Code](http://en.wikipedia.org/wiki/Universal_Product_Code)  | [optional] 

## Example

```python
from openapi_client.models.external_id_object import ExternalIdObject

# TODO update the JSON string below
json = "{}"
# create an instance of ExternalIdObject from a JSON string
external_id_object_instance = ExternalIdObject.from_json(json)
# print the JSON string representation of the object
print ExternalIdObject.to_json()

# convert the object into a dict
external_id_object_dict = external_id_object_instance.to_dict()
# create an instance of ExternalIdObject from a dict
external_id_object_form_dict = external_id_object.from_dict(external_id_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


