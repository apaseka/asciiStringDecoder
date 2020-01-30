public class StringDecoder {

    public static String decode(String encoded) {

        StringBuilder reverse = new StringBuilder(encoded).reverse();
        char[] chars = reverse.toString().toCharArray();
        StringBuilder stringIn;
        int asciiInt;

        StringBuilder decodedString = new StringBuilder();

        for (int i = 0; i < chars.length; ) {
            stringIn = new StringBuilder().append(chars[i]).append(chars[i + 1]);
            asciiInt = Integer.parseInt(stringIn.toString());

            if (asciiInt == 32 || (asciiInt >= 65 && asciiInt <= 99)) {
                decodedString.append((char) asciiInt);
                i += 2;
            } else {
                stringIn.append(chars[i + 2]);
                asciiInt = Integer.parseInt(stringIn.toString());
                decodedString.append((char) asciiInt);
                i += 3;
            }
        }
        return decodedString.toString();
    }
}
