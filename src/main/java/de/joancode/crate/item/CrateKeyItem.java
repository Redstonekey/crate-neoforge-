package de.joancode.crate.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class CrateKeyItem extends Item {
    public CrateKeyItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
