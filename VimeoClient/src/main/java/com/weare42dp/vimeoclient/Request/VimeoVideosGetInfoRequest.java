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
import com.weare42dp.vimeoclient.model.VimeoVideosGetInfoResponse;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.util.Key;

import java.io.IOException;


public class VimeoVideosGetInfoRequest extends VimeoRequest<VimeoVideosGetInfoResponse>
{
    private final String METHOD_NAME = "vimeo.videos.getInfo";

    @Key
    private Long video_id = null;

    public VimeoVideosGetInfoRequest()
    {
        super(VimeoHandler.sharedInstance().GetClient(),
                HttpMethods.GET,
                "",
                null,
                VimeoVideosGetInfoResponse.class);
        setMethod(METHOD_NAME);
    }

    public final void SetVideoID(long p_id)
    {
        video_id = p_id;
    }

    @Override
    public VimeoVideosGetInfoRequest set(String fieldName, Object value) {
        return (VimeoVideosGetInfoRequest) super.set(fieldName, value);
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