package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import tommy.spotify.model.AlbumRestrictionObject;
import tommy.spotify.model.ExternalUrlObject;
import tommy.spotify.model.ImageObject;
import tommy.spotify.model.SimplifiedArtistObject;

@Canonical
class ArtistDiscographyAlbumObject {

    enum AlbumTypeEnum {
    
        ALBUM("album"),
        
        SINGLE("single"),
        
        COMPILATION("compilation")
    
        private final String value
    
        AlbumTypeEnum(String value) {
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

    /* The type of the album.  */
    AlbumTypeEnum albumType
    /* The number of tracks in the album. */
    Integer totalTracks
    /* The markets in which the album is available: [ISO 3166-1 alpha-2 country codes](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2). _**NOTE**: an album is considered available in a market when at least 1 of its tracks is available in that market._  */
    List<String> availableMarkets = new ArrayList<>()
    
    ExternalUrlObject externalUrls
    /* A link to the Web API endpoint providing full details of the album.  */
    String href
    /* The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the album.  */
    String id
    /* The cover art for the album in various sizes, widest first.  */
    List<ImageObject> images = new ArrayList<>()
    /* The name of the album. In case of an album takedown, the value may be an empty string.  */
    String name
    /* The date the album was first released.  */
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
    
    AlbumRestrictionObject restrictions

    enum TypeEnum {
    
        ALBUM("album")
    
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
    /* The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the album.  */
    String uri
    /* The artists of the album. Each artist object includes a link in `href` to more detailed information about the artist.  */
    List<SimplifiedArtistObject> artists = new ArrayList<>()

    enum AlbumGroupEnum {
    
        ALBUM("album"),
        
        SINGLE("single"),
        
        COMPILATION("compilation"),
        
        APPEARS_ON("appears_on")
    
        private final String value
    
        AlbumGroupEnum(String value) {
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

    /* This field describes the relationship between the artist and the album.  */
    AlbumGroupEnum albumGroup
}
