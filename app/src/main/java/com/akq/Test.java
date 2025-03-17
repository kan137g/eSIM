package com.akq;

import android.content.Context;

import com.linksfield.lpad.grpc.LPAdClient;

/**
 * @ProjectName: eSIM
 * @Package: com.akq.esimlib
 * @ClassName: Test
 * @Description:
 * @Author: wencai
 * @CreateDate: 2025/3/17 23:01
 * @UpdateUser:
 * @UpdateDate: 2025/3/17 23:01
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Test {
    private LPAdClient lpAdClient;

    public void main(LPAdClient lpAdClient) {
        this.lpAdClient = lpAdClient;
    }
}
