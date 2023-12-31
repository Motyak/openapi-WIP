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


from typing import List, Optional, Union
from pydantic import BaseModel, Field, StrictFloat, StrictInt, confloat, conint, conlist

class SegmentObject(BaseModel):
    """
    SegmentObject
    """
    start: Optional[Union[StrictFloat, StrictInt]] = Field(None, description="The starting point (in seconds) of the segment.")
    duration: Optional[Union[StrictFloat, StrictInt]] = Field(None, description="The duration (in seconds) of the segment.")
    confidence: Optional[Union[confloat(le=1, ge=0, strict=True), conint(le=1, ge=0, strict=True)]] = Field(None, description="The confidence, from 0.0 to 1.0, of the reliability of the segmentation. Segments of the song which are difficult to logically segment (e.g: noise) may correspond to low values in this field. ")
    loudness_start: Optional[Union[StrictFloat, StrictInt]] = Field(None, description="The onset loudness of the segment in decibels (dB). Combined with `loudness_max` and `loudness_max_time`, these components can be used to describe the \"attack\" of the segment.")
    loudness_max: Optional[Union[StrictFloat, StrictInt]] = Field(None, description="The peak loudness of the segment in decibels (dB). Combined with `loudness_start` and `loudness_max_time`, these components can be used to describe the \"attack\" of the segment.")
    loudness_max_time: Optional[Union[StrictFloat, StrictInt]] = Field(None, description="The segment-relative offset of the segment peak loudness in seconds. Combined with `loudness_start` and `loudness_max`, these components can be used to desctibe the \"attack\" of the segment.")
    loudness_end: Optional[Union[StrictFloat, StrictInt]] = Field(None, description="The offset loudness of the segment in decibels (dB). This value should be equivalent to the loudness_start of the following segment.")
    pitches: Optional[conlist(Union[confloat(le=1, ge=0, strict=True), conint(le=1, ge=0, strict=True)])] = Field(None, description="Pitch content is given by a “chroma” vector, corresponding to the 12 pitch classes C, C#, D to B, with values ranging from 0 to 1 that describe the relative dominance of every pitch in the chromatic scale. For example a C Major chord would likely be represented by large values of C, E and G (i.e. classes 0, 4, and 7).  Vectors are normalized to 1 by their strongest dimension, therefore noisy sounds are likely represented by values that are all close to 1, while pure tones are described by one value at 1 (the pitch) and others near 0. As can be seen below, the 12 vector indices are a combination of low-power spectrum values at their respective pitch frequencies. ![pitch vector](https://developer.spotify.com/assets/audio/Pitch_vector.png) ")
    timbre: Optional[conlist(Union[StrictFloat, StrictInt])] = Field(None, description="Timbre is the quality of a musical note or sound that distinguishes different types of musical instruments, or voices. It is a complex notion also referred to as sound color, texture, or tone quality, and is derived from the shape of a segment’s spectro-temporal surface, independently of pitch and loudness. The timbre feature is a vector that includes 12 unbounded values roughly centered around 0. Those values are high level abstractions of the spectral surface, ordered by degree of importance.  For completeness however, the first dimension represents the average loudness of the segment; second emphasizes brightness; third is more closely correlated to the flatness of a sound; fourth to sounds with a stronger attack; etc. See an image below representing the 12 basis functions (i.e. template segments). ![timbre basis functions](https://developer.spotify.com/assets/audio/Timbre_basis_functions.png)  The actual timbre of the segment is best described as a linear combination of these 12 basis functions weighted by the coefficient values: timbre = c1 x b1 + c2 x b2 + ... + c12 x b12, where c1 to c12 represent the 12 coefficients and b1 to b12 the 12 basis functions as displayed below. Timbre vectors are best used in comparison with each other. ")
    __properties = ["start", "duration", "confidence", "loudness_start", "loudness_max", "loudness_max_time", "loudness_end", "pitches", "timbre"]

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
    def from_json(cls, json_str: str) -> SegmentObject:
        """Create an instance of SegmentObject from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> SegmentObject:
        """Create an instance of SegmentObject from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return SegmentObject.parse_obj(obj)

        _obj = SegmentObject.parse_obj({
            "start": obj.get("start"),
            "duration": obj.get("duration"),
            "confidence": obj.get("confidence"),
            "loudness_start": obj.get("loudness_start"),
            "loudness_max": obj.get("loudness_max"),
            "loudness_max_time": obj.get("loudness_max_time"),
            "loudness_end": obj.get("loudness_end"),
            "pitches": obj.get("pitches"),
            "timbre": obj.get("timbre")
        })
        return _obj


