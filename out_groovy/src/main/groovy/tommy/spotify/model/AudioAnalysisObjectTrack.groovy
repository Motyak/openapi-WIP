package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class AudioAnalysisObjectTrack {
    /* The exact number of audio samples analyzed from this track. See also `analysis_sample_rate`. */
    Integer numSamples
    /* Length of the track in seconds. */
    BigDecimal duration
    /* This field will always contain the empty string. */
    String sampleMd5
    /* An offset to the start of the region of the track that was analyzed. (As the entire track is analyzed, this should always be 0.) */
    Integer offsetSeconds
    /* The length of the region of the track was analyzed, if a subset of the track was analyzed. (As the entire track is analyzed, this should always be 0.) */
    Integer windowSeconds
    /* The sample rate used to decode and analyze this track. May differ from the actual sample rate of this track available on Spotify. */
    Integer analysisSampleRate
    /* The number of channels used for analysis. If 1, all channels are summed together to mono before analysis. */
    Integer analysisChannels
    /* The time, in seconds, at which the track's fade-in period ends. If the track has no fade-in, this will be 0.0. */
    BigDecimal endOfFadeIn
    /* The time, in seconds, at which the track's fade-out period starts. If the track has no fade-out, this should match the track's length. */
    BigDecimal startOfFadeOut
    /* The overall loudness of a track in decibels (dB). Loudness values are averaged across the entire track and are useful for comparing relative loudness of tracks. Loudness is the quality of a sound that is the primary psychological correlate of physical strength (amplitude). Values typically range between -60 and 0 db.  */
    Float loudness
    /* The overall estimated tempo of a track in beats per minute (BPM). In musical terminology, tempo is the speed or pace of a given piece and derives directly from the average beat duration.  */
    Float tempo
    /* The confidence, from 0.0 to 1.0, of the reliability of the `tempo`. */
    BigDecimal tempoConfidence
    /* An estimated time signature. The time signature (meter) is a notational convention to specify how many beats are in each bar (or measure). The time signature ranges from 3 to 7 indicating time signatures of \"3/4\", to \"7/4\". */
    Integer timeSignature
    /* The confidence, from 0.0 to 1.0, of the reliability of the `time_signature`. */
    BigDecimal timeSignatureConfidence
    /* The key the track is in. Integers map to pitches using standard [Pitch Class notation](https://en.wikipedia.org/wiki/Pitch_class). E.g. 0 = C, 1 = C♯/D♭, 2 = D, and so on. If no key was detected, the value is -1.  */
    Integer key
    /* The confidence, from 0.0 to 1.0, of the reliability of the `key`. */
    BigDecimal keyConfidence
    /* Mode indicates the modality (major or minor) of a track, the type of scale from which its melodic content is derived. Major is represented by 1 and minor is 0.  */
    Integer mode
    /* The confidence, from 0.0 to 1.0, of the reliability of the `mode`. */
    BigDecimal modeConfidence
    /* An [Echo Nest Musical Fingerprint (ENMFP)](https://academiccommons.columbia.edu/doi/10.7916/D8Q248M4) codestring for this track. */
    String codestring
    /* A version number for the Echo Nest Musical Fingerprint format used in the codestring field. */
    BigDecimal codeVersion
    /* An [EchoPrint](https://github.com/spotify/echoprint-codegen) codestring for this track. */
    String echoprintstring
    /* A version number for the EchoPrint format used in the echoprintstring field. */
    BigDecimal echoprintVersion
    /* A [Synchstring](https://github.com/echonest/synchdata) for this track. */
    String synchstring
    /* A version number for the Synchstring used in the synchstring field. */
    BigDecimal synchVersion
    /* A Rhythmstring for this track. The format of this string is similar to the Synchstring. */
    String rhythmstring
    /* A version number for the Rhythmstring used in the rhythmstring field. */
    BigDecimal rhythmVersion
}
