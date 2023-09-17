# RecommendationsObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seeds** | [**List[RecommendationSeedObject]**](RecommendationSeedObject.md) | An array of recommendation seed objects.  | 
**tracks** | [**List[TrackObject]**](TrackObject.md) | An array of track objects ordered according to the parameters supplied.  | 

## Example

```python
from openapi_client.models.recommendations_object import RecommendationsObject

# TODO update the JSON string below
json = "{}"
# create an instance of RecommendationsObject from a JSON string
recommendations_object_instance = RecommendationsObject.from_json(json)
# print the JSON string representation of the object
print RecommendationsObject.to_json()

# convert the object into a dict
recommendations_object_dict = recommendations_object_instance.to_dict()
# create an instance of RecommendationsObject from a dict
recommendations_object_form_dict = recommendations_object.from_dict(recommendations_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


