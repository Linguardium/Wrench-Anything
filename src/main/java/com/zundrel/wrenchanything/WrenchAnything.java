package com.zundrel.wrenchanything;

import com.zundrel.wrenchanything.config.WrenchAnythingConfig;
import com.zundrel.wrenchanything.items.WrenchItem;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WrenchAnything implements ModInitializer {
    public static String MODID = "wrenchanything";

    public static WrenchItem WRENCH;
    public static WrenchAnythingConfig config;
    static {
        AutoConfig.register(WrenchAnythingConfig.class, JanksonConfigSerializer::new);
        config= AutoConfig.getConfigHolder(WrenchAnythingConfig.class).getConfig();
    }
	@Override
	public void onInitialize() {

	    if (!config.hasDurability) {
            WRENCH = Registry.register(Registry.ITEM, new Identifier(MODID, "wrench"), new WrenchItem());
        } else {
            WRENCH = Registry.register(Registry.ITEM, new Identifier(MODID, "wrench"), new WrenchItem(config.maxDurability));
        }
	}
}
