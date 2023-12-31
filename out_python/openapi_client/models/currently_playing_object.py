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
from pydantic import BaseModel, Field, StrictBool, StrictInt, StrictStr
from openapi_client.models.context_object import ContextObject
from openapi_client.models.disallows_object import DisallowsObject
from openapi_client.models.queue_object_currently_playing import QueueObjectCurrentlyPlaying

class CurrentlyPlayingObject(BaseModel):
    """
    CurrentlyPlayingObject
    """
    context: Optional[ContextObject] = None
    timestamp: Optional[StrictInt] = Field(None, description="Unix Millisecond Timestamp when data was fetched")
    progress_ms: Optional[StrictInt] = Field(None, description="Progress into the currently playing track or episode. Can be `null`.")
    is_playing: Optional[StrictBool] = Field(None, description="If something is currently playing, return `true`.")
    item: Optional[QueueObjectCurrentlyPlaying] = None
    currently_playing_type: Optional[StrictStr] = Field(None, description="The object type of the currently playing item. Can be one of `track`, `episode`, `ad` or `unknown`. ")
    actions: Optional[DisallowsObject] = None
    __properties = ["context", "timestamp", "progress_ms", "is_playing", "item", "currently_playing_type", "actions"]

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
    def from_json(cls, json_str: str) -> CurrentlyPlayingObject:
        """Create an instance of CurrentlyPlayingObject from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of context
        if self.context:
            _dict['context'] = self.context.to_dict()
        # override the default output from pydantic by calling `to_dict()` of item
        if self.item:
            _dict['item'] = self.item.to_dict()
        # override the default output from pydantic by calling `to_dict()` of actions
        if self.actions:
            _dict['actions'] = self.actions.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CurrentlyPlayingObject:
        """Create an instance of CurrentlyPlayingObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CurrentlyPlayingObject.parse_obj(obj)

        _obj = CurrentlyPlayingObject.parse_obj({
            "context": ContextObject.from_dict(obj.get("context")) if obj.get("context") is not None else None,
            "timestamp": obj.get("timestamp"),
            "progress_ms": obj.get("progress_ms"),
            "is_playing": obj.get("is_playing"),
            "item": QueueObjectCurrentlyPlaying.from_dict(obj.get("item")) if obj.get("item") is not None else None,
            "currently_playing_type": obj.get("currently_playing_type"),
            "actions": DisallowsObject.from_dict(obj.get("actions")) if obj.get("actions") is not None else None
        })
        return _obj


