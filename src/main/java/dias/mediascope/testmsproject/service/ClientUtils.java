package dias.mediascope.testmsproject.service;

public interface ClientUtils {

    <T> T getData(Class<T> classType, String url);
}
