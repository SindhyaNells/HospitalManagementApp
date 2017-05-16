package com.manage.hospital.hmapp.data;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by sindhya on 5/10/17.
 */
public class HealthData {

    public String patient_id;
    public String sleep_duration;
    public String heart_rate;
    public String calories_burnt;
    public String no_of_steps;

    public HealthData(JSONObject jsonObject){
        try {
            patient_id = jsonObject.getString("Patient_Id");
            sleep_duration=jsonObject.getString("Sleep Duration");
            heart_rate=jsonObject.getString("Heart Rate");
            calories_burnt=jsonObject.getString("Calories Burnt");
            no_of_steps=jsonObject.getString("No of Steps");

        }catch (JSONException e){

        }
    }

}
