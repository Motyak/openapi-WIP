package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import tommy.spotify.model.ExternalUrlObject;
import tommy.spotify.model.LinkedTrackObject;
import tommy.spotify.model.SimplifiedArtistObject;
import tommy.spotify.model.TrackRestrictionObject;

@Canonical
class SimplifiedTrackObject {
    /* The artists who performed the track. Each artist object includes a link in `href` to more detailed information about the artist. */
    List<SimplifiedArtistObject> artists
    /* A list of the countries in which the track can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.  */
    List<String> availableMarkets
    /* The disc number (usually `1` unless the album consists of more than one disc). */
    Integer discNumber
    /* The track length in milliseconds. */
    Integer durationMs
    /* Whether or not the track has explicit lyrics ( `true` = yes it does; `false` = no it does not OR unknown). */
    Boolean explicit
    
    ExternalUrlObject externalUrls
    /* A link to the Web API endpoint providing full details of the track. */
    String href
    /* The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the track.  */
    String id
    /* Part of the response when [Track Relinking](/documentation/web-api/concepts/track-relinking/) is applied. If `true`, the track is playable in the given market. Otherwise `false`.  */
    Boolean isPlayable
    
    LinkedTrackObject linkedFrom
    
    TrackRestrictionObject restrictions
    /* The name of the track. */
    String name
    /* A URL to a 30 second preview (MP3 format) of the track.  */
    String previewUrl
    /* The number of the track. If an album has several discs, the track number is the number on the specified disc.  */
    Integer trackNumber
    /* The object type: \"track\".  */
    String type
    /* The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the track.  */
    String uri
    /* Whether or not the track is from a local file.  */
    Boolean isLocal
}
