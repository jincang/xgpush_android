package com.foodyi.ane.functions;

import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;
import com.tencent.android.tpush.XGPushManager;

public class DeleteTagFunction implements FREFunction {

	public static String TAG = "DeleteTagFunction";
	
	@Override
	public FREObject call(FREContext context, FREObject[] arg) {
		// TODO Auto-generated method stub
		try {
			String tag = arg[0].getAsString();
			Log.e(TAG, "del tag => "+tag);
			XGPushManager.deleteTag(context.getActivity().getApplicationContext(), tag);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FRETypeMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FREInvalidObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FREWrongThreadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
