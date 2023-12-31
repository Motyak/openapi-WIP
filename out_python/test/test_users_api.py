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
from openapi_client.api.users_api import UsersApi  # noqa: E501
from openapi_client.rest import ApiException


class TestUsersApi(unittest.TestCase):
    """UsersApi unit test stubs"""

    def setUp(self):
        self.api = openapi_client.api.users_api.UsersApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_check_current_user_follows(self):
        """Test case for check_current_user_follows

        Check If User Follows Artists or Users   # noqa: E501
        """
        pass

    def test_check_if_user_follows_playlist(self):
        """Test case for check_if_user_follows_playlist

        Check if Users Follow Playlist   # noqa: E501
        """
        pass

    def test_follow_artists_users(self):
        """Test case for follow_artists_users

        Follow Artists or Users   # noqa: E501
        """
        pass

    def test_follow_playlist(self):
        """Test case for follow_playlist

        Follow Playlist   # noqa: E501
        """
        pass

    def test_get_current_users_profile(self):
        """Test case for get_current_users_profile

        Get Current User's Profile   # noqa: E501
        """
        pass

    def test_get_followed(self):
        """Test case for get_followed

        Get Followed Artists   # noqa: E501
        """
        pass

    def test_get_list_users_playlists(self):
        """Test case for get_list_users_playlists

        Get User's Playlists   # noqa: E501
        """
        pass

    def test_get_users_profile(self):
        """Test case for get_users_profile

        Get User's Profile   # noqa: E501
        """
        pass

    def test_get_users_top_artists(self):
        """Test case for get_users_top_artists

        Get User's Top Artists   # noqa: E501
        """
        pass

    def test_get_users_top_tracks(self):
        """Test case for get_users_top_tracks

        Get User's Top Tracks   # noqa: E501
        """
        pass

    def test_unfollow_artists_users(self):
        """Test case for unfollow_artists_users

        Unfollow Artists or Users   # noqa: E501
        """
        pass

    def test_unfollow_playlist(self):
        """Test case for unfollow_playlist

        Unfollow Playlist   # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
