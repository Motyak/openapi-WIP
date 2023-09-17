# DeviceObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The device ID. | [optional] 
**is_active** | **bool** | If this device is the currently active device. | [optional] 
**is_private_session** | **bool** | If this device is currently in a private session. | [optional] 
**is_restricted** | **bool** | Whether controlling this device is restricted. At present if this is \&quot;true\&quot; then no Web API commands will be accepted by this device. | [optional] 
**name** | **str** | A human-readable name for the device. Some devices have a name that the user can configure (e.g. \\\&quot;Loudest speaker\\\&quot;) and some devices have a generic name associated with the manufacturer or device model. | [optional] 
**type** | **str** | Device type, such as \&quot;computer\&quot;, \&quot;smartphone\&quot; or \&quot;speaker\&quot;. | [optional] 
**volume_percent** | **int** | The current volume in percent. | [optional] 
**supports_volume** | **bool** | If this device can be used to set the volume. | [optional] 

## Example

```python
from openapi_client.models.device_object import DeviceObject

# TODO update the JSON string below
json = "{}"
# create an instance of DeviceObject from a JSON string
device_object_instance = DeviceObject.from_json(json)
# print the JSON string representation of the object
print DeviceObject.to_json()

# convert the object into a dict
device_object_dict = device_object_instance.to_dict()
# create an instance of DeviceObject from a dict
device_object_form_dict = device_object.from_dict(device_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


