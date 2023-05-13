package com.yangnk.UniqID.leafCore;


import com.yangnk.UniqID.leafCore.common.Result;

public interface IDGen {
    Result get(String key);
    boolean init();
}
