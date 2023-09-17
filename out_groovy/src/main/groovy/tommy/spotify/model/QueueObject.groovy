package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import tommy.spotify.model.QueueObjectCurrentlyPlaying;
import tommy.spotify.model.QueueObjectQueueInner;

@Canonical
class QueueObject {
    
    QueueObjectCurrentlyPlaying currentlyPlaying
    /* The tracks or episodes in the queue. Can be empty. */
    List<QueueObjectQueueInner> queue
}
