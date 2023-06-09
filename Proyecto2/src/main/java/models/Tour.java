
package models;

import java.util.Date;



public class Tour {
    private String numTour;
    private Guide guideAssigning = new Guide();
    private Date tourDate;
    private  int hourTour;
    private int minuteTour;
  
    public Tour(){}

    public Tour(String numTour, Date tourDate, int hourTour, int minuteTour) {
        this.numTour = numTour;
        this.tourDate = tourDate;
        this.hourTour = hourTour;
        this.minuteTour = minuteTour;
    }

    public String getNumTour() {
        return numTour;
    }

    public void setNumTour(String numTour) {
        this.numTour = numTour;
    }

    public Guide getGuideAssigning() {
        return guideAssigning;
    }

    public void setGuideAssigning(Guide guideAssigning) {
        this.guideAssigning = guideAssigning;
    }

    public Date getTourDate() {
        return tourDate;
    }

    public void setTourDate(Date tourDate) {
        this.tourDate = tourDate;
    }

    public int getHourTour() {
        return hourTour;
    }

    public void setHourTour(int hourTour) {
        this.hourTour = hourTour;
    }

    public int getMinuteTour() {
        return minuteTour;
    }

    public void setMinuteTour(int minuteTour) {
        this.minuteTour = minuteTour;
    }
   
        
    }
    
    

