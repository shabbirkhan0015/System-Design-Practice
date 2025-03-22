package ChainOfResponsibilty;

public class Level2SupportHandler implements SupportHandler {

    private SupportHandler nextHandler;
    @Override
    public void handlerRequest(Request request) {
        if(request.getPriority() == Priority.MEDIUM)
        {
            System.out.println("Level 2 Support handled the request.");
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
