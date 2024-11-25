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
        //finds the amount of commas in the wordlist
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

    //math.random used to see which comma will be indexed out
    //parse commas out using indexof
    //list gets updated, word that gets parsed removed from list
    //word added to wordtest

    /*if (wordList.substring(j, j + 1).equals(",")) {
                count++;
            }*/
}
