package com.novamachina.ens.common.registry.registryitem;

import net.minecraft.item.Item;

public class CrookRegistryItem {

    private final Item   item;
    private final double rarity;

    public CrookRegistryItem(Item item, double rarity) {
        this.item   = item;
        this.rarity = rarity;
    }

    public Item getItem() {
        return item;
    }

    public double getRarity() {
        return rarity;
    }
}
