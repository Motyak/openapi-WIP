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
from openapi_client.models.artist_discography_album_object import ArtistDiscographyAlbumObject  # noqa: E501
from openapi_client.rest import ApiException

class TestArtistDiscographyAlbumObject(unittest.TestCase):
    """ArtistDiscographyAlbumObject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test ArtistDiscographyAlbumObject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ArtistDiscographyAlbumObject`
        """
        model = openapi_client.models.artist_discography_album_object.ArtistDiscographyAlbumObject()  # noqa: E501
        if include_optional :
            return ArtistDiscographyAlbumObject(
                album_type = 'compilation', 
                total_tracks = 9, 
                available_markets = ["CA","BR","IT"], 
                external_urls = openapi_client.models.external_url_object.ExternalUrlObject(
                    spotify = '', ), 
                href = '', 
                id = '2up3OPMp9Tb4dAKM2erWXQ', 
                images = [
                    openapi_client.models.image_object.ImageObject(
                        url = 'https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228
', 
                        height = 300, 
                        width = 300, )
                    ], 
                name = '', 
                release_date = '1981-12', 
                release_date_precision = 'year', 
                restrictions = openapi_client.models.album_restriction_object.AlbumRestrictionObject(
                    reason = 'market', ), 
                type = 'album', 
                uri = 'spotify:album:2up3OPMp9Tb4dAKM2erWXQ', 
                artists = [
                    openapi_client.models.simplified_artist_object.SimplifiedArtistObject(
                        external_urls = null, 
                        href = '', 
                        id = '', 
                        name = '', 
                        type = 'artist', 
                        uri = '', )
                    ], 
                album_group = 'compilation'
            )
        else :
            return ArtistDiscographyAlbumObject(
                album_type = 'compilation',
                total_tracks = 9,
                available_markets = ["CA","BR","IT"],
                external_urls = openapi_client.models.external_url_object.ExternalUrlObject(
                    spotify = '', ),
                href = '',
                id = '2up3OPMp9Tb4dAKM2erWXQ',
                images = [
                    openapi_client.models.image_object.ImageObject(
                        url = 'https://i.scdn.co/image/ab67616d00001e02ff9ca10b55ce82ae553c8228
', 
                        height = 300, 
                        width = 300, )
                    ],
                name = '',
                release_date = '1981-12',
                release_date_precision = 'year',
                type = 'album',
                uri = 'spotify:album:2up3OPMp9Tb4dAKM2erWXQ',
                artists = [
                    openapi_client.models.simplified_artist_object.SimplifiedArtistObject(
                        external_urls = null, 
                        href = '', 
                        id = '', 
                        name = '', 
                        type = 'artist', 
                        uri = '', )
                    ],
                album_group = 'compilation',
        )
        """

    def testArtistDiscographyAlbumObject(self):
        """Test ArtistDiscographyAlbumObject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
