package br.ufba.hupes.hospitaladmissionforram.fragment;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringArrayRes;

import java.util.ArrayList;
import java.util.Arrays;

import br.ufba.hupes.hospitaladmissionforram.R;
import br.ufba.hupes.hospitaladmissionforram.helper.Validator;

@EFragment(R.layout.frag_info_adic)
public class InfoAdicionaisFragment extends NewResearchFragment {

	@ViewById
    Switch chkAnotherLocation;

	@ViewById(R.id.chk_med_anterior)
	Switch checkMedAnterior;

	@ViewById(R.id.chk_desenv_reacao)
	Switch checkReacao;

	@ViewById(R.id.chk_reacao_passada)
	Switch checkReacaoPassada;

    @ViewById
    View viewOutroLocal;

    @ViewById
    EditText editOutroLocal;

    @ViewById
    View viewReacaoPassada;

    @ViewById
    View viewReacaoPassadaMed;

	@ViewById
	Spinner spnTabagismo;

	@ViewById
	Spinner spnEtilismo;

	@ViewById
	Spinner spinnerResultado;

    @ViewById
    Spinner spinnerRiscoVida;

	@ViewById
	View viewTempoTabagismo;
	
	@ViewById
	View viewTempoEtilismo;
	
	@ViewById
	View viewDataObito;

    @ViewById
    EditText editReacaoPassada;

    @ViewById
    EditText editReacaoPassadaMed;

	@ViewById
	Spinner spnTempoTabagismo;

	@ViewById
	Spinner spnTempoEtilismo;

	@ViewById
	CheckBox chkCocaina, chkCrack, chkMaconha, chkLsd;

	@ViewById
	Spinner spnTratamento;

	@ViewById
	EditText editDataObito;
	
	@ViewById
	EditText editSequelas;

	@ViewById
	Spinner spnGravidade;
	
	@ViewById
	TextView editDataAlta;

    @StringArrayRes(R.array.opcoes_tabagismo)
    String[] arrayTabagismo;

    @StringArrayRes(R.array.opcoes_etilismo)
    String[] arrayEtilismo;

    @StringArrayRes(R.array.opcoes_gravidade)
    String[] arrayGravidade;

    @StringArrayRes(R.array.opcoes_resultado)
    String[] arrayResultado;

    @StringArrayRes(R.array.opcoes_risco_vida)
    String[] arrayRiscoVida;

    @StringArrayRes(R.array.opcoes_tempo)
    String[] arrayTempo;

    @StringArrayRes(R.array.opcoes_tratamento)
    String[] arrayTratamento;

	@ViewById 
	LinearLayout linear;
	
