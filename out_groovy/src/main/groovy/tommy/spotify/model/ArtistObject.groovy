package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import tommy.spotify.model.ExternalUrlObject;
import tommy.spotify.model.FollowersObject;
import tommy.spotify.model.ImageObject;

@Canonical
class ArtistObject {
    
    ExternalUrlObject externalUrls
    
    FollowersObject followers
    /* A list of the genres the artist is associated with. If not yet classified, the array is empty.  */
    List<String> genres
    /* A link to the Web API endpoint providing full details of the artist.  */
    String href
    /* The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the artist.  */
    String id
    /* Images of the artist in various sizes, widest first.  */
    List<ImageObject> images
    /* The name of the artist.  */
    String name
    /* The popularity of the artist. The value will be between 0 and 100, with 100 being the most popular. The artist's popularity is calculated from the popularity of all the artist's tracks.  */
    Integer popularity

    enum TypeEnum {
    
        ARTIST("artist")
    
        private final String value
    
        TypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The object type.  */
    TypeEnum type
    /* The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the artist.  */
    String uri
}
