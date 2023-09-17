package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import tommy.spotify.model.ExternalUrlObject;
import tommy.spotify.model.FollowersObject;

@Canonical
class PlaylistUserObject {
    
    ExternalUrlObject externalUrls
    
    FollowersObject followers
    /* A link to the Web API endpoint for this user.  */
    String href
    /* The [Spotify user ID](/documentation/web-api/concepts/spotify-uris-ids) for this user.  */
    String id

    enum TypeEnum {
    
        USER("user")
    
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
    /* The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for this user.  */
    String uri
}
