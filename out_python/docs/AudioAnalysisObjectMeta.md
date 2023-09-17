# AudioAnalysisObjectMeta


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analyzer_version** | **str** | The version of the Analyzer used to analyze this track. | [optional] 
**platform** | **str** | The platform used to read the track&#39;s audio data. | [optional] 
**detailed_status** | **str** | A detailed status code for this track. If analysis data is missing, this code may explain why. | [optional] 
**status_code** | **int** | The return code of the analyzer process. 0 if successful, 1 if any errors occurred. | [optional] 
**timestamp** | **int** | The Unix timestamp (in seconds) at which this track was analyzed. | [optional] 
**analysis_time** | **float** | The amount of time taken to analyze this track. | [optional] 
**input_process** | **str** | The method used to read the track&#39;s audio data. | [optional] 

## Example

```python
from openapi_client.models.audio_analysis_object_meta import AudioAnalysisObjectMeta

# TODO update the JSON string below
json = "{}"
# create an instance of AudioAnalysisObjectMeta from a JSON string
audio_analysis_object_meta_instance = AudioAnalysisObjectMeta.from_json(json)
# print the JSON string representation of the object
print AudioAnalysisObjectMeta.to_json()

# convert the object into a dict
audio_analysis_object_meta_dict = audio_analysis_object_meta_instance.to_dict()
# create an instance of AudioAnalysisObjectMeta from a dict
audio_analysis_object_meta_form_dict = audio_analysis_object_meta.from_dict(audio_analysis_object_meta_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