    @AfterViews
    public void init() {

        chkAnotherLocation.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                viewOutroLocal.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

        checkMedAnterior.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkReacao.setVisibility(isChecked ? View.VISIBLE : View.GONE);
            }
        });

        checkReacaoPassada.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                viewReacaoPassada.setVisibility(isChecked ? View.VISIBLE : View.GONE);
                viewReacaoPassadaMed.setVisibility(isChecked ? View.VISIBLE : View.GONE);
			}
		});

    	spnTabagismo.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> adapter, View v, int position, long arg3) {
				viewTempoTabagismo.setVisibility(position > 0 ? View.VISIBLE : View.GONE);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
			}
		});
    	
    	spnEtilismo.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> adapter, View v, int position, long arg3) {
				viewTempoEtilismo.setVisibility(position > 0 ? View.VISIBLE : View.GONE);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				
			}
		});
    	
    	spinnerRiscoVida.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> adapter, View v, int position, long arg3) {
				viewDataObito.setVisibility(position == adapter.getCount()-1 ? View.VISIBLE : View.GONE);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});
    	
    	fillViews();
    	if (!research.isOpen()) {
    		ArrayList<View> list = linear.getTouchables();
    		for (View view : list) {
    			view.setEnabled(false);
    		}
    	}
    }
    
    private void fillViews() {
    	chkAnotherLocation.setChecked(research.isAnotherLocation());
    	editOutroLocal.setText(research.getAnotherLocationDescription());
        checkMedAnterior.setChecked(research.isExposicaoPrevia());
    	checkReacao.setChecked(research.isDesenvolveuReacao());
    	editReacaoPassada.setText(research.getReacoesAdversas());
        editReacaoPassadaMed.setText(research.getMedsReacoesAdversas());
    	checkReacaoPassada.setChecked(editReacaoPassada.length() > 0);

    	String s;
    	s = research.getTabagismo();
    	if (s != null && s.length() > 0) {
    		spnTabagismo.setSelection(Arrays.asList(arrayTabagismo).indexOf(s));
    		spnTempoTabagismo.setSelection(Arrays.asList(arrayTempo).indexOf(research.getTempoTabagismo()));
		}

    	s = research.getEtilismo();
    	if (s != null && s.length() > 0) {
    		spnEtilismo.setSelection(Arrays.asList(arrayEtilismo).indexOf(s));
    		spnTempoEtilismo.setSelection(Arrays.asList(arrayTempo).indexOf(research.getTempoEtilismo()));
		}
    	
    	chkCrack.setChecked(research.isUsaCrack());
    	chkCocaina.setChecked(research.isUsaCocaina());
    	chkMaconha.setChecked(research.isUsaMaconha());
    	chkLsd.setChecked(research.isUsaLSD());
    	
		s = research.getTreatment();
		if (s != null && s.length() > 0) {
			spnTratamento.setSelection(Arrays.asList(arrayTratamento).indexOf(s));
		}
		s = research.getResult();
		if (s != null && s.length() > 0) {
			spinnerResultado.setSelection(Arrays.asList(arrayResultado).indexOf(s));
		}
        s = research.getRiskLife();
        if (s != null && s.length() > 0) {
            spinnerRiscoVida.setSelection(Arrays.asList(arrayRiscoVida).indexOf(s));
        }
		s = research.getGravity();
		if (s != null && s.length() > 0) {
			spnGravidade.setSelection(Arrays.asList(arrayGravidade).indexOf(s));
		}
		editSequelas.setText(research.getSequels());
    	editDataAlta.setText(research.getDischargeDate());
    	editDataObito.setText(research.getDeathDate());
	}

	@Override
    public boolean save() {
		String dataObito = editDataObito.getText().toString();
		if (dataObito.length() > 0) {
			if (!Validator.validateDateIsAfter("01/01/2014",dataObito , "dd/MM/yyyy", editDataObito, "Escolha uma data válida.")) {
				return false;
			}
		}

        boolean chkAnotherLocationChecked = chkAnotherLocation.isChecked();
        research.setAnotherLocation(chkAnotherLocationChecked);
        if (chkAnotherLocationChecked) {
            research.setAnotherLocationDescription(editOutroLocal.getText().toString());
        }

    	research.setExposicaoPrevia(checkMedAnterior.isChecked());
    	research.setDesenvolveuReacao(checkMedAnterior.isChecked() && checkReacao.isChecked());
    	research.setReacoesAdversas(editReacaoPassada.getText().toString());
        research.setMedsReacoesAdversas(editReacaoPassadaMed.getText().toString());

    	if (spnTabagismo.getSelectedItemPosition() > 0) {
    		research.setTabagismo(spnTabagismo.getSelectedItem().toString());
    		research.setTempoTabagismo(spnTempoTabagismo.getSelectedItem().toString());
		}

    	if (spnEtilismo.getSelectedItemPosition() > 0) {
    		research.setEtilismo(spnEtilismo.getSelectedItem().toString());
    		research.setTempoEtilismo(spnTempoEtilismo.getSelectedItem().toString());
		}
    	
    	research.setUsaCrack(chkCrack.isChecked());
    	research.setUsaCocaina(chkCocaina.isChecked());
    	research.setUsaMaconha(chkMaconha.isChecked());
    	research.setUsaLSD(chkLsd.isChecked());
 
    	research.setTreatment(spnTratamento.getSelectedItem().toString());
    	research.setSequels(editSequelas.getText().toString());
    	research.setResult(spinnerResultado.getSelectedItem().toString());
		research.setRiskLife(spinnerRiscoVida.getSelectedItem().toString());
    	research.setDeathDate(editDataObito.getText().toString());
    	research.setDischargeDate(editDataAlta.getText().toString());
    	research.setGravity(spnGravidade.getSelectedItem().toString());
    	
    	return true;
    }
}