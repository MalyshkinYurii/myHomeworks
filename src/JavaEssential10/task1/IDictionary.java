package JavaEssential10.task1;

public interface IDictionary<TKey, TValue> {
    void addElem(TKey key, TValue value);

    TValue getValue(TKey key);

    int size();
}
