package com.example.appviagem.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.appviagem.R;
import com.example.appviagem.model.ListPackage;

import java.math.BigDecimal;

public class PaymentActivity extends MainActivity {

	public static final String PAYMENT = "Pagamento";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_payment);
		this.setTitle(PAYMENT);

		ListPackage packageSaoPaulo = new ListPackage("São Paulo", "sao_paulo_sp", 2, new BigDecimal("243.99"));
		this.setPrice(packageSaoPaulo, findViewById(R.id.payment_price));
		this.onSubmitBuy();
	}

	private void onSubmitBuy() {
		Button button = findViewById(R.id.payment_btn_finish);
		button.setOnClickListener(view -> this.startActivity(new Intent(this, ResumeBuyActivity.class)));
	}
}