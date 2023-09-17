package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import tommy.spotify.model.ArtistObject;
import tommy.spotify.model.EpisodeObject;
import tommy.spotify.model.EpisodeRestrictionObject;
import tommy.spotify.model.ExternalIdObject;
import tommy.spotify.model.ExternalUrlObject;
import tommy.spotify.model.ImageObject;
import tommy.spotify.model.LinkedTrackObject;
import tommy.spotify.model.ResumePointObject;
import tommy.spotify.model.SimplifiedAlbumObject;
import tommy.spotify.model.SimplifiedShowObject;
import tommy.spotify.model.TrackObject;

@Canonical
class QueueObjectCurrentlyPlaying {
    
    SimplifiedAlbumObject album
    /* The artists who performed the track. Each artist object includes a link in `href` to more detailed information about the artist.  */
    List<ArtistObject> artists
    /* A list of the countries in which the track can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.  */
    List<String> availableMarkets
    /* The disc number (usually `1` unless the album consists of more than one disc).  */
    Integer discNumber
    /* The episode length in milliseconds.  */
    Integer durationMs
    /* Whether or not the episode has explicit content (true = yes it does; false = no it does not OR unknown).  */
    Boolean explicit
    
    ExternalIdObject externalIds
    
    ExternalUrlObject externalUrls
    /* A link to the Web API endpoint providing full details of the episode.  */
    String href
    /* The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the episode.  */
    String id
    /* True if the episode is playable in the given market. Otherwise false.  */
    Boolean isPlayable
    
    LinkedTrackObject linkedFrom
    
    EpisodeRestrictionObject restrictions
    /* The name of the episode.  */
    String name
    /* The popularity of the track. The value will be between 0 and 100, with 100 being the most popular.<br/>The popularity of a track is a value between 0 and 100, with 100 being the most popular. The popularity is calculated by algorithm and is based, in the most part, on the total number of plays the track has had and how recent those plays are.<br/>Generally speaking, songs that are being played a lot now will have a higher popularity than songs that were played a lot in the past. Duplicate tracks (e.g. the same track from a single and an album) are rated independently. Artist and album popularity is derived mathematically from track popularity. _**Note**: the popularity value may lag actual popularity by a few days: the value is not updated in real time._  */
    Integer popularity
    /* A link to a 30 second preview (MP3 format) of the track. Can be `null`  */
    String previewUrl
    /* The number of the track. If an album has several discs, the track number is the number on the specified disc.  */
    Integer trackNumber

    enum TypeEnum {
    
        TRACK("track"),
        
        EPISODE("episode")
    
        private final String value
    
        TypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The object type: \"track\".  */
    TypeEnum type
    /* The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the episode.  */
    String uri
    /* Whether or not the track is from a local file.  */
    Boolean isLocal
    /* A URL to a 30 second preview (MP3 format) of the episode. `null` if not available.  */
    String audioPreviewUrl
    /* A description of the episode. HTML tags are stripped away from this field, use `html_description` field in case HTML tags are needed.  */
    String description
    /* A description of the episode. This field may contain HTML tags.  */
    String htmlDescription
    /* The cover art for the episode in various sizes, widest first.  */
    List<ImageObject> images = new ArrayList<>()
    /* True if the episode is hosted outside of Spotify's CDN.  */
    Boolean isExternallyHosted
    /* The language used in the episode, identified by a [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code. This field is deprecated and might be removed in the future. Please use the `languages` field instead.  */
    String language
    /* A list of the languages used in the episode, identified by their [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639) code.  */
    List<String> languages = new ArrayList<>()
    /* The date the episode was first released, for example `\"1981-12-15\"`. Depending on the precision, it might be shown as `\"1981\"` or `\"1981-12\"`.  */
    String releaseDate

    enum ReleaseDatePrecisionEnum {
    
        YEAR("year"),
        
        MONTH("month"),
        
        DAY("day")
    
        private final String value
    
        ReleaseDatePrecisionEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The precision with which `release_date` value is known.  */
    ReleaseDatePrecisionEnum releaseDatePrecision
    
    ResumePointObject resumePoint
    
    SimplifiedShowObject show
}
