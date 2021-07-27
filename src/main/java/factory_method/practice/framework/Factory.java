package factory_method.practice.framework;

/**
 * 새로운 Product를 만들고(createProduct),
 * 만든 Product를 등록하는(registerProduct) 추상 메소드
 *
 * Template Method 패턴이 사용되고 있다
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product p);

}
