# coding: utf-8

"""
    Spotify Web API with fixes and improvements from sonallux

    You can use Spotify's Web API to discover music and podcasts, manage your Spotify library, control audio playback, and much more. Browse our available Web API endpoints using the sidebar at left, or via the navigation bar on top of this page on smaller screens.  In order to make successful Web API requests your app will need a valid access token. One can be obtained through <a href=\"https://developer.spotify.com/documentation/general/guides/authorization-guide/\">OAuth 2.0</a>.  The base URI for all Web API requests is `https://api.spotify.com/v1`.  Need help? See our <a href=\"https://developer.spotify.com/documentation/web-api/guides/\">Web API guides</a> for more information, or visit the <a href=\"https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer\">Spotify for Developers community forum</a> to ask questions and connect with other developers. 

    The version of the OpenAPI document: 2023.8.30
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

import openapi_client
from openapi_client.api.albums_api import AlbumsApi  # noqa: E501
from openapi_client.rest import ApiException


class TestAlbumsApi(unittest.TestCase):
    """AlbumsApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.albums_api.AlbumsApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_check_users_saved_albums(self):
        """Test case for check_users_saved_albums

        Check User's Saved Albums   # noqa: E501
        """
        pass

    def test_get_an_album(self):
        """Test case for get_an_album

        Get Album   # noqa: E501
        """
        pass

    def test_get_an_albums_tracks(self):
        """Test case for get_an_albums_tracks

        Get Album Tracks   # noqa: E501
        """
        pass

    def test_get_an_artists_albums(self):
        """Test case for get_an_artists_albums

        Get Artist's Albums   # noqa: E501
        """
        pass

    def test_get_multiple_albums(self):
        """Test case for get_multiple_albums

        Get Several Albums   # noqa: E501
        """
        pass

    def test_get_new_releases(self):
        """Test case for get_new_releases

        Get New Releases   # noqa: E501
        """
        pass

    def test_get_users_saved_albums(self):
        """Test case for get_users_saved_albums

        Get User's Saved Albums   # noqa: E501
        """
        pass

    def test_remove_albums_user(self):
        """Test case for remove_albums_user

        Remove Users' Saved Albums   # noqa: E501
        """
        pass

    def test_save_albums_user(self):
        """Test case for save_albums_user

        Save Albums for Current User   # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()