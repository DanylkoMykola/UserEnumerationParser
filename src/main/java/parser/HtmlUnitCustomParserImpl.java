package parser;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import entity.ErrorMessages;
import entity.User;

import java.io.IOException;

public class HtmlUnitCustomParserImpl extends HtmlParser {
    private String link;
    private final String ERROR_LOGIN_MESSAGE_IF_USER_EXISTS = System.getenv("ERROR_LOGIN_MESSAGE_IF_USER_EXISTS");

    public HtmlUnitCustomParserImpl(String link) {
        this.link = link;
    }

    @Override
    public  boolean isUserExists(String userName) {
        WebClient webClient = new WebClient();
        webClient.getOptions().setJavaScriptEnabled(true);
        HtmlPage loginPage;
        try {
            loginPage = webClient.getPage(link);
        } catch (IOException e) {
            throw new RuntimeException(ErrorMessages.UNABLE_TO_OPEN_LINK.getErrorMessage());
        }
        HtmlSubmitInput button = loginPage.getFirstByXPath(SUBMIT_BUTTON);
        HtmlTextInput textField = loginPage.getFirstByXPath(INPUT_TEXT_FORM);
        if (textField != null) {
            textField.setValueAttribute(userName);
        } else {
            throw new RuntimeException(ErrorMessages.UNABLE_TO_GET_TEXT_INPUT_FIELD.getErrorMessage());
        }
        HtmlPage respPage;
        try {
            if (button != null) {
                respPage = button.click();
            } else {
                throw new RuntimeException(ErrorMessages.UNABLE_TO_GET_SUBMIT_BUTTON.getErrorMessage());
            }
        } catch (IOException e) {
            throw new RuntimeException(ErrorMessages.UNABLE_TO_OPEN_LINK.getErrorMessage());
        }
        if (respPage != null) {
            String xml =  respPage.asXml();
            return  !xml.contains(ERROR_LOGIN_MESSAGE_IF_USER_EXISTS);
        } else {
            throw new RuntimeException(ErrorMessages.UNABLE_TO_GET_RESPONSE.getErrorMessage());
        }
    }
}
