# ArtistObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**external_urls** | [**ExternalUrlObject**](ExternalUrlObject.md) |  | [optional] 
**followers** | [**FollowersObject**](FollowersObject.md) |  | [optional] 
**genres** | **List[str]** | A list of the genres the artist is associated with. If not yet classified, the array is empty.  | [optional] 
**href** | **str** | A link to the Web API endpoint providing full details of the artist.  | [optional] 
**id** | **str** | The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the artist.  | [optional] 
**images** | [**List[ImageObject]**](ImageObject.md) | Images of the artist in various sizes, widest first.  | [optional] 
**name** | **str** | The name of the artist.  | [optional] 
**popularity** | **int** | The popularity of the artist. The value will be between 0 and 100, with 100 being the most popular. The artist&#39;s popularity is calculated from the popularity of all the artist&#39;s tracks.  | [optional] 
**type** | **str** | The object type.  | [optional] 
**uri** | **str** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the artist.  | [optional] 

## Example

```python
from openapi_client.models.artist_object import ArtistObject

# TODO update the JSON string below
json = "{}"
# create an instance of ArtistObject from a JSON string
artist_object_instance = ArtistObject.from_json(json)
# print the JSON string representation of the object
print ArtistObject.to_json()

# convert the object into a dict
artist_object_dict = artist_object_instance.to_dict()
# create an instance of ArtistObject from a dict
artist_object_form_dict = artist_object.from_dict(artist_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


