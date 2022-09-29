package com.example.appviagem.ui.activity;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appviagem.model.ListPackage;
import com.example.appviagem.util.UtilDate;
import com.example.appviagem.util.UtilFormat;
import com.example.appviagem.util.UtilResource;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

	public static final String LIST_PACKAGE = "package";

	public void setDate(ListPackage listPackage, TextView view) {
		String joinDates = UtilFormat.formatStringDays(this.getDateStart(), this.addDays(listPackage.getDays()));
		view.setText(joinDates);
	}

	public void setDays(ListPackage listPackage, TextView view) {
		view.setText(UtilFormat.getTextDays(listPackage.getDays()));
	}

	public void setPrice(ListPackage listPackage, TextView view) {
		view.setText(UtilFormat.formatCurrency().format(listPackage.getPrice()));
	}

	public void setLocal(ListPackage listPackage, TextView view) {
		view.setText(listPackage.getLocal());
	}

	public void setImage(ListPackage listPackage, ImageView imageView) {
		Drawable drawablePackageImage = UtilResource.getDrawable(listPackage, this);
		imageView.setImageDrawable(drawablePackageImage);
	}

	public Date getDateStart() {
		return UtilDate.getDate(UtilDate.getCalendarInstance());
	}

	public Date addDays(int days) {
		return UtilDate.addDays(UtilDate.getCalendarInstance(), days);
	}

}
