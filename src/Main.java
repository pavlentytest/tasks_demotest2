public class Main {
    public static void main(String[] args) {
        // immutable строки
        String str = "123123";
        str += "adfadfg"; // создается новая строка
        //str.reverse();
        System.out.println(str);

        // mutable строки
        StringBuffer stringBuffer = new StringBuffer("234234");
        stringBuffer.append("asdfasdf");
        stringBuffer.reverse();
        System.out.println(stringBuffer);

    }
}