# QueueObjectCurrentlyPlaying

The currently playing track or episode. Can be `null`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**album** | [**SimplifiedAlbumObject**](SimplifiedAlbumObject.md) |  | [optional] 
**artists** | [**List[ArtistObject]**](ArtistObject.md) | The artists who performed the track. Each artist object includes a link in &#x60;href&#x60; to more detailed information about the artist.  | [optional] 
**available_markets** | **List[str]** | A list of the countries in which the track can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.  | [optional] 
**disc_number** | **int** | The disc number (usually &#x60;1&#x60; unless the album consists of more than one disc).  | [optional] 
**duration_ms** | **int** | The episode length in milliseconds.  | 
**explicit** | **bool** | Whether or not the episode has explicit content (true &#x3D; yes it does; false &#x3D; no it does not OR unknown).  | 
**external_ids** | [**ExternalIdObject**](ExternalIdObject.md) |  | [optional] 
**external_urls** | [**ExternalUrlObject**](ExternalUrlObject.md) |  | 
**href** | **str** | A link to the Web API endpoint providing full details of the episode.  | 
**id** | **str** | The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the episode.  | 
**is_playable** | **bool** | True if the episode is playable in the given market. Otherwise false.  | 
**linked_from** | [**LinkedTrackObject**](LinkedTrackObject.md) |  | [optional] 
**restrictions** | [**EpisodeRestrictionObject**](EpisodeRestrictionObject.md) |  | [optional] 
**name** | **str** | The name of the episode.  | 
**popularity** | **int** | The popularity of the track. The value will be between 0 and 100, with 100 being the most popular.&lt;br/&gt;The popularity of a track is a value between 0 and 100, with 100 being the most popular. The popularity is calculated by algorithm and is based, in the most part, on the total number of plays the track has had and how recent those plays are.&lt;br/&gt;Generally speaking, songs that are being played a lot now will have a higher popularity than songs that were played a lot in the past. Duplicate tracks (e.g. the same track from a single and an album) are rated independently. Artist and album popularity is derived mathematically from track popularity. _**Note**: the popularity value may lag actual popularity by a few days: the value is not updated in real time._  | [optional] 
**preview_url** | **str** | A link to a 30 second preview (MP3 format) of the track. Can be &#x60;null&#x60;  | [optional] 
**track_number** | **int** | The number of the track. If an album has several discs, the track number is the number on the specified disc.  | [optional] 
**type** | **str** | The object type: \&quot;track\&quot;.  | 
**uri** | **str** | The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the episode.  | 
**is_local** | **bool** | Whether or not the track is from a local file.  | [optional] 
**audio_preview_url** | **str** | A URL to a 30 second preview (MP3 format) of the episode. &#x60;null&#x60; if not available.  | 
**description** | **str** | A description of the episode. HTML tags are stripped away from this field, use &#x60;html_description&#x60; field in case HTML tags are needed.  | 
**html_description** | **str** | A description of the episode. This field may contain HTML tags.  | 
**images** | [**List[ImageObject]**](ImageObject.md) | The cover art for the episode in various sizes, widest first.  | 
**is_externally_hosted** | **bool** | True if the episode is hosted outside of Spotify&#39;s CDN.  | 
**language** | **str** | The language used in the episode, identified by a [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code. This field is deprecated and might be removed in the future. Please use the &#x60;languages&#x60; field instead.  | [optional] 
**languages** | **List[str]** | A list of the languages used in the episode, identified by their [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639) code.  | 
**release_date** | **str** | The date the episode was first released, for example &#x60;\&quot;1981-12-15\&quot;&#x60;. Depending on the precision, it might be shown as &#x60;\&quot;1981\&quot;&#x60; or &#x60;\&quot;1981-12\&quot;&#x60;.  | 
**release_date_precision** | **str** | The precision with which &#x60;release_date&#x60; value is known.  | 
**resume_point** | [**ResumePointObject**](ResumePointObject.md) |  | 
**show** | [**SimplifiedShowObject**](SimplifiedShowObject.md) |  | 

## Example

```python
from openapi_client.models.queue_object_currently_playing import QueueObjectCurrentlyPlaying

# TODO update the JSON string below
json = "{}"
# create an instance of QueueObjectCurrentlyPlaying from a JSON string
queue_object_currently_playing_instance = QueueObjectCurrentlyPlaying.from_json(json)
# print the JSON string representation of the object
print QueueObjectCurrentlyPlaying.to_json()

# convert the object into a dict
queue_object_currently_playing_dict = queue_object_currently_playing_instance.to_dict()
# create an instance of QueueObjectCurrentlyPlaying from a dict
queue_object_currently_playing_form_dict = queue_object_currently_playing.from_dict(queue_object_currently_playing_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


