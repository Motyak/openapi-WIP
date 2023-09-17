# AudioAnalysisObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**AudioAnalysisObjectMeta**](AudioAnalysisObjectMeta.md) |  | [optional] 
**track** | [**AudioAnalysisObjectTrack**](AudioAnalysisObjectTrack.md) |  | [optional] 
**bars** | [**List[TimeIntervalObject]**](TimeIntervalObject.md) | The time intervals of the bars throughout the track. A bar (or measure) is a segment of time defined as a given number of beats. | [optional] 
**beats** | [**List[TimeIntervalObject]**](TimeIntervalObject.md) | The time intervals of beats throughout the track. A beat is the basic time unit of a piece of music; for example, each tick of a metronome. Beats are typically multiples of tatums. | [optional] 
**sections** | [**List[SectionObject]**](SectionObject.md) | Sections are defined by large variations in rhythm or timbre, e.g. chorus, verse, bridge, guitar solo, etc. Each section contains its own descriptions of tempo, key, mode, time_signature, and loudness. | [optional] 
**segments** | [**List[SegmentObject]**](SegmentObject.md) | Each segment contains a roughly conisistent sound throughout its duration. | [optional] 
**tatums** | [**List[TimeIntervalObject]**](TimeIntervalObject.md) | A tatum represents the lowest regular pulse train that a listener intuitively infers from the timing of perceived musical events (segments). | [optional] 

## Example

```python
from openapi_client.models.audio_analysis_object import AudioAnalysisObject

# TODO update the JSON string below
json = "{}"
# create an instance of AudioAnalysisObject from a JSON string
audio_analysis_object_instance = AudioAnalysisObject.from_json(json)
# print the JSON string representation of the object
print AudioAnalysisObject.to_json()

# convert the object into a dict
audio_analysis_object_dict = audio_analysis_object_instance.to_dict()
# create an instance of AudioAnalysisObject from a dict
audio_analysis_object_form_dict = audio_analysis_object.from_dict(audio_analysis_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


