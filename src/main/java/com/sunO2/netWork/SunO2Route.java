package com.sunO2.netWork;

import com.sunO2.app.SunO2Context;

/**
 * Created by admin on 17/3/24.
 */
public class SunO2Route {

    private SunO2Context context;

    public SunO2Route(SunO2Context context){
        this.context = context;
    }


    public SunO2Context getContext(){
        return context;
    }
}
