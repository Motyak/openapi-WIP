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

from pydantic import StrictInt, StrictStr, conint

from typing import Optional

from openapi_client.models.category_object import CategoryObject
from openapi_client.models.get_categories200_response import GetCategories200Response
from openapi_client.models.paging_featured_playlist_object import PagingFeaturedPlaylistObject

from openapi_client.api_client import ApiClient
from openapi_client.api_response import ApiResponse
from openapi_client.exceptions import (  # noqa: F401
    ApiTypeError,
    ApiValueError
)


class CategoriesApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient.get_default()
        self.api_client = api_client

    @validate_arguments
    def get_a_categories_playlists(self, category_id : StrictStr, country : Optional[StrictStr] = None, limit : Optional[conint(strict=True, le=50, ge=1)] = None, offset : Optional[StrictInt] = None, **kwargs) -> PagingFeaturedPlaylistObject:  # noqa: E501
        """Get Category's Playlists   # noqa: E501

        Get a list of Spotify playlists tagged with a particular category.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_a_categories_playlists(category_id, country, limit, offset, async_req=True)
        >>> result = thread.get()

        :param category_id: (required)
        :type category_id: str
        :param country:
        :type country: str
        :param limit:
        :type limit: int
        :param offset:
        :type offset: int
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: PagingFeaturedPlaylistObject
        """
        kwargs['_return_http_data_only'] = True
        if '_preload_content' in kwargs:
            raise ValueError("Error! Please call the get_a_categories_playlists_with_http_info method with `_preload_content` instead and obtain raw data from ApiResponse.raw_data")
        return self.get_a_categories_playlists_with_http_info(category_id, country, limit, offset, **kwargs)  # noqa: E501

    @validate_arguments
    def get_a_categories_playlists_with_http_info(self, category_id : StrictStr, country : Optional[StrictStr] = None, limit : Optional[conint(strict=True, le=50, ge=1)] = None, offset : Optional[StrictInt] = None, **kwargs) -> ApiResponse:  # noqa: E501
        """Get Category's Playlists   # noqa: E501

        Get a list of Spotify playlists tagged with a particular category.   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_a_categories_playlists_with_http_info(category_id, country, limit, offset, async_req=True)
        >>> result = thread.get()

        :param category_id: (required)
        :type category_id: str
        :param country:
        :type country: str
        :param limit:
        :type limit: int
        :param offset:
        :type offset: int
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
        :rtype: tuple(PagingFeaturedPlaylistObject, status_code(int), headers(HTTPHeaderDict))
        """

        _params = locals()

        _all_params = [
            'category_id',
            'country',
            'limit',
            'offset'
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
                    " to method get_a_categories_playlists" % _key
                )
            _params[_key] = _val
        del _params['kwargs']

        _collection_formats = {}

        # process the path parameters
        _path_params = {}
        if _params['category_id']:
            _path_params['category_id'] = _params['category_id']


        # process the query parameters
        _query_params = []
        if _params.get('country') is not None:  # noqa: E501
            _query_params.append(('country', _params['country']))

        if _params.get('limit') is not None:  # noqa: E501
            _query_params.append(('limit', _params['limit']))

        if _params.get('offset') is not None:  # noqa: E501
            _query_params.append(('offset', _params['offset']))

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
            '200': "PagingFeaturedPlaylistObject",
            '401': "GetAnAlbum401Response",
            '403': "GetAnAlbum401Response",
            '429': "GetAnAlbum401Response",
        }

        return self.api_client.call_api(
            '/browse/categories/{category_id}/playlists', 'GET',
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

    @validate_arguments
    def get_a_category(self, category_id : StrictStr, country : Optional[StrictStr] = None, locale : Optional[StrictStr] = None, **kwargs) -> CategoryObject:  # noqa: E501
        """Get Single Browse Category   # noqa: E501

        Get a single category used to tag items in Spotify (on, for example, the Spotify player’s “Browse” tab).   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_a_category(category_id, country, locale, async_req=True)
        >>> result = thread.get()

        :param category_id: (required)
        :type category_id: str
        :param country:
        :type country: str
        :param locale:
        :type locale: str
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: CategoryObject
        """
        kwargs['_return_http_data_only'] = True
        if '_preload_content' in kwargs:
            raise ValueError("Error! Please call the get_a_category_with_http_info method with `_preload_content` instead and obtain raw data from ApiResponse.raw_data")
        return self.get_a_category_with_http_info(category_id, country, locale, **kwargs)  # noqa: E501

    @validate_arguments
    def get_a_category_with_http_info(self, category_id : StrictStr, country : Optional[StrictStr] = None, locale : Optional[StrictStr] = None, **kwargs) -> ApiResponse:  # noqa: E501
        """Get Single Browse Category   # noqa: E501

        Get a single category used to tag items in Spotify (on, for example, the Spotify player’s “Browse” tab).   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_a_category_with_http_info(category_id, country, locale, async_req=True)
        >>> result = thread.get()

        :param category_id: (required)
        :type category_id: str
        :param country:
        :type country: str
        :param locale:
        :type locale: str
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
        :rtype: tuple(CategoryObject, status_code(int), headers(HTTPHeaderDict))
        """

        _params = locals()

        _all_params = [
            'category_id',
            'country',
            'locale'
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
                    " to method get_a_category" % _key
                )
            _params[_key] = _val
        del _params['kwargs']

        _collection_formats = {}

        # process the path parameters
        _path_params = {}
        if _params['category_id']:
            _path_params['category_id'] = _params['category_id']


        # process the query parameters
        _query_params = []
        if _params.get('country') is not None:  # noqa: E501
            _query_params.append(('country', _params['country']))

        if _params.get('locale') is not None:  # noqa: E501
            _query_params.append(('locale', _params['locale']))

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
            '200': "CategoryObject",
            '401': "GetAnAlbum401Response",
            '403': "GetAnAlbum401Response",
            '429': "GetAnAlbum401Response",
        }

        return self.api_client.call_api(
            '/browse/categories/{category_id}', 'GET',
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

    @validate_arguments
    def get_categories(self, country : Optional[StrictStr] = None, locale : Optional[StrictStr] = None, limit : Optional[conint(strict=True, le=50, ge=1)] = None, offset : Optional[StrictInt] = None, **kwargs) -> GetCategories200Response:  # noqa: E501
        """Get Several Browse Categories   # noqa: E501

        Get a list of categories used to tag items in Spotify (on, for example, the Spotify player’s “Browse” tab).   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_categories(country, locale, limit, offset, async_req=True)
        >>> result = thread.get()

        :param country:
        :type country: str
        :param locale:
        :type locale: str
        :param limit:
        :type limit: int
        :param offset:
        :type offset: int
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: GetCategories200Response
        """
        kwargs['_return_http_data_only'] = True
        if '_preload_content' in kwargs:
            raise ValueError("Error! Please call the get_categories_with_http_info method with `_preload_content` instead and obtain raw data from ApiResponse.raw_data")
        return self.get_categories_with_http_info(country, locale, limit, offset, **kwargs)  # noqa: E501

    @validate_arguments
    def get_categories_with_http_info(self, country : Optional[StrictStr] = None, locale : Optional[StrictStr] = None, limit : Optional[conint(strict=True, le=50, ge=1)] = None, offset : Optional[StrictInt] = None, **kwargs) -> ApiResponse:  # noqa: E501
        """Get Several Browse Categories   # noqa: E501

        Get a list of categories used to tag items in Spotify (on, for example, the Spotify player’s “Browse” tab).   # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.get_categories_with_http_info(country, locale, limit, offset, async_req=True)
        >>> result = thread.get()

        :param country:
        :type country: str
        :param locale:
        :type locale: str
        :param limit:
        :type limit: int
        :param offset:
        :type offset: int
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
        :rtype: tuple(GetCategories200Response, status_code(int), headers(HTTPHeaderDict))
        """

        _params = locals()

        _all_params = [
            'country',
            'locale',
            'limit',
            'offset'
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
                    " to method get_categories" % _key
                )
            _params[_key] = _val
        del _params['kwargs']

        _collection_formats = {}

        # process the path parameters
        _path_params = {}

        # process the query parameters
        _query_params = []
        if _params.get('country') is not None:  # noqa: E501
            _query_params.append(('country', _params['country']))

        if _params.get('locale') is not None:  # noqa: E501
            _query_params.append(('locale', _params['locale']))

        if _params.get('limit') is not None:  # noqa: E501
            _query_params.append(('limit', _params['limit']))

        if _params.get('offset') is not None:  # noqa: E501
            _query_params.append(('offset', _params['offset']))

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
            '200': "GetCategories200Response",
            '401': "GetAnAlbum401Response",
            '403': "GetAnAlbum401Response",
            '429': "GetAnAlbum401Response",
        }

        return self.api_client.call_api(
            '/browse/categories', 'GET',
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