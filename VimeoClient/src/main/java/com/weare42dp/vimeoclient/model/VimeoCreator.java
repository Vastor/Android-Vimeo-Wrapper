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


import com.google.api.client.util.Key;

import java.util.HashMap;
import java.util.Map;
public class VimeoCreator
{
    @Key("display_name")
    private java.lang.String display_name;
    @Key("id")
    private long id;
    @Key("is_plus")
    private boolean is_plus;
    @Key("is_pro")
    private boolean is_pro;
    @Key("is_staff")
    private boolean is_staff;
    @Key("profileurl")
    private java.lang.String profileurl;
    @Key("realname")
    private java.lang.String realname;
    @Key("username")
    private java.lang.String username;
    @Key("videosurl")
    private java.lang.String videosurl;
    @Key("portraits")
    private VimeoPortraits portraits;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public final String getDisplayName() {
        return display_name;
    }

    public final long getId() {
        return id;
    }

    public final boolean getIsPlus() {
        return is_plus;
    }

    public final boolean getIsPro() {
        return is_pro;
    }

    public final boolean getIsStaff() {
        return is_staff;
    }

    public final String getProfileUrl() {
        return profileurl;
    }

    public final String getRealName() {
        return realname;
    }

    public final String getUserName() {
        return username;
    }

    public final String getVideosUrl() {
        return videosurl;
    }

    public final VimeoPortraits getPortraits() {
        return portraits;
    }

}
