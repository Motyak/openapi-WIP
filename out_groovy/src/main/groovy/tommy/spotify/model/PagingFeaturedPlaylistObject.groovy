package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import tommy.spotify.model.PagingPlaylistObject;

@Canonical
class PagingFeaturedPlaylistObject {
    
    String message
    
    PagingPlaylistObject playlists
}
