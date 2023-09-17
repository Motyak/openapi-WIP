# PagingPlaylistTrackObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | **str** | A link to the Web API endpoint returning the full result of the request  | 
**limit** | **int** | The maximum number of items in the response (as set in the query or by default).  | 
**next** | **str** | URL to the next page of items. ( &#x60;null&#x60; if none)  | 
**offset** | **int** | The offset of the items returned (as set in the query or by default)  | 
**previous** | **str** | URL to the previous page of items. ( &#x60;null&#x60; if none)  | 
**total** | **int** | The total number of items available to return.  | 
**items** | [**List[PlaylistTrackObject]**](PlaylistTrackObject.md) |  | 

## Example

```python
from openapi_client.models.paging_playlist_track_object import PagingPlaylistTrackObject

# TODO update the JSON string below
json = "{}"
# create an instance of PagingPlaylistTrackObject from a JSON string
paging_playlist_track_object_instance = PagingPlaylistTrackObject.from_json(json)
# print the JSON string representation of the object
print PagingPlaylistTrackObject.to_json()

# convert the object into a dict
paging_playlist_track_object_dict = paging_playlist_track_object_instance.to_dict()
# create an instance of PagingPlaylistTrackObject from a dict
paging_playlist_track_object_form_dict = paging_playlist_track_object.from_dict(paging_playlist_track_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


