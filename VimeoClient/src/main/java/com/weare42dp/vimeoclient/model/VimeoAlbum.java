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

public class VimeoAlbum extends GenericJson
{
    @Key("id")
    private long id;
    @Key("title")
    private java.lang.String title;
    @Key("description")
    private java.lang.String description;
    @Key("created_on")
    private java.lang.String created_on;
    @Key("total_videos")
    private int total_videos;
    @Key("url")
    private java.util.List<String> url = new ArrayList<String>();
    @Key("video_sort_method")
    private java.lang.String video_sort_method;
    @Key("thumbnail_video")
    private VimeoThumbnailVideo thumbnail_video;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() { return title; }

    public String getCreatedOn() { return created_on; }

    public int getTotalVideos() { return total_videos; }

    public List<String> getUrls() { return url; }

    public String getVideoSortMethod() { return video_sort_method; }

    public VimeoThumbnailVideo getVideoThumbnail() { return thumbnail_video; }

}
