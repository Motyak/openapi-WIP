package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ExternalUrlObject {
    /* The [Spotify URL](/documentation/web-api/concepts/spotify-uris-ids) for the object.  */
    String spotify
}
