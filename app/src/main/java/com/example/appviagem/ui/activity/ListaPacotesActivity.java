package com.example.appviagem.ui.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appviagem.R;

import java.util.ArrayList;
import java.util.List;

public class ListaPacotesActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_lista_pacotes);

		List<Object[]> list = new ArrayList<>();
		Object[] object = new Object[3];

		object[0] = "teste1";
		object[1] = "teste2";
		object[2] = "teste3";

		list.add(object);

		// debug
		for (Object[] obj : list) {
			for (int i = 0; i < object.length; i++) {
				Log.i("debug", "onCreate: " + obj[i]);
			}
		}
	}
}