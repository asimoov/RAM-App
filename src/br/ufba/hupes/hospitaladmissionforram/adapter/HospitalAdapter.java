package br.ufba.hupes.hospitaladmissionforram.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import br.ufba.hupes.hospitaladmissionforram.R;
import br.ufba.hupes.hospitaladmissionforram.model.Hospital;

public class HospitalAdapter extends ArrayAdapter<Hospital> {

	static class HospitalHolder {
		TextView county;
		TextView acronym;
		TextView name;
		TextView quantity;
	}

	public HospitalAdapter(Context context, int textViewResourceId,
			Hospital[] hospitals) {
		super(context, textViewResourceId, hospitals);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Hospital hospital = this.getItem(position);
		HospitalHolder holder = null;
		
		View view = convertView;
		if (view == null) {
			LayoutInflater inflater = ((Activity)this.getContext()).getLayoutInflater();
			view = inflater.inflate(R.layout.item_hospital, parent, false);

			holder = new HospitalHolder();
			holder.quantity = (TextView) view.findViewById(R.id.quantity);
			holder.acronym = (TextView) view.findViewById(R.id.acronym);
			holder.name =  (TextView) view.findViewById(R.id.name);
			holder.county = (TextView) view.findViewById(R.id.county);
			
			view.setTag(holder);
		} else {
            holder = (HospitalHolder) view.getTag();
        }
		
		holder.quantity.setText(hospital.getQuantity().toString());
		holder.acronym.setText(hospital.getAcronym());
		holder.name.setText(hospital.getName().toString());
		holder.county.setText(hospital.getCounty());
		
		return view;
	}
}