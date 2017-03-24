package com.sunO2.app;

/**
 * Created by admin on 17/3/24.
 */
public class SunO2Context implements ApplicationWapper{

    private SunO2Application application;

    public SunO2Context(){

    }

    public SunO2Context(SunO2Application context){
        application = context;
    }

    public SunO2Context getContext() {
        return this;
    }

    public SunO2Application getApplicationContext(){
        return application;
    }
}
