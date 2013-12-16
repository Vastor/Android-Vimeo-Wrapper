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

import com.weare42dp.vimeoclient.VimeoClient;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.util.Key;

public class VimeoRequest<T> extends AbstractGoogleJsonClientRequest<T>
{

    public VimeoRequest(VimeoClient client, String requestMethod, String uriTemplate, Object content, Class<T> responseClass)
    {
        super(client, requestMethod, uriTemplate, content, responseClass);

        setFormat("json");
        setNoJsonCallback(true);
    }

    @Key("method")
    private String method;

    @Key("format")
    private String format;

    @Key("api_key")
    private String apiKey;

    @Key("nojsoncallback")
    private Integer noJsonCallback;

    public final VimeoRequest<T> setMethod(String method) {
        this.method = method;
        return this;
    }

    public final VimeoRequest<T> setFormat(String format) {
        this.format = format;
        return this;
    }

    public final VimeoRequest<T> setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    public final VimeoRequest<T> setNoJsonCallback(boolean noJsonCallback) {
        this.noJsonCallback = noJsonCallback ? 1 : 0;
        return this;
    }

    @Override
    public VimeoClient getAbstractGoogleClient() {
        return (VimeoClient) super.getAbstractGoogleClient();
    }

    @Override
    public VimeoRequest<T> setDisableGZipContent(boolean disableGZipContent) {
        return (VimeoRequest<T>) super.setDisableGZipContent(disableGZipContent);
    }

    @Override
    public VimeoRequest<T> setRequestHeaders(HttpHeaders headers) {
        return (VimeoRequest<T>) super.setRequestHeaders(headers);
    }

    @Override
    public VimeoRequest<T> set(String fieldName, Object value) {
        return (VimeoRequest<T>) super.set(fieldName, value);
    }

}
