package tn.esprit.com.ProjetPi.Utiles;

import tn.esprit.com.ProjetPi.entities.Ressource;

public class LeaveStat {

	private Ressource ressource;
	private long DayNumber;
	
	public LeaveStat(){
		
	}
	
	public LeaveStat(Ressource ressource, int dayNumber) {
		super();
		this.ressource = ressource;
		DayNumber = dayNumber;
	}
	public Ressource getRessource() {
		return ressource;
	}
	public void setRessource(Ressource ressource) {
		this.ressource = ressource;
	}
	public long getDayNumber() {
		return DayNumber;
	}
	public void setDayNumber(long dayNumber) {
		DayNumber = dayNumber;
	}



}
