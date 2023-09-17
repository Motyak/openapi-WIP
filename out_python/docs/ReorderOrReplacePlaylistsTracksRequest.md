# ReorderOrReplacePlaylistsTracksRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uris** | **List[str]** |  | [optional] 
**range_start** | **int** | The position of the first item to be reordered.  | [optional] 
**insert_before** | **int** | The position where the items should be inserted.&lt;br/&gt;To reorder the items to the end of the playlist, simply set _insert_before_ to the position after the last item.&lt;br/&gt;Examples:&lt;br/&gt;To reorder the first item to the last position in a playlist with 10 items, set _range_start_ to 0, and _insert_before_ to 10.&lt;br/&gt;To reorder the last item in a playlist with 10 items to the start of the playlist, set _range_start_ to 9, and _insert_before_ to 0.  | [optional] 
**range_length** | **int** | The amount of items to be reordered. Defaults to 1 if not set.&lt;br/&gt;The range of items to be reordered begins from the _range_start_ position, and includes the _range_length_ subsequent items.&lt;br/&gt;Example:&lt;br/&gt;To move the items at index 9-10 to the start of the playlist, _range_start_ is set to 9, and _range_length_ is set to 2.  | [optional] 
**snapshot_id** | **str** | The playlist&#39;s snapshot ID against which you want to make the changes.  | [optional] 

## Example

```python
from openapi_client.models.reorder_or_replace_playlists_tracks_request import ReorderOrReplacePlaylistsTracksRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ReorderOrReplacePlaylistsTracksRequest from a JSON string
reorder_or_replace_playlists_tracks_request_instance = ReorderOrReplacePlaylistsTracksRequest.from_json(json)
# print the JSON string representation of the object
print ReorderOrReplacePlaylistsTracksRequest.to_json()

# convert the object into a dict
reorder_or_replace_playlists_tracks_request_dict = reorder_or_replace_playlists_tracks_request_instance.to_dict()
# create an instance of ReorderOrReplacePlaylistsTracksRequest from a dict
reorder_or_replace_playlists_tracks_request_form_dict = reorder_or_replace_playlists_tracks_request.from_dict(reorder_or_replace_playlists_tracks_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


