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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VimeoChannel extends GenericJson
{
    @Key("id")
    private long id;
    @Key("is_featured")
    private boolean is_featured;
    @Key("is_sponsored")
    private boolean is_sponsored;
    @Key("is_subscribed")
    private boolean is_subscribed;
    @Key("name")
    private java.lang.String name;
    @Key("description")
    private java.lang.String description;
    @Key("created_on")
    private java.lang.String created_on;
    @Key("modified_on")
    private java.lang.String modified_on;
    @Key("total_videos")
    private int total_videos;
    @Key("total_subscribers")
    private int total_subscribers;
    @Key("logo_url")
    private java.lang.String logo_url;
    @Key("badge_url")
    private java.lang.String badge_url;
    @Key("thumbnail_url")
    private java.lang.String thumbnail_url;
    @Key("url")
    private java.util.List<String> url = new ArrayList<String>();
    @Key("layout")
    private java.lang.String layout;
    @Key("theme")
    private java.lang.String theme;
    @Key("privacy")
    private java.lang.String privacy;
    @Key("creator")
    private VimeoCreator creator;
    @Key("featured_description")
    private VimeoFeaturedDescription featured_description;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public final long getId() {
        return id;
    }

    public final boolean getFeatured() {
        return is_featured;
    }

    public final boolean getSponsored() {
        return is_sponsored;
    }

    public final boolean getSubscribed() {
        return is_subscribed;
    }

    public final String getName() {
        return name;
    }

    public final String getDescription() {
        return description;
    }

    public final String getCreatedOn() {
        return created_on;
    }

    public final String getModifiedOn() {
        return modified_on;
    }

    public final int getTotalVideos() {
        return total_videos;
    }

    public final int getTotalSubscribers() {
        return total_subscribers;
    }

    public final String getLogoUrl() {
        return logo_url;
    }

    public final String getBadgeUrl() {
        return badge_url;
    }

    public final String getThumbnailUrl() {
        return thumbnail_url;
    }

    public final List<String> getUrl() {
        return url;
    }

    public final String getLayout() {
        return layout;
    }

    public final String getTheme() {
        return theme;
    }

    public final String getPrivacy() {
        return privacy;
    }

    public final VimeoCreator getCreator() {
        return creator;
    }

    public final VimeoFeaturedDescription getFeaturedDescription() {
        return featured_description;
    }

}
