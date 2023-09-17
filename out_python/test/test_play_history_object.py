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
from openapi_client.models.play_history_object import PlayHistoryObject  # noqa: E501
from openapi_client.rest import ApiException

class TestPlayHistoryObject(unittest.TestCase):
    """PlayHistoryObject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test PlayHistoryObject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PlayHistoryObject`
        """
        model = openapi_client.models.play_history_object.PlayHistoryObject()  # noqa: E501
        if include_optional :
            return PlayHistoryObject(
                track = openapi_client.models.track_object.TrackObject(
                    album = null, 
                    artists = [
                        openapi_client.models.artist_object.ArtistObject(
                            external_urls = null, 
                            followers = null, 
                            genres = ["Prog rock","Grunge"], 
                            href = '', 
                            id = '', 
                            images = [
                                openapi_client.models.image_object.ImageObject(
                                    url = 'https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228
', 
                                    height = 300, 
                                    width = 300, )
                                ], 
                            name = '', 
                            popularity = 56, 
                            type = 'artist', 
                            uri = '', )
                        ], 
                    available_markets = [
                        ''
                        ], 
                    disc_number = 56, 
                    duration_ms = 56, 
                    explicit = True, 
                    external_ids = null, 
                    external_urls = null, 
                    href = '', 
                    id = '', 
                    is_playable = True, 
                    linked_from = null, 
                    restrictions = null, 
                    name = '', 
                    popularity = 56, 
                    preview_url = '', 
                    track_number = 56, 
                    type = 'track', 
                    uri = '', 
                    is_local = True, ), 
                played_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                context = openapi_client.models.context_object.ContextObject(
                    type = '', 
                    href = '', 
                    external_urls = null, 
                    uri = '', )
            )
        else :
            return PlayHistoryObject(
        )
        """

    def testPlayHistoryObject(self):
        """Test PlayHistoryObject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()