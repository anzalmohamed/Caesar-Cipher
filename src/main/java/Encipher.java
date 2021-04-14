
public class Encipher {
    private String mInputtedString;
    private int mKey;

    public String getmInputtedString(){
        return mInputtedString;
    }

    public int getmKey(){
        return mKey;
    }
    public Encipher(String mInputString, int mKey) {
        this.mInputtedString = mInputString;
        this.mKey = mKey;
    }

    public static String encipher(Encipher encipher){

        if(encipher.mKey > 26){
            encipher.mKey = encipher.mKey % 26;
        }
        else if(encipher.mKey < 0) {
            encipher.mKey= (encipher.mKey % 26) + 26;
        }

        String outputString = "";
        int length = encipher.mInputtedString.length();
        for (int i = 0; i < length ; i++) {
            char cc = encipher.mInputtedString.charAt(i);
            if(Character.isLetter(cc)){
                if(Character.isLowerCase(cc)){
                    char c = (char)(cc+encipher.mKey);
                    if(c>'z'){
                        outputString += (char)(cc - (26-encipher.mKey));
                    }
                    else {
                        outputString += c;
                    }
                }
                else if(Character.isUpperCase(cc)){
                    char c = (char)(cc+encipher.mKey);
                    if(c>'Z'){
                        outputString += (char)(cc - (26-encipher.mKey));
                    }
                    else {
                        outputString += c;
                    }
                }
            }
            else{
                outputString += cc;
            }
        }
        return outputString;
    }
}
