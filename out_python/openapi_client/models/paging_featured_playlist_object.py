# coding: utf-8

"""
    Spotify Web API with fixes and improvements from sonallux

    You can use Spotify's Web API to discover music and podcasts, manage your Spotify library, control audio playback, and much more. Browse our available Web API endpoints using the sidebar at left, or via the navigation bar on top of this page on smaller screens.  In order to make successful Web API requests your app will need a valid access token. One can be obtained through <a href=\"https://developer.spotify.com/documentation/general/guides/authorization-guide/\">OAuth 2.0</a>.  The base URI for all Web API requests is `https://api.spotify.com/v1`.  Need help? See our <a href=\"https://developer.spotify.com/documentation/web-api/guides/\">Web API guides</a> for more information, or visit the <a href=\"https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer\">Spotify for Developers community forum</a> to ask questions and connect with other developers. 

    The version of the OpenAPI document: 2023.8.30
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import Optional
from pydantic import BaseModel, StrictStr
from openapi_client.models.paging_playlist_object import PagingPlaylistObject

class PagingFeaturedPlaylistObject(BaseModel):
    """
    PagingFeaturedPlaylistObject
    """
    message: Optional[StrictStr] = None
    playlists: Optional[PagingPlaylistObject] = None
    __properties = ["message", "playlists"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> PagingFeaturedPlaylistObject:
        """Create an instance of PagingFeaturedPlaylistObject from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of playlists
        if self.playlists:
            _dict['playlists'] = self.playlists.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> PagingFeaturedPlaylistObject:
        """Create an instance of PagingFeaturedPlaylistObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return PagingFeaturedPlaylistObject.parse_obj(obj)

        _obj = PagingFeaturedPlaylistObject.parse_obj({
            "message": obj.get("message"),
            "playlists": PagingPlaylistObject.from_dict(obj.get("playlists")) if obj.get("playlists") is not None else None
        })
        return _obj

