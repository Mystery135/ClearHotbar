package com.websiteofgames.clearhotbar.inventories;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.List;

public class CopyInvScreen implements InventoryHolder {
    private Inventory inv;

    public CopyInvScreen(){

        inv = Bukkit.createInventory(this, 9, "Copy Inventory?");
        init();
    }
    private void init(){
        ItemStack item =
createItem("§a§lYes", Material.GREEN_WOOL);
for(int i = 0; i<4; i++){

    inv.setItem(inv.firstEmpty(), item);



}


        item = createItem("§b§lCopy inventory?", Material.CHEST);

        inv.setItem(inv.firstEmpty(), item);



        item = createItem("§c§lNo", Material.RED_WOOL);


        for(int i = 0; i<4; i++){

            inv.setItem(inv.firstEmpty(), item);


        }

    }

    private ItemStack createItem(String name, Material mat){
        ItemStack itemStack = new ItemStack(mat, 1);
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(name);
        itemStack.setItemMeta(meta);


return itemStack;

    }
    @Override
    public Inventory getInventory() {
        return inv;
    }
}
