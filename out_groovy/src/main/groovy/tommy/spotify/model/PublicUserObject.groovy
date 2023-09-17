package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import tommy.spotify.model.ExternalUrlObject;
import tommy.spotify.model.FollowersObject;
import tommy.spotify.model.ImageObject;

@Canonical
class PublicUserObject {
    /* The name displayed on the user's profile. `null` if not available.  */
    String displayName
    
    ExternalUrlObject externalUrls
    
    FollowersObject followers
    /* A link to the Web API endpoint for this user.  */
    String href
    /* The [Spotify user ID](/documentation/web-api/concepts/spotify-uris-ids) for this user.  */
    String id
    /* The user's profile image.  */
    List<ImageObject> images

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
