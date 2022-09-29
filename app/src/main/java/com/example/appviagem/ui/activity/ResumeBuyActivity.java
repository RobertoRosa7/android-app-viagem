package com.example.appviagem.ui.activity;

import android.content.Intent;
import android.os.Bundle;

import com.example.appviagem.R;
import com.example.appviagem.model.ListPackage;

public class ResumeBuyActivity extends MainActivity {

	public static final String RESUME_BUY = "Resumo da compra";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_resume_buy);
		this.setTitle(RESUME_BUY);

		Intent intent = this.getIntent();
		if (intent.hasExtra(LIST_PACKAGE)) {
			ListPackage listPackage = (ListPackage) intent.getSerializableExtra(LIST_PACKAGE);
			this.setInformation(listPackage);
		}
	}

	private void setInformation(ListPackage listPackage) {
		this.setImage(listPackage, findViewById(R.id.resume_buy_image));
		this.setLocal(listPackage, findViewById(R.id.resume_buy_text_city));
		this.setPrice(listPackage, findViewById(R.id.resume_buy_text_price));
		this.setDate(listPackage, findViewById(R.id.resume_buy_text_date));
	}
}