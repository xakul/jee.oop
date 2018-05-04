package abstractFactory;

/**
 * Create an Abstract class to get factories for Type and Shape Objects.
 * pipe veya pallet üretmek için bir abstract class oluştur.
 * 
 * */
public abstract class AbstractFactory {

	abstract PalletType getType(String type);

	abstract PipeShape getShape(String shape);
}
