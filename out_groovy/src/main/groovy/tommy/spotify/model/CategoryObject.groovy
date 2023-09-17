package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import tommy.spotify.model.ImageObject;

@Canonical
class CategoryObject {
    /* A link to the Web API endpoint returning full details of the category.  */
    String href
    /* The category icon, in various sizes.  */
    List<ImageObject> icons = new ArrayList<>()
    /* The [Spotify category ID](/documentation/web-api/concepts/spotify-uris-ids) of the category.  */
    String id
    /* The name of the category.  */
    String name
}
