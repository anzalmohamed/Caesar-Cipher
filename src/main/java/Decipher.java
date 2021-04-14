class Decipher {

    private int mKey;
    private String mstringInput;

    public int getmKey() {
        return mKey;
    }

    public String getmstringInput() {
        return  mstringInput;
    }

    public Decipher(String  mstringInput, int mKey) {
        this. mstringInput =  mstringInput;
        this.mKey = mKey;
    }

    public static String decipher(Decipher decipher) {

        if (decipher.mKey < 0) {
            decipher.mKey = (decipher.mKey % 26) + 26;
        }

        String stringOutput = "";
        int length = decipher. mstringInput.length();

        for (int i = 0; i < length; i++) {
            char character = decipher. mstringInput.charAt(i);

            if (Character.isLowerCase(character)) {

                char c = (char) (character - decipher.mKey);
                if (c < 'a') {
                    stringOutput += (char) (character + (26 - decipher.mKey));
                } else {
                    stringOutput += c;
                }
            } else if (Character.isUpperCase(character)) {
                char c = (char) (character - decipher.mKey);
                if (c < 'A') {
                    stringOutput += (char) (character + (26 - decipher.mKey));
                } else {
                    stringOutput += c;
                }
            }

            else {
                stringOutput += character;
            }

            return stringOutput;
        }
        return stringOutput;
    }
}