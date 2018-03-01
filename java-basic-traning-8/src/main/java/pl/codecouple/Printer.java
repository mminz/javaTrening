package pl.codecouple;

class Printer {

    private StringBuilder stringBuilder;

    Printer(String text) throws EmptyStringException {

        if(text == null) {
            throw new IllegalArgumentException();
        }

        if (text.isEmpty()) {
            throw new EmptyStringException("Zlooo!");
        }

        this.stringBuilder = new StringBuilder(text);
    }

    public String reverseString() {
        return stringBuilder.reverse().toString();
    }

    public int indexA() {
        return stringBuilder.indexOf("a");
    }

    public String deleteA() {
        return stringBuilder.deleteCharAt(0).toString();
    }

    public int indexC() {
        return stringBuilder.lastIndexOf("c");
    }

    public String replaceAwithC () {
        return stringBuilder.replace(1, 2, "XXX").toString();
    }

    public String removeFirstIndex(){
        return stringBuilder.deleteCharAt(0).toString();
    }


}
