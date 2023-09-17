# TimeIntervalObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **float** | The starting point (in seconds) of the time interval. | [optional] 
**duration** | **float** | The duration (in seconds) of the time interval. | [optional] 
**confidence** | **float** | The confidence, from 0.0 to 1.0, of the reliability of the interval. | [optional] 

## Example

```python
from openapi_client.models.time_interval_object import TimeIntervalObject

# TODO update the JSON string below
json = "{}"
# create an instance of TimeIntervalObject from a JSON string
time_interval_object_instance = TimeIntervalObject.from_json(json)
# print the JSON string representation of the object
print TimeIntervalObject.to_json()

# convert the object into a dict
time_interval_object_dict = time_interval_object_instance.to_dict()
# create an instance of TimeIntervalObject from a dict
time_interval_object_form_dict = time_interval_object.from_dict(time_interval_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


