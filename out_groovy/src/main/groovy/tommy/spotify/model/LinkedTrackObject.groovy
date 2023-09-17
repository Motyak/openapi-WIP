package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import tommy.spotify.model.ExternalUrlObject;

@Canonical
class LinkedTrackObject {
    
    ExternalUrlObject externalUrls
    /* A link to the Web API endpoint providing full details of the track.  */
    String href
    /* The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the track.  */
    String id
    /* The object type: \"track\".  */
    String type
    /* The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the track.  */
    String uri
}
