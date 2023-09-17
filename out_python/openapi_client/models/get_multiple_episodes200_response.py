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


from typing import List
from pydantic import BaseModel, Field, conlist
from openapi_client.models.episode_object import EpisodeObject

class GetMultipleEpisodes200Response(BaseModel):
    """
    GetMultipleEpisodes200Response
    """
    episodes: conlist(EpisodeObject) = Field(...)
    __properties = ["episodes"]

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
    def from_json(cls, json_str: str) -> GetMultipleEpisodes200Response:
        """Create an instance of GetMultipleEpisodes200Response from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in episodes (list)
        _items = []
        if self.episodes:
            for _item in self.episodes:
                if _item:
                    _items.append(_item.to_dict())
            _dict['episodes'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> GetMultipleEpisodes200Response:
        """Create an instance of GetMultipleEpisodes200Response from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return GetMultipleEpisodes200Response.parse_obj(obj)

        _obj = GetMultipleEpisodes200Response.parse_obj({
            "episodes": [EpisodeObject.from_dict(_item) for _item in obj.get("episodes")] if obj.get("episodes") is not None else None
        })
        return _obj

