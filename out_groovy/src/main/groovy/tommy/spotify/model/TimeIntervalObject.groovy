package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class TimeIntervalObject {
    /* The starting point (in seconds) of the time interval. */
    BigDecimal start
    /* The duration (in seconds) of the time interval. */
    BigDecimal duration
    /* The confidence, from 0.0 to 1.0, of the reliability of the interval. */
    BigDecimal confidence
}
