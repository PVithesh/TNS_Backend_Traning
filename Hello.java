class Hello{
    void print(){
        System.out.println("Hello! This is my first program");
    }
}
class HelloMain{
    public static void main(String args[]){
        Hello obj = new Hello();
        obj.print();
    }
}