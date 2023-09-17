package tommy.spotify.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import tommy.spotify.model.AudioAnalysisObjectMeta;
import tommy.spotify.model.AudioAnalysisObjectTrack;
import tommy.spotify.model.SectionObject;
import tommy.spotify.model.SegmentObject;
import tommy.spotify.model.TimeIntervalObject;

@Canonical
class AudioAnalysisObject {
    
    AudioAnalysisObjectMeta meta
    
    AudioAnalysisObjectTrack track
    /* The time intervals of the bars throughout the track. A bar (or measure) is a segment of time defined as a given number of beats. */
    List<TimeIntervalObject> bars
    /* The time intervals of beats throughout the track. A beat is the basic time unit of a piece of music; for example, each tick of a metronome. Beats are typically multiples of tatums. */
    List<TimeIntervalObject> beats
    /* Sections are defined by large variations in rhythm or timbre, e.g. chorus, verse, bridge, guitar solo, etc. Each section contains its own descriptions of tempo, key, mode, time_signature, and loudness. */
    List<SectionObject> sections
    /* Each segment contains a roughly conisistent sound throughout its duration. */
    List<SegmentObject> segments
    /* A tatum represents the lowest regular pulse train that a listener intuitively infers from the timing of perceived musical events (segments). */
    List<TimeIntervalObject> tatums
}
