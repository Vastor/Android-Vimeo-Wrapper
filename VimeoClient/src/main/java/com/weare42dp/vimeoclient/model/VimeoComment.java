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

package com.weare42dp.vimeoclient.model;


import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

import java.util.HashMap;
import java.util.Map;

public class VimeoComment extends GenericJson
{
    @Key("id")
    private long id;
    @Key("datecreate")
    private java.lang.String datecreate;
    @Key("permalink")
    private java.lang.String permalink;
    @Key("reply_to_comment_id")
    private long reply_to_comment_id;
    @Key("type")
    private java.lang.String type;
    @Key("text")
    private java.lang.String text;
    @Key("author")
    private VimeoCreator author;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public final long getId() {
        return id;
    }

    public final String getDateCreated() {
        return datecreate;
    }

    public final String getPermaLink() {
        return permalink;
    }

    public final long getReplyToCommentId() {
        return reply_to_comment_id;
    }

    public final String getType() {
        return type;
    }

    public final String getText() {
        return text;
    }

    public final VimeoCreator getAuthor() {
        return author;
    }


}
