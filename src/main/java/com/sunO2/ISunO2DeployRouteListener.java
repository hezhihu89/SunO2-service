package com.sunO2;

import com.sunO2.netWork.ISunO2Network;

/**
 * Created by admin on 17/3/24.
 *
 * 部署 API 接口监听
 */
public interface ISunO2DeployRouteListener {
    /**
     * 开始部署路由接口
     */
    void deloyRouteStart();

    /**
     * 开始初始化路由接口对象
     * @param total API接口总数
     * @param current 当前初始化到第几个
     * @param sunO2Network 每次部署的路由接口会多次调用
     */
    void deloyRouteInstance(int total,int current,ISunO2Network sunO2Network);

    /**
     * 部署完成
     */
    void deloyed();
}
