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
from pydantic import BaseModel, Field, StrictBool, StrictInt, StrictStr, conlist, validator
from openapi_client.models.author_object import AuthorObject
from openapi_client.models.copyright_object import CopyrightObject
from openapi_client.models.external_url_object import ExternalUrlObject
from openapi_client.models.image_object import ImageObject
from openapi_client.models.narrator_object import NarratorObject

class SimplifiedAudiobookObject(BaseModel):
    """
    SimplifiedAudiobookObject
    """
    authors: conlist(AuthorObject) = Field(..., description="The author(s) for the audiobook. ")
    available_markets: conlist(StrictStr) = Field(..., description="A list of the countries in which the audiobook can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code. ")
    copyrights: conlist(CopyrightObject) = Field(..., description="The copyright statements of the audiobook. ")
    description: StrictStr = Field(..., description="A description of the audiobook. HTML tags are stripped away from this field, use `html_description` field in case HTML tags are needed. ")
    html_description: StrictStr = Field(..., description="A description of the audiobook. This field may contain HTML tags. ")
    edition: Optional[StrictStr] = Field(None, description="The edition of the audiobook. ")
    explicit: StrictBool = Field(..., description="Whether or not the audiobook has explicit content (true = yes it does; false = no it does not OR unknown). ")
    external_urls: ExternalUrlObject = Field(...)
    href: StrictStr = Field(..., description="A link to the Web API endpoint providing full details of the audiobook. ")
    id: StrictStr = Field(..., description="The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the audiobook. ")
    images: conlist(ImageObject) = Field(..., description="The cover art for the audiobook in various sizes, widest first. ")
    languages: conlist(StrictStr) = Field(..., description="A list of the languages used in the audiobook, identified by their [ISO 639](https://en.wikipedia.org/wiki/ISO_639) code. ")
    media_type: StrictStr = Field(..., description="The media type of the audiobook. ")
    name: StrictStr = Field(..., description="The name of the audiobook. ")
    narrators: conlist(NarratorObject) = Field(..., description="The narrator(s) for the audiobook. ")
    publisher: StrictStr = Field(..., description="The publisher of the audiobook. ")
    type: StrictStr = Field(..., description="The object type. ")
    uri: StrictStr = Field(..., description="The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the audiobook. ")
    total_chapters: StrictInt = Field(..., description="The number of chapters in this audiobook. ")
    __properties = ["authors", "available_markets", "copyrights", "description", "html_description", "edition", "explicit", "external_urls", "href", "id", "images", "languages", "media_type", "name", "narrators", "publisher", "type", "uri", "total_chapters"]

    @validator('type')
    def type_validate_enum(cls, value):
        """Validates the enum"""
        if value not in ('audiobook'):
            raise ValueError("must be one of enum values ('audiobook')")
        return value

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
    def from_json(cls, json_str: str) -> SimplifiedAudiobookObject:
        """Create an instance of SimplifiedAudiobookObject from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in authors (list)
        _items = []
        if self.authors:
            for _item in self.authors:
                if _item:
                    _items.append(_item.to_dict())
            _dict['authors'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in copyrights (list)
        _items = []
        if self.copyrights:
            for _item in self.copyrights:
                if _item:
                    _items.append(_item.to_dict())
            _dict['copyrights'] = _items
        # override the default output from pydantic by calling `to_dict()` of external_urls
        if self.external_urls:
            _dict['external_urls'] = self.external_urls.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in images (list)
        _items = []
        if self.images:
            for _item in self.images:
                if _item:
                    _items.append(_item.to_dict())
            _dict['images'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in narrators (list)
        _items = []
        if self.narrators:
            for _item in self.narrators:
                if _item:
                    _items.append(_item.to_dict())
            _dict['narrators'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> SimplifiedAudiobookObject:
        """Create an instance of SimplifiedAudiobookObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return SimplifiedAudiobookObject.parse_obj(obj)

        _obj = SimplifiedAudiobookObject.parse_obj({
            "authors": [AuthorObject.from_dict(_item) for _item in obj.get("authors")] if obj.get("authors") is not None else None,
            "available_markets": obj.get("available_markets"),
            "copyrights": [CopyrightObject.from_dict(_item) for _item in obj.get("copyrights")] if obj.get("copyrights") is not None else None,
            "description": obj.get("description"),
            "html_description": obj.get("html_description"),
            "edition": obj.get("edition"),
            "explicit": obj.get("explicit"),
            "external_urls": ExternalUrlObject.from_dict(obj.get("external_urls")) if obj.get("external_urls") is not None else None,
            "href": obj.get("href"),
            "id": obj.get("id"),
            "images": [ImageObject.from_dict(_item) for _item in obj.get("images")] if obj.get("images") is not None else None,
            "languages": obj.get("languages"),
            "media_type": obj.get("media_type"),
            "name": obj.get("name"),
            "narrators": [NarratorObject.from_dict(_item) for _item in obj.get("narrators")] if obj.get("narrators") is not None else None,
            "publisher": obj.get("publisher"),
            "type": obj.get("type"),
            "uri": obj.get("uri"),
            "total_chapters": obj.get("total_chapters")
        })
        return _obj

