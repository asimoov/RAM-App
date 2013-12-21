package br.ufba.hupes.hospitaladmissionforram.model;

import java.util.ArrayList;
import java.util.UUID;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class RAM {

	@DatabaseField(id = true)
	private UUID id = UUID.randomUUID();

	@DatabaseField(dataType=DataType.SERIALIZABLE)
    private Cause cause;
	
	@DatabaseField(dataType=DataType.SERIALIZABLE)
    private Cause comorbidity;

	@DatabaseField
    private String otherCauses;

	@DatabaseField
    private String initialDate;

	@DatabaseField
    private String finalDate;
	
	@DatabaseField(foreign=true)
	private Research research;

	@DatabaseField(dataType=DataType.SERIALIZABLE)
    private ArrayList<Medication> suspects;
    
    public ArrayList<Medication> getSuspects() {
        return suspects;
    }

    public void setSuspects(ArrayList<Medication> suspects) {
        this.suspects = suspects;
    }

    public Cause getCause() {
        return cause;
    }

    public void setCause(Cause cause) {
        this.cause = cause;
    }

    public Cause getComorbidity() {
        return comorbidity;
    }

    public void setComorbidity(Cause comorbidity) {
        this.comorbidity = comorbidity;
    }

	public String getOtherCauses() {
		return otherCauses;
	}

	public void setOtherCauses(String anotherCauses) {
		this.otherCauses = anotherCauses;
	}

	public Research getResearch() {
		return research;
	}

	public void setResearch(Research research) {
		this.research = research;
	}

	public String getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(String finalDate) {
		this.finalDate = finalDate;
	}

	public String getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(String initialDate) {
		this.initialDate = initialDate;
	}
}