package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import tommy.spotify.model.ContextObject;
import tommy.spotify.model.TrackObject;

@Canonical
class PlayHistoryObject {
    
    TrackObject track
    /* The date and time the track was played. */
    Date playedAt
    
    ContextObject context
}
