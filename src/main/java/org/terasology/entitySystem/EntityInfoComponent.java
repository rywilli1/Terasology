package org.terasology.entitySystem;

/**
 * Component for storing entity system information on an entity
 * @author Immortius <immortius@gmail.com>
 */
public class EntityInfoComponent extends AbstractComponent {
    public String parentPrefab;

    public EntityInfoComponent() {}

    public EntityInfoComponent(String parentPrefab) {
        this.parentPrefab = parentPrefab;
    }
}
