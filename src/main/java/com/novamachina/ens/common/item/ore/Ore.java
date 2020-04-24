package com.novamachina.ens.common.item.ore;

import com.novamachina.ens.common.utility.Color;
import net.minecraft.item.Item;

public class Ore {

    private final String name;
    private final Color  color;
    private final Item   result;

    public Ore(String name, Color color, Item result) {
        this.name   = name;
        this.color  = color;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Item getResult() {
        return result;
    }

    public String getChunkName() {
        return "item_" + name + "_chunk";
    }

    public String getPieceName() {
        return "item_" + name + "_piece";
    }
}
