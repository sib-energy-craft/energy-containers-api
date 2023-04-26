package com.github.sib_energy_craft.containers.api;

import com.github.sib_energy_craft.energy_api.Energy;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * @since 0.0.1
 * @author sibmaks
 */
public interface ChargeableEnergyContainer {

    /**
     * Charge item stack, use internal energy, but not greater than max
     *
     * @param itemStack item stack
     * @param max max energy to charge
     */
    void charge(@NotNull ItemStack itemStack, @NotNull Energy max);

    /**
     * Discharge item stack, pass into internal energy, but not greater than max
     *
     * @param itemStack item stack
     * @param max max energy to discharge
     */
    void discharge(@NotNull ItemStack itemStack, @NotNull Energy max);
}
