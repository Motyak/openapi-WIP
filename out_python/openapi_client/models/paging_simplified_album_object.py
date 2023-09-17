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


from typing import List, Optional
from pydantic import BaseModel, Field, StrictInt, StrictStr, conlist
from openapi_client.models.simplified_album_object import SimplifiedAlbumObject

class PagingSimplifiedAlbumObject(BaseModel):
    """
    PagingSimplifiedAlbumObject
    """
    href: StrictStr = Field(..., description="A link to the Web API endpoint returning the full result of the request ")
    limit: StrictInt = Field(..., description="The maximum number of items in the response (as set in the query or by default). ")
    next: Optional[StrictStr] = Field(..., description="URL to the next page of items. ( `null` if none) ")
    offset: StrictInt = Field(..., description="The offset of the items returned (as set in the query or by default) ")
    previous: Optional[StrictStr] = Field(..., description="URL to the previous page of items. ( `null` if none) ")
    total: StrictInt = Field(..., description="The total number of items available to return. ")
    items: conlist(SimplifiedAlbumObject) = Field(...)
    __properties = ["href", "limit", "next", "offset", "previous", "total", "items"]

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
    def from_json(cls, json_str: str) -> PagingSimplifiedAlbumObject:
        """Create an instance of PagingSimplifiedAlbumObject from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in items (list)
        _items = []
        if self.items:
            for _item in self.items:
                if _item:
                    _items.append(_item.to_dict())
            _dict['items'] = _items
        # set to None if next (nullable) is None
        # and __fields_set__ contains the field
        if self.next is None and "next" in self.__fields_set__:
            _dict['next'] = None

        # set to None if previous (nullable) is None
        # and __fields_set__ contains the field
        if self.previous is None and "previous" in self.__fields_set__:
            _dict['previous'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> PagingSimplifiedAlbumObject:
        """Create an instance of PagingSimplifiedAlbumObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return PagingSimplifiedAlbumObject.parse_obj(obj)

        _obj = PagingSimplifiedAlbumObject.parse_obj({
            "href": obj.get("href"),
            "limit": obj.get("limit"),
            "next": obj.get("next"),
            "offset": obj.get("offset"),
            "previous": obj.get("previous"),
            "total": obj.get("total"),
            "items": [SimplifiedAlbumObject.from_dict(_item) for _item in obj.get("items")] if obj.get("items") is not None else None
        })
        return _obj


