# TrackObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**album** | [**SimplifiedAlbumObject**](SimplifiedAlbumObject.md) |  | [optional] 
**artists** | [**List[ArtistObject]**](ArtistObject.md) | The artists who performed the track. Each artist object includes a link in &#x60;href&#x60; to more detailed information about the artist.  | [optional] 
**available_markets** | **List[str]** | A list of the countries in which the track can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.  | [optional] 
**disc_number** | **int** | The disc number (usually &#x60;1&#x60; unless the album consists of more than one disc).  | [optional] 
**duration_ms** | **int** | The track length in milliseconds.  | [optional] 
**explicit** | **bool** | Whether or not the track has explicit lyrics ( &#x60;true&#x60; &#x3D; yes it does; &#x60;false&#x60; &#x3D; no it does not OR unknown).  | [optional] 
**external_ids** | [**ExternalIdObject**](ExternalIdObject.md) |  | [optional] 
**external_urls** | [**ExternalUrlObject**](ExternalUrlObject.md) |  | [optional] 
**href** | **str** | A link to the Web API endpoint providing full details of the track.  | [optional] 
**id** | **str** | The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the track.  | [optional] 
**is_playable** | **bool** | Part of the response when [Track Relinking](/documentation/web-api/concepts/track-relinking) is applied. If &#x60;true&#x60;, the track is playable in the given market. Otherwise &#x60;false&#x60;.  | [optional] 
**linked_from** | [**LinkedTrackObject**](LinkedTrackObject.md) |  | [optional] 
**restrictions** | [**TrackRestrictionObject**](TrackRestrictionObject.md) |  | [optional] 
**name** | **str** | The name of the track.  | [optional] 
**popularity** | **int** | The popularity of the track. The value will be between 0 and 100, with 100 being the most popular.&lt;br/&gt;The popularity of a track is a value between 0 and 100, with 100 being the most popular. The popularity is calculated by algorithm and is based, in the most part, on the total number of plays the track has had and how recent those plays are.&lt;br/&gt;Generally speaking, songs that are being played a lot now will have a higher popularity than songs that were played a lot in the past. Duplicate tracks (e.g. the same track from a single and an album) are rated independently. Artist and album popularity is derived mathematically from track popularity. _**Note**: the popularity value may lag actual popularity by a few days: the value is not updated in real time._  | [optional] 
**preview_url** | **str** | A link to a 30 second preview (MP3 format) of the track. Can be &#x60;null&#x60;  | [optional] 
**track_number** | **int** | The number of the track. If an album has several discs, the track number is the number on the specified disc.  | [optional] 
**type** | **str** | The object type: \&quot;track\&quot;.  | [optional] 
**uri** | **str** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the track.  | [optional] 
**is_local** | **bool** | Whether or not the track is from a local file.  | [optional] 

## Example

```python
from openapi_client.models.track_object import TrackObject

# TODO update the JSON string below
json = "{}"
# create an instance of TrackObject from a JSON string
track_object_instance = TrackObject.from_json(json)
# print the JSON string representation of the object
print TrackObject.to_json()

# convert the object into a dict
track_object_dict = track_object_instance.to_dict()
# create an instance of TrackObject from a dict
track_object_form_dict = track_object.from_dict(track_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


