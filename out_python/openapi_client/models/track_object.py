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
from openapi_client.models.artist_object import ArtistObject
from openapi_client.models.external_id_object import ExternalIdObject
from openapi_client.models.external_url_object import ExternalUrlObject
from openapi_client.models.linked_track_object import LinkedTrackObject
from openapi_client.models.simplified_album_object import SimplifiedAlbumObject
from openapi_client.models.track_restriction_object import TrackRestrictionObject

class TrackObject(BaseModel):
    """
    TrackObject
    """
    album: Optional[SimplifiedAlbumObject] = None
    artists: Optional[conlist(ArtistObject)] = Field(None, description="The artists who performed the track. Each artist object includes a link in `href` to more detailed information about the artist. ")
    available_markets: Optional[conlist(StrictStr)] = Field(None, description="A list of the countries in which the track can be played, identified by their [ISO 3166-1 alpha-2](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) code. ")
    disc_number: Optional[StrictInt] = Field(None, description="The disc number (usually `1` unless the album consists of more than one disc). ")
    duration_ms: Optional[StrictInt] = Field(None, description="The track length in milliseconds. ")
    explicit: Optional[StrictBool] = Field(None, description="Whether or not the track has explicit lyrics ( `true` = yes it does; `false` = no it does not OR unknown). ")
    external_ids: Optional[ExternalIdObject] = None
    external_urls: Optional[ExternalUrlObject] = None
    href: Optional[StrictStr] = Field(None, description="A link to the Web API endpoint providing full details of the track. ")
    id: Optional[StrictStr] = Field(None, description="The [Spotify ID](/documentation/web-api/concepts/spotify-uris-ids) for the track. ")
    is_playable: Optional[StrictBool] = Field(None, description="Part of the response when [Track Relinking](/documentation/web-api/concepts/track-relinking) is applied. If `true`, the track is playable in the given market. Otherwise `false`. ")
    linked_from: Optional[LinkedTrackObject] = None
    restrictions: Optional[TrackRestrictionObject] = None
    name: Optional[StrictStr] = Field(None, description="The name of the track. ")
    popularity: Optional[StrictInt] = Field(None, description="The popularity of the track. The value will be between 0 and 100, with 100 being the most popular.<br/>The popularity of a track is a value between 0 and 100, with 100 being the most popular. The popularity is calculated by algorithm and is based, in the most part, on the total number of plays the track has had and how recent those plays are.<br/>Generally speaking, songs that are being played a lot now will have a higher popularity than songs that were played a lot in the past. Duplicate tracks (e.g. the same track from a single and an album) are rated independently. Artist and album popularity is derived mathematically from track popularity. _**Note**: the popularity value may lag actual popularity by a few days: the value is not updated in real time._ ")
    preview_url: Optional[StrictStr] = Field(None, description="A link to a 30 second preview (MP3 format) of the track. Can be `null` ")
    track_number: Optional[StrictInt] = Field(None, description="The number of the track. If an album has several discs, the track number is the number on the specified disc. ")
    type: Optional[StrictStr] = Field(None, description="The object type: \"track\". ")
    uri: Optional[StrictStr] = Field(None, description="The [Spotify URI](/documentation/web-api/concepts/spotify-uris-ids) for the track. ")
    is_local: Optional[StrictBool] = Field(None, description="Whether or not the track is from a local file. ")
    __properties = ["album", "artists", "available_markets", "disc_number", "duration_ms", "explicit", "external_ids", "external_urls", "href", "id", "is_playable", "linked_from", "restrictions", "name", "popularity", "preview_url", "track_number", "type", "uri", "is_local"]

    @validator('type')
    def type_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in ('track', 'episode'):
            raise ValueError("must be one of enum values ('track', 'episode')")
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
    def from_json(cls, json_str: str) -> TrackObject:
        """Create an instance of TrackObject from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of album
        if self.album:
            _dict['album'] = self.album.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in artists (list)
        _items = []
        if self.artists:
            for _item in self.artists:
                if _item:
                    _items.append(_item.to_dict())
            _dict['artists'] = _items
        # override the default output from pydantic by calling `to_dict()` of external_ids
        if self.external_ids:
            _dict['external_ids'] = self.external_ids.to_dict()
        # override the default output from pydantic by calling `to_dict()` of external_urls
        if self.external_urls:
            _dict['external_urls'] = self.external_urls.to_dict()
        # override the default output from pydantic by calling `to_dict()` of linked_from
        if self.linked_from:
            _dict['linked_from'] = self.linked_from.to_dict()
        # override the default output from pydantic by calling `to_dict()` of restrictions
        if self.restrictions:
            _dict['restrictions'] = self.restrictions.to_dict()
        # set to None if preview_url (nullable) is None
        # and __fields_set__ contains the field
        if self.preview_url is None and "preview_url" in self.__fields_set__:
            _dict['preview_url'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> TrackObject:
        """Create an instance of TrackObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return TrackObject.parse_obj(obj)

        _obj = TrackObject.parse_obj({
            "album": SimplifiedAlbumObject.from_dict(obj.get("album")) if obj.get("album") is not None else None,
            "artists": [ArtistObject.from_dict(_item) for _item in obj.get("artists")] if obj.get("artists") is not None else None,
            "available_markets": obj.get("available_markets"),
            "disc_number": obj.get("disc_number"),
            "duration_ms": obj.get("duration_ms"),
            "explicit": obj.get("explicit"),
            "external_ids": ExternalIdObject.from_dict(obj.get("external_ids")) if obj.get("external_ids") is not None else None,
            "external_urls": ExternalUrlObject.from_dict(obj.get("external_urls")) if obj.get("external_urls") is not None else None,
            "href": obj.get("href"),
            "id": obj.get("id"),
            "is_playable": obj.get("is_playable"),
            "linked_from": LinkedTrackObject.from_dict(obj.get("linked_from")) if obj.get("linked_from") is not None else None,
            "restrictions": TrackRestrictionObject.from_dict(obj.get("restrictions")) if obj.get("restrictions") is not None else None,
            "name": obj.get("name"),
            "popularity": obj.get("popularity"),
            "preview_url": obj.get("preview_url"),
            "track_number": obj.get("track_number"),
            "type": obj.get("type"),
            "uri": obj.get("uri"),
            "is_local": obj.get("is_local")
        })
        return _obj


