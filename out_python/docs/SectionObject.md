# SectionObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **float** | The starting point (in seconds) of the section. | [optional] 
**duration** | **float** | The duration (in seconds) of the section. | [optional] 
**confidence** | **float** | The confidence, from 0.0 to 1.0, of the reliability of the section&#39;s \&quot;designation\&quot;. | [optional] 
**loudness** | **float** | The overall loudness of the section in decibels (dB). Loudness values are useful for comparing relative loudness of sections within tracks. | [optional] 
**tempo** | **float** | The overall estimated tempo of the section in beats per minute (BPM). In musical terminology, tempo is the speed or pace of a given piece and derives directly from the average beat duration. | [optional] 
**tempo_confidence** | **float** | The confidence, from 0.0 to 1.0, of the reliability of the tempo. Some tracks contain tempo changes or sounds which don&#39;t contain tempo (like pure speech) which would correspond to a low value in this field. | [optional] 
**key** | **int** | The estimated overall key of the section. The values in this field ranging from 0 to 11 mapping to pitches using standard Pitch Class notation (E.g. 0 &#x3D; C, 1 &#x3D; C♯/D♭, 2 &#x3D; D, and so on). If no key was detected, the value is -1. | [optional] 
**key_confidence** | **float** | The confidence, from 0.0 to 1.0, of the reliability of the key. Songs with many key changes may correspond to low values in this field. | [optional] 
**mode** | **float** | Indicates the modality (major or minor) of a section, the type of scale from which its melodic content is derived. This field will contain a 0 for \&quot;minor\&quot;, a 1 for \&quot;major\&quot;, or a -1 for no result. Note that the major key (e.g. C major) could more likely be confused with the minor key at 3 semitones lower (e.g. A minor) as both keys carry the same pitches. | [optional] 
**mode_confidence** | **float** | The confidence, from 0.0 to 1.0, of the reliability of the &#x60;mode&#x60;. | [optional] 
**time_signature** | **int** | An estimated time signature. The time signature (meter) is a notational convention to specify how many beats are in each bar (or measure). The time signature ranges from 3 to 7 indicating time signatures of \&quot;3/4\&quot;, to \&quot;7/4\&quot;. | [optional] 
**time_signature_confidence** | **float** | The confidence, from 0.0 to 1.0, of the reliability of the &#x60;time_signature&#x60;. Sections with time signature changes may correspond to low values in this field. | [optional] 

## Example

```python
from openapi_client.models.section_object import SectionObject

# TODO update the JSON string below
json = "{}"
# create an instance of SectionObject from a JSON string
section_object_instance = SectionObject.from_json(json)
# print the JSON string representation of the object
print SectionObject.to_json()

# convert the object into a dict
section_object_dict = section_object_instance.to_dict()
# create an instance of SectionObject from a dict
section_object_form_dict = section_object.from_dict(section_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


