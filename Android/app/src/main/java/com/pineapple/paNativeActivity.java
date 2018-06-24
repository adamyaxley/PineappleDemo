package com.pineapple;

import android.content.Intent;
import android.util.Log;
import android.os.Bundle;
import android.content.res.Configuration;
import android.content.pm.ActivityInfo;

import com.pineapple.util.paUtil;

//import com.google.android.gms.common.GooglePlayServicesUtil;
//import com.google.android.gms.common.ConnectionResult;

public class paNativeActivity extends android.app.NativeActivity
{
	//public static int PLAY_SERVICES_RESOLUTION_REQUEST = 91745821;
	@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d(paUtil.TAG, "onActivityResult(" + requestCode + "," + resultCode + "," + data);
    }
	
	static {
		System.loadLibrary("libPineappleDemo");
	}
	
	private void requestCorrectOrientation()
	{
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // FORCE LANDSCAPE
	}
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestCorrectOrientation();
	}

	protected void onDestroy() {
		super.onDestroy();
		requestCorrectOrientation();
	}

	protected void onPause() {
		super.onPause();
		requestCorrectOrientation();
	}

	protected void onResume() {
		super.onResume();
		requestCorrectOrientation();
		
		/*int result = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
		if (result != ConnectionResult.SUCCESS) {
			if (GooglePlayServicesUtil.isUserRecoverableError(result)) {
				Log.i(paUtil.TAG, "Google play services not present or up to date. showing dialog");
				GooglePlayServicesUtil.getErrorDialog(result, this, PLAY_SERVICES_RESOLUTION_REQUEST).show();
			} else {
				// Device not supported (either quit or disable google play services for this device)
				Log.i(paUtil.TAG, "Google play services not supported on this device");
				finish();
			}
		} else {
			Log.i(paUtil.TAG, "Google play services present and up to date. Yay!");
		}*/
	}

	protected void onStart(){
		super.onStart();
		requestCorrectOrientation();
	}

	protected void onStop(){
		super.onStop();
		requestCorrectOrientation();
	}

	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		requestCorrectOrientation();
	}
}