# GetSeveralAudioFeatures200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_features** | [**List[AudioFeaturesObject]**](AudioFeaturesObject.md) |  | 

## Example

```python
from openapi_client.models.get_several_audio_features200_response import GetSeveralAudioFeatures200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetSeveralAudioFeatures200Response from a JSON string
get_several_audio_features200_response_instance = GetSeveralAudioFeatures200Response.from_json(json)
# print the JSON string representation of the object
print GetSeveralAudioFeatures200Response.to_json()

# convert the object into a dict
get_several_audio_features200_response_dict = get_several_audio_features200_response_instance.to_dict()
# create an instance of GetSeveralAudioFeatures200Response from a dict
get_several_audio_features200_response_form_dict = get_several_audio_features200_response.from_dict(get_several_audio_features200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


