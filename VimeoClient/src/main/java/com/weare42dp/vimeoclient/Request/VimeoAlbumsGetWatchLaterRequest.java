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

package com.weare42dp.vimeoclient.Request;

import com.weare42dp.vimeoclient.VimeoHandler;
import com.weare42dp.vimeoclient.model.VimeoAlbumsGetWatchLaterResponse;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.util.Key;

import java.io.IOException;


public class VimeoAlbumsGetWatchLaterRequest extends VimeoRequest<VimeoAlbumsGetWatchLaterResponse>
{
    private final String METHOD_NAME = "vimeo.albums.getWatchLater";

    @Key
    private Integer page = null;

    @Key
    private Integer per_page = null;

    @Key
    private Boolean summary_response = null;

    @Key
    private Boolean full_response = null;

    public VimeoAlbumsGetWatchLaterRequest()
    {
        super(VimeoHandler.sharedInstance().GetClient(),
                HttpMethods.GET,
                "",
                null,
                VimeoAlbumsGetWatchLaterResponse.class);
        setMethod(METHOD_NAME);
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setPerPage(int per_page) {
        this.per_page = per_page;
    }

    public void setSummaryResponse(boolean summary_response) {
        this.summary_response = summary_response;
    }

    public void setFullResponse(boolean full_response) {
        this.full_response = full_response;
    }

    @Override
    public VimeoAlbumsGetWatchLaterRequest set(String fieldName, Object value) {
        return (VimeoAlbumsGetWatchLaterRequest) super.set(fieldName, value);
    }

    @Override
    public HttpRequest buildHttpRequestUsingHead() throws IOException {
        return super.buildHttpRequestUsingHead();
    }

    @Override
    public HttpResponse executeUsingHead() throws IOException {
        return super.executeUsingHead();
    }

}