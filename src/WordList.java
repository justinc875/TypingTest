public class WordList {
    //instance variables
    private String wordList;
    private String wordTest;
    private int comma;

    //constructor
    public WordList() {
        wordList = "play,one,order,would,still,number,than,around,higher,less,know,less,power,through,number,could,we,take,against,stand,call,he,with,a,so,those,if,any,say,for,be,plan,each,give,which,face,first,increase,child,after,course,much,show,the,just,line,most,form,will,under,need,one,might,become,by,find,how,against,follow,all";
        wordTest = "";
        comma = 0;
    }

    //getter
    public String getWordList() {
        return wordList;
    }

    public void wordTest() {
        for (int i = 0; i < wordList.length(); i++) {
            if (wordList.substring(i, i+1).equals(",")) {
                comma ++;
            }
        }
        int index = (int) (Math.random() * comma) + 1;
        String currentCharacter = wordList.substring(index + 1, index + 2);
        int j = 0;
        while (currentCharacter != ",") {
            

        }
    }

    //generate a random index
    //find the closest comma
    //nested loop, for loop transitioned into a while loop
    //find the next closest comma and add the new word from those indices to a new string with the world.
}
