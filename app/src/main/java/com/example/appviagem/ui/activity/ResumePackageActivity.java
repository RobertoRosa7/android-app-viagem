package com.example.appviagem.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.appviagem.R;
import com.example.appviagem.model.ListPackage;

import java.math.BigDecimal;

public class ResumePackageActivity extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_resume_package);
		this.setTitle("Resumo do pacote");

		ListPackage packageSaoPaulo = new ListPackage("São Paulo", "sao_paulo_sp", 2, new BigDecimal("243.99"));

		this.setImage(packageSaoPaulo, findViewById(R.id.resume_package_image));
		this.setLocal(packageSaoPaulo, findViewById(R.id.resume_package_local));
		this.setDays(packageSaoPaulo, findViewById(R.id.resume_package_days));
		this.setPrice(packageSaoPaulo, findViewById(R.id.resume_package_price));
		this.setDate(packageSaoPaulo, findViewById(R.id.resume_package_date));

		Button resumePackageBottomPayment = findViewById(R.id.resume_package_btn_payment);
		resumePackageBottomPayment.setOnClickListener(view -> this.startActivity(new Intent(this, PaymentActivity.class)));
	}
}