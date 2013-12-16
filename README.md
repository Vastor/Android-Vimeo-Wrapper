The MIT License (MIT)

Copyright (c) 2013 42dp Labs GmbH

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.


Android-Vimeo-Wrapper
=====================

A Vimeo Advanced Api wrapper for Android by [42dp Labs GmbH](http://www.weare42dp.com)

Based on the [android-oauth-client by David Wu](https://github.com/wuman/android-oauth-client)

usage:

```Java
//first get a shared Instance.

VimeoHandler VH = VimeoHandler.sharedInstance();
try
{
    //... and initialize the vimeo connection by using your consumer key and secret you got from vimeo
    VH.InitVimeoHandler(this, VIMEO_CONSUMER_KEY, VIMEO_CONSUMER_SECRET);
} catch (IOException e) {
    e.printStackTrace();
}

// Perform the actual login of the user
VH.PerformLogin();


// Return all Channels of the current logged user

VimeoChannelsGetAllResponse Result = null;
try {
    Result = VH.GetClient().getVimeoChannelsGetAll().execute();
} catch (IOException e) {
    e.printStackTrace();
}


// Generic Version

VimeoGenericResponse Result = null;
ArrayMap Params = new ArrayMap();
Params.put("channel_id", 123456);
Params.put("page", 2);
try {
    Result = VimeoHandler.sharedInstance().GetClient().getVimeoGenericRequest(
        "vimeo.channels.getVideos", Params).execute();
} catch (IOException e) {
    e.printStackTrace();
}

```

MethodList:
These are predefined Methods for collecting data from vimeo

```Java
VimeoAlbumsGetAllRequest
getVimeoAlbumsGetAll(long p_UserID)

VimeoAlbumsGetAllRequest
getVimeoAlbumsGetAll(long p_UserID, int p_Page, int p_PerPage, String p_SortMethod)

VimeoAlbumsGetVideosRequest
getVimeoAlbumsGetVideos(long p_AlbumId)

VimeoAlbumsGetVideosRequest
getVimeoAlbumsGetVideos(long p_AlbumId, int p_Page, int p_PerPage, String p_Password,
                        boolean p_SummaryResponse, boolean p_FullResponse)
                        
VimeoAlbumsGetWatchLaterRequest
getVimeoAlbumsGetWatchLater()

VimeoAlbumsGetWatchLaterRequest
getVimeoAlbumsGetWatchLater(int p_Page, int p_PerPage, boolean p_SummaryResponse,
                            boolean p_FullResponse)
                            
VimeoChannelsGetAllRequest
getVimeoChannelsGetAll()

VimeoChannelsGetAllRequest
getVimeoChannelsGetAll(int p_Page, int p_PerPage, String p_SortMethod)

VimeoChannelsGetInfoRequest
getVimeoChannelsGetInfo(long p_ChannelId)

VimeoChannelsGetVideosRequest
getVimeoChannelsGetVideos(long p_ChannelID)

VimeoChannelsGetVideosRequest
getVimeoChannelsGetVideos(long p_ChannelID, int p_Page, int p_PerPage,
                          boolean p_SummaryResponse, boolean p_FullResponse)
                          
VimeoPeopleGetSubscriptionsRequest
getVimeoPeopleGetSubscriptions()

VimeoPeopleGetSubscriptionsRequest
getVimeoPeopleGetSubscriptions(int p_Page, int p_PerPage)

VimeoVideosCommentsGetListRequest
getVimeoVideosCommentsGetList(long p_VideoId)

VimeoVideosCommentsGetListRequest
getVimeoVideosCommentsGetList(long p_VideoId, int p_Page, int p_PerPage)

VimeoVideosGetAllRequest
getVimeoVideosGetAll()

VimeoVideosGetAllRequest
getVimeoVideosGetAll(int p_Page, int p_PerPage, String p_SortMethod,
                     boolean p_SummaryResponse, boolean p_FullResponse)
                     
VimeoVideosGetAllRequest
getVimeoVideosGetAll(long p_UserId, int p_Page, int p_PerPage, String p_SortMethod,
                     boolean p_SummaryResponse, boolean p_FullResponse)
                     
VimeoVideosGetByTagRequest
getVimeoVideosGetByTag(String p_Tag)

VimeoVideosGetByTagRequest
getVimeoVideosGetByTag(String p_Tag, int p_Page, int p_PerPage, String p_SortMethod,
                       boolean p_SummaryResponse, boolean p_FullResponse)
                       
VimeoVideosGetInfoRequest
getVimeoVideosGetInfo(long p_VideoId)

VimeoVideosGetLikersRequest
getVimeoVideosGetLikers(long p_VideoId)

VimeoVideosGetLikersRequest
getVimeoVideosGetLikers(long p_VideoId, int p_Page, int p_PerPage)

VimeoVideosGetLikesRequest
getVimeoVideosGetLikes(long p_UserId)

VimeoVideosGetLikesRequest
getVimeoVideosGetLikes(long p_UserId, int p_Page, int p_PerPage, String p_SortMethod,
                       boolean p_SummaryResponse, boolean p_FullResponse)
                       
VimeoVideosSearchRequest
getVimeoVideosSearch(String p_Query)

VimeoVideosSearchRequest
getVimeoVideosSearch(String p_Query, int p_Page, int p_PerPage, String p_SortMethod,
                     boolean p_SummaryResponse, boolean p_FullResponse)
                     
VimeoVideosSearchRequest
getVimeoVideosSearch(String p_Query, long p_UserId, int p_Page, int p_PerPage,
                     String p_SortMethod, boolean p_SummaryResponse, boolean p_FullResponse)
```

Generic Method:
Handle parameter and return values yourself.

```Java
VimeoGenericRequest getVimeoGenericRequest(String p_MethodName, ArrayMap p_Parameter)
```
