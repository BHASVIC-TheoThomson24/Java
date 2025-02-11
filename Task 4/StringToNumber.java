class StringToNumber {
    public int convert(String string) {
        if (string.equals("one"))
            return 1;
        else if (string.equals("two"))
            return 2;
        else if (string.equals("three"))
            return 3;
        else if (string.equals("four"))
            return 4;
        else if (string.equals("five"))
            return 5;
        else if (string.equals("six"))
            return 6;
        else if (string.equals("seven"))
            return 7;
        else if (string.equals("eight"))
            return 8;
        else if (string.equals("nine"))
            return 9;
        else
            return -1;
    }

    public int convert(int number) {
        if (number >= 1 && number <= 9)
            return 9;
        else
            return -1;
    }
}