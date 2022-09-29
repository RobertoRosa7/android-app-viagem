package com.example.appviagem.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.example.appviagem.R;
import com.example.appviagem.dto.PackageDto;
import com.example.appviagem.ui.adapter.ListPackageAdapter;

public class ListaPacotesActivity extends MainActivity {

	public static final String TOOLBAR_TITLE = "Pacotes";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_lista_pacotes);
		this.setTitle(TOOLBAR_TITLE);
		this.setListView();
	}

	private void setListView() {
		ListView listView = findViewById(R.id.lista_pacote_listview);
		listView.setAdapter(new ListPackageAdapter(this, new PackageDto().list()));

		listView.setOnItemClickListener((adapterView, view, i, l) -> {
			this.startActivity(new Intent(ListaPacotesActivity.this, ResumePackageActivity.class));
		});
	}
}