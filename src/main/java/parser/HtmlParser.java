package parser;

public abstract class HtmlParser {
    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.72 Safari/537.36";
    public static final String FORM_DIV = "//form[@action=]";
    public static final String SUBMIT_BUTTON = "/html/body//form//input[@type='submit']";
    public static final String INPUT_TEXT_FORM = "/html/body//form//input[@type='text']";

    public abstract boolean isUserExists(String userName);
}
