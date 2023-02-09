public class Class13 {
    public static void main(String[] args) {

     String str= "i like jave. i write a lot of code. daily.";
     String [] strArr=str.split("[.?!]");
        System.out.println(strArr.length);
        System.out.println(strArr[1].trim());

    }
}
