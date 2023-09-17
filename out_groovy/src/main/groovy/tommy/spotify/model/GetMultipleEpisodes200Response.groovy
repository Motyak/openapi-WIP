package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import tommy.spotify.model.EpisodeObject;

@Canonical
class GetMultipleEpisodes200Response {
    
    List<EpisodeObject> episodes = new ArrayList<>()
}
