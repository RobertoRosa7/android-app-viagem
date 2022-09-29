package com.example.appviagem.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.appviagem.R;
import com.example.appviagem.model.ListPackage;

public class PaymentActivity extends MainActivity {

	public static final String PAYMENT = "Pagamento";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_payment);
		this.setTitle(PAYMENT);

		Intent intent = this.getIntent();
		if (intent.hasExtra(LIST_PACKAGE)) {
			final ListPackage listPackage = (ListPackage) intent.getSerializableExtra(LIST_PACKAGE);
			this.setPrice(listPackage, findViewById(R.id.payment_price));
			this.onSubmitBuy(listPackage);
		}
	}

	private void onSubmitBuy(ListPackage listPackage) {
		Button button = findViewById(R.id.payment_btn_finish);
		button.setOnClickListener(view -> {
			Intent intent = new Intent(this, ResumeBuyActivity.class);
			intent.putExtra(LIST_PACKAGE, listPackage);
			this.startActivity(intent);
		});
	}
}