package com.sexy.xvideo;
import android.content.*;
import android.widget.*;
import android.webkit.*;

public class WebAppInterface
{
	Context Webcontexto;
	
	WebAppInterface(Context contexto){
		this.Webcontexto = contexto;;
	}
	
	@JavascriptInterface
	public void showToast(String toast){
		Toast.makeText(Webcontexto, toast, Toast.LENGTH_LONG).show(); 
	}
	
}
