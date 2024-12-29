/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 *
 * @author ABC TRADERS
 */
public class BillingInfo {
  private  int patientid;
  private ArrayList<Integer> medicineid;  //we are storing values in a file by helip of id thats why list must be integer
  private  String recommendations, date;
  private  int fee;

    public BillingInfo() {
         this.patientid = 0;
        this.medicineid = new ArrayList<>();
        this.recommendations = "";
        this.date = "";
        this.fee = 0;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public ArrayList<Integer> getMedicineid() {
        return medicineid;
    }

    public void setMedicineid(int medicineid) {
        this.medicineid.add(medicineid);
    }

   
    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

   
    
}
