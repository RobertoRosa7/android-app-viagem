package com.example.appviagem.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appviagem.R;
import com.example.appviagem.model.ListPackage;
import com.example.appviagem.util.UtilFormat;
import com.example.appviagem.util.UtilResource;

import java.util.List;

public class ListPackageAdapter extends BaseAdapter {
	private final List<ListPackage> listPackages;
	private final Context context;

	public ListPackageAdapter(Context context, List<ListPackage> listPackages) {
		this.listPackages = listPackages;
		this.context = context;
	}

	@Override
	public int getCount() {
		return this.listPackages.size();
	}

	@Override
	public ListPackage getItem(int i) {
		return this.listPackages.get(i);
	}

	@Override
	public long getItemId(int i) {
		return 0;
	}

	@Override
	public View getView(int i, View view, ViewGroup viewGroup) {
		View viewCreated = this.viewCreated(viewGroup);
		ListPackage listPackage = this.listPackages.get(i);

		this.setViewDays(viewCreated, listPackage);
		this.setLocal(viewCreated, listPackage);
		this.setViewImage(viewCreated, listPackage);
		this.setViewPrice(viewCreated, listPackage);

		return viewCreated;
	}

	private void setViewDays(View viewCreated, ListPackage listPackage) {
		TextView days = viewCreated.findViewById(R.id.item_pacote_days);
		days.setText(UtilFormat.getTextDays(listPackage.getDays()));
	}

	private void setViewPrice(View viewCreated, ListPackage listPackage) {
		TextView price = viewCreated.findViewById(R.id.item_pacote_price);
		price.setText(UtilFormat.formatCurrency().format(listPackage.getPrice()));
	}

	private void setViewImage(View viewCreated, ListPackage listPackage) {
		ImageView image = viewCreated.findViewById(R.id.item_pacote_image);
		image.setImageDrawable(UtilResource.getDrawable(listPackage, this.context));
	}

	private void setLocal(View viewCreated, ListPackage listPackage) {
		TextView local = viewCreated.findViewById(R.id.item_pacote_locate);
		local.setText(listPackage.getLocal());
	}

	private View viewCreated(ViewGroup viewGroup) {
		return LayoutInflater.from(context).inflate(R.layout.item_pacote, viewGroup, false);
	}
}
