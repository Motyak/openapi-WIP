package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import tommy.spotify.model.ExternalUrlObject;

@Canonical
class ContextObject {
    /* The object type, e.g. \"artist\", \"playlist\", \"album\", \"show\".  */
    String type
    /* A link to the Web API endpoint providing full details of the track. */
    String href
    
    ExternalUrlObject externalUrls
    /* The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the context.  */
    String uri
}
