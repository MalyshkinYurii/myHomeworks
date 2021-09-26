package JavaEssential10.task1;

import java.util.ArrayList;

public class MyDictionary<TKey, TValue> implements IDictionary<TKey, TValue> {
    ArrayList<TKey> keys = new ArrayList<>();
    ArrayList<TValue> values = new ArrayList<>();

    @Override
    public void addElem(TKey tKey, TValue value) {
        try {
            if (keys.contains(tKey)) {
                throw new Exception("Данный ключ <" + tKey + "> уже присутствует.");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        keys.add(tKey);
        values.add(value);

    }

    @Override
    public TValue getValue(TKey tKey) {
        return values.get(keys.indexOf(tKey));
    }

    @Override
    public int size() {
        return keys.size();
    }
}
