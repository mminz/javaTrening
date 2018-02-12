package pl.codecouple;

class Printer {

    private StringBuilder stringBuilder;

    Printer(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Zloooooooo!");
        } else {
            this.stringBuilder = new StringBuilder(text);
        }
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


}
