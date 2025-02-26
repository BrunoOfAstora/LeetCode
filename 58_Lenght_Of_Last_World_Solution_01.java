class Solution {
    public int lengthOfLastWord(String s) {
        int lengthCounter = 0;
        int lastElement = s.length() - 1;

        while(lastElement >= 0 && s.charAt(lastElement) == ' ') 
        lastElement--;

        while(lastElement >= 0 && s.charAt(lastElement) != ' ') {
            lengthCounter++;
            lastElement--;
        }

        return lengthCounter;
        }
    }

/**Explanation:

Here, the lastElement variable will be decreased every time that the char is equal to a
space " ", mitigating Strings like:

"Hello World "

Then the variable lastElement continues to decrase when encounters a letter, but now the variable lengthCounter increases.

Let's see an example:

    Consider the dots as spaces

exampleString = "The Gray Fox Jumps Over The Lazy Dog . .";
lastElement = 38;
lengthCounter = 0;
(The Char in the variable lastElement is a Space, lastElement will be decreased below)

exampleString = "The Gray Fox Jumps Over The Lazy Dog .";
lastElement = 37;
lengthCounter = 0;
(last element is still "pointing" to a space char, it will be decreased one more time)

exampleString = "The Gray Fox Jumps Over The Lazy Dog";
lastElement = 36;
lengthCounter = 0;
(Now, lastElement points to a character that is no a space,it will be decreased anyways but now lengthCounter will be increased by 1, the first loop wil not be readed anymore, so if the next element be a space character, the program will return the result)

exampleString = "The Gray Fox Jumps Over The Lazy Dog";
lastElement = 36;
lengthCounter = 1;
(This will repeat until lastElement finds another " " character)

Final result:

3
Length of Word "Dog"

    lengthCounter = 3;
    lastElement = 33;
    return lengthCounter;

Complexity:

    Time complexity:
    O(n)

    Space complexity:
    O(1)
**/
