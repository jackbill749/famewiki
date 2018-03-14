package com.sparks.jack.famewiki.result;

import com.sparks.jack.famewiki.constant.Retcode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: jack
 * Date: 2017/12/14
 * Time: 0:18
 */
public class CommonResult  extends BaseResult{
    private String expiretime;
    private String token;

    public String getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(String expiretime) {
        this.expiretime = expiretime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public CommonResult(String expiretime, String token) {
        this.expiretime = expiretime;
        this.token = token;
    }

    public CommonResult(Integer retcode, String message, String describe, String expiretime, String token) {
        super(retcode, message, describe);
        this.expiretime = expiretime;
        this.token = token;
    }

    public CommonResult(Retcode retcode, String expiretime, String token) {
        super(retcode);
        this.expiretime = expiretime;
        this.token = token;
    }

    public CommonResult() {
    }

    public CommonResult(Integer retcode, String message, String describe) {
        super(retcode, message, describe);
    }

    public CommonResult(Retcode retcode) {
        super(retcode);
    }

    @Override
    public void setError(Retcode retcode) {
        super.setError(retcode);
    }
}
