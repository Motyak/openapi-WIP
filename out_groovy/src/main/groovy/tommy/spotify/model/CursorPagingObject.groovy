package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import tommy.spotify.model.CursorObject;

@Canonical
class CursorPagingObject {
    /* A link to the Web API endpoint returning the full result of the request. */
    String href
    /* The maximum number of items in the response (as set in the query or by default). */
    Integer limit
    /* URL to the next page of items. ( `null` if none) */
    String next
    
    CursorObject cursors
    /* The total number of items available to return. */
    Integer total
}
