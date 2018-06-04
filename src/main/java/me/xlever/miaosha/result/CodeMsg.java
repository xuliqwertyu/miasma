package me.xlever.miaosha.result;

public class CodeMsg {
    private int code;
    private String msg;
    //通用异常
    public static CodeMsg SUCCESS=new CodeMsg(0,"success");
    public static CodeMsg SERVER_ERROR=new CodeMsg(500100,"服务端异常");
    //登录模块500200
    //商品模块5003XXX
    private CodeMsg(int code,String msg){
        this.code=code;
        this.msg=msg;
    }
    public int getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }

}