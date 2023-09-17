# coding: utf-8

"""
    Spotify Web API with fixes and improvements from sonallux

    You can use Spotify's Web API to discover music and podcasts, manage your Spotify library, control audio playback, and much more. Browse our available Web API endpoints using the sidebar at left, or via the navigation bar on top of this page on smaller screens.  In order to make successful Web API requests your app will need a valid access token. One can be obtained through <a href=\"https://developer.spotify.com/documentation/general/guides/authorization-guide/\">OAuth 2.0</a>.  The base URI for all Web API requests is `https://api.spotify.com/v1`.  Need help? See our <a href=\"https://developer.spotify.com/documentation/web-api/guides/\">Web API guides</a> for more information, or visit the <a href=\"https://community.spotify.com/t5/Spotify-for-Developers/bd-p/Spotify_Developer\">Spotify for Developers community forum</a> to ask questions and connect with other developers. 

    The version of the OpenAPI document: 2023.8.30
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import re  # noqa: F401
import io
import warnings

from pydantic import validate_arguments, ValidationError
from typing_extensions import Annotated

from pydantic import StrictStr, conint, conlist, validator

from typing import Optional

from openapi_client.models.search200_response import Search200Response

from openapi_client.api_client import ApiClient
from openapi_client.api_response import ApiResponse
from openapi_client.exceptions import (  # noqa: F401
    ApiTypeError,
    ApiValueError
)


class SearchApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient.get_default()
        self.api_client = api_client

    @validate_arguments
    def search(self, q : StrictStr, type : conlist(StrictStr), market : Optional[StrictStr] = None, limit : Optional[conint(strict=True, le=50, ge=1)] = None, offset : Optional[conint(strict=True, le=1000, ge=0)] = None, include_external : Optional[StrictStr] = None, **kwargs) -> Search200Response:  # noqa: E501
        """Search for Item   # noqa: E501

        Get Spotify catalog information about albums, artists, playlists, tracks, shows, episodes or audiobooks that match a keyword string.<br /> **Note: Audiobooks are only available for the US, UK, Ireland, New Zealand and Australia markets.**   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.search(q, type, market, limit, offset, include_external, async_req=True)
        >>> result = thread.get()

        :param q: (required)
        :type q: str
        :param type: (required)
        :type type: List[str]
        :param market:
        :type market: str
        :param limit:
        :type limit: int
        :param offset:
        :type offset: int
        :param include_external:
        :type include_external: str
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: Search200Response
        """
        kwargs['_return_http_data_only'] = True
        if '_preload_content' in kwargs:
            raise ValueError("Error! Please call the search_with_http_info method with `_preload_content` instead and obtain raw data from ApiResponse.raw_data")
        return self.search_with_http_info(q, type, market, limit, offset, include_external, **kwargs)  # noqa: E501

    @validate_arguments
    def search_with_http_info(self, q : StrictStr, type : conlist(StrictStr), market : Optional[StrictStr] = None, limit : Optional[conint(strict=True, le=50, ge=1)] = None, offset : Optional[conint(strict=True, le=1000, ge=0)] = None, include_external : Optional[StrictStr] = None, **kwargs) -> ApiResponse:  # noqa: E501
        """Search for Item   # noqa: E501

        Get Spotify catalog information about albums, artists, playlists, tracks, shows, episodes or audiobooks that match a keyword string.<br /> **Note: Audiobooks are only available for the US, UK, Ireland, New Zealand and Australia markets.**   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.search_with_http_info(q, type, market, limit, offset, include_external, async_req=True)
        >>> result = thread.get()

        :param q: (required)
        :type q: str
        :param type: (required)
        :type type: List[str]
        :param market:
        :type market: str
        :param limit:
        :type limit: int
        :param offset:
        :type offset: int
        :param include_external:
        :type include_external: str
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _preload_content: if False, the ApiResponse.data will
                                 be set to none and raw_data will store the 
                                 HTTP response body without reading/decoding.
                                 Default is True.
        :type _preload_content: bool, optional
        :param _return_http_data_only: response data instead of ApiResponse
                                       object with status code, headers, etc
        :type _return_http_data_only: bool, optional
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the authentication
                              in the spec for a single request.
        :type _request_auth: dict, optional
        :type _content_type: string, optional: force content-type for the request
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: tuple(Search200Response, status_code(int), headers(HTTPHeaderDict))
        """

        _params = locals()

        _all_params = [
            'q',
            'type',
            'market',
            'limit',
            'offset',
            'include_external'
        ]
        _all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout',
                '_request_auth',
                '_content_type',
                '_headers'
            ]
        )

        # validate the arguments
        for _key, _val in _params['kwargs'].items():
            if _key not in _all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method search" % _key
                )
            _params[_key] = _val
        del _params['kwargs']

        _collection_formats = {}

        # process the path parameters
        _path_params = {}

        # process the query parameters
        _query_params = []
        if _params.get('q') is not None:  # noqa: E501
            _query_params.append(('q', _params['q']))

        if _params.get('type') is not None:  # noqa: E501
            _query_params.append(('type', _params['type']))
            _collection_formats['type'] = 'csv'

        if _params.get('market') is not None:  # noqa: E501
            _query_params.append(('market', _params['market']))

        if _params.get('limit') is not None:  # noqa: E501
            _query_params.append(('limit', _params['limit']))

        if _params.get('offset') is not None:  # noqa: E501
            _query_params.append(('offset', _params['offset']))

        if _params.get('include_external') is not None:  # noqa: E501
            _query_params.append(('include_external', _params['include_external']))

        # process the header parameters
        _header_params = dict(_params.get('_headers', {}))
        # process the form parameters
        _form_params = []
        _files = {}
        # process the body parameter
        _body_params = None
        # set the HTTP header `Accept`
        _header_params['Accept'] = self.api_client.select_header_accept(
            ['application/json'])  # noqa: E501

        # authentication setting
        _auth_settings = ['oauth_2_0']  # noqa: E501

        _response_types_map = {
            '200': "Search200Response",
            '401': "GetAnAlbum401Response",
            '403': "GetAnAlbum401Response",
            '429': "GetAnAlbum401Response",
        }

        return self.api_client.call_api(
            '/search', 'GET',
            _path_params,
            _query_params,
            _header_params,
            body=_body_params,
            post_params=_form_params,
            files=_files,
            response_types_map=_response_types_map,
            auth_settings=_auth_settings,
            async_req=_params.get('async_req'),
            _return_http_data_only=_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=_params.get('_preload_content', True),
            _request_timeout=_params.get('_request_timeout'),
            collection_formats=_collection_formats,
            _request_auth=_params.get('_request_auth'))
