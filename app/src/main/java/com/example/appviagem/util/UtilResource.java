package com.example.appviagem.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.example.appviagem.model.ListPackage;

public class UtilResource {

	public static final String DRAWABLE = "drawable";

	@SuppressLint("UseCompatLoadingForDrawables")
	public static Drawable getDrawable(ListPackage listPackage, Context context) {
		Resources resources = context.getResources();
		int drawable = resources.getIdentifier(listPackage.getImage(), DRAWABLE, context.getPackageName());
		return resources.getDrawable(drawable);
	}
}
