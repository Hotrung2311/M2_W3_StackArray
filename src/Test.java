public class Test {
    public static void main(String[] args) throws Exception {
        MyStack a = new MyStack(5);
        a.push(1);
        a.push(2);
        a.push(3);
        a.push(4);
        a.push(5);
//        a.push(6);
//        a.push(7);
//        a.push(8);

        System.out.println(a.pop());
    }
}
