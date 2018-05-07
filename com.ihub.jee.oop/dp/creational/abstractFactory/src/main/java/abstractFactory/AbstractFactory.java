package abstractFactory;

/**
 * Create an Abstract class to get factories for type and shape objects.
 * 
 * Pipe veya pallet üretmek için bir abstract class oluşturur.
 */
public abstract class AbstractFactory {

	abstract PalletType getType(String type);

	abstract PipeShape getShape(String shape);
}
