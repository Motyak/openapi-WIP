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
from pydantic import BaseModel, Field, StrictInt, StrictStr

class ImageObject(BaseModel):
    """
    ImageObject
    """
    url: StrictStr = Field(..., description="The source URL of the image. ")
    height: Optional[StrictInt] = Field(..., description="The image height in pixels. ")
    width: Optional[StrictInt] = Field(..., description="The image width in pixels. ")
    __properties = ["url", "height", "width"]

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
    def from_json(cls, json_str: str) -> ImageObject:
        """Create an instance of ImageObject from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # set to None if height (nullable) is None
        # and __fields_set__ contains the field
        if self.height is None and "height" in self.__fields_set__:
            _dict['height'] = None

        # set to None if width (nullable) is None
        # and __fields_set__ contains the field
        if self.width is None and "width" in self.__fields_set__:
            _dict['width'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> ImageObject:
        """Create an instance of ImageObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return ImageObject.parse_obj(obj)

        _obj = ImageObject.parse_obj({
            "url": obj.get("url"),
            "height": obj.get("height"),
            "width": obj.get("width")
        })
        return _obj

