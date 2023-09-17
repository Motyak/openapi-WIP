# GetAnArtistsTopTracks200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tracks** | [**List[TrackObject]**](TrackObject.md) |  | 

## Example

```python
from openapi_client.models.get_an_artists_top_tracks200_response import GetAnArtistsTopTracks200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetAnArtistsTopTracks200Response from a JSON string
get_an_artists_top_tracks200_response_instance = GetAnArtistsTopTracks200Response.from_json(json)
# print the JSON string representation of the object
print GetAnArtistsTopTracks200Response.to_json()

# convert the object into a dict
get_an_artists_top_tracks200_response_dict = get_an_artists_top_tracks200_response_instance.to_dict()
# create an instance of GetAnArtistsTopTracks200Response from a dict
get_an_artists_top_tracks200_response_form_dict = get_an_artists_top_tracks200_response.from_dict(get_an_artists_top_tracks200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


