package abstractFactory;

/**
 * Create an Abstract class to get factories for Type and Shape Objects.
 * 
 * Pipe veya pallet üretmek için bir abstract class oluþtur.
 * 
 */
public abstract class AbstractFactory {

	abstract PalletType getType(String type);

	abstract PipeShape getShape(String shape);
}
