package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PagingObject {
    /* A link to the Web API endpoint returning the full result of the request  */
    String href
    /* The maximum number of items in the response (as set in the query or by default).  */
    Integer limit
    /* URL to the next page of items. ( `null` if none)  */
    String next
    /* The offset of the items returned (as set in the query or by default)  */
    Integer offset
    /* URL to the previous page of items. ( `null` if none)  */
    String previous
    /* The total number of items available to return.  */
    Integer total
}
