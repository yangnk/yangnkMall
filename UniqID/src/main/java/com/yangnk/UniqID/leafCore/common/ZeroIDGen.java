package com.yangnk.UniqID.leafCore.common;

import com.yangnk.UniqID.leafCore.IDGen;

public class ZeroIDGen implements IDGen {
    @Override
    public Result get(String key) {
        return new Result(0, Status.SUCCESS);
    }

    @Override
    public boolean init() {
        return true;
    }
}
