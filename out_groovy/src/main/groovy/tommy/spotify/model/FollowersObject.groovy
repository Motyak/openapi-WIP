package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class FollowersObject {
    /* This will always be set to null, as the Web API does not support it at the moment.  */
    String href
    /* The total number of followers.  */
    Integer total
}
