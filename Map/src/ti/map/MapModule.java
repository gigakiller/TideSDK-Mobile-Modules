/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.map;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;


@Kroll.module(name="Map", id="ti.map")
public class MapModule extends KrollModule
{

	// Standard Debugging variables
	private static final String LCAT = "MapModule";
	private static final boolean DBG = TiConfig.LOGD;
	
	@Kroll.constant public static final int NORMAL_TYPE = GoogleMap.MAP_TYPE_NORMAL;
	@Kroll.constant public static final int TERRAIN_TYPE = GoogleMap.MAP_TYPE_TERRAIN;
	@Kroll.constant public static final int SATELLITE_TYPE = GoogleMap.MAP_TYPE_SATELLITE;
	
	@Kroll.constant public static final float ANNOTATION_AZURE = BitmapDescriptorFactory.HUE_AZURE;
	@Kroll.constant public static final float ANNOTATION_BLUE = BitmapDescriptorFactory.HUE_BLUE;
	@Kroll.constant public static final float ANNOTATION_CYAN = BitmapDescriptorFactory.HUE_CYAN;
	@Kroll.constant public static final float ANNOTATION_GREEN = BitmapDescriptorFactory.HUE_GREEN;
	@Kroll.constant public static final float ANNOTATION_MAGENTA = BitmapDescriptorFactory.HUE_MAGENTA;
	@Kroll.constant public static final float ANNOTATION_ORANGE = BitmapDescriptorFactory.HUE_ORANGE;
	@Kroll.constant public static final float ANNOTATION_RED = BitmapDescriptorFactory.HUE_RED;
	@Kroll.constant public static final float ANNOTATION_ROSE = BitmapDescriptorFactory.HUE_ROSE;
	@Kroll.constant public static final float ANNOTATION_VIOLET = BitmapDescriptorFactory.HUE_VIOLET;
	@Kroll.constant public static final float ANNOTATION_YELLOW = BitmapDescriptorFactory.HUE_YELLOW;

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;
	
	public MapModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		Log.d(LCAT, "inside onAppCreate");
		// put module init code that needs to run when the application is created
	}

}

