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

public class VimeoVideo extends GenericJson
{
    @Key("id")
    private long id;
    @Key("allow_adds")
    private boolean allow_adds;
    @Key("is_transcoding")
    private boolean is_transcoding;
    @Key("embed_privacy")
    private java.lang.String embed_privacy;
    @Key("is_hd")
    private boolean is_hd;
    @Key("is_like")
    private boolean is_like;
    @Key("is_watchlater")
    private boolean is_watchlater;
    @Key("license")
    private java.lang.String license;
    @Key("modified_date")
    private java.lang.String modified_date;
    @Key("number_of_plays")
    private int number_of_plays;
    @Key("number_of_likes")
    private int number_of_likes;
    @Key("number_of_comments")
    private int number_of_comments;
    @Key("width")
    private int width;
    @Key("height")
    private int height;
    @Key("duration")
    private int duration;
    @Key("owner")
    private java.lang.String owner;
    @Key("tags")
    private VimeoTags tags;
    @Key("cast")
    private VimeoCast cast;
    @Key("urls")
    private VimeoUrls urls;
    @Key("privacy")
    private java.lang.String privacy;
    @Key("title")
    private java.lang.String title;
    @Key("upload_date")
    private java.lang.String upload_date;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public final long getId() {
        return id;
    }

    public final boolean getAllowAdds() {
        return allow_adds;
    }

    public final boolean getIsTranscoding() {
        return is_transcoding;
    }

    public final String getEmbedPrivacy() {
        return embed_privacy;
    }

    public final boolean getIsHd() {
        return is_hd;
    }

    public final boolean getIsLike() {
        return is_like;
    }

    public final boolean getIsWatchlater() {
        return is_watchlater;
    }

    public final String getLicense() {
        return license;
    }

    public final String getModifiedDate() {
        return modified_date;
    }

    public final int getNumberOfPlays() {
        return number_of_plays;
    }

    public final int getNumberOfLikes() {
        return number_of_likes;
    }

    public final int getNumberOfComments() {
        return number_of_comments;
    }

    public final int getWidth() {
        return width;
    }

    public final int getHeight() {
        return height;
    }

    public final int getDuration() {
        return duration;
    }

    public final String getOwner() {
        return owner;
    }

    public final VimeoTags getTags() {
        return tags;
    }

    public final VimeoCast getCast() {
        return cast;
    }

    public final VimeoUrls getUrls() {
        return urls;
    }

    public final String getPrivacy() {
        return privacy;
    }

    public final String getTitle() {
        return title;
    }

    public final String getUploadDate() {
        return upload_date;
    }


}
