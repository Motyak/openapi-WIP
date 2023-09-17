package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DisallowsObject {
    /* Interrupting playback. Optional field. */
    Boolean interruptingPlayback
    /* Pausing. Optional field. */
    Boolean pausing
    /* Resuming. Optional field. */
    Boolean resuming
    /* Seeking playback location. Optional field. */
    Boolean seeking
    /* Skipping to the next context. Optional field. */
    Boolean skippingNext
    /* Skipping to the previous context. Optional field. */
    Boolean skippingPrev
    /* Toggling repeat context flag. Optional field. */
    Boolean togglingRepeatContext
    /* Toggling shuffle flag. Optional field. */
    Boolean togglingShuffle
    /* Toggling repeat track flag. Optional field. */
    Boolean togglingRepeatTrack
    /* Transfering playback between devices. Optional field. */
    Boolean transferringPlayback
}
