package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import tommy.spotify.model.PagingSimplifiedAlbumObject;

@Canonical
class GetNewReleases200Response {
    
    PagingSimplifiedAlbumObject albums
}
