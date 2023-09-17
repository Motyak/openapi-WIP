package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import tommy.spotify.model.AlbumObject;

@Canonical
class GetMultipleAlbums200Response {
    
    List<AlbumObject> albums = new ArrayList<>()
}
