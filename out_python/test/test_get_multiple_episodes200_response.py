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
from openapi_client.models.get_multiple_episodes200_response import GetMultipleEpisodes200Response  # noqa: E501
from openapi_client.rest import ApiException

class TestGetMultipleEpisodes200Response(unittest.TestCase):
    """GetMultipleEpisodes200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test GetMultipleEpisodes200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GetMultipleEpisodes200Response`
        """
        model = openapi_client.models.get_multiple_episodes200_response.GetMultipleEpisodes200Response()  # noqa: E501
        if include_optional :
            return GetMultipleEpisodes200Response(
                episodes = [
                    openapi_client.models.episode_object.EpisodeObject()
                    ]
            )
        else :
            return GetMultipleEpisodes200Response(
                episodes = [
                    openapi_client.models.episode_object.EpisodeObject()
                    ],
        )
        """

    def testGetMultipleEpisodes200Response(self):
        """Test GetMultipleEpisodes200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
