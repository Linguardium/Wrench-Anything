package com.zundrel.wrenchanything.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

import static com.zundrel.wrenchanything.WrenchAnything.MODID;

@Config(name = "wrenchanything")
public
class WrenchAnythingConfig implements ConfigData {
    public boolean hasDurability = false;
    public int maxDurability = 100;

}