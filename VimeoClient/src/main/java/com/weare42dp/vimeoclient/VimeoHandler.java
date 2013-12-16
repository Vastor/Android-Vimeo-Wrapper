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

import android.app.Activity;
import android.content.Context;

import com.weare42dp.vimeoclient.Request.VimeoRequestInitializer;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.ClientParametersAuthentication;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.wuman.android.auth.AuthorizationDialogController;
import com.wuman.android.auth.AuthorizationFlow;
import com.wuman.android.auth.DialogFragmentController;
import com.wuman.android.auth.OAuthManager;
import com.wuman.android.auth.oauth2.store.SharedPreferencesCredentialStore;

import java.io.IOException;

public class VimeoHandler
{
    private static volatile VimeoHandler instance = null;

    private String VIMEO_CONSUMER_KEY;
    private String VIMEO_CONSUMER_SECRET;

    private OAuthManager m_OAuth;
    private Context m_Context;
    private HttpTransport m_Transport;
    private JsonFactory m_JSONFactory;
    private Credential m_Credential;
    private VimeoClient m_VimeoClient;
    private boolean m_LoggedIn;

    private VimeoHandler()
    {
        m_LoggedIn = false;
    }

    public OAuthManager GetOAuthManager()
    {
        return m_OAuth;
    }

    public HttpTransport GetTransport()
    {
        return m_Transport;
    }
    public JsonFactory GetJsonFactory()
    {
        return m_JSONFactory;
    }
    public void InitVimeoHandler(Context p_Context, String p_ConsumerKey, String p_CosumerSecret) throws IOException {
        m_Context = p_Context;
        m_Transport = AndroidHttp.newCompatibleTransport();
        m_JSONFactory = new JacksonFactory();
        VIMEO_CONSUMER_KEY = p_ConsumerKey;
        VIMEO_CONSUMER_SECRET = p_CosumerSecret;

        SharedPreferencesCredentialStore credentialStore =
                new SharedPreferencesCredentialStore(m_Context, "oauth", m_JSONFactory);

        // setup authorization flow
        AuthorizationFlow flow = new AuthorizationFlow.Builder(
                BearerToken.authorizationHeaderAccessMethod(),
                m_Transport,
                m_JSONFactory,
                new GenericUrl("https://vimeo.com/oauth/access_token"),
                new ClientParametersAuthentication(VIMEO_CONSUMER_KEY, VIMEO_CONSUMER_SECRET),
                VIMEO_CONSUMER_KEY,
                "https://vimeo.com/oauth/authorize")
                .setTemporaryTokenRequestUrl("https://vimeo.com/oauth/request_token")
                .setCredentialStore(credentialStore)
                .build();

        Activity activity = (Activity) m_Context;
        // setup UI controller
        AuthorizationDialogController controller =
                new DialogFragmentController(activity.getFragmentManager()) {
                    @Override
                    public String getRedirectUri() throws IOException {
                        return "http://localhost/Callback";
                    }

                    @Override
                    public boolean isJavascriptEnabledForWebView() {
                        return true;
                    }
                };

        m_OAuth = new OAuthManager(flow, controller);
    }
    public Credential GetCredential()
    {
        return m_Credential;
    }
    public VimeoClient GetClient()
    {
        return m_VimeoClient;
    }

    public void PerformLogin() throws IOException
    {
        if (!m_LoggedIn)
        {
            m_Credential = m_OAuth.authorize10a(VIMEO_CONSUMER_KEY, null, null).getResult();
            m_VimeoClient = new VimeoClient.Builder(m_Transport, m_JSONFactory, m_Credential)
                    .setApplicationName("VimeoTest")
                    .setVimeoRequestInitializer(new VimeoRequestInitializer())
                    .build();
            m_LoggedIn = true;
        }
    }

    public static VimeoHandler sharedInstance()
    {
        if (instance == null)
        {
            synchronized (VimeoHandler .class)
            {
                if (instance == null)
                {
                    instance = new VimeoHandler ();
                }
            }
        }

        return instance;
    }

}
