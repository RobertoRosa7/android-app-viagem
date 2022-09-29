package com.example.appviagem.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.appviagem.R;
import com.example.appviagem.model.ListPackage;

public class ResumePackageActivity extends MainActivity {

	public static final String RESUMO_DO_PACOTE = "Resumo do pacote";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_resume_package);
		this.setTitle(RESUMO_DO_PACOTE);

		Intent intent = this.getIntent();
		if (intent.hasExtra(LIST_PACKAGE)) {
			final ListPackage listPackage = (ListPackage) intent.getSerializableExtra(LIST_PACKAGE);
			this.setInformation(listPackage);
			this.gotoPayment(listPackage);
		}
	}

	private void gotoPayment(ListPackage listPackage) {
		Button resumePackageBottomPayment = findViewById(R.id.resume_package_btn_payment);
		resumePackageBottomPayment.setOnClickListener(view -> {
			Intent intentToPayment = new Intent(this, PaymentActivity.class);
			intentToPayment.putExtra(LIST_PACKAGE, listPackage);
			this.startActivity(intentToPayment);
		});
	}

	private void setInformation(ListPackage listPackage) {
		this.setImage(listPackage, findViewById(R.id.resume_package_image));
		this.setLocal(listPackage, findViewById(R.id.resume_package_local));
		this.setDays(listPackage, findViewById(R.id.resume_package_days));
		this.setPrice(listPackage, findViewById(R.id.resume_package_price));
		this.setDate(listPackage, findViewById(R.id.resume_package_date));
	}
}