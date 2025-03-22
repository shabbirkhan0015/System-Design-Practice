package ChainOfResponsibilty;

public interface SupportHandler {

    void handlerRequest(Request request);
    void setNextHandler(SupportHandler nextHandler);
}
