package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;

@Canonical
class FollowPlaylistRequest {
    /* Defaults to `true`. If `true` the playlist will be included in user's public playlists, if `false` it will remain private.  */
    Boolean _public
}
