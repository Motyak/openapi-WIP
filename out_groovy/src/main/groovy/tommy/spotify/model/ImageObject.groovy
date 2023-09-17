package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ImageObject {
    /* The source URL of the image.  */
    String url
    /* The image height in pixels.  */
    Integer height
    /* The image width in pixels.  */
    Integer width
}
