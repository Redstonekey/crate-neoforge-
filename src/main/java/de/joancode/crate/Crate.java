package de.joancode.crate;

import de.joancode.crate.item.CrateKeyItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(Crate.MODID)
public class Crate {
    public static final String MODID = "crate";
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    
    public static final DeferredHolder<Item, CrateKeyItem> CRATE_KEY = ITEMS.registerItem("crate_key", 
        CrateKeyItem::new, new Item.Properties());

    public Crate(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
