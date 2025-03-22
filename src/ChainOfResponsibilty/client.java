package ChainOfResponsibilty;

public class client {
    public static void main(String[] args) {

        SupportHandler level1Handler = new Level1SupportHandler();
        SupportHandler level2Handler = new Level2SupportHandler();
        SupportHandler level3Handler = new Level3SupportHandler();

        level1Handler.setNextHandler(level2Handler);
        level2Handler.setNextHandler(level3Handler);

        Request request1 =new Request(Priority.LOW);
        Request request2=new Request(Priority.MEDIUM);
        Request request3=new Request(Priority.HIGH);



        //level1Handler.handlerRequest(request1);
        level1Handler.handlerRequest(request2);
        //level1Handler.handlerRequest(request3);

    }
}
