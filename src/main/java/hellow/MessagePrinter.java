package hellow;

public class MessagePrinter {
    /**
     * 打印机
     */
    public MessagePrinter(){
        super();
        System.out.println("MessagePrinter...");
    }
    /**
     * 建立和MessageService的关联关系
     */
    private MessageService service;

    /**
     * 设置service的值
     */
    public void setService(MessageService service){
        this.service = service;
    }
    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
