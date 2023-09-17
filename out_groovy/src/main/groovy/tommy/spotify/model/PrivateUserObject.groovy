package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import tommy.spotify.model.ExplicitContentSettingsObject;
import tommy.spotify.model.ExternalUrlObject;
import tommy.spotify.model.FollowersObject;
import tommy.spotify.model.ImageObject;

@Canonical
class PrivateUserObject {
    /* The country of the user, as set in the user's account profile. An [ISO 3166-1 alpha-2 country code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). _This field is only available when the current user has granted access to the [user-read-private](/documentation/web-api/concepts/scopes/#list-of-scopes) scope._  */
    String country
    /* The name displayed on the user's profile. `null` if not available.  */
    String displayName
    /* The user's email address, as entered by the user when creating their account. _**Important!** This email address is unverified; there is no proof that it actually belongs to the user._ _This field is only available when the current user has granted access to the [user-read-email](/documentation/web-api/concepts/scopes/#list-of-scopes) scope._  */
    String email
    
    ExplicitContentSettingsObject explicitContent
    
    ExternalUrlObject externalUrls
    
    FollowersObject followers
    /* A link to the Web API endpoint for this user.  */
    String href
    /* The [Spotify user ID](/documentation/web-api/concepts/spotify-uris-ids) for the user.  */
    String id
    /* The user's profile image. */
    List<ImageObject> images
    /* The user's Spotify subscription level: \"premium\", \"free\", etc. (The subscription level \"open\" can be considered the same as \"free\".) _This field is only available when the current user has granted access to the [user-read-private](/documentation/web-api/concepts/scopes/#list-of-scopes) scope._  */
    String product
    /* The object type: \"user\"  */
    String type
    /* The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the user.  */
    String uri
}
