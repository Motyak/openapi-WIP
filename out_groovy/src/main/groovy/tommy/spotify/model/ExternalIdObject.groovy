package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ExternalIdObject {
    /* [International Standard Recording Code](http://en.wikipedia.org/wiki/International_Standard_Recording_Code)  */
    String isrc
    /* [International Article Number](http://en.wikipedia.org/wiki/International_Article_Number_%28EAN%29)  */
    String ean
    /* [Universal Product Code](http://en.wikipedia.org/wiki/Universal_Product_Code)  */
    String upc
}
