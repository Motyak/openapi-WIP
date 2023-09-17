package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import tommy.spotify.model.RecommendationSeedObject;
import tommy.spotify.model.TrackObject;

@Canonical
class RecommendationsObject {
    /* An array of recommendation seed objects.  */
    List<RecommendationSeedObject> seeds = new ArrayList<>()
    /* An array of track objects ordered according to the parameters supplied.  */
    List<TrackObject> tracks = new ArrayList<>()
}
