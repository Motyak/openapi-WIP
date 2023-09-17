package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PlaylistTracksRefObject {
    /* A link to the Web API endpoint where full details of the playlist's tracks can be retrieved.  */
    String href
    /* Number of tracks in the playlist.  */
    Integer total
}
