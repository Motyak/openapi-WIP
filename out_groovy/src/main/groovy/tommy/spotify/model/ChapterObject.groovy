package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import tommy.spotify.model.ChapterRestrictionObject;
import tommy.spotify.model.ExternalUrlObject;
import tommy.spotify.model.ImageObject;
import tommy.spotify.model.ResumePointObject;
import tommy.spotify.model.SimplifiedAudiobookObject;

@Canonical
class ChapterObject {
    /* A URL to a 30 second preview (MP3 format) of the episode. `null` if not available.  */
    String audioPreviewUrl
    /* A list of the countries in which the chapter can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code.  */
    List<String> availableMarkets
    /* The number of the chapter  */
    Integer chapterNumber
    /* A description of the episode. HTML tags are stripped away from this field, use `html_description` field in case HTML tags are needed.  */
    String description
    /* A description of the episode. This field may contain HTML tags.  */
    String htmlDescription
    /* The episode length in milliseconds.  */
    Integer durationMs
    /* Whether or not the episode has explicit content (true = yes it does; false = no it does not OR unknown).  */
    Boolean explicit
    
    ExternalUrlObject externalUrls
    /* A link to the Web API endpoint providing full details of the episode.  */
    String href
    /* The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the episode.  */
    String id
    /* The cover art for the episode in various sizes, widest first.  */
    List<ImageObject> images = new ArrayList<>()
    /* True if the episode is playable in the given market. Otherwise false.  */
    Boolean isPlayable
    /* A list of the languages used in the episode, identified by their [ISO 639-1](https://en.wikipedia.org/wiki/ISO_639) code.  */
    List<String> languages = new ArrayList<>()
    /* The name of the episode.  */
    String name
    /* The date the episode was first released, for example `\"1981-12-15\"`. Depending on the precision, it might be shown as `\"1981\"` or `\"1981-12\"`.  */
    String releaseDate

    enum ReleaseDatePrecisionEnum {
    
        YEAR("year"),
        
        MONTH("month"),
        
        DAY("day")
    
        private final String value
    
        ReleaseDatePrecisionEnum(String value) {
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

    /* The precision with which `release_date` value is known.  */
    ReleaseDatePrecisionEnum releaseDatePrecision
    
    ResumePointObject resumePoint

    enum TypeEnum {
    
        EPISODE("episode")
    
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
    /* The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the episode.  */
    String uri
    
    ChapterRestrictionObject restrictions
    
    SimplifiedAudiobookObject audiobook
}
