/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 42dp Labs GmbH
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.weare42dp.vimeoclient;

import com.google.api.client.util.ArrayMap;
import com.weare42dp.vimeoclient.Request.LoginTestRequest;
import com.weare42dp.vimeoclient.Request.VimeoAlbumsGetAllRequest;
import com.weare42dp.vimeoclient.Request.VimeoAlbumsGetVideosRequest;
import com.weare42dp.vimeoclient.Request.VimeoAlbumsGetWatchLaterRequest;
import com.weare42dp.vimeoclient.Request.VimeoChannelsGetAllRequest;
import com.weare42dp.vimeoclient.Request.VimeoChannelsGetInfoRequest;
import com.weare42dp.vimeoclient.Request.VimeoChannelsGetVideosRequest;
import com.weare42dp.vimeoclient.Request.VimeoGenericRequest;
import com.weare42dp.vimeoclient.Request.VimeoPeopleGetSubscriptionsRequest;
import com.weare42dp.vimeoclient.Request.VimeoRequestInitializer;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.http.HttpRequestInitializer;
import com.weare42dp.vimeoclient.Request.VimeoVideosCommentsGetListRequest;
import com.weare42dp.vimeoclient.Request.VimeoVideosGetAllRequest;
import com.weare42dp.vimeoclient.Request.VimeoVideosGetByTagRequest;
import com.weare42dp.vimeoclient.Request.VimeoVideosGetInfoRequest;
import com.weare42dp.vimeoclient.Request.VimeoVideosGetLikersRequest;
import com.weare42dp.vimeoclient.Request.VimeoVideosGetLikesRequest;
import com.weare42dp.vimeoclient.Request.VimeoVideosSearchRequest;

import java.io.IOException;

public class VimeoClient extends AbstractGoogleJsonClient {

    public static final String DEFAULT_ROOT_URL = "http://vimeo.com/";

    public static final String DEFAULT_SERVICE_PATH = "api/rest/v2";

    public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

    public VimeoClient(com.google.api.client.http.HttpTransport transport,
                  com.google.api.client.json.JsonFactory jsonFactory,
                  com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
        this(new Builder(transport, jsonFactory, httpRequestInitializer));
    }

    VimeoClient(Builder builder) {
        super(builder);
    }

    @Override
    protected void initialize(AbstractGoogleClientRequest<?> httpClientRequest) throws IOException {
        super.initialize(httpClientRequest);
    }

    public LoginTestRequest getLoginStatus() throws IOException
    {
        LoginTestRequest request = new LoginTestRequest();
        initialize(request);
        return request;
    }

    public VimeoAlbumsGetAllRequest getVimeoAlbumsGetAll(long p_UserID) throws IOException
    {
        VimeoAlbumsGetAllRequest request = new VimeoAlbumsGetAllRequest();
        request.SetUserID(p_UserID);
        initialize(request);
        return request;
    }

    public VimeoAlbumsGetAllRequest getVimeoAlbumsGetAll(long p_UserID, int p_Page, int p_PerPage, String p_SortMethod) throws IOException
    {
        VimeoAlbumsGetAllRequest request = new VimeoAlbumsGetAllRequest();
        request.SetUserID(p_UserID);
        request.setPage(p_Page);
        request.setPerPage(p_PerPage);
        request.setSort(p_SortMethod);
        initialize(request);
        return request;
    }

    public VimeoAlbumsGetVideosRequest getVimeoAlbumsGetVideos(long p_AlbumId) throws IOException
    {
        VimeoAlbumsGetVideosRequest request = new VimeoAlbumsGetVideosRequest();
        request.setAlbumId(p_AlbumId);
        initialize(request);
        return request;
    }

    public VimeoAlbumsGetVideosRequest getVimeoAlbumsGetVideos(long p_AlbumId, int p_Page, int p_PerPage, String p_Password, boolean p_SummaryResponse, boolean p_FullResponse) throws IOException
    {
        VimeoAlbumsGetVideosRequest request = new VimeoAlbumsGetVideosRequest();
        request.setAlbumId(p_AlbumId);
        request.setPage(p_Page);
        request.setPerPage(p_PerPage);
        request.setPassword(p_Password);
        request.setFullResponse(p_FullResponse);
        request.setSummaryResponse(p_SummaryResponse);
        initialize(request);
        return request;
    }

