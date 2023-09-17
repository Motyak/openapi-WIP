package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;

@Canonical
class ChangePlaylistDetailsRequest {
    /* The new name for the playlist, for example `\"My New Playlist Title\"`  */
    String name
    /* If `true` the playlist will be public, if `false` it will be private.  */
    Boolean _public
    /* If `true`, the playlist will become collaborative and other users will be able to modify the playlist in their Spotify client. <br/> _**Note**: You can only set `collaborative` to `true` on non-public playlists._  */
    Boolean collaborative
    /* Value for playlist description as displayed in Spotify Clients and in the Web API.  */
    String description
}
