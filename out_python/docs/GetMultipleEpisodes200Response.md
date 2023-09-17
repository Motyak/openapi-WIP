# GetMultipleEpisodes200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**episodes** | [**List[EpisodeObject]**](EpisodeObject.md) |  | 

## Example

```python
from openapi_client.models.get_multiple_episodes200_response import GetMultipleEpisodes200Response

# TODO update the JSON string below
json = "{}"
# create an instance of GetMultipleEpisodes200Response from a JSON string
get_multiple_episodes200_response_instance = GetMultipleEpisodes200Response.from_json(json)
# print the JSON string representation of the object
print GetMultipleEpisodes200Response.to_json()

# convert the object into a dict
get_multiple_episodes200_response_dict = get_multiple_episodes200_response_instance.to_dict()
# create an instance of GetMultipleEpisodes200Response from a dict
get_multiple_episodes200_response_form_dict = get_multiple_episodes200_response.from_dict(get_multiple_episodes200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


