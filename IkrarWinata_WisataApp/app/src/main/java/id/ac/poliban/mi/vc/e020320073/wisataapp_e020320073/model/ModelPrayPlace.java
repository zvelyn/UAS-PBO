package id.ac.poliban.mi.vc.e020320073.wisataapp_e020320073.model;

import java.io.Serializable;

public class ModelPrayPlace implements Serializable {

    private String txtTempatIbadah;
    private double latitude;
    private double longitude;

    public String getTxtTempatIbadah() {
        return txtTempatIbadah;
    }

    public void setTxtTempatIbadah(String txtTempatIbadah) {
        this.txtTempatIbadah = txtTempatIbadah;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
