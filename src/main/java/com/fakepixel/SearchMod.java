package com.fakepixel;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiChest;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = "fakepixelmod", version = "1.0")
public class SearchMod {

    @SubscribeEvent
    public void onGuiOpen(GuiOpenEvent event) {

        if (event.gui instanceof GuiChest) {

            ContainerChest chest =
                    (ContainerChest) ((GuiChest) event.gui).inventorySlots;

            for (int i = 0; i < chest.getLowerChestInventory().getSizeInventory(); i++) {

                ItemStack item = chest.getLowerChestInventory().getStackInSlot(i);

                if (item != null) {
                    System.out.println("Item: " + item.getDisplayName());
                }
            }
        }
    }
}
