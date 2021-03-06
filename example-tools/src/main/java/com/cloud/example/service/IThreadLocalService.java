package com.cloud.example.service;

import com.cloud.example.vo.BatchParam;

/**
 * @author 咚咚锵
 * @date 2021/4/3 18:44
 * @description ThreadLocal测试
 */
public interface IThreadLocalService {

    /**
     * 设置参数
     *
     * @param sum
     */
    void initParam(int sum);

    /**
     * 计算
     */
    void compute();

    /**
     * 汇总计算结果
     *
     * @return
     */
    BatchParam summaryResults();
}
