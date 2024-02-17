package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry<E> {
    public Map<String, E> registry = new HashMap<String, E>();

    public void register(String key, E value) {
        registry.put(key, value);
    }

    public E getRegistry(String key) {
        if(registry.containsKey(key)) {
            return registry.get(key);
        }
        return null;
    }
}
