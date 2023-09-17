package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

@Canonical
class StartAUsersPlaybackRequest {
    /* Optional. Spotify URI of the context to play. Valid contexts are albums, artists & playlists. `{context_uri:\"spotify:album:1Je1IMUlBXcx1Fz0WE7oPT\"}`  */
    String contextUri
    /* Optional. A JSON array of the Spotify track URIs to play. For example: `{\"uris\": [\"spotify:track:4iV5W9uYEdYUVa79Axb7Rh\", \"spotify:track:1301WleyT98MSxVHPZCA6M\"]}`  */
    List<String> uris
    /* Optional. Indicates from where in the context playback should start. Only available when context_uri corresponds to an album or playlist object \"position\" is zero based and can’t be negative. Example: `\"offset\": {\"position\": 5}` \"uri\" is a string representing the uri of the item to start at. Example: `\"offset\": {\"uri\": \"spotify:track:1301WleyT98MSxVHPZCA6M\"}`  */
    Map<String, Object> offset = new HashMap<>()
    /* Indicates from what position to start playback. Must be a positive number. Passing in a position that is greater than the length of the track will cause the player to start playing the next song.  */
    Integer positionMs
}
