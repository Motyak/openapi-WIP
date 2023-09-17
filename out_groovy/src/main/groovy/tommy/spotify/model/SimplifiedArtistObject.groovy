package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import tommy.spotify.model.ExternalUrlObject;

@Canonical
class SimplifiedArtistObject {
    
    ExternalUrlObject externalUrls
    /* A link to the Web API endpoint providing full details of the artist.  */
    String href
    /* The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the artist.  */
    String id
    /* The name of the artist.  */
    String name

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
