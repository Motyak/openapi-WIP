# coding: utf-8

"""
    Spotify Web API with fixes and improvements from sonallux

    You can use Spotify's Web API to discover music and podcasts, manage your Spotify library, control audio playback, and much more. Browse our available Web API endpoints using the sidebar at left, or via the navigation bar on top of this page on smaller screens.  In order to make successful Web API requests your app will need a valid access token. One can be obtained through <a href=\"https://developer.spotify.com/documentation/general/guides/authorization-guide/\">OAuth 2.0</a>.  The base URI for all Web API requests is `https://api.spotify.com/v1`.  Need help? See our <a href=\"https://developer.spotify.com/documentation/web-api/guides/\">Web API guides</a> for more information, or visit the <a href=\"https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer\">Spotify for Developers community forum</a> to ask questions and connect with other developers. 

    The version of the OpenAPI document: 2023.8.30
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

import openapi_client
from openapi_client.models.audio_analysis_object_track import AudioAnalysisObjectTrack  # noqa: E501
from openapi_client.rest import ApiException

class TestAudioAnalysisObjectTrack(unittest.TestCase):
    """AudioAnalysisObjectTrack unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test AudioAnalysisObjectTrack
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `AudioAnalysisObjectTrack`
        """
        model = openapi_client.models.audio_analysis_object_track.AudioAnalysisObjectTrack()  # noqa: E501
        if include_optional :
            return AudioAnalysisObjectTrack(
                num_samples = 4585515, 
                duration = 207.95985, 
                sample_md5 = '', 
                offset_seconds = 0, 
                window_seconds = 0, 
                analysis_sample_rate = 22050, 
                analysis_channels = 1, 
                end_of_fade_in = 0.0, 
                start_of_fade_out = 201.13705, 
                loudness = -5.883, 
                tempo = 118.211, 
                tempo_confidence = 0.73, 
                time_signature = 4, 
                time_signature_confidence = 0.994, 
                key = 9, 
                key_confidence = 0.408, 
                mode = 0, 
                mode_confidence = 0.485, 
                codestring = '', 
                code_version = 3.15, 
                echoprintstring = '', 
                echoprint_version = 4.15, 
                synchstring = '', 
                synch_version = 1.0, 
                rhythmstring = '', 
                rhythm_version = 1.0
            )
        else :
            return AudioAnalysisObjectTrack(
        )
        """

    def testAudioAnalysisObjectTrack(self):
        """Test AudioAnalysisObjectTrack"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
