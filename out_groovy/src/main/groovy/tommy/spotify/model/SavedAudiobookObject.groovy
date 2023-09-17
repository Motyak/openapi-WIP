package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import tommy.spotify.model.AudiobookObject;

@Canonical
class SavedAudiobookObject {
    /* The date and time the audiobook was saved Timestamps are returned in ISO 8601 format as Coordinated Universal Time (UTC) with a zero offset: YYYY-MM-DDTHH:MM:SSZ. If the time is imprecise (for example, the date/time of an album release), an additional field indicates the precision; see for example, release_date in an album object.  */
    Date addedAt
    
    AudiobookObject audiobook
}
