// 제네릭 타입 변수 2개를 가진 제네릭 클래스의 선언 및 활용
package sec02_genericclass.EX02_TwoGenericArguments;

class KeyValue<K, V>{
    private K key;
    private V value;
    public K getKey(){
        return key;
    }
    public void setKey(K key){
        this.key = key;
    }
    public V getValue(){
        return value;
    }
    public void setValue(V value){
        this.value = value;
    }
}

public class TwoGenericArguments {
    public static void main(String[] args){

        // 제네릭 객체 1 생성
        KeyValue<String, Integer> kv1 = new KeyValue<>();
        kv1.setKey("사과");
        kv1.setValue(1000);
        String key1 = kv1.getKey();
        int value1 = kv1. getValue();
        System.out.println("key: " + key1 + " value: " + value1);

        // 제네릭 객체 2 생성
        KeyValue<Integer, String> kv2 = new KeyValue<>();
        kv2.setKey(404);
        kv2.setValue("Not Found(요청한 페이지를 찾을 수 없습니다.)");
        int key2 = kv2.getKey();
        String value2 = kv2.getValue();
        System.out.println("key: " + key2 + " value: " + value2);

        // 제네릭 객체 3 생성
        KeyValue<String, Void> kv3 = new KeyValue<>();
        kv3.setKey("키 값만 사용");
        String key3 = kv3. getKey();
        System.out.println("key: " + key3);
    }
}

/*제네릭 객체를 생성하면서 객체 타입을 지정해주고, 그에 맞는 값들을 대입해주고
* 그 값들을 출력함 */