package me.imtoggle.smarthotbar

import cc.polyfrost.oneconfig.config.Config
import cc.polyfrost.oneconfig.config.data.*

object ModConfig : Config(Mod(SmartHotbar.NAME, ModType.UTIL_QOL), "${SmartHotbar.MODID}.json") {

    init {
        initialize()
    }
}