package com.example.appviagem.ui.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appviagem.R;
import com.example.appviagem.model.ListPackage;
import com.example.appviagem.util.UtilDate;
import com.example.appviagem.util.UtilFormat;
import com.example.appviagem.util.UtilResource;

import java.math.BigDecimal;
import java.util.Date;

public class ResumeBuyActivity extends AppCompatActivity {

	public static final String RESUME_BUY = "Resumo da compra";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_resume_buy);

		this.setTitle(RESUME_BUY);

		ListPackage packageSaoPaulo = new ListPackage("São Paulo", "sao_paulo_sp", 2, new BigDecimal("243.99"));
		this.setImage(packageSaoPaulo);
		this.setLocal(packageSaoPaulo);
		this.setPrice(packageSaoPaulo);
		this.setDate(packageSaoPaulo);
	}

	private void setDate(ListPackage listPackage) {
		TextView resumePackageDate = findViewById(R.id.resume_buy_text_date);
		String joinDates = UtilFormat.formatStringDays(this.getDateStart(), this.addDays(listPackage.getDays()));
		resumePackageDate.setText(joinDates);
	}

	private Date getDateStart() {
		return UtilDate.getDate(UtilDate.getCalendarInstance());
	}

	private Date addDays(int days) {
		return UtilDate.addDays(UtilDate.getCalendarInstance(), days);
	}


	private void setPrice(ListPackage listPackage) {
		TextView resumePackagePrice = findViewById(R.id.resume_buy_text_price);
		resumePackagePrice.setText(UtilFormat.formatCurrency().format(listPackage.getPrice()));
	}

	private void setImage(ListPackage listPackage) {
		ImageView resumePackageImage = findViewById(R.id.resume_buy_image);
		Drawable drawablePackageImage = UtilResource.getDrawable(listPackage, this);
		resumePackageImage.setImageDrawable(drawablePackageImage);
	}

	private void setLocal(ListPackage listPackage) {
		TextView resumePackageLocal = findViewById(R.id.resume_buy_text_city);
		resumePackageLocal.setText(listPackage.getLocal());
	}
}