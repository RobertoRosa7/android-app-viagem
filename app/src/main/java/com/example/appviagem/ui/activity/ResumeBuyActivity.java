package com.example.appviagem.ui.activity;

import android.os.Bundle;

import com.example.appviagem.R;
import com.example.appviagem.model.ListPackage;

import java.math.BigDecimal;

public class ResumeBuyActivity extends MainActivity {

	public static final String RESUME_BUY = "Resumo da compra";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_resume_buy);

		this.setTitle(RESUME_BUY);

		ListPackage packageSaoPaulo = new ListPackage("São Paulo", "sao_paulo_sp", 2, new BigDecimal("243.99"));
		this.setImage(packageSaoPaulo, findViewById(R.id.resume_buy_image));
		this.setLocal(packageSaoPaulo, findViewById(R.id.resume_buy_text_city));
		this.setPrice(packageSaoPaulo, findViewById(R.id.resume_buy_text_price));
		this.setDate(packageSaoPaulo, findViewById(R.id.resume_buy_text_date));
	}
}