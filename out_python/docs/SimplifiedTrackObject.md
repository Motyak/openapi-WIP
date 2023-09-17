# SimplifiedTrackObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**artists** | [**List[SimplifiedArtistObject]**](SimplifiedArtistObject.md) | The artists who performed the track. Each artist object includes a link in &#x60;href&#x60; to more detailed information about the artist. | [optional] 
**available_markets** | **List[str]** | A list of the countries in which the track can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.  | [optional] 
**disc_number** | **int** | The disc number (usually &#x60;1&#x60; unless the album consists of more than one disc). | [optional] 
**duration_ms** | **int** | The track length in milliseconds. | [optional] 
**explicit** | **bool** | Whether or not the track has explicit lyrics ( &#x60;true&#x60; &#x3D; yes it does; &#x60;false&#x60; &#x3D; no it does not OR unknown). | [optional] 
**external_urls** | [**ExternalUrlObject**](ExternalUrlObject.md) |  | [optional] 
**href** | **str** | A link to the Web API endpoint providing full details of the track. | [optional] 
**id** | **str** | The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the track.  | [optional] 
**is_playable** | **bool** | Part of the response when [Track Relinking](/documentation/web-api/concepts/track-relinking/) is applied. If &#x60;true&#x60;, the track is playable in the given market. Otherwise &#x60;false&#x60;.  | [optional] 
**linked_from** | [**LinkedTrackObject**](LinkedTrackObject.md) |  | [optional] 
**restrictions** | [**TrackRestrictionObject**](TrackRestrictionObject.md) |  | [optional] 
**name** | **str** | The name of the track. | [optional] 
**preview_url** | **str** | A URL to a 30 second preview (MP3 format) of the track.  | [optional] 
**track_number** | **int** | The number of the track. If an album has several discs, the track number is the number on the specified disc.  | [optional] 
**type** | **str** | The object type: \&quot;track\&quot;.  | [optional] 
**uri** | **str** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the track.  | [optional] 
**is_local** | **bool** | Whether or not the track is from a local file.  | [optional] 

## Example

```python
from openapi_client.models.simplified_track_object import SimplifiedTrackObject

# TODO update the JSON string below
json = "{}"
# create an instance of SimplifiedTrackObject from a JSON string
simplified_track_object_instance = SimplifiedTrackObject.from_json(json)
# print the JSON string representation of the object
print SimplifiedTrackObject.to_json()

# convert the object into a dict
simplified_track_object_dict = simplified_track_object_instance.to_dict()
# create an instance of SimplifiedTrackObject from a dict
simplified_track_object_form_dict = simplified_track_object.from_dict(simplified_track_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


