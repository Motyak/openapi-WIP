package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import tommy.spotify.model.AudioFeaturesObject;

@Canonical
class GetSeveralAudioFeatures200Response {
    
    List<AudioFeaturesObject> audioFeatures = new ArrayList<>()
}
