package br.edu.ifsp.dmo.aplicativoifclimav1.mvp;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.loopj.android.http.RequestParams;

import org.json.JSONObject;

public interface MainMVP {
    interface View{
        Context getContex();
    }
    interface Presenter{

        void detach();
        void getWeatherForCurrentLocation(LocationManager locationService, Activity main) ;
        void getWeatherForNewCity(String city);
        void letsdoSomeNetworking(RequestParams params);
    }

}
