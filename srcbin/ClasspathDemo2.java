class Item2{
    public void print() {
        System.out.println("Hello world");
    }
}
class ClasspathDemo2 {
    public static void main(String[] args) {
        Item2 i1 = new Item2();
        i1.print();
    }
}
//터미널에서 실행
//javac ClasspathDemo2.java
//java -classpath ".;lib" ClasspathDemo2
//classpath를 이용해서 외부 라이브러리의 클래스를 사용할 수 있다.
//java ClasspathDemo2 = java -classpath "." ClasspathDemo2

//환경변수 설정
//운영체제에서 지정하는 변수로 classpath를 설정하면 모든 자바 프로그램에서 classpath를 설정하지 않아도 된다.