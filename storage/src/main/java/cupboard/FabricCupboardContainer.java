package cupboard;

import cupboard.container.Container;
import cupboard.container.Cup;
import cupboard.container.Mug;
import cupboard.exception.ExceptionContainerCreation;

public class FabricCupboardContainer {

    private static FabricCupboardContainer instance = new FabricCupboardContainer();

    private FabricCupboardContainer() { }

    /**
     * Retourne une instance singleton de la fabrique à contenant.
     * @return Instance Singleton de contenant vide à café
     */
    public static FabricCupboardContainer getFabricContainerInstance() {
        return instance;
    }

    /**
     * Permet de créer un contenant en fonction de la chaine de caractères passée en paramètre
     * @param typeContainer Type de contenant à créer
     * @param capacity Capacité en litre du contenant à créer
     * @return Le contenant désiré en fonction de la chaine de caractères passée en paramètre
     * @throws ExceptionContainerCreation Exception levée quand le type de contenant à créer n'est pas reconnu
     */
    public Container getContainer(String typeContainer, double capacity) throws ExceptionContainerCreation {
        if (typeContainer.equals("mug"))
            return new Mug(capacity);
        else if (typeContainer.equals("cup"))
            return new Cup(capacity);
        else
            throw new ExceptionContainerCreation("Container not available in the storage cupboard : " + typeContainer);
    }
}
