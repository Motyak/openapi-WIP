package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RecommendationSeedObject {
    /* The number of tracks available after min\\_\\* and max\\_\\* filters have been applied.  */
    Integer afterFilteringSize
    /* The number of tracks available after relinking for regional availability.  */
    Integer afterRelinkingSize
    /* A link to the full track or artist data for this seed. For tracks this will be a link to a Track Object. For artists a link to an Artist Object. For genre seeds, this value will be `null`.  */
    String href
    /* The id used to select this seed. This will be the same as the string used in the `seed_artists`, `seed_tracks` or `seed_genres` parameter.  */
    String id
    /* The number of recommended tracks available for this seed.  */
    Integer initialPoolSize
    /* The entity type of this seed. One of `artist`, `track` or `genre`.  */
    String type
}
