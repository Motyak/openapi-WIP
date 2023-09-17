# SimplifiedArtistObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_urls** | [**ExternalUrlObject**](ExternalUrlObject.md) |  | [optional] 
**href** | **str** | A link to the Web API endpoint providing full details of the artist.  | [optional] 
**id** | **str** | The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the artist.  | [optional] 
**name** | **str** | The name of the artist.  | [optional] 
**type** | **str** | The object type.  | [optional] 
**uri** | **str** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the artist.  | [optional] 

## Example

```python
from openapi_client.models.simplified_artist_object import SimplifiedArtistObject

# TODO update the JSON string below
json = "{}"
# create an instance of SimplifiedArtistObject from a JSON string
simplified_artist_object_instance = SimplifiedArtistObject.from_json(json)
# print the JSON string representation of the object
print SimplifiedArtistObject.to_json()

# convert the object into a dict
simplified_artist_object_dict = simplified_artist_object_instance.to_dict()
# create an instance of SimplifiedArtistObject from a dict
simplified_artist_object_form_dict = simplified_artist_object.from_dict(simplified_artist_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


