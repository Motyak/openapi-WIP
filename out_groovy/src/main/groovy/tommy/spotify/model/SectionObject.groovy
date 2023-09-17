package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class SectionObject {
    /* The starting point (in seconds) of the section. */
    BigDecimal start
    /* The duration (in seconds) of the section. */
    BigDecimal duration
    /* The confidence, from 0.0 to 1.0, of the reliability of the section's \"designation\". */
    BigDecimal confidence
    /* The overall loudness of the section in decibels (dB). Loudness values are useful for comparing relative loudness of sections within tracks. */
    BigDecimal loudness
    /* The overall estimated tempo of the section in beats per minute (BPM). In musical terminology, tempo is the speed or pace of a given piece and derives directly from the average beat duration. */
    BigDecimal tempo
    /* The confidence, from 0.0 to 1.0, of the reliability of the tempo. Some tracks contain tempo changes or sounds which don't contain tempo (like pure speech) which would correspond to a low value in this field. */
    BigDecimal tempoConfidence
    /* The estimated overall key of the section. The values in this field ranging from 0 to 11 mapping to pitches using standard Pitch Class notation (E.g. 0 = C, 1 = C♯/D♭, 2 = D, and so on). If no key was detected, the value is -1. */
    Integer key
    /* The confidence, from 0.0 to 1.0, of the reliability of the key. Songs with many key changes may correspond to low values in this field. */
    BigDecimal keyConfidence

    enum ModeEnum {
    
        NUMBER_MINUS_1(new BigDecimal("-1")),
        
        NUMBER_0(new BigDecimal("0")),
        
        NUMBER_1(new BigDecimal("1"))
    
        private final BigDecimal value
    
        ModeEnum(BigDecimal value) {
            this.value = value
        }
    
        BigDecimal getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* Indicates the modality (major or minor) of a section, the type of scale from which its melodic content is derived. This field will contain a 0 for \"minor\", a 1 for \"major\", or a -1 for no result. Note that the major key (e.g. C major) could more likely be confused with the minor key at 3 semitones lower (e.g. A minor) as both keys carry the same pitches. */
    ModeEnum mode
    /* The confidence, from 0.0 to 1.0, of the reliability of the `mode`. */
    BigDecimal modeConfidence
    /* An estimated time signature. The time signature (meter) is a notational convention to specify how many beats are in each bar (or measure). The time signature ranges from 3 to 7 indicating time signatures of \"3/4\", to \"7/4\". */
    Integer timeSignature
    /* The confidence, from 0.0 to 1.0, of the reliability of the `time_signature`. Sections with time signature changes may correspond to low values in this field. */
    BigDecimal timeSignatureConfidence
}
