# AudioAnalysisObjectTrack


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**num_samples** | **int** | The exact number of audio samples analyzed from this track. See also &#x60;analysis_sample_rate&#x60;. | [optional] 
**duration** | **float** | Length of the track in seconds. | [optional] 
**sample_md5** | **str** | This field will always contain the empty string. | [optional] 
**offset_seconds** | **int** | An offset to the start of the region of the track that was analyzed. (As the entire track is analyzed, this should always be 0.) | [optional] 
**window_seconds** | **int** | The length of the region of the track was analyzed, if a subset of the track was analyzed. (As the entire track is analyzed, this should always be 0.) | [optional] 
**analysis_sample_rate** | **int** | The sample rate used to decode and analyze this track. May differ from the actual sample rate of this track available on Spotify. | [optional] 
**analysis_channels** | **int** | The number of channels used for analysis. If 1, all channels are summed together to mono before analysis. | [optional] 
**end_of_fade_in** | **float** | The time, in seconds, at which the track&#39;s fade-in period ends. If the track has no fade-in, this will be 0.0. | [optional] 
**start_of_fade_out** | **float** | The time, in seconds, at which the track&#39;s fade-out period starts. If the track has no fade-out, this should match the track&#39;s length. | [optional] 
**loudness** | **float** | The overall loudness of a track in decibels (dB). Loudness values are averaged across the entire track and are useful for comparing relative loudness of tracks. Loudness is the quality of a sound that is the primary psychological correlate of physical strength (amplitude). Values typically range between -60 and 0 db.  | [optional] 
**tempo** | **float** | The overall estimated tempo of a track in beats per minute (BPM). In musical terminology, tempo is the speed or pace of a given piece and derives directly from the average beat duration.  | [optional] 
**tempo_confidence** | **float** | The confidence, from 0.0 to 1.0, of the reliability of the &#x60;tempo&#x60;. | [optional] 
**time_signature** | **int** | An estimated time signature. The time signature (meter) is a notational convention to specify how many beats are in each bar (or measure). The time signature ranges from 3 to 7 indicating time signatures of \&quot;3/4\&quot;, to \&quot;7/4\&quot;. | [optional] 
**time_signature_confidence** | **float** | The confidence, from 0.0 to 1.0, of the reliability of the &#x60;time_signature&#x60;. | [optional] 
**key** | **int** | The key the track is in. Integers map to pitches using standard [Pitch Class notation](https://en.wikipedia.org/wiki/Pitch_class). E.g. 0 &#x3D; C, 1 &#x3D; C♯/D♭, 2 &#x3D; D, and so on. If no key was detected, the value is -1.  | [optional] 
**key_confidence** | **float** | The confidence, from 0.0 to 1.0, of the reliability of the &#x60;key&#x60;. | [optional] 
**mode** | **int** | Mode indicates the modality (major or minor) of a track, the type of scale from which its melodic content is derived. Major is represented by 1 and minor is 0.  | [optional] 
**mode_confidence** | **float** | The confidence, from 0.0 to 1.0, of the reliability of the &#x60;mode&#x60;. | [optional] 
**codestring** | **str** | An [Echo Nest Musical Fingerprint (ENMFP)](https://academiccommons.columbia.edu/doi/10.7916/D8Q248M4) codestring for this track. | [optional] 
**code_version** | **float** | A version number for the Echo Nest Musical Fingerprint format used in the codestring field. | [optional] 
**echoprintstring** | **str** | An [EchoPrint](https://github.com/spotify/echoprint-codegen) codestring for this track. | [optional] 
**echoprint_version** | **float** | A version number for the EchoPrint format used in the echoprintstring field. | [optional] 
**synchstring** | **str** | A [Synchstring](https://github.com/echonest/synchdata) for this track. | [optional] 
**synch_version** | **float** | A version number for the Synchstring used in the synchstring field. | [optional] 
**rhythmstring** | **str** | A Rhythmstring for this track. The format of this string is similar to the Synchstring. | [optional] 
**rhythm_version** | **float** | A version number for the Rhythmstring used in the rhythmstring field. | [optional] 

## Example

```python
from openapi_client.models.audio_analysis_object_track import AudioAnalysisObjectTrack

# TODO update the JSON string below
json = "{}"
# create an instance of AudioAnalysisObjectTrack from a JSON string
audio_analysis_object_track_instance = AudioAnalysisObjectTrack.from_json(json)
# print the JSON string representation of the object
print AudioAnalysisObjectTrack.to_json()

# convert the object into a dict
audio_analysis_object_track_dict = audio_analysis_object_track_instance.to_dict()
# create an instance of AudioAnalysisObjectTrack from a dict
audio_analysis_object_track_form_dict = audio_analysis_object_track.from_dict(audio_analysis_object_track_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


