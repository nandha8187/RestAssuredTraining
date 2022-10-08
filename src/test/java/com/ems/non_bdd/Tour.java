package com.ems.non_bdd;

public class Tour {

	String place;
	String modeofTravel;

	public String getPlace() {
		return place;
	}

	public Tour setPlace(String place) {
		this.place = place;
		return this;
	}

	public String getModeofTravel() {
		return modeofTravel;
	}

	public Tour setModeofTravel(String modeofTravel) {
		this.modeofTravel = modeofTravel;
		return this;
	}

	public void heyManWhereAreYouGoing() {

		System.out.println(getPlace());
		
		System.out.println("Oh Jolly ah "+getModeofTravel()+"la "+getPlace()+" Poriya");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tour tour = new Tour();

		tour.setPlace("Buffallo");
		tour.setModeofTravel("car");
        tour.heyManWhereAreYouGoing(); 

        tour.setPlace("Praveen").setModeofTravel("Flight").heyManWhereAreYouGoing();       
        
	}


}