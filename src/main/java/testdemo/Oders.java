package testdemo;

/**
 * 使用有参构造注入
 */
public class Oders {
    //属性
    private String oname;
    private String address;
    //有参构造
    public Oders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void odeartest(){
        System.out.println(oname + "::" + address);
    }
}
