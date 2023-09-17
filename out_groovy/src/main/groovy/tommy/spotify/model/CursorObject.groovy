package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CursorObject {
    /* The cursor to use as key to find the next page of items. */
    String after
    /* The cursor to use as key to find the previous page of items. */
    String before
}
