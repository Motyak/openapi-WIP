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
from openapi_client.models.simplified_show_object import SimplifiedShowObject  # noqa: E501
from openapi_client.rest import ApiException

class TestSimplifiedShowObject(unittest.TestCase):
    """SimplifiedShowObject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test SimplifiedShowObject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SimplifiedShowObject`
        """
        model = openapi_client.models.simplified_show_object.SimplifiedShowObject()  # noqa: E501
        if include_optional :
            return SimplifiedShowObject(
                available_markets = [
                    ''
                    ], 
                copyrights = [
                    openapi_client.models.copyright_object.CopyrightObject(
                        text = '', 
                        type = '', )
                    ], 
                description = '', 
                html_description = '', 
                explicit = True, 
                external_urls = openapi_client.models.external_url_object.ExternalUrlObject(
                    spotify = '', ), 
                href = '', 
                id = '', 
                images = [
                    openapi_client.models.image_object.ImageObject(
                        url = 'https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228
', 
                        height = 300, 
                        width = 300, )
                    ], 
                is_externally_hosted = True, 
                languages = [
                    ''
                    ], 
                media_type = '', 
                name = '', 
                publisher = '', 
                type = 'show', 
                uri = '', 
                total_episodes = 56
            )
        else :
            return SimplifiedShowObject(
                available_markets = [
                    ''
                    ],
                copyrights = [
                    openapi_client.models.copyright_object.CopyrightObject(
                        text = '', 
                        type = '', )
                    ],
                description = '',
                html_description = '',
                explicit = True,
                external_urls = openapi_client.models.external_url_object.ExternalUrlObject(
                    spotify = '', ),
                href = '',
                id = '',
                images = [
                    openapi_client.models.image_object.ImageObject(
                        url = 'https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228
', 
                        height = 300, 
                        width = 300, )
                    ],
                is_externally_hosted = True,
                languages = [
                    ''
                    ],
                media_type = '',
                name = '',
                publisher = '',
                type = 'show',
                uri = '',
                total_episodes = 56,
        )
        """

    def testSimplifiedShowObject(self):
        """Test SimplifiedShowObject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
