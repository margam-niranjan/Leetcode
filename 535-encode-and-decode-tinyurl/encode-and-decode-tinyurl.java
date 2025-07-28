import java.util.*;

public class Codec {
    private Map<String, String> longToShort;
    private Map<String, String> shortToLong;
    private static final String BASE_URL = "http://tinyurl.com/";
    private static final String CHAR_SET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private Random rand;

    public Codec() {
        longToShort = new HashMap<>();
        shortToLong = new HashMap<>();
        rand = new Random();
    }

    private String getRandomCode() {
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            code.append(CHAR_SET.charAt(rand.nextInt(CHAR_SET.length())));
        }
        return code.toString();
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (longToShort.containsKey(longUrl)) {
            return BASE_URL + longToShort.get(longUrl);
        }

        String code = getRandomCode();
        while (shortToLong.containsKey(code)) {
            code = getRandomCode(); // Ensure uniqueness
        }

        longToShort.put(longUrl, code);
        shortToLong.put(code, longUrl);
        return BASE_URL + code;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String code = shortUrl.replace(BASE_URL, "");
        return shortToLong.get(code);
    }
}
