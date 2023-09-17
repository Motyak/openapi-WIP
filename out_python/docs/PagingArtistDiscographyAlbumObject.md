# PagingArtistDiscographyAlbumObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **str** | A link to the Web API endpoint returning the full result of the request  | 
**limit** | **int** | The maximum number of items in the response (as set in the query or by default).  | 
**next** | **str** | URL to the next page of items. ( &#x60;null&#x60; if none)  | 
**offset** | **int** | The offset of the items returned (as set in the query or by default)  | 
**previous** | **str** | URL to the previous page of items. ( &#x60;null&#x60; if none)  | 
**total** | **int** | The total number of items available to return.  | 
**items** | [**List[ArtistDiscographyAlbumObject]**](ArtistDiscographyAlbumObject.md) |  | 

## Example

```python
from openapi_client.models.paging_artist_discography_album_object import PagingArtistDiscographyAlbumObject

# TODO update the JSON string below
json = "{}"
# create an instance of PagingArtistDiscographyAlbumObject from a JSON string
paging_artist_discography_album_object_instance = PagingArtistDiscographyAlbumObject.from_json(json)
# print the JSON string representation of the object
print PagingArtistDiscographyAlbumObject.to_json()

# convert the object into a dict
paging_artist_discography_album_object_dict = paging_artist_discography_album_object_instance.to_dict()
# create an instance of PagingArtistDiscographyAlbumObject from a dict
paging_artist_discography_album_object_form_dict = paging_artist_discography_album_object.from_dict(paging_artist_discography_album_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


