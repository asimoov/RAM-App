package com.example.projectx.fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.projectx.R;
import com.example.projectx.adapter.HospitalAdapter;
import com.example.projectx.model.Hospital;

@SuppressLint("NewApi")
public class ListHospitals extends Fragment {
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View viewLista = inflater.inflate(R.layout.list_hospitals, null);
		ListView listView = (ListView) viewLista.findViewById(R.id.list);

		Hospital hospitals[] = new Hospital[] {
				new Hospital("Hospital Edgard", "HUPES", "Salvador"),
				new Hospital("Hospital Geral do Estado", "HGE", "Salvador")
		};

		final HospitalAdapter adapter = new HospitalAdapter(this.getActivity(), R.layout.item_hospital, hospitals);
		listView.setAdapter(adapter);
		
		return viewLista;
	}
}
