package ChainOfResponsibilty;

public class Level1SupportHandler implements SupportHandler {

    private SupportHandler nextHandler;
    @Override
    public void handlerRequest(Request request) {
        if(request.getPriority() == Priority.LOW)
        {
            System.out.println("Level1 handler");
        }
        else if(nextHandler !=null){
            nextHandler.handlerRequest(request);
        }

    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
