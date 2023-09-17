# AlbumObject


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
**artists** | [**List[SimplifiedArtistObject]**](SimplifiedArtistObject.md) | The artists of the album. Each artist object includes a link in &#x60;href&#x60; to more detailed information about the artist.  | 
**tracks** | [**PagingSimplifiedTrackObject**](PagingSimplifiedTrackObject.md) |  | 
**copyrights** | [**List[CopyrightObject]**](CopyrightObject.md) | The copyright statements of the album.  | 
**external_ids** | [**ExternalIdObject**](ExternalIdObject.md) |  | 
**genres** | **List[str]** | A list of the genres the album is associated with. If not yet classified, the array is empty.  | 
**label** | **str** | The label associated with the album.  | 
**popularity** | **int** | The popularity of the album. The value will be between 0 and 100, with 100 being the most popular.  | 

## Example

```python
from openapi_client.models.album_object import AlbumObject

# TODO update the JSON string below
json = "{}"
# create an instance of AlbumObject from a JSON string
album_object_instance = AlbumObject.from_json(json)
# print the JSON string representation of the object
print AlbumObject.to_json()

# convert the object into a dict
album_object_dict = album_object_instance.to_dict()
# create an instance of AlbumObject from a dict
album_object_form_dict = album_object.from_dict(album_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


