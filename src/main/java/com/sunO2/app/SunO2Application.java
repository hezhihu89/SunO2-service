package com.sunO2.app;

/**
 * Created by admin on 17/3/24.
 */
public class SunO2Application implements ApplicationWapper{

    private SunO2Context mContext;

    public SunO2Application() {
      mContext = new SunO2Context();
    }

    public SunO2Context getContext() {
        return mContext;
    }
}
