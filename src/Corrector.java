public record Corrector() {

    public static void replaceWord(String[] words) throws NumberFormatException{

        char checkLetter = 'b';

        for (String word : words) {

           char[] wordCharArray = word.toCharArray();

            for (int i = 0; i < wordCharArray.length - 1; i++) {
                if (wordCharArray[i] == checkLetter) wordCharArray[i] = 'o';
            }

            System.out.println(wordCharArray);
        }
    }
}