    public VimeoAlbumsGetWatchLaterRequest getVimeoAlbumsGetWatchLater() throws IOException
    {
        VimeoAlbumsGetWatchLaterRequest request = new VimeoAlbumsGetWatchLaterRequest();
        initialize(request);
        return request;
    }

    public VimeoAlbumsGetWatchLaterRequest getVimeoAlbumsGetWatchLater(int p_Page, int p_PerPage, boolean p_SummaryResponse, boolean p_FullResponse) throws IOException
    {
        VimeoAlbumsGetWatchLaterRequest request = new VimeoAlbumsGetWatchLaterRequest();
        request.setPage(p_Page);
        request.setPerPage(p_PerPage);
        request.setFullResponse(p_FullResponse);
        request.setSummaryResponse(p_SummaryResponse);
        initialize(request);
        return request;
    }

    public VimeoChannelsGetAllRequest getVimeoChannelsGetAll() throws IOException
    {
        VimeoChannelsGetAllRequest request = new VimeoChannelsGetAllRequest();
        initialize(request);
        return request;
    }

    public VimeoChannelsGetAllRequest getVimeoChannelsGetAll(int p_Page, int p_PerPage, String p_SortMethod) throws IOException
    {
        VimeoChannelsGetAllRequest request = new VimeoChannelsGetAllRequest();
        request.setPage(p_Page);
        request.setPerPage(p_PerPage);
        request.setSort(p_SortMethod);
        initialize(request);
        return request;
    }

    public VimeoChannelsGetInfoRequest getVimeoChannelsGetInfo(long p_ChannelId) throws IOException
    {
        VimeoChannelsGetInfoRequest request = new VimeoChannelsGetInfoRequest();
        request.setChannelId(p_ChannelId);
        initialize(request);
        return request;
    }

    public VimeoChannelsGetVideosRequest getVimeoChannelsGetVideos(long p_ChannelID) throws IOException
    {
        VimeoChannelsGetVideosRequest request = new VimeoChannelsGetVideosRequest();
        request.SetChannelID(p_ChannelID);
        initialize(request);
        return request;
    }

    public VimeoChannelsGetVideosRequest getVimeoChannelsGetVideos(long p_ChannelID, int p_Page, int p_PerPage, boolean p_SummaryResponse, boolean p_FullResponse) throws IOException
    {
        VimeoChannelsGetVideosRequest request = new VimeoChannelsGetVideosRequest();
        request.SetChannelID(p_ChannelID);
        request.setPage(p_Page);
        request.setPerPage(p_PerPage);
        request.setFullResponse(p_FullResponse);
        request.setSummaryResponse(p_SummaryResponse);
        initialize(request);
        return request;
    }

    public VimeoPeopleGetSubscriptionsRequest getVimeoPeopleGetSubscriptions() throws IOException
    {
        VimeoPeopleGetSubscriptionsRequest request = new VimeoPeopleGetSubscriptionsRequest();
        initialize(request);
        return request;
    }

    public VimeoPeopleGetSubscriptionsRequest getVimeoPeopleGetSubscriptions(int p_Page, int p_PerPage) throws IOException
    {
        VimeoPeopleGetSubscriptionsRequest request = new VimeoPeopleGetSubscriptionsRequest();
        request.setPage(p_Page);
        request.setPerPage(p_PerPage);
        initialize(request);
        return request;
    }

    public VimeoVideosCommentsGetListRequest getVimeoVideosCommentsGetList(long p_VideoId) throws IOException
    {
        VimeoVideosCommentsGetListRequest request = new VimeoVideosCommentsGetListRequest();
        request.SetVideoID(p_VideoId);
        initialize(request);
        return request;
    }

