package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;

@Canonical
class CreatePlaylistRequest {
    /* The name for the new playlist, for example `\"Your Coolest Playlist\"`. This name does not need to be unique; a user may have several playlists with the same name.  */
    String name
    /* Defaults to `true`. If `true` the playlist will be public, if `false` it will be private. To be able to create private playlists, the user must have granted the `playlist-modify-private` [scope](/documentation/web-api/concepts/scopes/#list-of-scopes)  */
    Boolean _public
    /* Defaults to `false`. If `true` the playlist will be collaborative. _**Note**: to create a collaborative playlist you must also set `public` to `false`. To create collaborative playlists you must have granted `playlist-modify-private` and `playlist-modify-public` [scopes](/documentation/web-api/concepts/scopes/#list-of-scopes)._  */
    Boolean collaborative
    /* value for playlist description as displayed in Spotify Clients and in the Web API.  */
    String description
}
