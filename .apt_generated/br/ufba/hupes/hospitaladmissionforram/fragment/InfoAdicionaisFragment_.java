//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0.
//


package br.ufba.hupes.hospitaladmissionforram.fragment;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import br.ufba.hupes.hospitaladmissionforram.R.array;
import br.ufba.hupes.hospitaladmissionforram.R.layout;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class InfoAdicionaisFragment_
    extends InfoAdicionaisFragment
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private View contentView_;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    public View findViewById(int id) {
        if (contentView_ == null) {
            return null;
        }
        return contentView_.findViewById(id);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contentView_ = super.onCreateView(inflater, container, savedInstanceState);
        if (contentView_ == null) {
            contentView_ = inflater.inflate(layout.frag_info_adic, container, false);
        }
        return contentView_;
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        Resources resources_ = getActivity().getResources();
        arrayEtilismo = resources_.getStringArray(array.opcoes_etilismo);
        arrayTratamento = resources_.getStringArray(array.opcoes_tratamento);
        arrayTempo = resources_.getStringArray(array.opcoes_tempo);
        arrayResultado = resources_.getStringArray(array.opcoes_resultado);
        arrayGravidade = resources_.getStringArray(array.opcoes_gravidade);
        arrayTabagismo = resources_.getStringArray(array.opcoes_tabagismo);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static InfoAdicionaisFragment_.FragmentBuilder_ builder() {
        return new InfoAdicionaisFragment_.FragmentBuilder_();
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        spnTempoEtilismo = ((Spinner) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.spn_tempo_etilismo));
        editReacaoPassada = ((EditText) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.edit_reacao_passada));
        editDataObito = ((EditText) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.edit_data_obito));
        linear = ((LinearLayout) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.linear));
        spnEtilismo = ((Spinner) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.spn_etilismo));
        checkReacao = ((CheckBox) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.chk_desenv_reacao));
        viewPlantasMedFreq = ((View) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.view_plantas_med_freq));
        checkMedAnterior = ((CheckBox) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.chk_med_anterior));
        editDataAlta = ((TextView) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.edit_data_alta));
        editPlantasMed = ((EditText) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.edit_plantas_med));
        viewDataObito = ((View) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.view_data_obito));
        chkMaconha = ((CheckBox) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.chk_maconha));
        spnGravidade = ((Spinner) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.spn_gravidade));
        viewTempoTabagismo = ((View) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.view_tempo_tabagismo));
        checkPlantasMed = ((CheckBox) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.chk_plantas_med));
        viewReacaoPassada = ((View) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.view_reacao_passada));
        spnTabagismo = ((Spinner) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.spn_tabagismo));
        editPlantasMedFreq = ((EditText) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.edit_plantas_med_freq));
        chkAnotherLocation = ((CheckBox) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.chk_another_location));
        chkLsd = ((CheckBox) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.chk_lsd));
        checkReacaoPassada = ((CheckBox) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.chk_reacao_passada));
        viewTempoEtilismo = ((View) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.view_tempo_etilismo));
        viewPlantasMed = ((View) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.view_plantas_med));
        spnTratamento = ((Spinner) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.spn_tratamento));
        spinnerResultado = ((Spinner) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.spinner_resultado));
        chkCocaina = ((CheckBox) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.chk_cocaina));
        chkCrack = ((CheckBox) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.chk_crack));
        editSequelas = ((EditText) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.edit_sequelas));
        spnTempoTabagismo = ((Spinner) hasViews.findViewById(br.ufba.hupes.hospitaladmissionforram.R.id.spn_tempo_tabagismo));
        init();
    }

    public static class FragmentBuilder_ {

        private Bundle args_;

        private FragmentBuilder_() {
            args_ = new Bundle();
        }

        public InfoAdicionaisFragment build() {
            InfoAdicionaisFragment_ fragment_ = new InfoAdicionaisFragment_();
            fragment_.setArguments(args_);
            return fragment_;
        }

    }

}
