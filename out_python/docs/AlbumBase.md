# AlbumBase


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**album_type** | **str** | The type of the album.  | 
**total_tracks** | **int** | The number of tracks in the album. | 
**available_markets** | **List[str]** | The markets in which the album is available: [ISO 3166-1 alpha-2 country codes](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). _**NOTE**: an album is considered available in a market when at least 1 of its tracks is available in that market._  | 
**external_urls** | [**ExternalUrlObject**](ExternalUrlObject.md) |  | 
**href** | **str** | A link to the Web API endpoint providing full details of the album.  | 
**id** | **str** | The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the album.  | 
**images** | [**List[ImageObject]**](ImageObject.md) | The cover art for the album in various sizes, widest first.  | 
**name** | **str** | The name of the album. In case of an album takedown, the value may be an empty string.  | 
**release_date** | **str** | The date the album was first released.  | 
**release_date_precision** | **str** | The precision with which &#x60;release_date&#x60; value is known.  | 
**restrictions** | [**AlbumRestrictionObject**](AlbumRestrictionObject.md) |  | [optional] 
**type** | **str** | The object type.  | 
**uri** | **str** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the album.  | 

## Example

```python
from openapi_client.models.album_base import AlbumBase

# TODO update the JSON string below
json = "{}"
# create an instance of AlbumBase from a JSON string
album_base_instance = AlbumBase.from_json(json)
# print the JSON string representation of the object
print AlbumBase.to_json()

# convert the object into a dict
album_base_dict = album_base_instance.to_dict()
# create an instance of AlbumBase from a dict
album_base_form_dict = album_base.from_dict(album_base_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


