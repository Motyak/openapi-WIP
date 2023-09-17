package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ResumePointObject {
    /* Whether or not the episode has been fully played by the user.  */
    Boolean fullyPlayed
    /* The user's most recent position in the episode in milliseconds.  */
    Integer resumePositionMs
}
