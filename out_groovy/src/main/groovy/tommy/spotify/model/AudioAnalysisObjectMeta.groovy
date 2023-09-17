package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class AudioAnalysisObjectMeta {
    /* The version of the Analyzer used to analyze this track. */
    String analyzerVersion
    /* The platform used to read the track's audio data. */
    String platform
    /* A detailed status code for this track. If analysis data is missing, this code may explain why. */
    String detailedStatus
    /* The return code of the analyzer process. 0 if successful, 1 if any errors occurred. */
    Integer statusCode
    /* The Unix timestamp (in seconds) at which this track was analyzed. */
    Integer timestamp
    /* The amount of time taken to analyze this track. */
    BigDecimal analysisTime
    /* The method used to read the track's audio data. */
    String inputProcess
}
