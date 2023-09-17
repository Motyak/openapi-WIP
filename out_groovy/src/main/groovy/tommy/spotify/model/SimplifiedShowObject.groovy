package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import tommy.spotify.model.CopyrightObject;
import tommy.spotify.model.ExternalUrlObject;
import tommy.spotify.model.ImageObject;

@Canonical
class SimplifiedShowObject {
    /* A list of the countries in which the show can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.  */
    List<String> availableMarkets = new ArrayList<>()
    /* The copyright statements of the show.  */
    List<CopyrightObject> copyrights = new ArrayList<>()
    /* A description of the show. HTML tags are stripped away from this field, use `html_description` field in case HTML tags are needed.  */
    String description
    /* A description of the show. This field may contain HTML tags.  */
    String htmlDescription
    /* Whether or not the show has explicit content (true = yes it does; false = no it does not OR unknown).  */
    Boolean explicit
    
    ExternalUrlObject externalUrls
    /* A link to the Web API endpoint providing full details of the show.  */
    String href
    /* The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the show.  */
    String id
    /* The cover art for the show in various sizes, widest first.  */
    List<ImageObject> images = new ArrayList<>()
    /* True if all of the shows episodes are hosted outside of Spotify's CDN. This field might be `null` in some cases.  */
    Boolean isExternallyHosted
    /* A list of the languages used in the show, identified by their [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code.  */
    List<String> languages = new ArrayList<>()
    /* The media type of the show.  */
    String mediaType
    /* The name of the episode.  */
    String name
    /* The publisher of the show.  */
    String publisher

    enum TypeEnum {
    
        SHOW("show")
    
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
    /* The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the show.  */
    String uri
    /* The total number of episodes in the show.  */
    Integer totalEpisodes
}
