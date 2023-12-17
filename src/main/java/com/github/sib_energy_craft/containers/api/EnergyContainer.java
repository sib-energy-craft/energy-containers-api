package com.github.sib_energy_craft.containers.api;

import com.github.sib_energy_craft.energy_api.Energy;
import org.jetbrains.annotations.NotNull;

/**
 * @author sibmaks
 * @since 0.0.1
 */
public interface EnergyContainer {

    /**
     * Check is container contains some energy
     *
     * @return true - container has energy, false - otherwise
     */
    boolean hasEnergy();

    /**
     * Check is container has space to energy
     *
     * @return true - container has space, false - otherwise
     */
    boolean hasSpace();

    /**
     * Add energy charge into container.<br/>
     * In case if passed charge greater than free space, then not used energy is lost.
     *
     * @param charge charge to add
     */
    default void add(int charge) {
        add(new Energy(charge));
    }

    /**
     * Add energy into container.<br/>
     * In case if passed charge greater than free space, then not used energy is lost.
     *
     * @param energy energy to add
     */
    void add(@NotNull Energy energy);

    /**
     * Remove energy charge from container.<br/>
     * In case if container not contains requested amount of energy then false is returned and nothing happened.
     *
     * @param charge energy charge to remove
     */
    default boolean subtract(int charge) {
        return subtract(new Energy(charge));
    }

    /**
     * Remove energy from container.<br/>
     * In case if container not contains requested amount of energy then false is returned and nothing happened.
     *
     * @param energy energy charge to remove
     */
    boolean subtract(@NotNull Energy energy);
}