    public VimeoVideosCommentsGetListRequest getVimeoVideosCommentsGetList(long p_VideoId, int p_Page, int p_PerPage) throws IOException
    {
        VimeoVideosCommentsGetListRequest request = new VimeoVideosCommentsGetListRequest();
        request.SetVideoID(p_VideoId);
        request.setPage(p_Page);
        request.setPerPage(p_PerPage);
        initialize(request);
        return request;
    }

    public VimeoVideosGetAllRequest getVimeoVideosGetAll() throws IOException
    {
        VimeoVideosGetAllRequest request = new VimeoVideosGetAllRequest();
        initialize(request);
        return request;
    }

    public VimeoVideosGetAllRequest getVimeoVideosGetAll(int p_Page, int p_PerPage, String p_SortMethod, boolean p_SummaryResponse, boolean p_FullResponse) throws IOException
    {
        VimeoVideosGetAllRequest request = new VimeoVideosGetAllRequest();
        request.setPage(p_Page);
        request.setPerPage(p_PerPage);
        request.setSort(p_SortMethod);
        request.setFullResponse(p_FullResponse);
        request.setSummaryResponse(p_SummaryResponse);
        initialize(request);
        return request;
    }

    public VimeoVideosGetAllRequest getVimeoVideosGetAll(long p_UserId, int p_Page, int p_PerPage, String p_SortMethod, boolean p_SummaryResponse, boolean p_FullResponse) throws IOException
    {
        VimeoVideosGetAllRequest request = new VimeoVideosGetAllRequest();
        request.SetUserID(p_UserId);
        request.setPage(p_Page);
        request.setPerPage(p_PerPage);
        request.setSort(p_SortMethod);
        request.setFullResponse(p_FullResponse);
        request.setSummaryResponse(p_SummaryResponse);
        initialize(request);
        return request;
    }

    public VimeoVideosGetByTagRequest getVimeoVideosGetByTag(String p_Tag) throws IOException
    {
        VimeoVideosGetByTagRequest request = new VimeoVideosGetByTagRequest();
        request.setTag(p_Tag);
        initialize(request);
        return request;
    }

    public VimeoVideosGetByTagRequest getVimeoVideosGetByTag(String p_Tag, int p_Page, int p_PerPage, String p_SortMethod, boolean p_SummaryResponse, boolean p_FullResponse) throws IOException
    {
        VimeoVideosGetByTagRequest request = new VimeoVideosGetByTagRequest();
        request.setTag(p_Tag);
        request.setPage(p_Page);
        request.setPerPage(p_PerPage);
        request.setSort(p_SortMethod);
        request.setFullResponse(p_FullResponse);
        request.setSummaryResponse(p_SummaryResponse);
        initialize(request);
        return request;
    }

    public VimeoVideosGetInfoRequest getVimeoVideosGetInfo(long p_VideoId) throws IOException
    {
        VimeoVideosGetInfoRequest request = new VimeoVideosGetInfoRequest();
        request.SetVideoID(p_VideoId);
        initialize(request);
        return request;
    }

    public VimeoVideosGetLikersRequest getVimeoVideosGetLikers(long p_VideoId) throws IOException
    {
        VimeoVideosGetLikersRequest request = new VimeoVideosGetLikersRequest();
        request.SetVideoID(p_VideoId);
        initialize(request);
        return request;
    }

    public VimeoVideosGetLikersRequest getVimeoVideosGetLikers(long p_VideoId, int p_Page, int p_PerPage) throws IOException
    {
        VimeoVideosGetLikersRequest request = new VimeoVideosGetLikersRequest();
        request.SetVideoID(p_VideoId);
        request.setPage(p_Page);
        request.setPerPage(p_PerPage);
        initialize(request);
        return request;
    }

    public VimeoVideosGetLikesRequest getVimeoVideosGetLikes(long p_UserId) throws IOException
    {
        VimeoVideosGetLikesRequest request = new VimeoVideosGetLikesRequest();
        request.SetUserID(p_UserId);
        initialize(request);
        return request;
    }

