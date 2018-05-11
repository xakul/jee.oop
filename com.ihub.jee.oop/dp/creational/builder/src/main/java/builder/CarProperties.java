package builder;

/**
 * Created CarProperties interface to implement common methods in subclasses.
 * Genel olarak kullanılacak metotları CarProperties interface içinde
 * tanimladik. Bu metotlar altsınıflarda kullanılacak.
 * 
 * We will use these methods by overriding in abstract class which is CarAbstract.
 * Yazılan metotlar CarAbstract sınıfında override edilerek kullanılacak.
 */
public interface CarProperties {

	public String getName();

	public String getColor();

	public String getModel();

	public String getType();

}