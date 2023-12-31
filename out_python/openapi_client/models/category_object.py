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
from pydantic import BaseModel, Field, StrictStr, conlist
from openapi_client.models.image_object import ImageObject

class CategoryObject(BaseModel):
    """
    CategoryObject
    """
    href: StrictStr = Field(..., description="A link to the Web API endpoint returning full details of the category. ")
    icons: conlist(ImageObject) = Field(..., description="The category icon, in various sizes. ")
    id: StrictStr = Field(..., description="The [Spotify category ID](/documentation/web-api/concepts/spotify-uris-ids) of the category. ")
    name: StrictStr = Field(..., description="The name of the category. ")
    __properties = ["href", "icons", "id", "name"]

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
    def from_json(cls, json_str: str) -> CategoryObject:
        """Create an instance of CategoryObject from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in icons (list)
        _items = []
        if self.icons:
            for _item in self.icons:
                if _item:
                    _items.append(_item.to_dict())
            _dict['icons'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> CategoryObject:
        """Create an instance of CategoryObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return CategoryObject.parse_obj(obj)

        _obj = CategoryObject.parse_obj({
            "href": obj.get("href"),
            "icons": [ImageObject.from_dict(_item) for _item in obj.get("icons")] if obj.get("icons") is not None else None,
            "id": obj.get("id"),
            "name": obj.get("name")
        })
        return _obj


