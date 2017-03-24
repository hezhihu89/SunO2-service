package com.sunO2.netWork;

import java.util.ArrayList;

/**
 * Created by admin on 17/3/24.
 */
public interface Inject {
    ArrayList<Class<? extends ISunO2Network>> getManifest();
}
