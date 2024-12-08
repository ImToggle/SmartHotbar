package me.imtoggle.smarthotbar

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = SmartHotbar.MODID, name = SmartHotbar.NAME, version = SmartHotbar.VERSION, modLanguageAdapter = "cc.polyfrost.oneconfig.utils.KotlinLanguageAdapter")
object SmartHotbar {
    const val MODID = "@ID@"
    const val NAME = "@NAME@"
    const val VERSION = "@VER@"

    @Mod.EventHandler
    fun onInit(event: FMLInitializationEvent) {
        ModConfig
    }
}