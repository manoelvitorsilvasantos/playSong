package com.sexy.xvideo;

import android.app.*;
import android.os.*;
import android.webkit.*;
import android.graphics.*;

public class MainActivity extends Activity 
{
	private WebView site;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		site = findViewById(R.id.webview);
		//WebSettings setting = site.getSettings();
		site.loadUrl("https://suap.ifba.edu.br");
		site.getSettings().setJavaScriptEnabled(true);
		site.setWebViewClient(new WebViewClient());
		site.setBackgroundColor(Color.rgb(0,0,0));
		site.setScrollBarStyle(R.style.AppTheme);
	
    }
}
