# StartAUsersPlaybackRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**context_uri** | **str** | Optional. Spotify URI of the context to play. Valid contexts are albums, artists &amp; playlists. &#x60;{context_uri:\&quot;spotify:album:1Je1IMUlBXcx1Fz0WE7oPT\&quot;}&#x60;  | [optional] 
**uris** | **List[str]** | Optional. A JSON array of the Spotify track URIs to play. For example: &#x60;{\&quot;uris\&quot;: [\&quot;spotify:track:4iV5W9uYEdYUVa79Axb7Rh\&quot;, \&quot;spotify:track:1301WleyT98MSxVHPZCA6M\&quot;]}&#x60;  | [optional] 
**offset** | **Dict[str, object]** | Optional. Indicates from where in the context playback should start. Only available when context_uri corresponds to an album or playlist object \&quot;position\&quot; is zero based and can’t be negative. Example: &#x60;\&quot;offset\&quot;: {\&quot;position\&quot;: 5}&#x60; \&quot;uri\&quot; is a string representing the uri of the item to start at. Example: &#x60;\&quot;offset\&quot;: {\&quot;uri\&quot;: \&quot;spotify:track:1301WleyT98MSxVHPZCA6M\&quot;}&#x60;  | [optional] 
**position_ms** | **int** | Indicates from what position to start playback. Must be a positive number. Passing in a position that is greater than the length of the track will cause the player to start playing the next song.  | [optional] 

## Example

```python
from openapi_client.models.start_a_users_playback_request import StartAUsersPlaybackRequest

# TODO update the JSON string below
json = "{}"
# create an instance of StartAUsersPlaybackRequest from a JSON string
start_a_users_playback_request_instance = StartAUsersPlaybackRequest.from_json(json)
# print the JSON string representation of the object
print StartAUsersPlaybackRequest.to_json()

# convert the object into a dict
start_a_users_playback_request_dict = start_a_users_playback_request_instance.to_dict()
# create an instance of StartAUsersPlaybackRequest from a dict
start_a_users_playback_request_form_dict = start_a_users_playback_request.from_dict(start_a_users_playback_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


