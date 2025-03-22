package ChainOfResponsibilty;

public class Level3SupportHandler implements SupportHandler {

    private SupportHandler nextHandler;

    @Override
    public void handlerRequest(Request request) {
        if (request.getPriority() == Priority.HIGH) {
            System.out.println("Level 3 Support handled the request.");
        } else {
            System.out.println("Request cannot be handled.");
        }
    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {

    }
}
