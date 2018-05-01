package com.lxapp.utils;

import com.lxapp.AppContext;
import com.lxapp.common.AppInterface;

public class AppUtils {

	private static ThreadLocal<AppInterface> appInterfaces = new ThreadLocal<>();
	
	
	public static String getVersion() {
		if(appInterfaces.get()==null)return null;
		return appInterfaces.get().getVersion();

	}
	
	public static AppInterface getAppInterface() {
		return appInterfaces.get();
	}
	
	public static boolean isLogin() {
		String uid = getAppInterface().getUid();
		if(uid!=null&&!uid.equals(""))return true;

		return false;
	}
	
	
	public static String getUid() {
		return getAppInterface().getUid();

	}
	
	
	public static void setAppInterfaces(AppInterface appInterface) {
		AppUtils.appInterfaces.set(appInterface);
	}
	
}
