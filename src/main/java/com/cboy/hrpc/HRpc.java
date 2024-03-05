package com.cboy.hrpc;

public interface HRpc<Req,Resp> {

    Resp call(ReqConfig config, Req request, Class<Resp> respClazz);

}
