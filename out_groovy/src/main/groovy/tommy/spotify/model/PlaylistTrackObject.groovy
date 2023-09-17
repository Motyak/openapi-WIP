package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import tommy.spotify.model.PlaylistTrackObjectTrack;
import tommy.spotify.model.PlaylistUserObject;

@Canonical
class PlaylistTrackObject {
    /* The date and time the track or episode was added. _**Note**: some very old playlists may return `null` in this field._  */
    Date addedAt
    
    PlaylistUserObject addedBy
    /* Whether this track or episode is a [local file](/documentation/web-api/concepts/playlists/#local-files) or not.  */
    Boolean isLocal
    
    PlaylistTrackObjectTrack track
}
