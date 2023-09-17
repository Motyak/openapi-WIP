package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ExplicitContentSettingsObject {
    /* When `true`, indicates that explicit content should not be played.  */
    Boolean filterEnabled
    /* When `true`, indicates that the explicit content setting is locked and can't be changed by the user.  */
    Boolean filterLocked
}
