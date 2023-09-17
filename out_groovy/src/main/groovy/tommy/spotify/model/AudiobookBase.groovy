package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import tommy.spotify.model.AuthorObject;
import tommy.spotify.model.CopyrightObject;
import tommy.spotify.model.ExternalUrlObject;
import tommy.spotify.model.ImageObject;
import tommy.spotify.model.NarratorObject;

@Canonical
class AudiobookBase {
    /* The author(s) for the audiobook.  */
    List<AuthorObject> authors = new ArrayList<>()
    /* A list of the countries in which the audiobook can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.  */
    List<String> availableMarkets = new ArrayList<>()
    /* The copyright statements of the audiobook.  */
    List<CopyrightObject> copyrights = new ArrayList<>()
    /* A description of the audiobook. HTML tags are stripped away from this field, use `html_description` field in case HTML tags are needed.  */
    String description
    /* A description of the audiobook. This field may contain HTML tags.  */
    String htmlDescription
    /* The edition of the audiobook.  */
    String edition
    /* Whether or not the audiobook has explicit content (true = yes it does; false = no it does not OR unknown).  */
    Boolean explicit
    
    ExternalUrlObject externalUrls
    /* A link to the Web API endpoint providing full details of the audiobook.  */
    String href
    /* The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the audiobook.  */
    String id
    /* The cover art for the audiobook in various sizes, widest first.  */
    List<ImageObject> images = new ArrayList<>()
    /* A list of the languages used in the audiobook, identified by their [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code.  */
    List<String> languages = new ArrayList<>()
    /* The media type of the audiobook.  */
    String mediaType
    /* The name of the audiobook.  */
    String name
    /* The narrator(s) for the audiobook.  */
    List<NarratorObject> narrators = new ArrayList<>()
    /* The publisher of the audiobook.  */
    String publisher

    enum TypeEnum {
    
        AUDIOBOOK("audiobook")
    
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
    /* The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the audiobook.  */
    String uri
    /* The number of chapters in this audiobook.  */
    Integer totalChapters
}
