# PagingFeaturedPlaylistObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**playlists** | [**PagingPlaylistObject**](PagingPlaylistObject.md) |  | [optional] 

## Example

```python
from openapi_client.models.paging_featured_playlist_object import PagingFeaturedPlaylistObject

# TODO update the JSON string below
json = "{}"
# create an instance of PagingFeaturedPlaylistObject from a JSON string
paging_featured_playlist_object_instance = PagingFeaturedPlaylistObject.from_json(json)
# print the JSON string representation of the object
print PagingFeaturedPlaylistObject.to_json()

# convert the object into a dict
paging_featured_playlist_object_dict = paging_featured_playlist_object_instance.to_dict()
# create an instance of PagingFeaturedPlaylistObject from a dict
paging_featured_playlist_object_form_dict = paging_featured_playlist_object.from_dict(paging_featured_playlist_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


