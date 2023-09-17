package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import tommy.spotify.model.RemoveTracksPlaylistRequestTracksInner;

@Canonical
class RemoveTracksPlaylistRequest {
    /* An array of objects containing [Spotify URIs](/documentation/web-api/concepts/spotify-uris-ids) of the tracks or episodes to remove. For example: `{ \"tracks\": [{ \"uri\": \"spotify:track:4iV5W9uYEdYUVa79Axb7Rh\" },{ \"uri\": \"spotify:track:1301WleyT98MSxVHPZCA6M\" }] }`. A maximum of 100 objects can be sent at once.  */
    List<RemoveTracksPlaylistRequestTracksInner> tracks = new ArrayList<>()
    /* The playlist's snapshot ID against which you want to make the changes. The API will validate that the specified items exist and in the specified positions and make the changes, even if more recent changes have been made to the playlist.  */
    String snapshotId
}
