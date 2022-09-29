package com.example.appviagem.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appviagem.R;
import com.example.appviagem.model.ListPackage;
import com.example.appviagem.util.UtilFormat;

import java.math.BigDecimal;

public class PaymentActivity extends AppCompatActivity {

	public static final String PAYMENT = "Pagamento";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_payment);
		this.setTitle(PAYMENT);

		ListPackage packageSaoPaulo = new ListPackage("São Paulo", "sao_paulo_sp", 2, new BigDecimal("243.99"));
		this.setPrice(packageSaoPaulo);
		this.startActivity(new Intent(this, ResumeBuyActivity.class));
	}

	private void setPrice(ListPackage listPackage) {
		TextView resumePackagePrice = findViewById(R.id.payment_price);
		resumePackagePrice.setText(UtilFormat.formatCurrency().format(listPackage.getPrice()));
	}
}