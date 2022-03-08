package testdemo;

/**
 * 演示使用set方法进行注入属性
 */
public class Book {

    //创建属性
    private String bname;
    private String bauthor;

    //set方法注入
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public static void main(String[] args) {
       Book book = new Book();
       book.setBname("abc");

    }

    public void testDemo(){
        System.out.println(bname + "::" + bauthor);
    }
}
