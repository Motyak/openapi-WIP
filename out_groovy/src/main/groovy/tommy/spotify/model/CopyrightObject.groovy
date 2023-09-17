package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CopyrightObject {
    /* The copyright text for this content.  */
    String text
    /* The type of copyright: `C` = the copyright, `P` = the sound recording (performance) copyright.  */
    String type
}
