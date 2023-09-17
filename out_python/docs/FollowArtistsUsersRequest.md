# FollowArtistsUsersRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **List[str]** | A JSON array of the artist or user [Spotify IDs](/documentation/web-api/concepts/spotify-uris-ids). For example: &#x60;{ids:[\&quot;74ASZWbe4lXaubB36ztrGX\&quot;, \&quot;08td7MxkoHQkXnWAYD8d6Q\&quot;]}&#x60;. A maximum of 50 IDs can be sent in one request. _**Note**: if the &#x60;ids&#x60; parameter is present in the query string, any IDs listed here in the body will be ignored._  | 

## Example

```python
from openapi_client.models.follow_artists_users_request import FollowArtistsUsersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of FollowArtistsUsersRequest from a JSON string
follow_artists_users_request_instance = FollowArtistsUsersRequest.from_json(json)
# print the JSON string representation of the object
print FollowArtistsUsersRequest.to_json()

# convert the object into a dict
follow_artists_users_request_dict = follow_artists_users_request_instance.to_dict()
# create an instance of FollowArtistsUsersRequest from a dict
follow_artists_users_request_form_dict = follow_artists_users_request.from_dict(follow_artists_users_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


