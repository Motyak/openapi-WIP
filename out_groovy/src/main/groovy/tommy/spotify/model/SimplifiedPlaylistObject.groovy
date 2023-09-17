package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import tommy.spotify.model.ExternalUrlObject;
import tommy.spotify.model.ImageObject;
import tommy.spotify.model.PlaylistOwnerObject;
import tommy.spotify.model.PlaylistTracksRefObject;

@Canonical
class SimplifiedPlaylistObject {
    /* `true` if the owner allows other users to modify the playlist.  */
    Boolean collaborative
    /* The playlist description. _Only returned for modified, verified playlists, otherwise_ `null`.  */
    String description
    
    ExternalUrlObject externalUrls
    /* A link to the Web API endpoint providing full details of the playlist.  */
    String href
    /* The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the playlist.  */
    String id
    /* Images for the playlist. The array may be empty or contain up to three images. The images are returned by size in descending order. See [Working with Playlists](/documentation/web-api/concepts/playlists). _**Note**: If returned, the source URL for the image (`url`) is temporary and will expire in less than a day._  */
    List<ImageObject> images
    /* The name of the playlist.  */
    String name
    
    PlaylistOwnerObject owner
    /* The playlist's public/private status: `true` the playlist is public, `false` the playlist is private, `null` the playlist status is not relevant. For more about public/private status, see [Working with Playlists](/documentation/web-api/concepts/playlists)  */
    Boolean _public
    /* The version identifier for the current playlist. Can be supplied in other requests to target a specific playlist version  */
    String snapshotId
    
    PlaylistTracksRefObject tracks
    /* The object type: \"playlist\"  */
    String type
    /* The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the playlist.  */
    String uri
}
