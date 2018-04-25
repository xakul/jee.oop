package builder.carBuilder;

/**
 * Created CarProperties interface to implement common methods in subclasses.
 * Genel olarak kullanilacak metotlari CarProperties interface içinde
 * tanimladik. Bu metotlar altsiniflarda kullanilacak.
 * 
 * We will use these methods by overriding in abstract class which is CarAbstract.
 * Yazilan metotlar CarAbstract sinifinda override edilerek kullanilacak.
 */

public interface CarProperties {

	public String getName();

	public String getColor();

	public String getModel();

	public String getType();

}