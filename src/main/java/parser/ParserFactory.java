package parser;

public class ParserFactory {
    public static HtmlParser getInstance(String link) {
        return new HtmlUnitCustomParserImpl(link);
    }
}
