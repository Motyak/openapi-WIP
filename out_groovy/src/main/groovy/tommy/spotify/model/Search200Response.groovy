package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import tommy.spotify.model.PagingArtistObject;
import tommy.spotify.model.PagingPlaylistObject;
import tommy.spotify.model.PagingSimplifiedAlbumObject;
import tommy.spotify.model.PagingSimplifiedAudiobookObject;
import tommy.spotify.model.PagingSimplifiedEpisodeObject;
import tommy.spotify.model.PagingSimplifiedShowObject;
import tommy.spotify.model.PagingTrackObject;

@Canonical
class Search200Response {
    
    PagingTrackObject tracks
    
    PagingArtistObject artists
    
    PagingSimplifiedAlbumObject albums
    
    PagingPlaylistObject playlists
    
    PagingSimplifiedShowObject shows
    
    PagingSimplifiedEpisodeObject episodes
    
    PagingSimplifiedAudiobookObject audiobooks
}
