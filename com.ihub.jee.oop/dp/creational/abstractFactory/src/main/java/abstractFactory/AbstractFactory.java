package abstractFactory;

/**
 * Create an Abstract class to get factories for Type and Shape Objects.
 * 
 * Pipe veya pallet �retmek i�in bir abstract class olu�tur.
 * 
 */
public abstract class AbstractFactory {

	abstract PalletType getType(String type);

	abstract PipeShape getShape(String shape);
}
