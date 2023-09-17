# TransferAUsersPlaybackRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_ids** | **List[str]** | A JSON array containing the ID of the device on which playback should be started/transferred.&lt;br/&gt;For example:&#x60;{device_ids:[\&quot;74ASZWbe4lXaubB36ztrGX\&quot;]}&#x60;&lt;br/&gt;_**Note**: Although an array is accepted, only a single device_id is currently supported. Supplying more than one will return &#x60;400 Bad Request&#x60;_  | 
**play** | **bool** | **true**: ensure playback happens on new device.&lt;br/&gt;**false** or not provided: keep the current playback state.  | [optional] 

## Example

```python
from openapi_client.models.transfer_a_users_playback_request import TransferAUsersPlaybackRequest

# TODO update the JSON string below
json = "{}"
# create an instance of TransferAUsersPlaybackRequest from a JSON string
transfer_a_users_playback_request_instance = TransferAUsersPlaybackRequest.from_json(json)
# print the JSON string representation of the object
print TransferAUsersPlaybackRequest.to_json()

# convert the object into a dict
transfer_a_users_playback_request_dict = transfer_a_users_playback_request_instance.to_dict()
# create an instance of TransferAUsersPlaybackRequest from a dict
transfer_a_users_playback_request_form_dict = transfer_a_users_playback_request.from_dict(transfer_a_users_playback_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


