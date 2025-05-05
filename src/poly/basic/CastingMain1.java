package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //단 자식의 기능은 호출 할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        // 다운캐스트(부모타입 -> 자식 타입)
        Child child = (Child) poly;
        child.parentMethod();
        child.childMethod();

        // 일시적 다운캐시팅 - 해당 메서드를 호출하는 순간만 다운 캐스팅
        ((Child) poly).childMethod();

        Child child1 = new Child();
        child.childValue = 10;
        child1.parentValue = 20;
        Parent parent1 = (Parent) child1;
        System.out.println("parent1 = " + parent1.parentValue);
        Child child2 = (Child) parent1;
        // 값은 유지되지 않음
        System.out.println("child2 = " + child2.parentValue);
        System.out.println("child2 = " + child2.childValue);
    }
}