    public VimeoVideosGetLikesRequest getVimeoVideosGetLikes(long p_UserId, int p_Page, int p_PerPage, String p_SortMethod, boolean p_SummaryResponse, boolean p_FullResponse) throws IOException
    {
        VimeoVideosGetLikesRequest request = new VimeoVideosGetLikesRequest();
        request.SetUserID(p_UserId);
        request.setPage(p_Page);
        request.setPerPage(p_PerPage);
        request.setSort(p_SortMethod);
        request.setFullResponse(p_FullResponse);
        request.setSummaryResponse(p_SummaryResponse);
        initialize(request);
        return request;
    }

    public VimeoVideosSearchRequest getVimeoVideosSearch(String p_Query) throws IOException
    {
        VimeoVideosSearchRequest request = new VimeoVideosSearchRequest();
        request.setQuery(p_Query);
        initialize(request);
        return request;
    }

    public VimeoVideosSearchRequest getVimeoVideosSearch(String p_Query, int p_Page, int p_PerPage, String p_SortMethod, boolean p_SummaryResponse, boolean p_FullResponse) throws IOException
    {
        VimeoVideosSearchRequest request = new VimeoVideosSearchRequest();
        request.setQuery(p_Query);
        request.setPage(p_Page);
        request.setPerPage(p_PerPage);
        request.setSort(p_SortMethod);
        request.setFullResponse(p_FullResponse);
        request.setSummaryResponse(p_SummaryResponse);
        initialize(request);
        return request;
    }

    public VimeoVideosSearchRequest getVimeoVideosSearch(String p_Query, long p_UserId, int p_Page, int p_PerPage, String p_SortMethod, boolean p_SummaryResponse, boolean p_FullResponse) throws IOException
    {
        VimeoVideosSearchRequest request = new VimeoVideosSearchRequest();
        request.setQuery(p_Query);
        request.SetUserID(p_UserId);
        request.setPage(p_Page);
        request.setPerPage(p_PerPage);
        request.setSort(p_SortMethod);
        request.setFullResponse(p_FullResponse);
        request.setSummaryResponse(p_SummaryResponse);
        initialize(request);
        return request;
    }

    public VimeoGenericRequest getVimeoGenericRequest(String p_MethodName, ArrayMap p_Parameter) throws IOException
    {
        VimeoGenericRequest request = new VimeoGenericRequest();
        request.setMethodName(p_MethodName);
        request.putAll(p_Parameter);
        initialize(request);
        return request;
    }

    public static final class Builder extends
            com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

        public Builder(com.google.api.client.http.HttpTransport transport,
                       com.google.api.client.json.JsonFactory jsonFactory,
                       com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
            super(transport,
                    jsonFactory,
                    DEFAULT_ROOT_URL,
                    DEFAULT_SERVICE_PATH,
                    httpRequestInitializer,
                    false);
        }

        @Override
        public VimeoClient build() {
            return new VimeoClient(this);
        }

        @Override
        public Builder setRootUrl(String rootUrl) {
            return (Builder) super.setRootUrl(rootUrl);
        }

        @Override
        public Builder setServicePath(String servicePath) {
            return (Builder) super.setServicePath(servicePath);
        }

        @Override
        public Builder setGoogleClientRequestInitializer(
                GoogleClientRequestInitializer googleClientRequestInitializer) {
            return (Builder) super
                    .setGoogleClientRequestInitializer(googleClientRequestInitializer);
        }

        @Override
        public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
            return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
        }

        @Override
        public Builder setApplicationName(String applicationName) {
            return (Builder) super.setApplicationName(applicationName);
        }

        @Override
        public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
            return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
        }

        @Override
        public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
            return (Builder) super
                    .setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
        }

        @Override
        public Builder setSuppressAllChecks(boolean suppressAllChecks) {
            return (Builder) super.setSuppressAllChecks(suppressAllChecks);
        }

        public Builder setVimeoRequestInitializer(
                VimeoRequestInitializer instagramRequestInitializer) {
            return (Builder) super.setGoogleClientRequestInitializer(instagramRequestInitializer);
        }

    }
}
