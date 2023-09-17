package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import tommy.spotify.model.ContextObject;
import tommy.spotify.model.DisallowsObject;
import tommy.spotify.model.QueueObjectCurrentlyPlaying;

@Canonical
class CurrentlyPlayingObject {
    
    ContextObject context
    /* Unix Millisecond Timestamp when data was fetched */
    Integer timestamp
    /* Progress into the currently playing track or episode. Can be `null`. */
    Integer progressMs
    /* If something is currently playing, return `true`. */
    Boolean isPlaying
    
    QueueObjectCurrentlyPlaying item
    /* The object type of the currently playing item. Can be one of `track`, `episode`, `ad` or `unknown`.  */
    String currentlyPlayingType
    
    DisallowsObject actions
}
