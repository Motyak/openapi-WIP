package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

@Canonical
class TransferAUsersPlaybackRequest {
    /* A JSON array containing the ID of the device on which playback should be started/transferred.<br/>For example:`{device_ids:[\"74ASZWbe4lXaubB36ztrGX\"]}`<br/>_**Note**: Although an array is accepted, only a single device_id is currently supported. Supplying more than one will return `400 Bad Request`_  */
    List<String> deviceIds = new ArrayList<>()
    /* **true**: ensure playback happens on new device.<br/>**false** or not provided: keep the current playback state.  */
    Boolean play
}
